package k3;

import B.f;
import F3.n;
import J2.j;
import J2.o;
import J2.r;
import L3.c;
import L3.i;
import L3.m;
import O2.q;
import X2.O;
import Y2.g;
import Y2.h;
import a3.C;
import d3.y;
import j3.a;
import z1.a0;

public final class p extends C {
    public final y o;
    public final f p;
    public final i q;
    public final d r;
    public final c s;
    public final h t;
    public static final q[] u;

    static {
        o o0 = new o(r.a.b(p.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;");
        o o1 = new o(r.a.b(p.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;");
        p.u = new q[]{r.a.e(o0), r.a.e(o1)};
    }

    public p(f f0, y y0) {
        j.f(f0, "outerContext");
        a a0 = (a)f0.j;
        super(a0.o, y0.a);
        this.o = y0;
        f f1 = o1.a.c(f0, this, null, 6);
        this.p = f1;
        j.f(a0.d.c().c, "<this>");
        a a1 = (a)f1.j;
        m m0 = a1.a;
        k3.o o0 = new k3.o(this, 0);
        m0.getClass();
        this.q = new i(m0, o0);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.r = new d(f1, y0, this);
        k3.o o1 = new k3.o(this, 2);
        m0.getClass();
        this.s = new c(m0, o1);  // 初始化器: LL3/i;-><init>(LL3/m;LI2/a;)V
        Y2.f f2 = a1.v.b ? g.a : a0.J(f1, y0);
        this.t = f2;
        m0.a(new k3.o(this, 1));
    }

    @Override  // G3.a, Y2.a
    public final h l() {
        return this.t;
    }

    @Override  // a3.C
    public final O q() {
        return new k.d(this);
    }

    @Override  // a3.C
    public final String toString() {
        return "Lazy Java package fragment: " + this.m + " of module " + ((a)this.p.j).o;
    }

    @Override  // X2.F
    public final n x0() {
        return this.r;
    }
}

