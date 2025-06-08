package M3;

import J2.j;
import N3.f;
import X2.T;
import kotlin.NoWhenBranchMatchedException;
import o1.a;
import x3.g;

public final class r extends q implements k {
    public r(A a0, A a1) {
        j.f(a0, "lowerBound");
        j.f(a1, "upperBound");
        super(a0, a1);
    }

    @Override  // M3.w
    public final w J0(f f0) {
        j.f(f0, "kotlinTypeRefiner");
        j.f(this.j, "type");
        j.f(this.k, "type");
        return new r(this.j, this.k);
    }

    @Override  // M3.Z
    public final Z L0(boolean z) {
        return d.j(this.j.O0(z), this.k.O0(z));
    }

    @Override  // M3.Z
    public final Z M0(f f0) {
        j.f(f0, "kotlinTypeRefiner");
        j.f(this.j, "type");
        j.f(this.k, "type");
        return new r(this.j, this.k);
    }

    @Override  // M3.Z
    public final Z N0(H h0) {
        j.f(h0, "newAttributes");
        return d.j(this.j.P0(h0), this.k.P0(h0));
    }

    @Override  // M3.q
    public final A O0() {
        return this.j;
    }

    @Override  // M3.q
    public final String P0(g g0, g g1) {
        j.f(g0, "renderer");
        return g1.a.l() ? "(" + g0.V(this.j) + ".." + g0.V(this.k) + ')' : g0.C(g0.V(this.j), g0.V(this.k), a.u(this));
    }

    // 去混淆评级： 低(20)
    @Override  // M3.k
    public final boolean d0() {
        return this.j.H0().q() instanceof T && j.a(this.j.H0(), this.k.H0());
    }

    @Override  // M3.k
    public final Z i(w w0) {
        j.f(w0, "replacement");
        Z z0 = w0.K0();
        if(z0 instanceof q) {
            return c.g(z0, z0);
        }
        if(!(z0 instanceof A)) {
            throw new NoWhenBranchMatchedException();
        }
        return c.g(d.j(((A)z0), ((A)z0).O0(true)), z0);
    }

    @Override  // M3.q
    public final String toString() {
        return "(" + this.j + ".." + this.k + ')';
    }
}

