package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class zzaqm {
    public final zzapc a;
    public final String b;
    public final String c;
    public volatile Method d;
    public final Class[] e;
    public final CountDownLatch f;

    public zzaqm(zzapc zzapc0, String s, String s1, Class[] arr_class) {
        this.d = null;
        this.f = new CountDownLatch(1);
        this.a = zzapc0;
        this.b = s;
        this.c = s1;
        this.e = arr_class;
        zzapc0.zzk().submit(new A0(this, 3));
    }

    public final Method zza() {
        if(this.d != null) {
            return this.d;
        }
        try {
            return this.f.await(2L, TimeUnit.SECONDS) ? this.d : null;
        }
        catch(InterruptedException unused_ex) {
            return null;
        }
    }
}

