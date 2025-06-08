package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

public final class t extends u {
    public final Long m;
    public final String n;
    public final String o;
    public final Bundle p;
    public final boolean q;
    public final boolean r;
    public final zzee s;

    public t(zzee zzee0, Long long0, String s, String s1, Bundle bundle0, boolean z, boolean z1) {
        this.s = zzee0;
        this.m = long0;
        this.n = s;
        this.o = s1;
        this.p = bundle0;
        this.q = z;
        this.r = z1;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        ((zzcc)Preconditions.checkNotNull(this.s.h)).logEvent(this.n, this.o, this.p, this.q, this.r, (this.m == null ? this.i : ((long)this.m)));
    }
}

