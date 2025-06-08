package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzcdn {
    public final AtomicReference a;
    public final Object b;
    public String c;
    public String d;
    public final AtomicBoolean e;
    public final AtomicInteger f;
    public final AtomicReference g;
    public final AtomicReference h;
    public final ConcurrentHashMap i;
    public final AtomicReference j;
    public final ArrayBlockingQueue k;
    public final Object l;

    public zzcdn() {
        this.a = new AtomicReference(null);
        this.b = new Object();
        this.c = null;
        this.d = null;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicInteger(-1);
        this.g = new AtomicReference(null);
        this.h = new AtomicReference(null);
        this.i = new ConcurrentHashMap(9);
        this.j = new AtomicReference(null);
        this.k = new ArrayBlockingQueue(20);
        this.l = new Object();
    }

    public final void a(Context context0, String s, String s1) {
        AtomicReference atomicReference0 = this.g;
        if(this.e(context0, "com.google.android.gms.measurement.AppMeasurement", atomicReference0, true)) {
            ConcurrentHashMap concurrentHashMap0 = this.i;
            Method method0 = (Method)concurrentHashMap0.get(s1);
            if(method0 == null) {
                try {
                    method0 = context0.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(s1, String.class);
                    concurrentHashMap0.put(s1, method0);
                }
                catch(Exception unused_ex) {
                    this.c(s1, false);
                    method0 = null;
                }
            }
            try {
                method0.invoke(atomicReference0.get(), s);
                zze.zza(("Invoke Firebase method " + s1 + ", Ad Unit Id: " + s));
            }
            catch(Exception unused_ex) {
                this.c(s1, false);
            }
        }
    }

    public final void b(Context context0, String s, String s1, Bundle bundle0) {
        if(this.zzu(context0)) {
            Bundle bundle1 = new Bundle();
            try {
                bundle1.putLong("_aeid", Long.parseLong(s1));
            }
            catch(NullPointerException | NumberFormatException nullPointerException0) {
                zzcfi.zzh(("Invalid event ID: " + s1), nullPointerException0);
            }
            if("_ac".equals(s)) {
                bundle1.putInt("_r", 1);
            }
            if(bundle0 != null) {
                bundle1.putAll(bundle0);
            }
            if(zzcdn.f(context0)) {
                this.d("logEventInternal", new zzccz(s, bundle1));
                return;
            }
            AtomicReference atomicReference0 = this.g;
            if(this.e(context0, "com.google.android.gms.measurement.AppMeasurement", atomicReference0, true)) {
                ConcurrentHashMap concurrentHashMap0 = this.i;
                Method method0 = (Method)concurrentHashMap0.get("logEventInternal");
                if(method0 == null) {
                    try {
                        method0 = context0.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap0.put("logEventInternal", method0);
                    }
                    catch(Exception unused_ex) {
                        this.c("logEventInternal", true);
                        method0 = null;
                    }
                }
                try {
                    method0.invoke(atomicReference0.get(), "am", s, bundle1);
                }
                catch(Exception unused_ex) {
                    this.c("logEventInternal", true);
                }
            }
        }
    }

    public final void c(String s, boolean z) {
        AtomicBoolean atomicBoolean0 = this.e;
        if(!atomicBoolean0.get()) {
            zzcfi.zzj(("Invoke Firebase method " + s + " error."));
            if(z) {
                zzcfi.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                atomicBoolean0.set(true);
            }
        }
    }

    public final void d(String s, x2 x20) {
        synchronized(this.j) {
            FutureTask futureTask0 = new FutureTask(new zzcda(this, x20, s), null);
            if(this.j.get() == null) {
                this.k.offer(futureTask0);
            }
            else {
                futureTask0.run();
            }
        }
    }

    public final boolean e(Context context0, String s, AtomicReference atomicReference0, boolean z) {
        if(atomicReference0.get() == null) {
            try {
                zzccw.zza(atomicReference0, null, context0.getClassLoader().loadClass(s).getDeclaredMethod("getInstance", Context.class).invoke(null, context0));
                return true;
            }
            catch(Exception unused_ex) {
                this.c("getInstance", z);
                return false;
            }
        }
        return true;
    }

    public static final boolean f(Context context0) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzaf)).booleanValue() || DynamiteModule.getLocalVersion(context0, "com.google.android.gms.ads.dynamite") < ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzag))))) {
            return false;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzah)).booleanValue()) {
            try {
                context0.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            }
            catch(ClassNotFoundException unused_ex) {
            }
        }
        return true;
    }

    public final Object g(String s, Object object0, w2 w20) {
        synchronized(this.j) {
            if(((zzcmz)this.j.get()) != null) {
                try {
                    return w20.zza(((zzcmz)this.j.get()));
                }
                catch(Exception unused_ex) {
                    this.c(s, false);
                }
            }
            return object0;
        }
    }

    public final Object h(Context context0, String s) {
        AtomicReference atomicReference0 = this.g;
        if(!this.e(context0, "com.google.android.gms.measurement.AppMeasurement", atomicReference0, true)) {
            return null;
        }
        Method method0 = this.i(context0, s);
        try {
            return method0.invoke(atomicReference0.get(), null);
        }
        catch(Exception unused_ex) {
            this.c(s, true);
            return null;
        }
    }

    public final Method i(Context context0, String s) {
        ConcurrentHashMap concurrentHashMap0 = this.i;
        Method method0 = (Method)concurrentHashMap0.get(s);
        if(method0 != null) {
            return method0;
        }
        try {
            Method method1 = context0.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(s, null);
            concurrentHashMap0.put(s, method1);
            return method1;
        }
        catch(Exception unused_ex) {
            this.c(s, false);
            return null;
        }
    }

    public final ExecutorService j() {
        AtomicReference atomicReference0 = this.a;
        if(atomicReference0.get() == null) {
            zzccw.zza(atomicReference0, null, new ThreadPoolExecutor(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzae)))), ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzae)))), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new v2(0)));
        }
        return (ExecutorService)atomicReference0.get();
    }

    public final String zza(Context context0) {
        if(!this.zzu(context0)) {
            return null;
        }
        if(zzcdn.f(context0)) {
            Long long0 = (Long)this.g("getAdEventId", null, zzcdb.zza);
            return long0 == null ? null : Long.toString(((long)long0));
        }
        Object object0 = this.h(context0, "generateEventId");
        return object0 == null ? null : object0.toString();
    }

    public final String zzb(Context context0) {
        if(!this.zzu(context0)) {
            return null;
        }
        synchronized(this.b) {
            String s = this.d;
            if(s != null) {
                return s;
            }
            this.d = zzcdn.f(context0) ? ((String)this.g("getAppIdOrigin", this.d, zzcdf.zza)) : "fa";
            return this.d;
        }
    }

    public final String zzc(Context context0) {
        if(!this.zzu(context0)) {
            return null;
        }
        long v = (long)(((Long)zzay.zzc().zzb(zzbhz.zzad)));
        if(zzcdn.f(context0)) {
            try {
                return v >= 0L ? ((String)this.j().submit(new zzcdh(this)).get(v, TimeUnit.MILLISECONDS)) : ((String)this.g("getAppInstanceId", null, zzcdg.zza));
            }
            catch(TimeoutException unused_ex) {
                return "TIME_OUT";
            }
            catch(Exception unused_ex) {
                return null;
            }
        }
        if(v < 0L) {
            return (String)this.h(context0, "getAppInstanceId");
        }
        Future future0 = this.j().submit(new zzcdi(this, context0));
        try {
            return (String)future0.get(v, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException unused_ex) {
            return "TIME_OUT";
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public final String zzd(Context context0) {
        if(!this.zzu(context0)) {
            return "";
        }
        if(zzcdn.f(context0)) {
            return (String)this.g("getCurrentScreenNameOrScreenClass", "", zzcdc.zza);
        }
        AtomicReference atomicReference0 = this.g;
        if(!this.e(context0, "com.google.android.gms.measurement.AppMeasurement", atomicReference0, true)) {
            return "";
        }
        try {
            String s = (String)this.i(context0, "getCurrentScreenName").invoke(atomicReference0.get(), null);
            if(s == null) {
                s = (String)this.i(context0, "getCurrentScreenClass").invoke(atomicReference0.get(), null);
            }
            return s == null ? "" : s;
        }
        catch(Exception unused_ex) {
            this.c("getCurrentScreenName", false);
            return "";
        }
    }

    public final String zze(Context context0) {
        if(!this.zzu(context0)) {
            return null;
        }
        synchronized(this.b) {
            String s = this.c;
            if(s != null) {
                return s;
            }
            this.c = zzcdn.f(context0) ? ((String)this.g("getGmpAppId", this.c, zzccy.zza)) : ((String)this.h(context0, "getGmpAppId"));
            return this.c;
        }
    }

    public final void zzh(Context context0, String s) {
        if(!this.zzu(context0)) {
            return;
        }
        if(zzcdn.f(context0)) {
            this.d("beginAdUnitExposure", new zzccx(s));
            return;
        }
        this.a(context0, s, "beginAdUnitExposure");
    }

    public final void zzi(Context context0, String s) {
        if(!this.zzu(context0)) {
            return;
        }
        if(zzcdn.f(context0)) {
            this.d("endAdUnitExposure", new zzcde(s));
            return;
        }
        this.a(context0, s, "endAdUnitExposure");
    }

    public final void zzk(Context context0, String s) {
        this.b(context0, "_aa", s, null);
    }

    public final void zzl(Context context0, String s) {
        this.b(context0, "_aq", s, null);
    }

    public final void zzm(Context context0, String s) {
        this.b(context0, "_ac", s, null);
    }

    public final void zzn(Context context0, String s) {
        this.b(context0, "_ai", s, null);
    }

    public final void zzo(Context context0, String s, String s1, String s2, int v) {
        if(!this.zzu(context0)) {
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("_ai", s1);
        bundle0.putString("reward_type", s2);
        bundle0.putInt("reward_value", v);
        this.b(context0, "_ar", s, bundle0);
        zze.zza(("Log a Firebase reward video event, reward type: " + s2 + ", reward value: " + v));
    }

    public final void zzp(Context context0, zzl zzl0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzak)).booleanValue() && this.zzu(context0) && zzcdn.f(context0)) {
        }
    }

    public final void zzq(Context context0, zzez zzez0) {
        zzcdo.zzd(context0).a().zzd(zzez0);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzak)).booleanValue() && this.zzu(context0) && zzcdn.f(context0)) {
        }
    }

    public final void zzr(Bundle bundle0) {
        this.d("setConsent", new zzcdj(bundle0));
    }

    @Deprecated
    public final void zzs(Context context0, String s) {
        if(!this.zzu(context0)) {
            return;
        }
        if(!(context0 instanceof Activity)) {
            return;
        }
        if(zzcdn.f(context0)) {
            this.d("setScreenName", new zzcdd(context0, s));
            return;
        }
        AtomicReference atomicReference0 = this.h;
        if(this.e(context0, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference0, false)) {
            ConcurrentHashMap concurrentHashMap0 = this.i;
            Method method0 = (Method)concurrentHashMap0.get("setCurrentScreen");
            if(method0 == null) {
                try {
                    method0 = context0.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    concurrentHashMap0.put("setCurrentScreen", method0);
                }
                catch(Exception unused_ex) {
                    this.c("setCurrentScreen", false);
                    method0 = null;
                }
            }
            try {
                method0.invoke(atomicReference0.get(), ((Activity)context0), s, "com.spears.civilopedia");
            }
            catch(Exception unused_ex) {
                this.c("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzt() {
        synchronized(this.l) {
        }
        return false;
    }

    public final boolean zzu(Context context0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzY)).booleanValue() && !this.e.get()) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzai)).booleanValue()) {
                return true;
            }
            AtomicInteger atomicInteger0 = this.f;
            if(atomicInteger0.get() == -1) {
                if(!zzcfb.zzr(context0, 12451000) && zzcfb.zzs(context0)) {
                    zzcfi.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    atomicInteger0.set(0);
                    return atomicInteger0.get() == 1;
                }
                atomicInteger0.set(1);
            }
            return atomicInteger0.get() == 1;
        }
        return false;
    }
}

