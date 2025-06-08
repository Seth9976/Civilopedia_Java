package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class o extends u {
    public final int m;
    public final String n;
    public final String o;
    public final boolean p;
    public final zzee q;
    public final Object r;

    public o(zzee zzee0, String s, String s1, Object object0, boolean z) {
        this.m = 1;
        this.q = zzee0;
        this.n = s;
        this.o = s1;
        this.r = object0;
        this.p = z;
        super(zzee0, true);
    }

    public o(zzee zzee0, String s, String s1, boolean z, zzbz zzbz0) {
        this.m = 0;
        this.q = zzee0;
        this.n = s;
        this.o = s1;
        this.p = z;
        this.r = zzbz0;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        if(this.m != 0) {
            Object object0 = Preconditions.checkNotNull(this.q.h);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.r);
            ((zzcc)object0).setUserProperty(this.n, this.o, iObjectWrapper0, this.p, this.i);
            return;
        }
        ((zzcc)Preconditions.checkNotNull(this.q.h)).getUserProperties(this.n, this.o, this.p, ((zzbz)this.r));
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public void b() {
        if(this.m != 0) {
            return;
        }
        ((zzbz)this.r).zzd(null);
    }
}

