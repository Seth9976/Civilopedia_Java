package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class r extends u {
    public final boolean m;
    public final zzee n;

    public r(zzee zzee0, boolean z) {
        this.n = zzee0;
        this.m = z;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        ((zzcc)Preconditions.checkNotNull(this.n.h)).setDataCollectionEnabled(this.m);
    }
}

