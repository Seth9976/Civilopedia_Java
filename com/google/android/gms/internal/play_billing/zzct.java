package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Set;

public final class zzct extends a implements Serializable {
    public final transient zzco i;
    public static final zzct j;
    public static final zzct k;

    static {
        zzct.j = new zzct(r.m);
        zzct.k = new zzct(zzco.zzm(zzdh.zza()));
    }

    public zzct(zzco zzco0) {
        this.i = zzco0;
    }

    public static zzct zzb() {
        return zzct.j;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzdj
    public final Set zzc() {
        zzco zzco0 = this.i;
        return zzco0.isEmpty() ? x.q : new y(zzco0, p.i);
    }
}

