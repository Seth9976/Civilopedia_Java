package com.google.android.gms.internal.ads;

import F0.g;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzdw {
    public final Handler a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public static zzdw e;

    public zzdw(Context context0) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context0.registerReceiver(new g(this, 4), intentFilter0);
    }

    public static void a(zzdw zzdw0, int v) {
        synchronized(zzdw0.c) {
            if(zzdw0.d == v) {
                return;
            }
            zzdw0.d = v;
        }
        for(Object object1: zzdw0.b) {
            WeakReference weakReference0 = (WeakReference)object1;
            zzvw zzvw0 = (zzvw)weakReference0.get();
            if(zzvw0 == null) {
                zzdw0.b.remove(weakReference0);
            }
            else {
                zzvy.zzh(zzvw0.zza, v);
            }
        }
    }

    public final int zza() {
        synchronized(this.c) {
        }
        return this.d;
    }

    public static zzdw zzb(Context context0) {
        synchronized(zzdw.class) {
            if(zzdw.e == null) {
                zzdw.e = new zzdw(context0);
            }
            return zzdw.e;
        }
    }

    public final void zzd(zzvw zzvw0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.b;
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0.get() == null) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
        }
        copyOnWriteArrayList0.add(new WeakReference(zzvw0));
        zzdq zzdq0 = new zzdq(this, zzvw0, null);
        this.a.post(zzdq0);
    }
}

