package X2;

import I2.b;
import J2.j;
import J2.l;
import L3.e;
import L3.m;
import W2.k;
import f0.g;
import java.util.List;
import v3.c;
import v3.f;
import x2.i;

public final class E extends l implements b {
    public final int i;
    public final g j;

    public E(g g0, int v) {
        this.i = v;
        this.j = g0;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        X2.g g1;
        if(this.i != 0) {
            j.f(((c)object0), "fqName");
            return new k(((A)this.j.k), ((c)object0), 1);
        }
        j.f(((C)object0), "<name for destructuring parameter 0>");
        v3.b b0 = ((C)object0).a;
        if(b0.c) {
            throw new UnsupportedOperationException("Unresolved local class: " + b0);
        }
        v3.b b1 = b0.f();
        List list0 = ((C)object0).b;
        g g0 = this.j;
        if(b1 == null) {
            e e0 = (e)g0.l;
            c c0 = b0.g();
            j.e(c0, "getPackageFqName(...)");
            g1 = (X2.g)e0.b(c0);
        }
        else {
            g1 = g0.f(b1, i.O(list0));
        }
        boolean z = b0.b.e().d();
        m m0 = (m)g0.j;
        f f0 = b0.i();
        j.e(f0, "getShortClassName(...)");
        Integer integer0 = (Integer)i.U(list0);
        return integer0 == null ? new D(m0, g1, f0, !z, 0) : new D(m0, g1, f0, !z, ((int)integer0));
    }
}

