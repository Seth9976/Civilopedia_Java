package M3;

import J2.j;
import Y2.h;

public final class p extends Q {
    public final Q b;
    public final Q c;

    public p(Q q0, Q q1) {
        this.b = q0;
        this.c = q1;
    }

    // 去混淆评级： 低(20)
    @Override  // M3.Q
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    // 去混淆评级： 低(20)
    @Override  // M3.Q
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override  // M3.Q
    public final h c(h h0) {
        j.f(h0, "annotations");
        h h1 = this.b.c(h0);
        return this.c.c(h1);
    }

    @Override  // M3.Q
    public final N d(w w0) {
        N n0 = this.b.d(w0);
        return n0 == null ? this.c.d(w0) : n0;
    }

    @Override  // M3.Q
    public final w f(w w0, a0 a00) {
        j.f(w0, "topLevelType");
        j.f(a00, "position");
        w w1 = this.b.f(w0, a00);
        return this.c.f(w1, a00);
    }
}

