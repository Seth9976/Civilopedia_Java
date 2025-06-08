package W2;

import I2.b;
import J2.j;
import J2.o;
import J2.r;
import L3.i;
import O2.q;
import U2.m;
import U2.n;
import Z2.c;
import a3.A;
import a3.k;
import android.support.v4.media.session.a;
import java.util.Collection;
import o2.I;
import v3.f;
import x2.t;

public final class g implements c {
    public final A a;
    public final b b;
    public final i c;
    public static final e d;
    public static final q[] e;
    public static final v3.c f;
    public static final f g;
    public static final v3.b h;

    static {
        o o0 = new o(r.a.b(g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;");
        g.e = new q[]{r.a.e(o0)};
        g.d = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        g.f = n.l;
        f f0 = m.c.f();
        j.e(f0, "shortName(...)");
        g.g = f0;
        g.h = v3.b.j(m.c.g());
    }

    public g(L3.m m0, A a0) {
        this.a = a0;
        this.b = W2.f.i;
        this.c = new i(m0, new I3.A(7, this, m0));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    @Override  // Z2.c
    public final boolean a(v3.c c0, f f0) {
        j.f(c0, "packageFqName");
        j.f(f0, "name");
        return f0.equals(g.g) && c0.equals(g.f);
    }

    @Override  // Z2.c
    public final X2.e b(v3.b b0) {
        j.f(b0, "classId");
        return b0.equals(g.h) ? ((k)a.A(this.c, g.e[0])) : null;
    }

    @Override  // Z2.c
    public final Collection c(v3.c c0) {
        j.f(c0, "packageFqName");
        return c0.equals(g.f) ? I.s(((k)a.A(this.c, g.e[0]))) : t.i;
    }
}

