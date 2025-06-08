package M3;

import F3.n;
import J2.j;
import P3.d;
import java.util.List;
import x3.g;

public abstract class q extends Z implements d {
    public final A j;
    public final A k;

    public q(A a0, A a1) {
        j.f(a0, "lowerBound");
        j.f(a1, "upperBound");
        super();
        this.j = a0;
        this.k = a1;
    }

    @Override  // M3.w
    public final List A0() {
        return this.O0().A0();
    }

    @Override  // M3.w
    public final H G0() {
        return this.O0().G0();
    }

    @Override  // M3.w
    public final K H0() {
        return this.O0().H0();
    }

    @Override  // M3.w
    public final boolean I0() {
        return this.O0().I0();
    }

    public abstract A O0();

    public abstract String P0(g arg1, g arg2);

    @Override
    public String toString() {
        return g.e.V(this);
    }

    @Override  // M3.w
    public n x0() {
        return this.O0().x0();
    }
}

