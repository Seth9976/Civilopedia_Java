package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

public final class zzgkc {
    public final Map a;
    public static volatile zzgkc b;
    public static volatile zzgkc c;
    public static final zzgkc d;

    static {
        zzgkc.d = new zzgkc();
    }

    public zzgkc() {
        this.a = Collections.emptyMap();
    }

    public static zzgkc zza() {
        zzgkc zzgkc0 = zzgkc.b;
        if(zzgkc0 == null) {
            synchronized(zzgkc.class) {
                zzgkc0 = zzgkc.b;
                if(zzgkc0 == null) {
                    zzgkc0 = zzgkc.d;
                    zzgkc.b = zzgkc0;
                }
            }
        }
        return zzgkc0;
    }

    public static zzgkc zzb() {
        zzgkc zzgkc0 = zzgkc.c;
        if(zzgkc0 != null) {
            return zzgkc0;
        }
        synchronized(zzgkc.class) {
            zzgkc zzgkc1 = zzgkc.c;
            if(zzgkc1 != null) {
                return zzgkc1;
            }
            zzgkc zzgkc2 = v9.a();
            zzgkc.c = zzgkc2;
            return zzgkc2;
        }
    }

    public final zzgko zzc(zzgma zzgma0, int v) {
        p9 p90 = new p9(zzgma0, v);
        return (zzgko)this.a.get(p90);
    }
}

