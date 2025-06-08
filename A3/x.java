package a3;

import F3.j;
import J2.o;
import J2.r;
import L3.i;
import O2.q;
import X2.J;
import X2.k;
import Y2.g;
import v3.c;
import v3.f;

public final class x extends m implements J {
    public final A k;
    public final c l;
    public final i m;
    public final i n;
    public final j o;
    public static final q[] p;

    static {
        o o0 = new o(r.a.b(x.class), "fragments", "getFragments()Ljava/util/List;");
        o o1 = new o(r.a.b(x.class), "empty", "getEmpty()Z");
        x.p = new q[]{r.a.e(o0), r.a.e(o1)};
    }

    public x(A a0, c c0, L3.m m0) {
        J2.j.f(a0, "module");
        J2.j.f(c0, "fqName");
        J2.j.f(m0, "storageManager");
        f f0 = c0.g();
        super(g.a, f0);
        this.k = a0;
        this.l = c0;
        this.m = new i(m0, new w(this, 1));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.n = new i(m0, new w(this, 0));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.o = new j(m0, new w(this, 2));
    }

    @Override  // X2.k
    public final Object c0(X2.m m0, Object object0) {
        return m0.v(this, object0);
    }

    // 去混淆评级： 低(25)
    @Override
    public final boolean equals(Object object0) {
        J j0 = object0 instanceof J ? ((J)object0) : null;
        return j0 == null ? false : J2.j.a(this.l, ((x)j0).l) && J2.j.a(this.k, ((x)j0).k);
    }

    @Override
    public final int hashCode() {
        return this.l.hashCode() + this.k.hashCode() * 0x1F;
    }

    @Override  // X2.k
    public final k p() {
        c c0 = this.l;
        if(c0.d()) {
            return null;
        }
        c c1 = c0.e();
        J2.j.e(c1, "parent(...)");
        return this.k.m0(c1);
    }
}

