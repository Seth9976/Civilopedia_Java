package R2;

import I2.a;
import I2.c;
import J2.j;
import O2.n;
import a3.I;
import w2.d;
import x2.w;

public class a0 extends m0 implements a, c {
    public final int s;
    public final Object t;

    public a0(F f0, I i0, int v) {
        this.s = v;
        if(v != 1) {
            j.f(f0, "container");
            j.f(i0, "descriptor");
            super(f0, i0);
            Z z0 = new Z(this, 0);
            this.t = w.p(d.i, z0);
            Z z1 = new Z(this, 1);
            w.p(d.i, z1);
            return;
        }
        j.f(f0, "container");
        j.f(i0, "descriptor");
        super(f0, i0);
        f0 f00 = new f0(this, 0);
        this.t = w.p(d.i, f00);
        f0 f01 = new f0(this, 1);
        w.p(d.i, f01);
    }

    @Override  // I2.c
    public Object a(Object object0, Object object1) {
        return ((e0)((w2.c)this.t).getValue()).g(new Object[]{object0, object1});
    }

    @Override  // O2.q
    public final n d() {
        return this.s != 0 ? ((e0)((w2.c)this.t).getValue()) : ((Y)((w2.c)this.t).getValue());
    }

    @Override  // I2.a
    public Object invoke() {
        return ((Y)((w2.c)this.t).getValue()).g(new Object[0]);
    }

    @Override  // R2.m0
    public final i0 u() {
        return this.s != 0 ? ((e0)((w2.c)this.t).getValue()) : ((Y)((w2.c)this.t).getValue());
    }
}

