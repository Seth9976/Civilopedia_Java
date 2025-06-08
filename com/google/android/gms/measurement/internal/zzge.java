package com.google.android.gms.measurement.internal;

import D3.b;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzia;
import i1.B;
import i1.C;
import i1.L;
import i1.M;
import i1.p;
import i1.r;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import o1.a;
import org.checkerframework.dataflow.qual.Pure;

public final class zzge implements C {
    public volatile Boolean A;
    public final Boolean B;
    public final Boolean C;
    public volatile boolean D;
    public int E;
    public final AtomicInteger F;
    public final long G;
    public static volatile zzge H;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final zzab f;
    public final zzag g;
    public final r h;
    public final zzeu i;
    public final zzgb j;
    public final zzko k;
    public final zzln l;
    public final zzep m;
    public final Clock n;
    public final zziy o;
    public final zzij p;
    public final zzd q;
    public final zzin r;
    public final String s;
    public zzen t;
    public zzjy u;
    public zzaq v;
    public zzel w;
    public boolean x;
    public Boolean y;
    public long z;

    public zzge(zzhh zzhh0) {
        boolean z = false;
        this.x = false;
        this.F = new AtomicInteger(0);
        Preconditions.checkNotNull(zzhh0);
        Context context0 = zzhh0.a;
        zzab zzab0 = new zzab();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.f = zzab0;
        a.b = zzab0;
        this.a = context0;
        this.b = zzhh0.b;
        this.c = zzhh0.c;
        this.d = zzhh0.d;
        this.e = zzhh0.h;
        this.A = zzhh0.e;
        this.s = zzhh0.j;
        this.D = true;
        zzcl zzcl0 = zzhh0.g;
        if(zzcl0 != null) {
            Bundle bundle0 = zzcl0.zzg;
            if(bundle0 != null) {
                Object object0 = bundle0.get("measurementEnabled");
                if(object0 instanceof Boolean) {
                    this.B = (Boolean)object0;
                }
                Object object1 = zzcl0.zzg.get("measurementDeactivated");
                if(object1 instanceof Boolean) {
                    this.C = (Boolean)object1;
                }
            }
        }
        zzia.zze(context0);
        Clock clock0 = DefaultClock.getInstance();
        this.n = clock0;
        this.G = zzhh0.i == null ? clock0.currentTimeMillis() : ((long)zzhh0.i);
        zzag zzag0 = new zzag(this);  // 初始化器: Li1/A;-><init>(Lcom/google/android/gms/measurement/internal/zzge;)V
        zzag0.c = zzae.zza;
        this.g = zzag0;
        r r0 = new r(this);
        r0.zzv();
        this.h = r0;
        zzeu zzeu0 = new zzeu(this);
        zzeu0.zzv();
        this.i = zzeu0;
        zzln zzln0 = new zzln(this);
        zzln0.zzv();
        this.l = zzln0;
        this.m = new zzep(new b(this, 21));
        this.q = new zzd(this);
        zziy zziy0 = new zziy(this);
        zziy0.zzb();
        this.o = zziy0;
        zzij zzij0 = new zzij(this);
        zzij0.zzb();
        this.p = zzij0;
        zzko zzko0 = new zzko(this);
        zzko0.zzb();
        this.k = zzko0;
        zzin zzin0 = new zzin(this);  // 初始化器: Li1/B;-><init>(Lcom/google/android/gms/measurement/internal/zzge;)V
        zzin0.zzv();
        this.r = zzin0;
        zzgb zzgb0 = new zzgb(this);
        zzgb0.zzv();
        this.j = zzgb0;
        if(zzhh0.g == null || zzhh0.g.zzb == 0L) {
            z = true;
        }
        if(context0.getApplicationContext() instanceof Application) {
            zzij zzij1 = this.zzq();
            if(zzij1.a.a.getApplicationContext() instanceof Application) {
                Application application0 = (Application)zzij1.a.a.getApplicationContext();
                if(zzij1.c == null) {
                    zzij1.c = new L(zzij1);
                }
                if(z) {
                    application0.unregisterActivityLifecycleCallbacks(zzij1.c);
                    application0.registerActivityLifecycleCallbacks(zzij1.c);
                    zzij1.a.zzay().zzj().zza("Registered activity lifecycle callback");
                }
            }
        }
        else {
            this.zzay().zzk().zza("Application context is not an Application");
        }
        zzgb0.zzp(new B.a(this, zzhh0, 11, false));
    }

    public final boolean a() {
        if(!this.x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        this.zzaz().zzg();
        Clock clock0 = this.n;
        if(this.y == null || this.z == 0L || !this.y.booleanValue() && Math.abs(clock0.elapsedRealtime() - this.z) > 1000L) {
            this.z = clock0.elapsedRealtime();
            boolean z = true;
            boolean z1 = this.zzv().v("android.permission.INTERNET") && this.zzv().v("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.a).isCallerInstantApp() || this.g.d() || zzln.A(this.a) && zzln.B(this.a));
            this.y = Boolean.valueOf(z1);
            if(z1) {
                zzln zzln0 = this.zzv();
                String s = this.zzh().zzm();
                zzel zzel0 = this.zzh();
                zzel0.zza();
                if(!zzln0.o(s, zzel0.m)) {
                    zzel zzel1 = this.zzh();
                    zzel1.zza();
                    if(TextUtils.isEmpty(zzel1.m)) {
                        z = false;
                    }
                }
                this.y = Boolean.valueOf(z);
            }
        }
        return this.y.booleanValue();
    }

    public static final void b(p p0) {
        if(p0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(!p0.b) {
            throw new IllegalStateException("Component not initialized: " + p0.getClass());
        }
    }

    public static final void c(B b0) {
        if(b0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(!b0.b) {
            throw new IllegalStateException("Component not initialized: " + b0.getClass());
        }
    }

    public final void zzE() {
        Pair pair0;
        this.zzaz().zzg();
        zzge.c(this.zzr());
        String s = this.zzh().zzl();
        r r0 = this.zzm();
        r0.zzg();
        zzge zzge0 = r0.a;
        long v = zzge0.zzav().elapsedRealtime();
        String s1 = r0.g;
        if(s1 == null || v >= r0.i) {
            r0.i = zzge0.zzf().zzi(s, zzeh.zza) + v;
            try {
                Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(zzge0.zzau());
                r0.g = "";
                String s2 = advertisingIdClient$Info0.getId();
                if(s2 != null) {
                    r0.g = s2;
                }
                r0.h = advertisingIdClient$Info0.isLimitAdTrackingEnabled();
            }
            catch(Exception exception0) {
                zzge0.zzay().zzc().zzb("Unable to get advertising id", exception0);
                r0.g = "";
            }
            pair0 = new Pair(r0.g, Boolean.valueOf(r0.h));
        }
        else {
            pair0 = new Pair(s1, Boolean.valueOf(r0.h));
        }
        if(this.g.zzr() && !((Boolean)pair0.second).booleanValue() && !TextUtils.isEmpty(((CharSequence)pair0.first))) {
            zzin zzin0 = this.zzr();
            zzin0.c();
            ConnectivityManager connectivityManager0 = (ConnectivityManager)zzin0.a.a.getSystemService("connectivity");
            NetworkInfo networkInfo0 = null;
            if(connectivityManager0 != null) {
                try {
                    networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                }
                catch(SecurityException unused_ex) {
                }
            }
            if(networkInfo0 != null && networkInfo0.isConnected()) {
                zzln zzln0 = this.zzv();
                this.zzh().a.g.zzh();
                URL uRL0 = zzln0.zzE(68000L, s, ((String)pair0.first), this.zzm().r.zza() - 1L);
                if(uRL0 != null) {
                    zzin zzin1 = this.zzr();
                    zzgc zzgc0 = new zzgc(this);
                    zzin1.zzg();
                    zzin1.c();
                    Preconditions.checkNotNull(uRL0);
                    Preconditions.checkNotNull(zzgc0);
                    zzin1.a.zzaz().zzo(new M(zzin1, s, uRL0, zzgc0));
                }
                return;
            }
            this.zzay().zzk().zza("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        this.zzay().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    public final void zzG(boolean z) {
        this.zzaz().zzg();
        this.D = z;
    }

    public final boolean zzI() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean zzJ() {
        return this.zza() == 0;
    }

    public final boolean zzK() {
        this.zzaz().zzg();
        return this.D;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.b);
    }

    @Pure
    public final boolean zzN() {
        return this.e;
    }

    public final int zza() {
        this.zzaz().zzg();
        if(this.g.zzv()) {
            return 1;
        }
        if(this.C != null && this.C.booleanValue()) {
            return 2;
        }
        this.zzaz().zzg();
        if(!this.D) {
            return 8;
        }
        r r0 = this.zzm();
        r0.zzg();
        Boolean boolean0 = r0.d().contains("measurement_enabled") ? Boolean.valueOf(r0.d().getBoolean("measurement_enabled", true)) : null;
        if(boolean0 != null) {
            return boolean0.booleanValue() ? 0 : 3;
        }
        Boolean boolean1 = this.g.c("firebase_analytics_collection_enabled");
        if(boolean1 != null) {
            return boolean1.booleanValue() ? 0 : 4;
        }
        Boolean boolean2 = this.B;
        if(boolean2 != null) {
            return boolean2.booleanValue() ? 0 : 5;
        }
        return this.A != null && !this.A.booleanValue() ? 7 : 0;
    }

    @Override  // i1.C
    @Pure
    public final Context zzau() {
        return this.a;
    }

    @Override  // i1.C
    @Pure
    public final Clock zzav() {
        return this.n;
    }

    @Override  // i1.C
    @Pure
    public final zzab zzaw() {
        return this.f;
    }

    @Override  // i1.C
    @Pure
    public final zzeu zzay() {
        zzge.c(this.i);
        return this.i;
    }

    @Override  // i1.C
    @Pure
    public final zzgb zzaz() {
        zzge.c(this.j);
        return this.j;
    }

    @Pure
    public final zzd zzd() {
        zzd zzd0 = this.q;
        if(zzd0 == null) {
            throw new IllegalStateException("Component not created");
        }
        return zzd0;
    }

    @Pure
    public final zzag zzf() {
        return this.g;
    }

    @Pure
    public final zzaq zzg() {
        zzge.c(this.v);
        return this.v;
    }

    @Pure
    public final zzel zzh() {
        zzge.b(this.w);
        return this.w;
    }

    @Pure
    public final zzen zzi() {
        zzge.b(this.t);
        return this.t;
    }

    @Pure
    public final zzep zzj() {
        return this.m;
    }

    public final zzeu zzl() {
        return this.i == null || !this.i.b ? null : this.i;
    }

    @Pure
    public final r zzm() {
        r r0 = this.h;
        if(r0 == null) {
            throw new IllegalStateException("Component not created");
        }
        return r0;
    }

    public static zzge zzp(Context context0, zzcl zzcl0, Long long0) {
        if(zzcl0 != null && (zzcl0.zze == null || zzcl0.zzf == null)) {
            zzcl0 = new zzcl(zzcl0.zza, zzcl0.zzb, zzcl0.zzc, zzcl0.zzd, null, null, zzcl0.zzg, null);
        }
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(zzge.H == null) {
            synchronized(zzge.class) {
                if(zzge.H == null) {
                    zzge.H = new zzge(new zzhh(context0, zzcl0, long0));
                }
            }
        }
        else if(zzcl0 != null && (zzcl0.zzg != null && zzcl0.zzg.containsKey("dataCollectionDefaultEnabled"))) {
            Preconditions.checkNotNull(zzge.H);
            zzge zzge0 = zzge.H;
            zzge0.A = Boolean.valueOf(zzcl0.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzge.H);
        return zzge.H;
    }

    @Pure
    public final zzij zzq() {
        zzge.b(this.p);
        return this.p;
    }

    @Pure
    public final zzin zzr() {
        zzge.c(this.r);
        return this.r;
    }

    @Pure
    public final zziy zzs() {
        zzge.b(this.o);
        return this.o;
    }

    @Pure
    public final zzjy zzt() {
        zzge.b(this.u);
        return this.u;
    }

    @Pure
    public final zzko zzu() {
        zzge.b(this.k);
        return this.k;
    }

    @Pure
    public final zzln zzv() {
        zzln zzln0 = this.l;
        if(zzln0 == null) {
            throw new IllegalStateException("Component not created");
        }
        return zzln0;
    }

    @Pure
    public final String zzw() {
        return this.b;
    }

    @Pure
    public final String zzx() {
        return this.c;
    }

    @Pure
    public final String zzy() {
        return this.d;
    }

    @Pure
    public final String zzz() {
        return this.s;
    }
}

