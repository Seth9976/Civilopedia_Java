package M3;

import J2.j;
import N3.f;
import x3.g;
import x3.k;

public final class s extends q implements Y {
    public final q l;
    public final w m;

    public s(q q0, w w0) {
        j.f(q0, "origin");
        j.f(w0, "enhancement");
        super(q0.j, q0.k);
        this.l = q0;
        this.m = w0;
    }

    @Override  // M3.w
    public final w J0(f f0) {
        j.f(f0, "kotlinTypeRefiner");
        j.f(this.l, "type");
        j.f(this.m, "type");
        return new s(this.l, this.m);
    }

    @Override  // M3.Y
    public final w L() {
        return this.m;
    }

    @Override  // M3.Z
    public final Z L0(boolean z) {
        return c.A(this.l.L0(z), this.m.K0().L0(z));
    }

    @Override  // M3.Z
    public final Z M0(f f0) {
        j.f(f0, "kotlinTypeRefiner");
        j.f(this.l, "type");
        j.f(this.m, "type");
        return new s(this.l, this.m);
    }

    @Override  // M3.Z
    public final Z N0(H h0) {
        j.f(h0, "newAttributes");
        return c.A(this.l.N0(h0), this.m);
    }

    @Override  // M3.q
    public final A O0() {
        return this.l.O0();
    }

    @Override  // M3.q
    public final String P0(g g0, g g1) {
        j.f(g0, "renderer");
        g1.a.getClass();
        return ((Boolean)g1.a.m.a(k.X[11], g1.a)).booleanValue() ? g0.V(this.m) : this.l.P0(g0, g1);
    }

    @Override  // M3.q
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.m + ")] " + this.l;
    }

    @Override  // M3.Y
    public final Z w0() {
        return this.l;
    }
}

