package V2;

import J2.j;
import L3.m;
import M3.K;
import M3.a0;
import U2.n;
import X2.O;
import X2.U;
import X2.o;
import X2.p;
import X2.y;
import a3.P;
import a3.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import v3.f;
import x2.i;
import x2.r;

public final class c extends b {
    public final m m;
    public final J3.c n;
    public final k o;
    public final int p;
    public final V2.b q;
    public final e r;
    public final List s;
    public static final v3.b t;
    public static final v3.b u;

    static {
        f f0 = f.e("Function");
        c.t = new v3.b(n.l, f0);
        f f1 = f.e("KFunction");
        c.u = new v3.b(n.i, f1);
    }

    public c(m m0, J3.c c0, k k0, int v) {
        j.f(c0, "containingDeclaration");
        super(m0, k0.a(v));
        this.m = m0;
        this.n = c0;
        this.o = k0;
        this.p = v;
        this.q = new V2.b(this);
        this.r = new e(m0, this);  // 初始化器: LF3/h;-><init>(LL3/m;La3/b;)V
        ArrayList arrayList0 = new ArrayList();
        N2.c c1 = new N2.c(1, v, 1);  // 初始化器: LN2/a;-><init>(III)V
        ArrayList arrayList1 = new ArrayList(x2.k.E(c1));
        N2.b b0 = c1.h();
        while(b0.k) {
            f f0 = f.e(("P" + b0.b()));
            arrayList0.add(P.P0(this, a0.l, f0, arrayList0.size(), this.m));
            arrayList1.add(w2.k.a);
        }
        f f1 = f.e("R");
        arrayList0.add(P.P0(this, a0.m, f1, arrayList0.size(), this.m));
        this.s = i.o0(arrayList0);
        k k1 = this.o;
        d.i.getClass();
        j.f(k1, "functionTypeKind");
        if(!k1.equals(g.c) && !k1.equals(V2.j.c) && !k1.equals(h.c)) {
            k1.equals(V2.i.c);
        }
    }

    @Override  // X2.h
    public final K B() {
        return this.q;
    }

    @Override  // X2.e
    public final boolean D() {
        return false;
    }

    @Override  // X2.e
    public final boolean D0() {
        return false;
    }

    @Override  // X2.e
    public final boolean K() {
        return false;
    }

    @Override  // a3.z
    public final F3.n L(N3.f f0) {
        return this.r;
    }

    @Override  // X2.e
    public final Collection V() {
        return r.i;
    }

    @Override  // X2.e
    public final boolean Y() {
        return false;
    }

    @Override  // X2.x
    public final boolean Z() {
        return false;
    }

    @Override  // X2.i
    public final boolean a0() {
        return false;
    }

    @Override  // X2.e
    public final o c() {
        j.e(p.e, "PUBLIC");
        return p.e;
    }

    @Override  // X2.e
    public final y f() {
        return y.m;
    }

    @Override  // X2.e
    public final Collection g() {
        return r.i;
    }

    @Override  // X2.e
    public final X2.f j() {
        return X2.f.j;
    }

    @Override  // Y2.a
    public final Y2.h l() {
        return Y2.g.a;
    }

    @Override  // X2.e
    public final U l0() {
        return null;
    }

    @Override  // X2.e
    public final boolean o() {
        return false;
    }

    @Override  // X2.e
    public final a3.i o0() {
        return null;
    }

    @Override  // X2.k
    public final X2.k p() {
        return this.n;
    }

    @Override  // X2.e
    public final F3.n p0() {
        return F3.m.b;
    }

    @Override  // X2.l
    public final O q() {
        return O.b;
    }

    @Override  // X2.e
    public final List t() {
        return this.s;
    }

    @Override
    public final String toString() {
        String s = this.getName().b();
        j.e(s, "asString(...)");
        return s;
    }

    @Override  // X2.x
    public final boolean v0() {
        return false;
    }

    @Override  // X2.x
    public final boolean z() {
        return false;
    }
}

