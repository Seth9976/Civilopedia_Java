package M3;

import J2.j;
import P3.e;
import X2.T;

public final class m extends n implements k, e {
    public final A j;
    public final boolean k;

    static {
    }

    public m(A a0, boolean z) {
        this.j = a0;
        this.k = z;
    }

    @Override  // M3.n
    public final boolean I0() {
        return false;
    }

    @Override  // M3.A
    public final A O0(boolean z) {
        return z ? this.j.O0(true) : this;
    }

    @Override  // M3.A
    public final A P0(H h0) {
        j.f(h0, "newAttributes");
        return new m(this.j.P0(h0), this.k);
    }

    @Override  // M3.n
    public final A Q0() {
        return this.j;
    }

    @Override  // M3.n
    public final n S0(A a0) {
        return new m(a0, this.k);
    }

    @Override  // M3.k
    public final boolean d0() {
        this.j.H0();
        return this.j.H0().q() instanceof T;
    }

    @Override  // M3.k
    public final Z i(w w0) {
        j.f(w0, "replacement");
        return c.l(w0.K0(), this.k);
    }

    @Override  // M3.A
    public final String toString() {
        return this.j + " & Any";
    }
}

