package h3;

import B.f;
import I3.A;
import J2.j;
import J2.o;
import J2.r;
import L3.i;
import M3.w;
import O2.q;
import X2.O;
import d3.e;
import i3.h;
import java.util.Map;
import m3.a;
import v3.c;
import x2.s;

public class b implements Y2.b, h {
    public final c a;
    public final O b;
    public final i c;
    public final a d;
    public static final q[] e;

    static {
        o o0 = new o(r.a.b(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;");
        b.e = new q[]{r.a.e(o0)};
    }

    public b(f f0, e e0, c c0) {
        j.f(f0, "c");
        j.f(c0, "fqName");
        super();
        this.a = c0;
        j3.a a0 = (j3.a)f0.j;
        c3.f f1 = e0 == null ? O.b : a0.j.a(e0);
        this.b = f1;
        A a1 = new A(13, f0, this);
        a0.a.getClass();
        this.c = new i(a0.a, a1);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.d = e0 == null ? null : ((a)x2.i.T(e0.b()));
    }

    @Override  // Y2.b
    public final c a() {
        return this.a;
    }

    @Override  // Y2.b
    public Map b() {
        return s.i;
    }

    @Override  // Y2.b
    public final w getType() {
        return (M3.A)android.support.v4.media.session.a.A(this.c, b.e[0]);
    }

    @Override  // Y2.b
    public final O q() {
        return this.b;
    }
}

