package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class s extends u {
    public final int m;
    public final w n;
    public final zzee o;

    public s(zzee zzee0, w w0, int v) {
        this.m = v;
        this.o = zzee0;
        this.n = w0;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        if(this.m != 0) {
            ((zzcc)Preconditions.checkNotNull(this.o.h)).unregisterOnMeasurementEventListener(this.n);
            return;
        }
        ((zzcc)Preconditions.checkNotNull(this.o.h)).registerOnMeasurementEventListener(this.n);
    }
}

