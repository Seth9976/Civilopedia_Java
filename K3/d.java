package k3;

import B.f;
import F3.n;
import J2.j;
import J2.o;
import J2.r;
import L3.i;
import L3.m;
import O2.A;
import O2.q;
import X2.h;
import d3.y;
import f3.b;
import j3.a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import x2.t;

public final class d implements n {
    public final f b;
    public final p c;
    public final u d;
    public final i e;
    public static final q[] f;

    static {
        o o0 = new o(r.a.b(d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;");
        d.f = new q[]{r.a.e(o0)};
    }

    public d(f f0, y y0, p p0) {
        j.f(p0, "packageFragment");
        super();
        this.b = f0;
        this.c = p0;
        this.d = new u(f0, y0, p0);
        m m0 = ((a)f0.j).a;
        A3.m m1 = new A3.m(this, 29);
        m0.getClass();
        this.e = new i(m0, m1);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    @Override  // F3.n
    public final Collection a(v3.f f0, b b0) {
        j.f(f0, "name");
        this.i(f0, b0);
        n[] arr_n = this.h();
        this.d.getClass();
        Collection collection0 = x2.r.i;
        for(int v = 0; v < arr_n.length; ++v) {
            collection0 = A.m(collection0, arr_n[v].a(f0, b0));
        }
        return collection0 == null ? t.i : collection0;
    }

    @Override  // F3.n
    public final Collection b(v3.f f0, b b0) {
        j.f(f0, "name");
        this.i(f0, b0);
        n[] arr_n = this.h();
        Collection collection0 = this.d.b(f0, b0);
        for(int v = 0; v < arr_n.length; ++v) {
            collection0 = A.m(collection0, arr_n[v].b(f0, b0));
        }
        return collection0 == null ? t.i : collection0;
    }

    @Override  // F3.n
    public final Set c() {
        n[] arr_n = this.h();
        Set set0 = new LinkedHashSet();
        for(int v = 0; v < arr_n.length; ++v) {
            x2.o.H(arr_n[v].c(), set0);
        }
        set0.addAll(this.d.c());
        return set0;
    }

    @Override  // F3.n
    public final Set d() {
        n[] arr_n = this.h();
        Set set0 = new LinkedHashSet();
        for(int v = 0; v < arr_n.length; ++v) {
            x2.o.H(arr_n[v].d(), set0);
        }
        set0.addAll(this.d.d());
        return set0;
    }

    @Override  // F3.n
    public final Set e() {
        n[] arr_n = this.h();
        j.f(arr_n, "<this>");
        x2.r r0 = arr_n.length == 0 ? x2.r.i : new X3.o(arr_n, 1);
        Set set0 = A.u(r0);
        if(set0 != null) {
            set0.addAll(this.d.e());
            return set0;
        }
        return null;
    }

    @Override  // F3.p
    public final h f(v3.f f0, b b0) {
        j.f(f0, "name");
        j.f(b0, "location");
        this.i(f0, b0);
        this.d.getClass();
        h h0 = null;
        h h1 = this.d.v(f0, null);
        if(h1 != null) {
            return h1;
        }
        n[] arr_n = this.h();
        for(int v = 0; v < arr_n.length; ++v) {
            h h2 = arr_n[v].f(f0, b0);
            if(h2 != null) {
                if(!(h2 instanceof X2.i) || !((X2.i)h2).Z()) {
                    return h2;
                }
                if(h0 == null) {
                    h0 = h2;
                }
            }
        }
        return h0;
    }

    @Override  // F3.p
    public final Collection g(F3.f f0, I2.b b0) {
        j.f(f0, "kindFilter");
        n[] arr_n = this.h();
        Collection collection0 = this.d.g(f0, b0);
        for(int v = 0; v < arr_n.length; ++v) {
            collection0 = A.m(collection0, arr_n[v].g(f0, b0));
        }
        return collection0 == null ? t.i : collection0;
    }

    public final n[] h() {
        return (n[])android.support.v4.media.session.a.A(this.e, d.f[0]);
    }

    public final void i(v3.f f0, b b0) {
        j.f(f0, "name");
        j.f(b0, "location");
        A.X(((a)this.b.j).n, b0, this.c, f0);
    }

    @Override
    public final String toString() {
        return "scope for " + this.c;
    }
}

