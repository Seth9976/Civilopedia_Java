package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

public final class g extends u {
    public final int m;
    public final Bundle n;
    public final zzee o;

    public g(zzee zzee0, Bundle bundle0, int v) {
        this.m = v;
        this.o = zzee0;
        this.n = bundle0;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        switch(this.m) {
            case 0: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).setConditionalUserProperty(this.n, this.i);
                return;
            }
            case 1: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).setConsent(this.n, this.i);
                return;
            }
            case 2: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).setConsentThirdParty(this.n, this.i);
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).setDefaultEventParameters(this.n);
            }
        }
    }
}

