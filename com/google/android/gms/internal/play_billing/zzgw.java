package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Map;

public final class zzgw {
    public final Map a;
    public static volatile zzgw b;
    public static final zzgw c;
    public static final int zzb;

    static {
        zzgw.c = new zzgw();
    }

    public zzgw() {
        this.a = Collections.emptyMap();
    }

    public static zzgw zza() {
        zzgw zzgw0 = zzgw.b;
        if(zzgw0 != null) {
            return zzgw0;
        }
        synchronized(zzgw.class) {
            zzgw zzgw1 = zzgw.b;
            if(zzgw1 != null) {
                return zzgw1;
            }
            zzgw zzgw2 = zzhe.b();
            zzgw.b = zzgw2;
            return zzgw2;
        }
    }

    public final zzhj zzb(zzim zzim0, int v) {
        m0 m00 = new m0(v, zzim0);
        return (zzhj)this.a.get(m00);
    }
}

