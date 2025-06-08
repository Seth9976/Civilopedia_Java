package R2;

import I2.c;
import J2.j;
import O2.q;

public final class e0 extends i0 implements c {
    public final a0 o;

    public e0(a0 a00) {
        j.f(a00, "property");
        super();
        this.o = a00;
    }

    @Override  // I2.c
    public final Object a(Object object0, Object object1) {
        return ((e0)((w2.c)this.o.t).getValue()).g(new Object[]{object0, object1});
    }

    @Override  // O2.m
    public final q f() {
        return this.o;
    }

    @Override  // R2.g0
    public final m0 t() {
        return this.o;
    }
}

