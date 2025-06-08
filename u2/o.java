package U2;

import L3.b;
import L3.m;
import M3.a0;
import M3.j;
import O3.l;
import W2.k;
import X2.p;
import X2.u;
import X2.y;
import a3.B;
import a3.P;
import a3.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o2.G;
import v3.f;

public abstract class o {
    public static final B a;

    static {
        k k0 = new k(l.b, n.f, 1);
        f f0 = n.g.f();
        b b0 = m.e;
        B b1 = new B(k0, f0, b0);
        b1.p = y.m;
        X2.o o0 = p.e;
        if(o0 != null) {
            b1.q = o0;
            f f1 = f.e("T");
            List list0 = G.p(P.P0(b1, a0.l, f1, 0, b0));
            if(b1.s != null) {
                throw new IllegalStateException("Type parameters are already set for " + b1.getName());
            }
            ArrayList arrayList0 = new ArrayList(list0);
            b1.s = arrayList0;
            b1.r = new j(b1, arrayList0, b1.t, b1.u);
            Set set0 = Collections.emptySet();
            if(set0 != null) {
                for(Object object0: set0) {
                    ((i)(((u)object0))).o = b1.k();
                }
                o.a = b1;
                return;
            }
            B.d0(13);
            throw null;
        }
        B.d0(9);
        throw null;
    }
}

