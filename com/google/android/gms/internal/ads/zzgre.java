package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzgre {
    public final List a;
    public final List b;

    public zzgre(int v, int v1) {
        this.a = zzgqr.zzc(v);
        this.b = zzgqr.zzc(v1);
    }

    public final zzgre zza(zzgrh zzgrh0) {
        this.b.add(zzgrh0);
        return this;
    }

    public final zzgre zzb(zzgrh zzgrh0) {
        this.a.add(zzgrh0);
        return this;
    }

    public final zzgrf zzc() {
        return new zzgrf(this.a, this.b);
    }
}

