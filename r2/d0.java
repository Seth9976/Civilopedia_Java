package R2;

import J2.j;
import O2.n;
import O2.o;
import O2.p;
import a3.I;
import w2.c;
import w2.d;
import x2.w;

public class d0 extends m0 implements p {
    public final Object s;

    public d0(F f0, I i0) {
        j.f(f0, "container");
        j.f(i0, "descriptor");
        super(f0, i0);
        c0 c00 = new c0(this, 0);
        this.s = w.p(d.i, c00);
        c0 c01 = new c0(this, 1);
        w.p(d.i, c01);
    }

    public d0(F f0, String s, String s1, Object object0) {
        j.f(f0, "container");
        j.f(s, "name");
        j.f(s1, "signature");
        super(f0, s, s1, null, object0);
        c0 c00 = new c0(this, 0);
        this.s = w.p(d.i, c00);
        c0 c01 = new c0(this, 1);
        w.p(d.i, c01);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        return ((b0)((c)this.s).getValue()).g(new Object[]{object0});
    }

    @Override  // O2.q
    public final n d() {
        return (b0)((c)this.s).getValue();
    }

    @Override  // O2.p
    public final o d() {
        return (b0)((c)this.s).getValue();
    }

    @Override  // R2.m0
    public final i0 u() {
        return (b0)((c)this.s).getValue();
    }
}

