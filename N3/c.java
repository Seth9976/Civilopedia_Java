package n3;

import B.f;
import J2.j;
import M3.A;
import M3.F;
import M3.H;
import M3.K;
import M3.N;
import M3.X;
import M3.Z;
import M3.a0;
import M3.w;
import X2.M;
import X2.T;
import X2.b;
import X2.l;
import X2.u;
import a3.J;
import a3.S;
import a3.v;
import g3.B;
import g3.a;
import g3.n;
import g3.s;
import g3.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import o2.I;
import x2.i;
import x2.k;
import x2.r;

public final class c {
    public w a(O.c c0, w w0, List list0, p p0, boolean z) {
        d d3;
        e e10;
        N3.e e8;
        g g4;
        h h9;
        h h8;
        g3.c c3;
        e e7;
        a a2;
        Y2.h h3;
        T t1;
        Y2.h h1;
        e e5;
        N3.e e4;
        int v2;
        e e3;
        boolean z2;
        f f1;
        l l1;
        d d0;
        P3.h h0;
        d[] arr_d1;
        int v;
        j.f(w0, "<this>");
        ArrayList arrayList0 = c0.f(w0);
        ArrayList arrayList1 = new ArrayList(k.E(list0));
        for(Object object0: list0) {
            arrayList1.add(c0.f(((P3.d)object0)));
        }
        f f0 = (f)c0.d;
        boolean z1 = c0.a;
        if(z1 && (!(list0 instanceof Collection) || !list0.isEmpty())) {
            for(Object object1: list0) {
                j.f(((P3.d)object1), "other");
                if(((j3.a)f0.j).u.a(w0, ((w)(((P3.d)object1))))) {
                    continue;
                }
                v = 1;
                goto label_19;
            }
        }
        v = arrayList0.size();
    label_19:
        d[] arr_d = new d[v];
        int v1 = 0;
        while(v1 < v) {
            n3.a a0 = (n3.a)arrayList0.get(v1);
            N3.e e0 = N3.e.j;
            g g0 = g.i;
            e e1 = e.j;
            e e2 = e.i;
            g g1 = g.j;
            g g2 = g.k;
            l l0 = (l)c0.c;
            T t0 = a0.c;
            if(a0.a == null) {
                if(t0 == null) {
                    arr_d1 = arr_d;
                    h0 = null;
                }
                else {
                    a0 a00 = t0.b0();
                    arr_d1 = arr_d;
                    j.e(a00, "getVariance(...)");
                    h0 = android.support.v4.media.session.a.l(a00);
                }
                if(h0 == P3.h.j) {
                    d0 = d.e;
                    l1 = l0;
                    f1 = f0;
                    z2 = z1;
                    e3 = e2;
                    v2 = v1;
                    e4 = e0;
                    e5 = e1;
                    goto label_181;
                }
            }
            else {
                arr_d1 = arr_d;
            }
            r r0 = r.i;
            P3.d d1 = a0.a;
            if(d1 == null) {
                e3 = e2;
                h1 = r0;
            }
            else {
                e3 = e2;
                h1 = ((w)d1).l();
            }
            if(d1 == null) {
                e5 = e1;
                t1 = null;
            }
            else {
                K k0 = e0.k(d1);
                if(k0 != null) {
                    t1 = N3.g.s(k0);
                    e5 = e1;
                }
            }
            z2 = z1;
            a a1 = (a)c0.e;
            boolean z3 = a1 == a.n;
            if(t0 == null) {
                a2 = a1;
                if(!z3) {
                    ((j3.a)f0.j).t.getClass();
                }
                if(l0 == null) {
                    h3 = r0;
                }
                else {
                    Y2.h h2 = l0.l();
                    if(h2 != null) {
                        h3 = h2;
                    }
                }
                h1 = i.c0(h3, h1);
            }
            else {
                a2 = a1;
            }
            ((j3.a)f0.j).q.getClass();
            l1 = l0;
            e e6 = null;
            Iterator iterator2 = h1.iterator();
            while(true) {
                if(!iterator2.hasNext()) {
                    e4 = e0;
                    break;
                }
                Object object2 = iterator2.next();
                v3.c c1 = g3.c.d(object2);
                e4 = e0;
                if(y.o.contains(c1)) {
                    e7 = e3;
                    goto label_96;
                }
                else if(y.p.contains(c1)) {
                    e7 = e5;
                label_96:
                    if(e6 == null || e6 == e7) {
                        e6 = e7;
                    }
                    else {
                        e6 = null;
                        break;
                    }
                }
                e0 = e4;
            }
            j3.a a3 = (j3.a)f0.j;
            f1 = f0;
            K3.j j0 = new K3.j(6, c0, a0);
            g3.c c2 = a3.q;
            c2.getClass();
            h h4 = null;
            Iterator iterator3 = h1.iterator();
            while(true) {
                if(!iterator3.hasNext()) {
                    v2 = v1;
                    break;
                }
                Object object3 = iterator3.next();
                h h5 = c2.g(object3, ((Boolean)j0.b(object3)).booleanValue());
                if(h5 == null) {
                    Object object4 = c2.i(object3);
                    if(object4 == null) {
                        c3 = c2;
                        v2 = v1;
                        h5 = null;
                    }
                    else {
                        B b0 = c2.h(object3);
                        if(b0 == null) {
                            b0 = c2.a.a.a;
                        }
                        v2 = v1;
                        if(b0 == B.i) {
                            c3 = c2;
                            h5 = null;
                        }
                        else {
                            h h6 = c2.g(object4, ((Boolean)j0.b(object4)).booleanValue());
                            if(h6 == null) {
                                c3 = c2;
                                h5 = null;
                            }
                            else {
                                c3 = c2;
                                h5 = h.a(h6, null, b0 == B.j, 1);
                            }
                        }
                    }
                }
                else {
                    c3 = c2;
                    v2 = v1;
                }
                if(h4 == null) {
                label_149:
                    h4 = h5;
                }
                else if(h5 != null && !h5.equals(h4)) {
                    boolean z4 = h4.b;
                    boolean z5 = h5.b;
                    if(!z5 || z4) {
                        if(z5 || !z4) {
                            h4 = null;
                            break;
                        }
                        else {
                            h4 = h5;
                            goto label_150;
                        }
                        goto label_149;
                    }
                }
            label_150:
                c2 = c3;
                v1 = v2;
            }
            if(h4 == null) {
                n n0 = a0.b == null ? null : ((n)a0.b.a.get((t0 == null || z3 ? a2 : a.m)));
                h h7 = t1 == null ? null : O.c.b(t1);
                if(h7 == null) {
                    h8 = n0 == null ? null : n0.a;
                }
                else {
                    h8 = h.a(h7, g2, false, 2);
                }
                boolean z6 = (h7 == null ? null : h7.a) == g2 || t1 != null && n0 != null && n0.c;
                if(t0 == null) {
                    h9 = null;
                }
                else {
                    h9 = O.c.b(t0);
                    if(h9 == null) {
                        h9 = null;
                    }
                    else if(h9.a == g1) {
                        h9 = h.a(h9, g0, false, 2);
                    }
                }
                if(h9 != null) {
                    if(h8 == null) {
                        h8 = h9;
                    }
                    else if((!h9.b || h8.b) && (!h9.b && h8.b || h9.a.compareTo(h8.a) >= 0 && h9.a.compareTo(h8.a) > 0)) {
                        h8 = h9;
                    }
                }
                d0 = new d((h8 == null ? null : h8.a), e6, z6, h8 != null && h8.b);
            }
            else {
                d0 = new d(h4.a, e6, h4.a == g2 && t1 != null, h4.b);
            }
        label_181:
            ArrayList arrayList2 = new ArrayList();
            for(Object object5: arrayList1) {
                n3.a a4 = (n3.a)i.V(v2, ((List)object5));
                if(a4 == null) {
                    e8 = e4;
                    d3 = null;
                }
                else {
                    P3.d d2 = a4.a;
                    if(d2 != null) {
                        g g3 = O.c.d(d2);
                        if(g3 == null) {
                            w w1 = M3.c.e(((w)d2));
                            g4 = w1 == null ? null : O.c.d(w1);
                        }
                        else {
                            g4 = g3;
                        }
                        e8 = e4;
                        v3.e e9 = O.c.c(e8.s(d2));
                        if(W2.d.k.containsKey(e9)) {
                            e10 = e3;
                        }
                        else {
                            v3.e e11 = O.c.c(e8.M(d2));
                            e10 = W2.d.j.containsKey(e11) ? e5 : null;
                        }
                        d3 = new d(g4, e10, e8.e0(d2) || ((w)d2).K0() instanceof n3.f, g4 != g3);
                    }
                }
                if(d3 != null) {
                    arrayList2.add(d3);
                }
                e4 = e8;
            }
            boolean z7 = v2 == 0 && z2;
            boolean z8 = v2 == 0 && l1 instanceof S && ((S)l1).r != null;
            ArrayList arrayList3 = new ArrayList();
            for(Object object6: arrayList2) {
                d d4 = (d)object6;
                g g5 = d4.d ? null : d4.a;
                if(g5 != null) {
                    arrayList3.add(g5);
                }
            }
            Set set0 = i.s0(arrayList3);
            g g6 = d0.a;
            g g7 = d0.d ? null : g6;
            g g8 = g7 == g0 ? g0 : ((g)z1.a0.L(set0, g2, g1, g7, z7));
            if(g8 == null) {
                ArrayList arrayList4 = new ArrayList();
                for(Object object7: arrayList2) {
                    g g9 = ((d)object7).a;
                    if(g9 != null) {
                        arrayList4.add(g9);
                    }
                }
                Set set1 = i.s0(arrayList4);
                if(g6 != g0) {
                    g0 = (g)z1.a0.L(set1, g2, g1, g6, z7);
                }
            }
            else {
                g0 = g8;
            }
            ArrayList arrayList5 = new ArrayList();
            for(Object object8: arrayList2) {
                e e12 = ((d)object8).b;
                if(e12 != null) {
                    arrayList5.add(e12);
                }
            }
            boolean z9 = false;
            e e13 = (e)z1.a0.L(i.s0(arrayList5), e5, e3, d0.b, z7);
            g g10 = g0 == null || z || z8 && g0 == g1 ? null : g0;
            if(g10 == g2) {
                if(d0.c) {
                    z9 = true;
                }
                else if(!arrayList2.isEmpty()) {
                    for(Object object9: arrayList2) {
                        if(((d)object9).c) {
                            z9 = true;
                            break;
                        }
                    }
                }
            }
            arr_d1[v2] = new d(g10, e13, z9, g10 != null && g8 != g0);
            v1 = v2 + 1;
            arr_d = arr_d1;
            z1 = z2;
            f0 = f1;
        }
        K3.j j1 = new K3.j(5, p0, arr_d);
        return (Z)c.d(w0.K0(), j1, 0, c0.b).j;
    }

    public w b(i3.a a0, b b0, boolean z, f f0, a a1, p p0, boolean z1, I2.b b1) {
        O.c c0 = new O.c(b0, z, f0, a1, false);
        Object object0 = b1.b(a0);
        Collection collection0 = a0.s();
        j.e(collection0, "getOverriddenDescriptors(...)");
        ArrayList arrayList0 = new ArrayList(k.E(collection0));
        for(Object object1: collection0) {
            j.c(((X2.c)object1));
            arrayList0.add(((w)b1.b(((X2.c)object1))));
        }
        return this.a(c0, ((w)object0), arrayList0, p0, z1);
    }

    public static l.a c(A a0, K3.j j0, int v, o o0, boolean z, boolean z1) {
        Y2.h h3;
        F f0;
        B.k k1;
        K k0;
        Boolean boolean0;
        X2.h h1;
        o o1 = o.k;
        if(o0 == o1 && a0.A0().isEmpty()) {
            return new l.a(null, 1, false);
        }
        X2.h h0 = a0.H0().q();
        if(h0 == null) {
            return new l.a(null, 1, false);
        }
        d d0 = (d)j0.b(v);
        if(o0 == o1 || !(h0 instanceof X2.e)) {
            h1 = null;
        }
        else if(d0.b == e.i && o0 == o.i) {
            v3.e e0 = y3.d.g(((X2.e)h0));
            HashMap hashMap0 = W2.d.j;
            if(hashMap0.containsKey(e0)) {
                v3.c c0 = (v3.c)hashMap0.get(y3.d.g(((X2.e)h0)));
                if(c0 == null) {
                    throw new IllegalArgumentException("Given class " + ((X2.e)h0) + " is not a mutable collection");
                }
                h1 = C3.e.e(((X2.e)h0)).i(c0);
            }
            else {
                goto label_17;
            }
        }
        else {
        label_17:
            if(d0.b != e.j || o0 != o.j) {
                h1 = null;
            }
            else {
                v3.e e1 = y3.d.g(((X2.e)h0));
                h1 = W2.d.k.containsKey(e1) ? W2.e.a(((X2.e)h0)) : null;
            }
        }
        if(o0 == o1) {
            boolean0 = null;
        }
        else {
            switch((d0.a == null ? -1 : q.a[d0.a.ordinal()])) {
                case 1: {
                    boolean0 = Boolean.TRUE;
                    break;
                }
                case 2: {
                    boolean0 = Boolean.FALSE;
                    break;
                }
                default: {
                    boolean0 = null;
                }
            }
        }
        if(h1 == null) {
            k0 = a0.H0();
        }
        else {
            k0 = h1.B();
            if(k0 == null) {
                k0 = a0.H0();
            }
        }
        j.c(k0);
        int v1 = v + 1;
        Iterable iterable0 = a0.A0();
        List list0 = k0.o();
        j.e(list0, "getParameters(...)");
        Iterator iterator0 = iterable0.iterator();
        Iterator iterator1 = list0.iterator();
        ArrayList arrayList0 = new ArrayList(Math.min(k.E(iterable0), k.E(list0)));
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = iterator1.next();
            T t0 = (T)object1;
            N n0 = (N)object0;
            if(z1 && z) {
                k1 = new B.k(null, 0);
            }
            else if(!n0.c()) {
                k1 = c.d(n0.b().K0(), j0, v1, z1);
            }
            else if(((d)j0.b(v1)).a == g.i) {
                Z z2 = n0.b().K0();
                k1 = new B.k(M3.d.j(M3.c.k(z2).O0(false), M3.c.y(z2).O0(true)), 1);
            }
            else {
                k1 = new B.k(null, 1);
            }
            v1 += k1.i;
            Z z3 = (Z)k1.j;
            if(z3 != null) {
                a0 a00 = n0.a();
                j.e(a00, "getProjectionKind(...)");
                f0 = o1.a.m(z3, a00, t0);
            }
            else if(h1 == null || n0.c()) {
                f0 = h1 == null ? null : X.j(t0);
            }
            else {
                w w0 = n0.b();
                j.e(w0, "getType(...)");
                a0 a01 = n0.a();
                j.e(a01, "getProjectionKind(...)");
                f0 = o1.a.m(w0, a01, t0);
            }
            arrayList0.add(f0);
        }
        int v2 = v1 - v;
        if(h1 == null && boolean0 == null) {
            if(!arrayList0.isEmpty()) {
                for(Object object2: arrayList0) {
                    if(((N)object2) == null) {
                        continue;
                    }
                    goto label_92;
                }
            }
            return new l.a(null, v2, false);
        }
    label_92:
        Y2.h[] arr_h = {a0.l(), (h1 == null ? null : n3.r.b), (boolean0 == null ? null : n3.r.a)};
        ArrayList arrayList1 = new ArrayList();
        for(int v3 = 0; v3 < 3; ++v3) {
            Y2.h h2 = arr_h[v3];
            if(h2 != null) {
                arrayList1.add(h2);
            }
        }
        switch(arrayList1.size()) {
            case 0: {
                throw new IllegalStateException("At least one Annotations object expected");
            }
            case 1: {
                h3 = (Y2.h)i.i0(arrayList1);
                break;
            }
            default: {
                h3 = new Y2.i(i.o0(arrayList1), 1);
                break;
            }
        }
        H h4 = M3.c.w(h3);
        Iterable iterable1 = a0.A0();
        Iterator iterator3 = arrayList0.iterator();
        Iterator iterator4 = iterable1.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(k.E(arrayList0), k.E(iterable1)));
        while(iterator3.hasNext() && iterator4.hasNext()) {
            Object object3 = iterator3.next();
            Object object4 = iterator4.next();
            N n1 = (N)object4;
            N n2 = (N)object3;
            if(n2 != null) {
                n1 = n2;
            }
            arrayList2.add(n1);
        }
        A a1 = M3.d.r(h4, k0, arrayList2, (boolean0 == null ? a0.I0() : boolean0.booleanValue()));
        if(d0.c) {
            a1 = new n3.f(a1);
        }
        return boolean0 == null || !d0.d ? new l.a(a1, v2, false) : new l.a(a1, v2, true);
    }

    public static B.k d(Z z0, K3.j j0, int v, boolean z1) {
        Z z2 = null;
        if(M3.c.i(z0)) {
            return new B.k(null, 1);
        }
        if(z0 instanceof M3.q) {
            l.a a0 = c.c(((M3.q)z0).j, j0, v, o.i, z0 instanceof l3.g, z1);
            l.a a1 = c.c(((M3.q)z0).k, j0, v, o.j, z0 instanceof l3.g, z1);
            A a2 = (A)a1.c;
            Z z3 = (A)a0.c;
            if(z3 != null || a2 != null) {
                if(!a0.b && !a1.b) {
                    A a3 = ((M3.q)z0).k;
                    A a4 = ((M3.q)z0).j;
                    if(z0 instanceof l3.g) {
                        if(z3 == null) {
                            z3 = a4;
                        }
                        if(a2 == null) {
                            a2 = a3;
                        }
                        return new B.k(new l3.g(((A)z3), a2), a0.a);
                    }
                    if(z3 == null) {
                        z3 = a4;
                    }
                    if(a2 == null) {
                        a2 = a3;
                    }
                    return new B.k(M3.d.j(((A)z3), a2), a0.a);
                }
                if(a2 == null) {
                    j.c(z3);
                }
                else {
                    if(z3 == null) {
                        z3 = a2;
                    }
                    z3 = M3.d.j(((A)z3), a2);
                }
                z2 = M3.c.A(z0, z3);
            }
            return new B.k(z2, a0.a);
        }
        if(!(z0 instanceof A)) {
            throw new NoWhenBranchMatchedException();
        }
        l.a a5 = c.c(((A)z0), j0, v, o.k, false, z1);
        boolean z4 = a5.b;
        Z z5 = (A)a5.c;
        if(z4) {
            z5 = M3.c.A(z0, z5);
        }
        return new B.k(z5, a5.a);
    }

    // This method was un-flattened
    public ArrayList e(f f0, Collection collection0) {
        w2.e e0;
        Iterator iterator4;
        f f3;
        Iterator iterator3;
        boolean z;
        n3.l l0;
        w w0;
        X2.c c1;
        Y2.h h1;
        j.f(f0, "c");
        ArrayList arrayList0 = new ArrayList(k.E(collection0));
        Iterator iterator0 = collection0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            X2.c c0 = (X2.c)object0;
            if(c0 instanceof i3.a) {
                i3.a a0 = (i3.a)c0;
                if(a0.j() == 2 && a0.a().s().size() == 1) {
                    iterator4 = iterator0;
                }
                else {
                    X2.h h0 = X2.w.g(c0);
                    if(h0 == null) {
                        h1 = ((G3.a)c0).l();
                    }
                    else {
                        k3.i i0 = h0 instanceof k3.i ? ((k3.i)h0) : null;
                        List list0 = i0 == null ? null : ((List)i0.s.getValue());
                        if(list0 == null || list0.isEmpty()) {
                            h1 = ((G3.a)c0).l();
                        }
                        else {
                            ArrayList arrayList1 = new ArrayList(k.E(list0));
                            for(Object object1: list0) {
                                arrayList1.add(new k3.f(f0, ((d3.e)object1), true));
                            }
                            ArrayList arrayList2 = i.c0(((G3.a)c0).l(), arrayList1);
                            h1 = arrayList2.isEmpty() ? Y2.g.a : new Y2.i(arrayList2, 0);
                        }
                    }
                    f f1 = o1.a.j(f0, h1);
                    if(c0 instanceof i3.g) {
                        J j0 = ((i3.g)c0).E;
                        if(j0 != null && !j0.m) {
                            c1 = j0;
                        }
                    }
                    else {
                        c1 = c0;
                    }
                    v v0 = a0.J();
                    a a1 = a.k;
                    if(v0 == null) {
                        w0 = null;
                    }
                    else {
                        u u0 = c1 instanceof u ? ((u)c1) : null;
                        S s0 = u0 == null ? null : ((S)u0.n0(i3.f.N));
                        w0 = this.b(((i3.a)c0), s0, false, (s0 == null ? f1 : o1.a.j(f1, s0.l())), a1, null, false, m.k);
                    }
                    i3.f f2 = c0 instanceof i3.f ? ((i3.f)c0) : null;
                    if(f2 == null) {
                        l0 = null;
                    }
                    else {
                        X2.k k0 = f2.p();
                        j.d(k0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String s1 = x2.w.y(((X2.e)k0), I.h(f2, 3));
                        if(s1 != null) {
                            l0 = (n3.l)n3.k.d.get(s1);
                        }
                    }
                    if(l0 != null) {
                        l0.b.size();
                        a0.z0().size();
                    }
                    j.f(((j3.a)f0.j).v, "javaTypeEnhancementState");
                    if(s.q.b(g3.q.a) != B.k) {
                        ((j3.a)f1.j).t.getClass();
                    }
                    else if(c0 instanceof u && j.a(c0.n0(i3.f.O), Boolean.TRUE)) {
                        z = true;
                        goto label_63;
                    }
                    z = false;
                label_63:
                    List list1 = c1.z0();
                    j.e(list1, "getValueParameters(...)");
                    ArrayList arrayList3 = new ArrayList(k.E(list1));
                    for(Object object2: list1) {
                        S s2 = (S)object2;
                        p p0 = l0 == null ? null : ((p)i.V(s2.n, l0.b));
                        A3.h h2 = new A3.h(s2, 24);
                        if(s2 == null) {
                            iterator3 = iterator0;
                            f3 = f1;
                        }
                        else {
                            iterator3 = iterator0;
                            f3 = o1.a.j(f1, s2.l());
                        }
                        arrayList3.add(this.b(((i3.a)c0), s2, false, f3, a1, p0, z, h2));
                        iterator0 = iterator3;
                    }
                    iterator4 = iterator0;
                    M m0 = c0 instanceof M ? ((M)c0) : null;
                    w w1 = this.b(((i3.a)c0), c1, true, f1, (m0 == null || !O2.A.O(m0) ? a.j : a.l), (l0 == null ? null : l0.a), false, m.l);
                    w w2 = a0.r();
                    j.c(w2);
                    m m1 = m.j;
                    if(X.c(w2, m1, null)) {
                    label_101:
                        g3.h h3 = new g3.h();  // 初始化器: Ljava/lang/Object;-><init>()V
                        e0 = new w2.e(B3.c.a, h3);
                    }
                    else {
                        v v1 = a0.J();
                        if((v1 == null ? false : X.c(v1.getType(), m1, null))) {
                            goto label_101;
                        }
                        else {
                            e0 = null;
                            List list2 = a0.z0();
                            j.e(list2, "getValueParameters(...)");
                            Iterable iterable0 = list2;
                            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                                for(Object object3: iterable0) {
                                    w w3 = ((S)object3).getType();
                                    j.e(w3, "getType(...)");
                                    if(X.c(w3, m1, null)) {
                                        goto label_101;
                                    }
                                }
                            }
                        }
                    }
                    boolean z1 = false;
                    if(w0 != null || w1 != null) {
                    label_112:
                        if(w0 == null) {
                            v v2 = a0.J();
                            w0 = v2 == null ? null : v2.getType();
                        }
                        ArrayList arrayList4 = new ArrayList(k.E(arrayList3));
                        int v3 = 0;
                        for(Object object5: arrayList3) {
                            if(v3 >= 0) {
                                w w4 = (w)object5;
                                if(w4 == null) {
                                    w4 = ((S)a0.z0().get(v3)).getType();
                                    j.e(w4, "getType(...)");
                                }
                                arrayList4.add(w4);
                                ++v3;
                                continue;
                            }
                            x2.j.D();
                            throw null;
                        }
                        if(w1 == null) {
                            w1 = a0.r();
                            j.c(w1);
                        }
                        c0 = a0.F(w0, arrayList4, w1, e0);
                    }
                    else {
                        if(!arrayList3.isEmpty()) {
                            for(Object object4: arrayList3) {
                                if(((w)object4) != null) {
                                    z1 = true;
                                    break;
                                }
                            }
                        }
                        if(z1 || e0 != null) {
                            goto label_112;
                        }
                    }
                }
            }
            else {
                iterator4 = iterator0;
            }
            arrayList0.add(c0);
            iterator0 = iterator4;
        }
        return arrayList0;
    }
}

