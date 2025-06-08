package z3;

import F3.n;
import J2.j;
import M3.A;
import M3.H;
import M3.K;
import M3.N;
import M3.Z;
import M3.w;
import N3.f;
import O3.h;
import O3.l;
import P3.c;
import java.util.List;
import x2.r;

public final class a extends A implements c {
    public final N j;
    public final z3.c k;
    public final boolean l;
    public final H m;

    public a(N n0, z3.c c0, boolean z, H h0) {
        j.f(n0, "typeProjection");
        j.f(h0, "attributes");
        super();
        this.j = n0;
        this.k = c0;
        this.l = z;
        this.m = h0;
    }

    @Override  // M3.w
    public final List A0() {
        return r.i;
    }

    @Override  // M3.w
    public final H G0() {
        return this.m;
    }

    @Override  // M3.w
    public final K H0() {
        return this.k;
    }

    @Override  // M3.w
    public final boolean I0() {
        return this.l;
    }

    @Override  // M3.w
    public final w J0(f f0) {
        j.f(f0, "kotlinTypeRefiner");
        return new a(this.j.d(f0), this.k, this.l, this.m);
    }

    @Override  // M3.A
    public final Z L0(boolean z) {
        return z == this.l ? this : new a(this.j, this.k, z, this.m);
    }

    @Override  // M3.Z
    public final Z M0(f f0) {
        j.f(f0, "kotlinTypeRefiner");
        return new a(this.j.d(f0), this.k, this.l, this.m);
    }

    @Override  // M3.A
    public final A O0(boolean z) {
        return z == this.l ? this : new a(this.j, this.k, z, this.m);
    }

    @Override  // M3.A
    public final A P0(H h0) {
        j.f(h0, "newAttributes");
        return new a(this.j, this.k, this.l, h0);
    }

    // 去混淆评级： 低(20)
    @Override  // M3.A
    public final String toString() {
        return "Captured(" + this.j + ')' + (this.l ? "?" : "");
    }

    @Override  // M3.w
    public final n x0() {
        return l.a(h.j, true, new String[0]);
    }
}

