package X2;

import B1.a;
import F3.n;
import J2.j;
import M3.A;
import M3.K;
import O3.l;
import X3.f;
import X3.h;
import X3.p;
import X3.q;
import a3.x;
import f0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v3.c;
import x2.r;
import y3.d;

public abstract class w {
    public static final z a;

    static {
        w.a = new z("InvalidModuleNotifier");
    }

    public static final a a(A a0, i i0, int v) {
        i i1 = null;
        if(i0 != null && !l.f(i0)) {
            int v1 = i0.t().size() + v;
            if(!i0.a0()) {
                if(v1 != a0.A0().size()) {
                    d.p(i0);
                }
                return new a(i0, a0.A0().subList(v, a0.A0().size()), null);
            }
            List list0 = a0.A0().subList(v, v1);
            k k0 = i0.p();
            if(k0 instanceof i) {
                i1 = (i)k0;
            }
            return new a(i0, list0, w.a(a0, i1, v1));
        }
        return null;
    }

    public static final void b(I i0, c c0, ArrayList arrayList0) {
        j.f(i0, "<this>");
        j.f(c0, "fqName");
        i0.a(c0, arrayList0);
    }

    public static final List c(i i0) {
        List list2;
        j.f(i0, "<this>");
        List list0 = i0.t();
        j.e(list0, "getDeclaredTypeParameters(...)");
        if(!i0.a0() && !(i0.p() instanceof b)) {
            return list0;
        }
        C3.d d0 = C3.d.i;
        X3.k k0 = X3.l.v0(i0, d0);
        X3.k k1 = k0 instanceof X3.d ? ((X3.d)k0).a() : new X3.c(k0, 1);
        List list1 = X3.l.y0(new h(new f(new q(k1, 0), true, s.m), s.n, p.q));
        X3.k k2 = X3.l.v0(i0, d0);
        X3.k k3 = k2 instanceof X3.d ? ((X3.d)k2).a() : new X3.c(k2, 1);
        Object object0 = null;
        Iterator iterator0 = k3.iterator();
        while(true) {
            list2 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            if(object1 instanceof e) {
                object0 = object1;
                break;
            }
        }
        if(((e)object0) != null) {
            K k4 = ((e)object0).B();
            if(k4 != null) {
                list2 = k4.o();
            }
        }
        if(list2 == null) {
            list2 = r.i;
        }
        if(list1.isEmpty() && list2.isEmpty()) {
            List list3 = i0.t();
            j.e(list3, "getDeclaredTypeParameters(...)");
            return list3;
        }
        ArrayList arrayList0 = x2.i.e0(list2, list1);
        ArrayList arrayList1 = new ArrayList(x2.k.E(arrayList0));
        for(Object object2: arrayList0) {
            j.c(((T)object2));
            arrayList1.add(new X2.d(((T)object2), i0, list0.size()));
        }
        return x2.i.e0(arrayList1, list0);
    }

    public static final e d(X2.A a0, v3.b b0) {
        j.f(a0, "<this>");
        j.f(b0, "classId");
        X2.h h0 = w.e(a0, b0);
        return h0 instanceof e ? ((e)h0) : null;
    }

    public static final X2.h e(X2.A a0, v3.b b0) {
        j.f(a0, "<this>");
        j.f(b0, "classId");
        if(a0.E0(y3.l.a) != null) {
            throw new ClassCastException();
        }
        c c0 = b0.g();
        j.e(c0, "getPackageFqName(...)");
        J j0 = a0.m0(c0);
        List list0 = b0.h().a.e();
        Object object0 = x2.i.S(list0);
        j.e(object0, "first(...)");
        f3.b b1 = f3.b.o;
        X2.h h0 = ((x)j0).o.f(((v3.f)object0), b1);
        if(h0 != null) {
            for(Object object1: list0.subList(1, list0.size())) {
                if(!(h0 instanceof e)) {
                    return null;
                }
                n n0 = ((e)h0).k0();
                j.c(((v3.f)object1));
                X2.h h1 = n0.f(((v3.f)object1), b1);
                h0 = h1 instanceof e ? ((e)h1) : null;
                if(h0 == null) {
                    return null;
                }
            }
            return h0;
        }
        return null;
    }

    public static final e f(X2.A a0, v3.b b0, g g0) {
        j.f(a0, "<this>");
        j.f(b0, "classId");
        j.f(g0, "notFoundClasses");
        e e0 = w.d(a0, b0);
        return e0 == null ? g0.f(b0, X3.l.y0(X3.l.w0(X3.l.v0(b0, X2.r.q), s.j))) : e0;
    }

    public static final X2.h g(k k0) {
        j.f(k0, "<this>");
        k k1 = k0.p();
        if(k1 != null && !(k0 instanceof F)) {
            if(!(k1.p() instanceof F)) {
                return w.g(k1);
            }
            return k1 instanceof X2.h ? ((X2.h)k1) : null;
        }
        return null;
    }

    public static final boolean h(I i0, c c0) {
        j.f(i0, "<this>");
        j.f(c0, "fqName");
        return i0.b(c0);
    }

    public static final ArrayList i(I i0, c c0) {
        j.f(i0, "<this>");
        j.f(c0, "fqName");
        ArrayList arrayList0 = new ArrayList();
        w.b(i0, c0, arrayList0);
        return arrayList0;
    }

    public static final e j(a3.A a0, c c0) {
        f3.b b0 = f3.b.i;
        j.f(a0, "<this>");
        j.f(c0, "fqName");
        if(c0.d()) {
            return null;
        }
        c c1 = c0.e();
        j.e(c1, "parent(...)");
        x x0 = (x)a0.m0(c1);
        v3.f f0 = c0.f();
        j.e(f0, "shortName(...)");
        X2.h h0 = x0.o.f(f0, b0);
        e e0 = h0 instanceof e ? ((e)h0) : null;
        if(e0 != null) {
            return e0;
        }
        c c2 = c0.e();
        j.e(c2, "parent(...)");
        e e1 = w.j(a0, c2);
        if(e1 != null) {
            n n0 = e1.k0();
            if(n0 != null) {
                v3.f f1 = c0.f();
                j.e(f1, "shortName(...)");
                X2.h h1 = n0.f(f1, b0);
                return h1 instanceof e ? ((e)h1) : null;
            }
        }
        return null;
    }
}

