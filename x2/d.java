package X2;

import J2.j;
import L3.p;
import M3.A;
import M3.K;
import M3.a0;
import java.util.List;
import v3.f;

public final class d implements T {
    public final T i;
    public final i j;
    public final int k;

    public d(T t0, i i0, int v) {
        j.f(i0, "declarationDescriptor");
        super();
        this.i = t0;
        this.j = i0;
        this.k = v;
    }

    @Override  // X2.h
    public final K B() {
        return this.i.B();
    }

    @Override  // X2.T
    public final p C() {
        return this.i.C();
    }

    @Override  // X2.T
    public final boolean O() {
        return true;
    }

    @Override  // X2.T
    public final boolean P() {
        return this.i.P();
    }

    @Override  // X2.T
    public final int U() {
        return this.i.U() + this.k;
    }

    @Override  // X2.T
    public final T a() {
        return this.i.a();
    }

    @Override  // X2.h
    public final h a() {
        return this.i.a();
    }

    @Override  // X2.k
    public final k a() {
        return this.i.a();
    }

    @Override  // X2.T
    public final a0 b0() {
        return this.i.b0();
    }

    @Override  // X2.k
    public final Object c0(m m0, Object object0) {
        return this.i.c0(m0, object0);
    }

    @Override  // X2.k
    public final f getName() {
        return this.i.getName();
    }

    @Override  // X2.T
    public final List getUpperBounds() {
        return this.i.getUpperBounds();
    }

    @Override  // X2.h
    public final A k() {
        return this.i.k();
    }

    @Override  // Y2.a
    public final Y2.h l() {
        return this.i.l();
    }

    @Override  // X2.k
    public final k p() {
        return this.j;
    }

    @Override  // X2.l
    public final O q() {
        return this.i.q();
    }

    @Override
    public final String toString() {
        return this.i + "[inner-copy]";
    }
}

