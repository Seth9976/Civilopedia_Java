package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzee {
    public final Clock a;
    public final ExecutorService b;
    public final AppMeasurementSdk c;
    public final ArrayList d;
    public int e;
    public boolean f;
    public final String g;
    public volatile zzcc h;
    public static volatile zzee i;

    public zzee(Context context0, String s, String s1, Bundle bundle0) {
        this.a = DefaultClock.getInstance();
        p p0 = new p();
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), p0);
        int v = 1;
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        this.b = Executors.unconfigurableExecutorService(threadPoolExecutor0);
        this.c = new AppMeasurementSdk(this);
        this.d = new ArrayList();
        try {
            zzip.zzc(context0, "google_app_id", zzfw.zza(context0));
        }
        catch(IllegalStateException unused_ex) {
        }
        this.g = "fa";
        if(s == null || s1 == null) {
            if(s1 != null) {
                v = 0;
            }
            if((v ^ (s == null ? 1 : 0)) != 0) {
                Log.w("FA", "Specified origin or custom app id is null. Both parameters will be ignored.");
            }
        }
        else {
            Log.v("FA", "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
        }
        this.b(new m(this, s, s1, context0, bundle0));
        Application application0 = (Application)context0.getApplicationContext();
        if(application0 == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
            return;
        }
        application0.registerActivityLifecycleCallbacks(new y(this));
    }

    public final void a(Exception exception0, boolean z, boolean z1) {
        this.f |= z;
        if(z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exception0);
            return;
        }
        if(z1) {
            this.zzA(5, "Error with data collection. Data lost.", exception0, null, null);
        }
        Log.w("FA", "Error with data collection. Data lost.", exception0);
    }

    public final void b(u u0) {
        this.b.execute(u0);
    }

    public final void zzA(int v, String s, Object object0, Object object1, Object object2) {
        this.b(new m(this, s, object0));
    }

    public final void zzB(zzhf zzhf0) {
        w w0;
        Preconditions.checkNotNull(zzhf0);
        synchronized(this.d) {
            for(int v1 = 0; v1 < this.d.size(); ++v1) {
                if(zzhf0.equals(((Pair)this.d.get(v1)).first)) {
                    Log.w("FA", "OnEventListener already registered.");
                    return;
                }
            }
            w0 = new w(zzhf0);
            Pair pair0 = new Pair(zzhf0, w0);
            this.d.add(pair0);
        }
        if(this.h != null) {
            try {
                this.h.registerOnMeasurementEventListener(w0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.b(new s(this, w0, 0));
    }

    public final void zzC() {
        this.b(new k(this));
    }

    public final void zzD(Bundle bundle0) {
        this.b(new g(this, bundle0, 0));
    }

    public final void zzE(Bundle bundle0) {
        this.b(new g(this, bundle0, 1));
    }

    public final void zzF(Bundle bundle0) {
        this.b(new g(this, bundle0, 2));
    }

    public final void zzG(Activity activity0, String s, String s1) {
        this.b(new h(this, activity0, s, s1));
    }

    public final void zzH(boolean z) {
        this.b(new r(this, z));
    }

    public final void zzI(Bundle bundle0) {
        this.b(new g(this, bundle0, 3));
    }

    public final void zzJ(zzhe zzhe0) {
        v v0 = new v(zzhe0);
        if(this.h != null) {
            try {
                this.h.setEventInterceptor(v0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w("FA", "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.b(new j(this, v0, 1));
    }

    public final void zzK(Boolean boolean0) {
        this.b(new j(this, boolean0, 0));
    }

    public final void zzL(long v) {
        this.b(new l(this, v));
    }

    public final void zzM(String s) {
        this.b(new i(this, s, 0));
    }

    public final void zzN(String s, String s1, Object object0, boolean z) {
        this.b(new o(this, s, s1, object0, z));
    }

    public final void zzO(zzhf zzhf0) {
        w w0;
        Pair pair0;
        Preconditions.checkNotNull(zzhf0);
        synchronized(this.d) {
            for(int v1 = 0; true; ++v1) {
                pair0 = null;
                if(v1 >= this.d.size()) {
                    break;
                }
                if(zzhf0.equals(((Pair)this.d.get(v1)).first)) {
                    pair0 = (Pair)this.d.get(v1);
                    break;
                }
            }
            if(pair0 == null) {
                Log.w("FA", "OnEventListener had not been registered.");
                return;
            }
            this.d.remove(pair0);
            w0 = (w)pair0.second;
        }
        if(this.h != null) {
            try {
                this.h.unregisterOnMeasurementEventListener(w0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w("FA", "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.b(new s(this, w0, 1));
    }

    public final int zza(String s) {
        zzbz zzbz0 = new zzbz();
        this.b(new m(this, s, zzbz0));
        Integer integer0 = (Integer)zzbz.zze(zzbz0.zzb(10000L), Integer.class);
        return integer0 == null ? 25 : ((int)integer0);
    }

    public final long zzb() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 2));
        Long long0 = (Long)zzbz.zze(zzbz0.zzb(500L), Long.class);
        if(long0 == null) {
            long v = new Random(System.nanoTime() ^ this.a.currentTimeMillis()).nextLong();
            int v1 = this.e + 1;
            this.e = v1;
            return v + ((long)v1);
        }
        return (long)long0;
    }

    public final Bundle zzc(Bundle bundle0, boolean z) {
        zzbz zzbz0 = new zzbz();
        this.b(new m(this, bundle0, zzbz0));
        return z ? zzbz0.zzb(5000L) : null;
    }

    public final AppMeasurementSdk zzd() {
        return this.c;
    }

    public static zzee zzg(Context context0, String s, String s1, String s2, Bundle bundle0) {
        Preconditions.checkNotNull(context0);
        if(zzee.i == null) {
            synchronized(zzee.class) {
                if(zzee.i == null) {
                    zzee.i = new zzee(context0, s1, s2, bundle0);
                }
            }
        }
        return zzee.i;
    }

    public final Object zzh(int v) {
        zzbz zzbz0 = new zzbz();
        this.b(new q(this, zzbz0, v));
        return zzbz.zze(zzbz0.zzb(15000L), Object.class);
    }

    public final String zzj() {
        return this.g;
    }

    public final String zzk() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 5));
        return zzbz0.zzc(120000L);
    }

    public final String zzl() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 1));
        return zzbz0.zzc(50L);
    }

    public final String zzm() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 4));
        return zzbz0.zzc(500L);
    }

    public final String zzn() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 3));
        return zzbz0.zzc(500L);
    }

    public final String zzo() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 0));
        return zzbz0.zzc(500L);
    }

    public final List zzp(String s, String s1) {
        zzbz zzbz0 = new zzbz();
        this.b(new h(this, s, s1, zzbz0, 1));
        List list0 = (List)zzbz.zze(zzbz0.zzb(5000L), List.class);
        return list0 == null ? Collections.emptyList() : list0;
    }

    public final Map zzq(String s, String s1, boolean z) {
        zzbz zzbz0 = new zzbz();
        this.b(new o(this, s, s1, z, zzbz0));
        Bundle bundle0 = zzbz0.zzb(5000L);
        if(bundle0 != null && bundle0.size() != 0) {
            Map map0 = new HashMap(bundle0.size());
            for(Object object0: bundle0.keySet()) {
                String s2 = (String)object0;
                Object object1 = bundle0.get(s2);
                if(object1 instanceof Double || object1 instanceof Long || object1 instanceof String) {
                    ((HashMap)map0).put(s2, object1);
                }
            }
            return map0;
        }
        return Collections.emptyMap();
    }

    public final void zzu(String s) {
        this.b(new i(this, s, 1));
    }

    public final void zzv(String s, String s1, Bundle bundle0) {
        this.b(new h(this, s, s1, bundle0, 0));
    }

    public final void zzw(String s) {
        this.b(new i(this, s, 2));
    }

    public final void zzx(String s, Bundle bundle0) {
        this.b(new t(this, null, null, s, bundle0, false, true));
    }

    public final void zzy(String s, String s1, Bundle bundle0) {
        this.b(new t(this, null, s, s1, bundle0, true, true));
    }

    public final void zzz(String s, String s1, Bundle bundle0, long v) {
        this.b(new t(this, v, s, s1, bundle0, true, false));
    }
}

