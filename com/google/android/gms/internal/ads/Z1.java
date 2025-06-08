package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;

public final class z1 implements Application.ActivityLifecycleCallbacks {
    public Activity i;
    public Application j;
    public final Object k;
    public boolean l;
    public boolean m;
    public final ArrayList n;
    public final ArrayList o;
    public A0 p;
    public boolean q;
    public long r;

    public z1() {
        this.k = new Object();
        this.l = true;
        this.m = false;
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.q = false;
    }

    public final void a(zzbbg zzbbg0) {
        synchronized(this.k) {
            this.n.add(zzbbg0);
        }
    }

    public final void b(zzbbg zzbbg0) {
        synchronized(this.k) {
            this.n.remove(zzbbg0);
        }
    }

    public final void c(Activity activity0) {
        synchronized(this.k) {
            if(!activity0.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.i = activity0;
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        synchronized(this.k) {
            Activity activity1 = this.i;
            if(activity1 != null) {
                if(activity1.equals(activity0)) {
                    this.i = null;
                }
                Iterator iterator0 = this.o.iterator();
                while(iterator0.hasNext()) {
                    Object object1 = iterator0.next();
                    zzbbu zzbbu0 = (zzbbu)object1;
                    try {
                        if(!zzbbu0.zza()) {
                            continue;
                        }
                        iterator0.remove();
                    }
                    catch(Exception exception0) {
                        zzt.zzo().zzt(exception0, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzcfi.zzh("", exception0);
                    }
                }
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.c(activity0);
        synchronized(this.k) {
            for(Object object1: this.o) {
                zzbbu zzbbu0 = (zzbbu)object1;
                try {
                    zzbbu0.zzb();
                }
                catch(Exception exception0) {
                    zzt.zzo().zzt(exception0, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzcfi.zzh("", exception0);
                }
            }
        }
        this.m = true;
        A0 a00 = this.p;
        if(a00 != null) {
            zzs.zza.removeCallbacks(a00);
        }
        A0 a01 = new A0(this, 4);
        this.p = a01;
        zzs.zza.postDelayed(a01, this.r);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        this.c(activity0);
        this.m = false;
        boolean z = this.l;
        this.l = true;
        A0 a00 = this.p;
        if(a00 != null) {
            zzs.zza.removeCallbacks(a00);
        }
        synchronized(this.k) {
            for(Object object1: this.o) {
                zzbbu zzbbu0 = (zzbbu)object1;
                try {
                    zzbbu0.zzc();
                }
                catch(Exception exception0) {
                    zzt.zzo().zzt(exception0, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzcfi.zzh("", exception0);
                }
            }
            if(z) {
                zzcfi.zze("App is still foreground.");
            }
            else {
                for(Object object2: this.n) {
                    zzbbg zzbbg0 = (zzbbg)object2;
                    try {
                        zzbbg0.zza(true);
                    }
                    catch(Exception exception1) {
                        zzcfi.zzh("", exception1);
                    }
                }
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        this.c(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }
}

