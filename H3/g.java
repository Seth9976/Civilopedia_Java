package h3;

import B.f;
import J2.j;
import J2.o;
import J2.r;
import L3.i;
import O2.q;
import U2.m;
import d3.e;
import j3.a;
import java.util.Map;

public final class g extends b {
    public final i f;
    public static final q[] g;

    static {
        o o0 = new o(r.a.b(g.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;");
        g.g = new q[]{r.a.e(o0)};
    }

    public g(e e0, f f0) {
        j.f(f0, "c");
        super(f0, e0, m.m);
        L3.m m0 = ((a)f0.j).a;
        m0.getClass();
        this.f = new i(m0, h3.f.i);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    @Override  // h3.b
    public final Map b() {
        return (Map)android.support.v4.media.session.a.A(this.f, g.g[0]);
    }
}

