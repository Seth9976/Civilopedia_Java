package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class q extends u {
    public final zzbz m;
    public final int n;
    public final zzee o;

    public q(zzee zzee0, zzbz zzbz0, int v) {
        this.o = zzee0;
        this.m = zzbz0;
        this.n = v;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        ((zzcc)Preconditions.checkNotNull(this.o.h)).getTestFlag(this.m, this.n);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void b() {
        this.m.zzd(null);
    }
}

