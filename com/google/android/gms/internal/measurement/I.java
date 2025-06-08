package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class i extends u {
    public final int m;
    public final String n;
    public final zzee o;

    public i(zzee zzee0, String s, int v) {
        this.m = v;
        this.o = zzee0;
        this.n = s;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        switch(this.m) {
            case 0: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).setUserId(this.n, this.i);
                return;
            }
            case 1: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).beginAdUnitExposure(this.n, this.j);
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).endAdUnitExposure(this.n, this.j);
            }
        }
    }
}

