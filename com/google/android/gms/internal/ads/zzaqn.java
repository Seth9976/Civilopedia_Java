package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class zzaqn implements Callable {
    public final zzapc a;
    public final String b;
    public final String c;
    public final zzali d;
    public Method e;
    public final int f;
    public final int g;

    public zzaqn(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1) {
        this.a = zzapc0;
        this.b = s;
        this.c = s1;
        this.d = zzali0;
        this.f = v;
        this.g = v1;
    }

    public abstract void a();

    @Override
    public Object call() throws Exception {
        this.zzk();
        return null;
    }

    public Void zzk() throws Exception {
        try {
            zzapc zzapc0 = this.a;
            long v = System.nanoTime();
            Method method0 = zzapc0.zzj(this.b, this.c);
            this.e = method0;
            if(method0 == null) {
                return null;
            }
            this.a();
            zzanx zzanx0 = zzapc0.zzd();
            if(zzanx0 != null) {
                int v1 = this.f;
                if(v1 != 0x80000000) {
                    zzanx0.zzc(this.g, v1, (System.nanoTime() - v) / 1000L, null, null);
                }
            }
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
        }
        return null;
    }
}

