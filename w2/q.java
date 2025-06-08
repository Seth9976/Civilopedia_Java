package W2;

import A3.h;
import I2.b;
import I3.i;
import J3.a;
import J3.d;
import L3.j;
import L3.m;
import T1.c;
import U2.n;
import V3.k;
import X2.F;
import X2.I;
import a3.A;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import x2.t;
import z1.a0;

public final class q implements I {
    public final m a;
    public final A b;
    public i c;
    public final j d;

    public q(m m0, c c0, A a0) {
        this.a = m0;
        this.b = a0;
        this.d = m0.c(new h(this, 2));
    }

    @Override  // X2.I
    public final void a(v3.c c0, ArrayList arrayList0) {
        J2.j.f(c0, "fqName");
        k.a(arrayList0, this.d.b(c0));
    }

    @Override  // X2.I
    public final boolean b(v3.c c0) {
        J2.j.f(c0, "fqName");
        Object object0 = this.d.j.get(c0);
        return object0 == null || object0 == L3.k.j ? this.c(c0) == null : ((F)this.d.b(c0)) == null;
    }

    public final J3.c c(v3.c c0) {
        J2.j.f(c0, "fqName");
        if(!c0.h(n.k)) {
            return null;
        }
        a.m.getClass();
        InputStream inputStream0 = d.c(a.a(c0));
        return inputStream0 == null ? null : a0.k(c0, this.a, this.b, inputStream0);
    }

    @Override  // X2.I
    public final Collection h(v3.c c0, b b0) {
        J2.j.f(c0, "fqName");
        return t.i;
    }
}

