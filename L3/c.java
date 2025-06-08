package l3;

import I2.a;
import J2.l;
import M3.A;
import M3.K;
import X2.T;
import X2.h;
import d3.q;

public final class c extends l implements a {
    public final B1.a i;
    public final T j;
    public final l3.a k;
    public final K l;
    public final q m;

    public c(B1.a a0, T t0, l3.a a1, K k0, q q0) {
        this.i = a0;
        this.j = t0;
        this.k = a1;
        this.l = k0;
        this.m = q0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        B.c c0 = (B.c)this.i.l;
        h h0 = this.l.q();
        A a0 = h0 == null ? null : h0.k();
        l3.a a1 = l3.a.a(l3.a.a(this.k, null, false, null, a0, 0x1F), null, this.m.d(), null, null, 59);
        return c0.w(this.j, a1);
    }
}

