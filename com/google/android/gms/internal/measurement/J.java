package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class j extends u {
    public final int m;
    public final zzee n;
    public final Object o;

    public j(zzee zzee0, Object object0, int v) {
        this.m = v;
        this.n = zzee0;
        this.o = object0;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        if(this.m != 0) {
            ((zzcc)Preconditions.checkNotNull(this.n.h)).setEventInterceptor(((v)this.o));
            return;
        }
        if(((Boolean)this.o) != null) {
            ((zzcc)Preconditions.checkNotNull(this.n.h)).setMeasurementEnabled(((Boolean)this.o).booleanValue(), this.i);
            return;
        }
        ((zzcc)Preconditions.checkNotNull(this.n.h)).clearMeasurementEnabled(this.i);
    }
}

