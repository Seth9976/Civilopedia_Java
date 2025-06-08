package V2;

import J2.j;
import M3.F;
import M3.H;
import M3.d;
import U2.n;
import X2.A;
import X2.P;
import X2.T;
import X2.e;
import X2.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o2.G;
import v3.f;
import x2.r;

public final class b extends M3.b {
    public final c c;

    public b(c c0) {
        this.c = c0;
        super(c0.m);
    }

    @Override  // M3.g
    public final Collection b() {
        List list2;
        List list0;
        c c0 = this.c;
        k k0 = c0.o;
        g g0 = g.c;
        if(j.a(k0, g0)) {
            list0 = G.p(c.t);
        }
        else {
            boolean z = j.a(k0, h.c);
            int v = c0.p;
            if(z) {
                f f0 = g0.a(v);
                v3.b b0 = new v3.b(n.l, f0);
                list0 = x2.j.z(new v3.b[]{c.u, b0});
                goto label_21;
            }
            V2.j j0 = V2.j.c;
            if(j.a(k0, j0)) {
                list0 = G.p(c.t);
            }
            else if(j.a(k0, i.c)) {
                f f1 = j0.a(v);
                v3.b b1 = new v3.b(n.f, f1);
                list0 = x2.j.z(new v3.b[]{c.u, b1});
            }
            else {
                throw new IllegalStateException("should not be called");
            }
        }
    label_21:
        A a0 = c0.n.M0();
        ArrayList arrayList0 = new ArrayList(x2.k.E(list0));
        for(Object object0: list0) {
            v3.b b2 = (v3.b)object0;
            e e0 = w.d(a0, b2);
            if(e0 == null) {
                throw new IllegalStateException(("Built-in class " + b2 + " not found").toString());
            }
            int v1 = e0.B().o().size();
            List list1 = c0.s;
            j.f(list1, "<this>");
            if(v1 < 0) {
                throw new IllegalArgumentException(A.f.e(v1, "Requested element count ", " is less than zero.").toString());
            }
            if(v1 == 0) {
                list2 = r.i;
            }
            else {
                int v2 = list1.size();
                if(v1 >= v2) {
                    list2 = x2.i.o0(list1);
                }
                else if(v1 == 1) {
                    list2 = G.p(x2.i.a0(list1));
                }
                else {
                    ArrayList arrayList1 = new ArrayList(v1);
                    if(list1 instanceof RandomAccess) {
                        for(int v3 = v2 - v1; v3 < v2; ++v3) {
                            arrayList1.add(list1.get(v3));
                        }
                    }
                    else {
                        ListIterator listIterator0 = list1.listIterator(v2 - v1);
                        while(listIterator0.hasNext()) {
                            Object object1 = listIterator0.next();
                            arrayList1.add(object1);
                        }
                    }
                    list2 = arrayList1;
                }
            }
            ArrayList arrayList2 = new ArrayList(x2.k.E(list2));
            for(Object object2: list2) {
                arrayList2.add(new F(((T)object2).k()));
            }
            H.j.getClass();
            arrayList0.add(d.q(H.k, e0, arrayList2));
        }
        return x2.i.o0(arrayList0);
    }

    @Override  // M3.g
    public final P d() {
        return P.k;
    }

    @Override  // M3.b
    public final e i() {
        return this.c;
    }

    @Override  // M3.K
    public final List o() {
        return this.c.s;
    }

    @Override  // M3.K
    public final boolean p() {
        return true;
    }

    @Override  // M3.b
    public final X2.h q() {
        return this.c;
    }

    @Override
    public final String toString() {
        return this.c.toString();
    }
}

