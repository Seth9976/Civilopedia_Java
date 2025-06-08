package V2;

import J2.j;
import L3.m;
import X2.e;
import Y3.n;
import Z2.c;
import a3.A;
import a3.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import v3.b;
import v3.f;
import x2.i;
import x2.t;

public final class a implements c {
    public final m a;
    public final A b;

    public a(m m0, A a0) {
        j.f(a0, "module");
        super();
        this.a = m0;
        this.b = a0;
    }

    @Override  // Z2.c
    public final boolean a(v3.c c0, f f0) {
        j.f(c0, "packageFqName");
        j.f(f0, "name");
        String s = f0.b();
        j.e(s, "asString(...)");
        return (n.H0(s, "Function") || n.H0(s, "KFunction") || n.H0(s, "SuspendFunction") || n.H0(s, "KSuspendFunction")) && V2.m.c.a(s, c0) != null;
    }

    @Override  // Z2.c
    public final e b(b b0) {
        j.f(b0, "classId");
        if(!b0.c && b0.b.e().d()) {
            String s = b0.h().b();
            if(!n.t0(s, "Function")) {
                return null;
            }
            v3.c c0 = b0.g();
            j.e(c0, "getPackageFqName(...)");
            l l0 = V2.m.c.a(s, c0);
            if(l0 == null) {
                return null;
            }
            Iterable iterable0 = (List)android.support.v4.media.session.a.A(((x)this.b.m0(c0)).m, x.p[0]);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                if(object0 instanceof J3.c) {
                    arrayList0.add(object0);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            Iterator iterator1 = arrayList0.iterator();
            while(iterator1.hasNext()) {
                iterator1.next();
            }
            if(i.U(arrayList1) != null) {
                throw new ClassCastException();
            }
            J3.c c1 = (J3.c)i.S(arrayList0);
            return new V2.c(this.a, c1, l0.a, l0.b);
        }
        return null;
    }

    @Override  // Z2.c
    public final Collection c(v3.c c0) {
        j.f(c0, "packageFqName");
        return t.i;
    }
}

