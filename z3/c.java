package z3;

import J2.j;
import M3.N;
import M3.a0;
import M3.w;
import N3.i;
import U2.h;
import java.util.Collection;
import java.util.List;
import o2.G;
import x2.r;

public final class c implements b {
    public final N a;
    public i b;

    public c(N n0) {
        j.f(n0, "projection");
        super();
        this.a = n0;
        n0.a();
    }

    @Override  // z3.b
    public final N a() {
        return this.a;
    }

    @Override  // M3.K
    public final h m() {
        h h0 = this.a.b().H0().m();
        j.e(h0, "getBuiltIns(...)");
        return h0;
    }

    @Override  // M3.K
    public final List o() {
        return r.i;
    }

    @Override  // M3.K
    public final boolean p() {
        return false;
    }

    @Override  // M3.K
    public final X2.h q() {
        return null;
    }

    @Override  // M3.K
    public final Collection r() {
        N n0 = this.a;
        w w0 = n0.a() == a0.m ? n0.b() : this.m().o();
        j.c(w0);
        return G.p(w0);
    }

    @Override
    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }
}

