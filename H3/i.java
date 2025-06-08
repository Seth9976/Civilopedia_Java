package h3;

import B.f;
import J2.j;
import J2.o;
import J2.r;
import O2.q;
import U2.m;
import d3.e;
import j3.a;
import java.util.Map;

public final class i extends b {
    public final L3.i f;
    public static final q[] g;

    static {
        o o0 = new o(r.a.b(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;");
        i.g = new q[]{r.a.e(o0)};
    }

    public i(e e0, f f0) {
        j.f(e0, "annotation");
        j.f(f0, "c");
        super(f0, e0, m.w);
        L3.m m0 = ((a)f0.j).a;
        A3.m m1 = new A3.m(this, 26);
        m0.getClass();
        this.f = new L3.i(m0, m1);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    @Override  // h3.b
    public final Map b() {
        return (Map)android.support.v4.media.session.a.A(this.f, i.g[0]);
    }
}

