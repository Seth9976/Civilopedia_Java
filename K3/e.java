package k3;

import A3.g;
import D3.b;
import I2.a;
import I3.i;
import J2.j;
import J2.l;
import O2.A;
import O3.k;
import d3.d;
import d3.o;
import g3.x;
import java.util.ArrayList;
import v3.c;
import x2.w;

public final class e extends l implements a {
    public final int i;
    public final f j;

    public e(f f0, int v) {
        this.i = v;
        this.j = f0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        switch(this.i) {
            case 0: {
                f f2 = this.j;
                ArrayList arrayList0 = f2.b.b();
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: arrayList0) {
                    v3.f f3 = ((d3.f)(((m3.a)object0))).a;
                    if(f3 == null) {
                        f3 = x.b;
                    }
                    g g0 = f2.c(((m3.a)object0));
                    w2.e e2 = g0 == null ? null : new w2.e(f3, g0);
                    if(e2 != null) {
                        arrayList1.add(e2);
                    }
                }
                return w.z(arrayList1);
            }
            case 1: {
                return d.a(A.y(A.v(this.j.b.a))).b();
            }
            default: {
                f f0 = this.j;
                c c0 = f0.a();
                d3.e e0 = f0.b;
                if(c0 == null) {
                    return O3.l.c(k.M, new String[]{e0.toString()});
                }
                B.f f1 = f0.a;
                X2.e e1 = W2.e.b(c0, ((j3.a)f1.j).o.l);
                if(e1 == null) {
                    o o0 = new o(A.y(A.v(e0.a)));
                    j3.a a0 = (j3.a)f1.j;
                    a0.k.getClass();
                    b b0 = (b)a0.k.j;
                    if(b0 == null) {
                        j.l("resolver");
                        throw null;
                    }
                    e1 = b0.h(o0);
                    if(e1 == null) {
                        v3.b b1 = v3.b.j(c0);
                        i i0 = a0.d.c();
                        return X2.w.f(a0.o, b1, i0.l).k();
                    }
                }
                return e1.k();
            }
        }
    }
}

