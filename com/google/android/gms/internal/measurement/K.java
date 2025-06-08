package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class k extends u {
    public final zzee m;

    public k(zzee zzee0) {
        this.m = zzee0;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        ((zzcc)Preconditions.checkNotNull(this.m.h)).resetAnalyticsData(this.i);
    }
}

