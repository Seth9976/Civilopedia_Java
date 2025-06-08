package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class l extends u {
    public final long m;
    public final zzee n;

    public l(zzee zzee0, long v) {
        this.n = zzee0;
        this.m = v;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        ((zzcc)Preconditions.checkNotNull(this.n.h)).setSessionTimeoutDuration(this.m);
    }
}

