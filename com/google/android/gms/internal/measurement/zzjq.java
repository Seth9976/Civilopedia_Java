package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

public final class zzjq {
    public final Map a;
    public static volatile zzjq b;
    public static volatile zzjq c;
    public static final zzjq d;

    static {
        zzjq.d = new zzjq();
    }

    public zzjq() {
        this.a = Collections.emptyMap();
    }

    public static zzjq zza() {
        zzjq zzjq0 = zzjq.b;
        if(zzjq0 == null) {
            synchronized(zzjq.class) {
                zzjq0 = zzjq.b;
                if(zzjq0 == null) {
                    zzjq0 = zzjq.d;
                    zzjq.b = zzjq0;
                }
            }
        }
        return zzjq0;
    }

    public static zzjq zzb() {
        zzjq zzjq0 = zzjq.c;
        if(zzjq0 != null) {
            return zzjq0;
        }
        synchronized(zzjq.class) {
            zzjq zzjq1 = zzjq.c;
            if(zzjq1 != null) {
                return zzjq1;
            }
            zzjq zzjq2 = X.a();
            zzjq.c = zzjq2;
            return zzjq2;
        }
    }

    public final zzkc zzc(zzll zzll0, int v) {
        T t0 = new T(zzll0, v);
        return (zzkc)this.a.get(t0);
    }
}

