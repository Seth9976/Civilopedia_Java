package g3;

import M3.U;
import M3.w;
import X2.b;
import X3.h;
import X3.l;
import X3.s;
import a3.L;
import a3.v;
import i3.f;
import java.util.List;
import x2.g;
import x2.i;
import y3.e;
import y3.k;

public final class j implements e {
    @Override  // y3.e
    public final int a(b b0, b b1, X2.e e0) {
        J2.j.f(b0, "superDescriptor");
        J2.j.f(b1, "subDescriptor");
        if(b1 instanceof f && ((f)b1).u().isEmpty()) {
            y3.j j0 = k.i(b0, b1);
            if((j0 == null ? 0 : j0.c()) != 0) {
                return 4;
            }
            List list0 = ((f)b1).z0();
            J2.j.e(list0, "getValueParameters(...)");
            s s0 = l.w0(i.L(list0), g3.e.m);
            w w0 = ((f)b1).o;
            J2.j.c(w0);
            h h0 = l.u0(g.C(new X3.k[]{s0, g.C(new Object[]{w0})}));
            v v0 = ((f)b1).q;
            X3.g g0 = new X3.g(l.u0(g.C(new X3.k[]{h0, i.L(x2.j.A((v0 == null ? null : v0.getType())))})));
            while(g0.b()) {
                w w1 = (w)g0.next();
                if(!w1.A0().isEmpty() && !(w1.K0() instanceof l3.g)) {
                    return 4;
                }
                if(false) {
                    break;
                }
            }
            b b2 = (b)b0.b(new U(new l3.e()));
            if(b2 == null) {
                return 4;
            }
            if(b2 instanceof L && !((L)b2).u().isEmpty()) {
                b2 = ((L)b2).s0().p().c();
                J2.j.c(b2);
            }
            int v1 = k.c.n(b2, b1, false).c();
            A.f.u(v1, "getResult(...)");
            return g3.i.a[q.e.c(v1)] == 1 ? 1 : 4;
        }
        return 4;
    }

    @Override  // y3.e
    public final int b() {
        return 2;
    }
}

