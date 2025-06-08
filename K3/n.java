package k3;

import B.f;
import I2.b;
import L3.i;
import L3.j;
import L3.m;
import M3.N;
import M3.V;
import M3.X;
import M3.Z;
import M3.w;
import O2.A;
import V3.h;
import X2.M;
import X2.P;
import X2.e;
import X2.p;
import X2.t;
import X2.u;
import Y2.g;
import a3.J;
import a3.K;
import a3.L;
import a3.S;
import a3.v;
import com.google.android.gms.internal.ads.U;
import d3.o;
import d3.x;
import g3.G;
import i3.d;
import j3.a;
import java.lang.annotation.Annotation;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o2.I;
import v3.c;
import x2.r;
import x2.z;
import y3.k;
import z1.a0;

public final class n extends y {
    public final e n;
    public final o o;
    public final boolean p;
    public final i q;
    public final i r;
    public final i s;
    public final i t;
    public final j u;

    public n(f f0, e e0, o o0, boolean z, n n0) {
        J2.j.f(f0, "c");
        J2.j.f(e0, "ownerDescriptor");
        J2.j.f(o0, "jClass");
        super(f0, n0);
        this.n = e0;
        this.o = o0;
        this.p = z;
        m m0 = ((a)f0.j).a;
        l l0 = new l(this, f0);
        m0.getClass();
        this.q = new i(m0, l0);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        k3.m m1 = new k3.m(this, 1);
        m0.getClass();
        this.r = new i(m0, m1);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        l l1 = new l(f0, this);
        m0.getClass();
        this.s = new i(m0, l1);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        k3.m m2 = new k3.m(this, 0);
        m0.getClass();
        this.t = new i(m0, m2);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.u = m0.c(new K3.j(3, this, f0));
    }

    public final void A(Set set0, AbstractCollection abstractCollection0, h h0, b b0) {
        K k0;
        L l1;
        for(Object object0: set0) {
            M m0 = (M)object0;
            if(this.E(m0, b0)) {
                L l0 = this.I(m0, b0);
                J2.j.c(l0);
                if(m0.G()) {
                    l1 = n.J(m0, b0);
                    J2.j.c(l1);
                }
                else {
                    l1 = null;
                }
                if(l1 != null) {
                    l1.f();
                    l0.f();
                }
                J2.j.f(this.n, "ownerDescriptor");
                X2.y y0 = l0.f();
                X2.o o0 = l0.c();
                new d(this.n, g.a, y0, o0, l1 != null, m0.getName(), l0.q(), null, 1, false, null);  // 初始化器: Li3/g;-><init>(LX2/k;LY2/h;LX2/y;LX2/o;ZLv3/f;LX2/O;LX2/M;IZLw2/e;)V
                w w0 = l0.o;
                J2.j.c(w0);
                v v0 = this.p();
                null.T0(w0, r.i, v0, null, r.i);
                J j0 = y3.l.l(null, l0.l(), false, l0.q());
                j0.t = l0;
                j0.P0(null.getType());
                if(l1 == null) {
                    k0 = null;
                }
                else {
                    List list0 = l1.z0();
                    J2.j.e(list0, "getValueParameters(...)");
                    S s0 = (S)x2.i.U(list0);
                    if(s0 == null) {
                        throw new AssertionError("No parameter found for " + l1);
                    }
                    k0 = y3.l.m(null, l1.l(), s0.l(), false, l1.c(), l1.q());
                    k0.t = l1;
                }
                null.Q0(j0, k0, null, null);
            }
        }
    }

    public final Collection B() {
        e e0 = this.n;
        if(this.p) {
            Collection collection0 = e0.B().r();
            J2.j.e(collection0, "getSupertypes(...)");
            return collection0;
        }
        ((a)this.b.j).u.getClass();
        J2.j.f(e0, "classDescriptor");
        Collection collection1 = e0.B().r();
        J2.j.e(collection1, "getSupertypes(...)");
        return collection1;
    }

    public static L C(L l0, u u0, AbstractCollection abstractCollection0) {
        if(!abstractCollection0.isEmpty()) {
            for(Object object0: abstractCollection0) {
                L l1 = (L)object0;
                if(!l0.equals(l1) && l1.J == null && n.F(l1, u0)) {
                    u u1 = l0.s0().r().c();
                    J2.j.c(u1);
                    return (L)u1;
                }
                if(false) {
                    break;
                }
            }
        }
        return l0;
    }

    public static L D(L l0) {
        c c0;
        List list0 = l0.z0();
        J2.j.e(list0, "getValueParameters(...)");
        S s0 = (S)x2.i.b0(list0);
        if(s0 != null) {
            X2.h h0 = s0.getType().H0().q();
            if(h0 == null) {
                c0 = null;
            }
            else {
                v3.e e0 = C3.e.h(h0);
                if(!e0.d()) {
                    e0 = null;
                }
                c0 = e0 == null ? null : e0.g();
            }
            if(!J2.j.a(c0, U2.n.g)) {
                s0 = null;
            }
            if(s0 != null) {
                t t0 = l0.s0();
                List list1 = l0.z0();
                J2.j.e(list1, "getValueParameters(...)");
                L l1 = (L)t0.g(x2.i.P(list1)).t(((N)s0.getType().A0().get(0)).b()).c();
                if(l1 != null) {
                    l1.C = true;
                }
                return l1;
            }
        }
        return null;
    }

    public final boolean E(M m0, b b0) {
        if(A.O(m0)) {
            return false;
        }
        L l0 = this.I(m0, b0);
        L l1 = n.J(m0, b0);
        if(l0 == null) {
            return false;
        }
        return m0.G() ? l1 != null && l1.f() == l0.f() : true;
    }

    public static boolean F(u u0, u u1) {
        int v = k.c.n(u1, u0, true).c();
        A.f.u(v, "getResult(...)");
        return v == 1 && !a0.n(u1, u0);
    }

    public static boolean G(L l0, L l1) {
        J2.j.f(l0, "<this>");
        if(J2.j.a(l0.getName().b(), "removeAt") && J2.j.a(I.i(l0), G.g.e)) {
            l1 = l1.Y0();
        }
        J2.j.c(l1);
        return n.F(l1, l0);
    }

    public static L H(M m0, String s, b b0) {
        L l0;
        Iterator iterator0 = ((Iterable)b0.b(v3.f.e(s))).iterator();
        do {
            l0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            L l1 = (L)object0;
            if(l1.z0().size() == 0 && (l1.o == null ? false : N3.d.a.b(l1.o, m0.getType()))) {
                l0 = l1;
            }
        }
        while(l0 == null);
        return l0;
    }

    public final L I(M m0, b b0) {
        J j0 = m0.d();
        String s = null;
        J j1 = j0 == null ? null : ((J)android.support.v4.media.session.a.x(j0));
        if(j1 != null) {
            U2.h.z(j1);
            X2.c c0 = C3.e.b(C3.e.k(j1), g3.e.l);
            if(c0 != null) {
                c c1 = C3.e.g(c0);
                v3.f f0 = (v3.f)((Map)g3.g.a).get(c1);
                if(f0 != null) {
                    s = f0.b();
                }
            }
        }
        if(s != null && !android.support.v4.media.session.a.C(this.n, j1)) {
            return n.H(m0, s, b0);
        }
        String s1 = m0.getName().b();
        J2.j.e(s1, "asString(...)");
        return n.H(m0, g3.w.a(s1), b0);
    }

    public static L J(M m0, b b0) {
        L l0;
        String s = m0.getName().b();
        J2.j.e(s, "asString(...)");
        Iterator iterator0 = ((Iterable)b0.b(v3.f.e(g3.w.b(s)))).iterator();
        do {
            l0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            L l1 = (L)object0;
            if(l1.z0().size() == 1 && (l1.o != null && U2.h.D(l1.o, U2.m.d))) {
                List list0 = l1.z0();
                J2.j.e(list0, "getValueParameters(...)");
                w w0 = ((S)x2.i.i0(list0)).getType();
                w w1 = m0.getType();
                if(N3.d.a.a(w0, w1)) {
                    l0 = l1;
                }
            }
        }
        while(l0 == null);
        return l0;
    }

    public final LinkedHashSet K(v3.f f0) {
        Iterable iterable0 = this.B();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object0: iterable0) {
            x2.o.H(((w)object0).x0().b(f0, f3.b.m), linkedHashSet0);
        }
        return linkedHashSet0;
    }

    public final Set L(v3.f f0) {
        Iterable iterable0 = this.B();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            Iterable iterable1 = ((w)object0).x0().a(f0, f3.b.m);
            ArrayList arrayList1 = new ArrayList(x2.k.E(iterable1));
            for(Object object1: iterable1) {
                arrayList1.add(((M)object1));
            }
            x2.o.H(arrayList1, arrayList0);
        }
        return x2.i.s0(arrayList0);
    }

    public static boolean M(L l0, u u0) {
        String s = I.h(l0, 2);
        u u1 = u0.a();
        J2.j.e(u1, "getOriginal(...)");
        return s.equals(I.h(u1, 2)) && !n.F(l0, u0);
    }

    public final boolean N(L l0) {
        List list0;
        v3.f f0 = l0.getName();
        J2.j.e(f0, "getName(...)");
        String s = f0.b();
        J2.j.e(s, "asString(...)");
        if(Y3.n.H0(s, "get") || Y3.n.H0(s, "is")) {
            v3.f f2 = A.U(f0, "get", null, 12);
            if(f2 == null) {
                f2 = A.U(f0, "is", null, 8);
            }
            list0 = x2.j.A(f2);
        }
        else if(Y3.n.H0(s, "set")) {
            v3.f[] arr_f = {A.U(f0, "set", null, 4), A.U(f0, "set", "is", 4)};
            list0 = new ArrayList();
            for(int v = 0; v < 2; ++v) {
                v3.f f1 = arr_f[v];
                if(f1 != null) {
                    ((ArrayList)list0).add(f1);
                }
            }
        }
        else {
            list0 = (List)g3.g.b.get(f0);
            if(list0 == null) {
                list0 = r.i;
            }
        }
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                Iterable iterable0 = this.L(((v3.f)object0));
                if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                    for(Object object1: iterable0) {
                        M m0 = (M)object1;
                        if(!this.E(m0, new K3.j(2, l0, this))) {
                            continue;
                        }
                        if(!m0.G()) {
                            String s1 = l0.getName().b();
                            J2.j.e(s1, "asString(...)");
                            if(!Y3.n.H0(s1, "set")) {
                                return false;
                            }
                            continue;
                        }
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        v3.f f3 = l0.getName();
        J2.j.e(f3, "getName(...)");
        v3.f f4 = (v3.f)G.k.get(f3);
        if(f4 != null) {
            LinkedHashSet linkedHashSet0 = this.K(f4);
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: linkedHashSet0) {
                J2.j.f(((L)object2), "<this>");
                if(android.support.v4.media.session.a.x(((L)object2)) != null) {
                    arrayList0.add(object2);
                }
            }
            if(!arrayList0.isEmpty()) {
                t t0 = l0.s0();
                t0.L(f4);
                t0.K();
                t0.x();
                u u0 = t0.c();
                J2.j.c(u0);
                if(!arrayList0.isEmpty()) {
                    for(Object object3: arrayList0) {
                        if(n.G(((L)object3), ((L)u0))) {
                            return false;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
        }
        v3.f f5 = l0.getName();
        J2.j.e(f5, "getName(...)");
        if(g3.f.b(f5)) {
            v3.f f6 = l0.getName();
            J2.j.e(f6, "getName(...)");
            LinkedHashSet linkedHashSet1 = this.K(f6);
            ArrayList arrayList1 = new ArrayList();
            for(Object object4: linkedHashSet1) {
                u u1 = g3.f.a(((L)object4));
                if(u1 != null) {
                    arrayList1.add(u1);
                }
            }
            if(!arrayList1.isEmpty()) {
                for(Object object5: arrayList1) {
                    if(n.M(l0, ((u)object5))) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        L l1 = n.D(l0);
        if(l1 != null) {
            v3.f f7 = l0.getName();
            J2.j.e(f7, "getName(...)");
            LinkedHashSet linkedHashSet2 = this.K(f7);
            if(!linkedHashSet2.isEmpty()) {
                for(Object object6: linkedHashSet2) {
                    if(((L)object6).n() && n.F(l1, ((L)object6))) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return true;
    }

    public final void O(v3.f f0, f3.b b0) {
        J2.j.f(f0, "name");
        J2.j.f(b0, "location");
        J2.j.f(((a)this.b.j).n, "<this>");
        J2.j.f(this.n, "scopeOwner");
    }

    @Override  // k3.y
    public final Collection a(v3.f f0, f3.b b0) {
        J2.j.f(f0, "name");
        this.O(f0, b0);
        return super.a(f0, b0);
    }

    @Override  // k3.y
    public final Collection b(v3.f f0, f3.b b0) {
        J2.j.f(f0, "name");
        this.O(f0, b0);
        return super.b(f0, b0);
    }

    @Override  // F3.o
    public final X2.h f(v3.f f0, f3.b b0) {
        J2.j.f(f0, "name");
        J2.j.f(b0, "location");
        this.O(f0, b0);
        n n0 = this.c;
        if(n0 != null) {
            j j0 = n0.u;
            if(j0 != null) {
                X2.h h0 = (e)j0.b(f0);
                return h0 == null ? ((X2.h)this.u.b(f0)) : h0;
            }
        }
        return (X2.h)this.u.b(f0);
    }

    @Override  // k3.y
    public final Set h(F3.f f0, F3.k k0) {
        J2.j.f(f0, "kindFilter");
        return z.w(((Set)this.r.invoke()), ((Map)this.t.invoke()).keySet());
    }

    @Override  // k3.y
    public final Set i(F3.f f0, F3.k k0) {
        J2.j.f(f0, "kindFilter");
        e e0 = this.n;
        Collection collection0 = e0.B().r();
        J2.j.e(collection0, "getSupertypes(...)");
        Set set0 = new LinkedHashSet();
        for(Object object0: collection0) {
            x2.o.H(((w)object0).x0().c(), set0);
        }
        ((AbstractCollection)set0).addAll(((k3.c)this.e.invoke()).b());
        ((AbstractCollection)set0).addAll(((k3.c)this.e.invoke()).e());
        ((AbstractCollection)set0).addAll(this.h(f0, k0));
        ((AbstractCollection)set0).addAll(((D3.a)((a)this.b.j).x).e(this.b, e0));
        return set0;
    }

    @Override  // k3.y
    public final void j(ArrayList arrayList0, v3.f f0) {
        J2.j.f(f0, "name");
        boolean z = this.o.g();
        e e0 = this.n;
        f f1 = this.b;
        if(z) {
            i i0 = this.e;
            if(((k3.c)i0.invoke()).c(f0) != null) {
                if(!arrayList0.isEmpty()) {
                    for(Object object0: arrayList0) {
                        if(!((L)object0).z0().isEmpty()) {
                            continue;
                        }
                        ((D3.a)((a)f1.j).x).b(f1, e0, f0, arrayList0);
                        return;
                    }
                }
                d3.A a0 = ((k3.c)i0.invoke()).c(f0);
                J2.j.c(a0);
                j3.c c0 = a0.J(f1, a0);
                v3.f f2 = a0.c();
                a a1 = (a)f1.j;
                i3.f f3 = i3.f.b1(e0, c0, f2, a1.j.a(a0), true);
                l3.a a2 = android.support.v4.media.session.a.P(V.j, false, null, 6);
                m3.d d0 = a0.f();
                w w0 = ((B1.a)f1.n).H(d0, a2);
                v v0 = this.p();
                X2.y.i.getClass();
                X2.y y0 = P.a(false, false, true);
                f3.a1(null, v0, r.i, r.i, r.i, w0, y0, p.e, null);
                f3.L = 1;
                a1.g.getClass();
                arrayList0.add(f3);
            }
        }
        ((D3.a)((a)f1.j).x).b(f1, e0, f0, arrayList0);
    }

    @Override  // k3.y
    public final k3.c k() {
        return new k3.a(this.o, k3.j.j);
    }

    @Override  // k3.y
    public final void m(LinkedHashSet linkedHashSet0, v3.f f0) {
        J2.j.f(f0, "name");
        LinkedHashSet linkedHashSet1 = this.K(f0);
        if(!G.j.contains(f0) && !g3.f.b(f0)) {
            if(!linkedHashSet1.isEmpty()) {
                for(Object object0: linkedHashSet1) {
                    if(!((u)object0).n()) {
                        continue;
                    }
                    goto label_18;
                }
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: linkedHashSet1) {
                if(this.N(((L)object1))) {
                    arrayList0.add(object1);
                }
            }
            this.y(linkedHashSet0, f0, arrayList0, false);
            return;
        }
    label_18:
        h h0 = new h();
        LinkedHashSet linkedHashSet2 = android.support.v4.media.session.a.L(f0, linkedHashSet1, r.i, this.n, I3.l.a, ((a)this.b.j).u.d);
        this.z(f0, linkedHashSet0, linkedHashSet2, linkedHashSet0, new K3.k(1, 1, this));
        this.z(f0, linkedHashSet0, linkedHashSet2, h0, new K3.k(1, 2, this));
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: linkedHashSet1) {
            if(this.N(((L)object2))) {
                arrayList1.add(object2);
            }
        }
        this.y(linkedHashSet0, f0, x2.i.e0(h0, arrayList1), true);
    }

    @Override  // k3.y
    public final void n(ArrayList arrayList0, v3.f f0) {
        Set set1;
        J2.j.f(f0, "name");
        f f1 = this.b;
        if(this.o.a.isAnnotation()) {
            x x0 = (x)x2.i.j0(((k3.c)this.e.invoke()).a(f0));
            if(x0 != null) {
                j3.c c0 = a0.J(f1, x0);
                X2.o o0 = o1.a.W(x0.e());
                v3.f f2 = x0.c();
                c3.f f3 = ((a)f1.j).j.a(x0);
                i3.g g0 = i3.g.U0(this.n, c0, o0, false, f2, f3, false);
                J j0 = y3.l.f(g0, g.a);
                g0.Q0(j0, null, null, null);
                J2.j.f(f1, "<this>");
                Object object0 = f1.l;
                w w0 = y.l(x0, new f(((a)f1.j), new U(f1, g0, x0, 0), ((w2.c)object0)));
                v v0 = this.p();
                g0.T0(w0, r.i, v0, null, r.i);
                j0.u = w0;
                arrayList0.add(g0);
            }
        }
        Set set0 = this.L(f0);
        if(set0.isEmpty()) {
            return;
        }
        h h0 = new h();
        h h1 = new h();
        this.A(set0, arrayList0, h0, new k3.k(this, 0));
        if(h0.isEmpty()) {
            set1 = x2.i.s0(set0);
        }
        else if(h0 instanceof Set) {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            for(Object object1: set0) {
                if(!h0.contains(object1)) {
                    linkedHashSet0.add(object1);
                }
            }
            set1 = linkedHashSet0;
        }
        else {
            LinkedHashSet linkedHashSet1 = new LinkedHashSet(set0);
            linkedHashSet1.removeAll(h0);
            set1 = linkedHashSet1;
        }
        this.A(set1, h1, null, new k3.k(this, 1));
        arrayList0.addAll(android.support.v4.media.session.a.L(f0, z.w(set0, h1), arrayList0, this.n, ((a)f1.j).f, ((a)f1.j).u.d));
    }

    @Override  // k3.y
    public final Set o(F3.f f0) {
        J2.j.f(f0, "kindFilter");
        if(this.o.a.isAnnotation()) {
            return this.c();
        }
        Set set0 = new LinkedHashSet(((k3.c)this.e.invoke()).f());
        Collection collection0 = this.n.B().r();
        J2.j.e(collection0, "getSupertypes(...)");
        for(Object object0: collection0) {
            x2.o.H(((w)object0).x0().d(), set0);
        }
        return set0;
    }

    @Override  // k3.y
    public final v p() {
        e e0 = this.n;
        if(e0 != null) {
            return e0.F0();
        }
        y3.d.a(0);
        throw null;
    }

    @Override  // k3.y
    public final X2.k q() {
        return this.n;
    }

    // 去混淆评级： 低(20)
    @Override  // k3.y
    public final boolean r(i3.f f0) {
        return this.o.a.isAnnotation() ? false : this.N(f0);
    }

    @Override  // k3.y
    public final k3.v s(x x0, ArrayList arrayList0, w w0, List list0) {
        J2.j.f(x0, "method");
        ((a)this.b.j).e.getClass();
        if(this.n == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'owner\' of kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1.resolvePropagatedSignature must not be null");
        }
        List list1 = Collections.emptyList();
        if(list1 == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'signatureErrors\' of kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature.<init> must not be null");
        }
        return new k3.v(w0, list0, arrayList0, list1);
    }

    @Override  // k3.y
    public final String toString() {
        return "Lazy Java member scope for " + this.o.c();
    }

    public static final ArrayList v(n n0, v3.f f0) {
        Iterable iterable0 = ((k3.c)n0.e.invoke()).a(f0);
        ArrayList arrayList0 = new ArrayList(x2.k.E(iterable0));
        for(Object object0: iterable0) {
            arrayList0.add(n0.t(((x)object0)));
        }
        return arrayList0;
    }

    public static final ArrayList w(n n0, v3.f f0) {
        LinkedHashSet linkedHashSet0 = n0.K(f0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: linkedHashSet0) {
            J2.j.f(((L)object0), "<this>");
            if(android.support.v4.media.session.a.x(((L)object0)) == null && g3.f.a(((L)object0)) == null) {
                arrayList0.add(object0);
            }
        }
        return arrayList0;
    }

    public final void x(ArrayList arrayList0, i3.b b0, int v, x x0, w w0, w w1) {
        d3.t t0;
        Y2.f f0 = g.a;
        v3.f f1 = x0.c();
        if(w0 != null) {
            Z z0 = X.g(w0, false);
            Object object0 = x0.a.getDefaultValue();
            if(object0 == null) {
                t0 = null;
            }
            else {
                Class class0 = object0.getClass();
                if(Enum.class.isAssignableFrom(class0)) {
                    t0 = new d3.t(null, ((Enum)object0));
                }
                else if(object0 instanceof Annotation) {
                    t0 = new d3.g(null, ((Annotation)object0));
                }
                else if(object0 instanceof Object[]) {
                    t0 = new d3.h(null, ((Object[])object0));
                }
                else if(object0 instanceof Class) {
                    t0 = new d3.p(null, ((Class)object0));
                }
                else {
                    t0 = new d3.v(null, object0);
                }
            }
            arrayList0.add(new S(b0, null, v, f0, f1, z0, t0 != null, false, false, (w1 == null ? null : X.g(w1, false)), ((a)this.b.j).j.a(x0)));
            return;
        }
        X.a(2);
        throw null;
    }

    public final void y(LinkedHashSet linkedHashSet0, v3.f f0, ArrayList arrayList0, boolean z) {
        LinkedHashSet linkedHashSet1 = android.support.v4.media.session.a.L(f0, arrayList0, linkedHashSet0, this.n, ((a)this.b.j).f, ((a)this.b.j).u.d);
        if(!z) {
            linkedHashSet0.addAll(linkedHashSet1);
            return;
        }
        ArrayList arrayList1 = x2.i.e0(linkedHashSet1, linkedHashSet0);
        ArrayList arrayList2 = new ArrayList(x2.k.E(linkedHashSet1));
        for(Object object0: linkedHashSet1) {
            L l0 = (L)object0;
            L l1 = (L)android.support.v4.media.session.a.y(l0);
            if(l1 != null) {
                l0 = n.C(l0, l1, arrayList1);
            }
            arrayList2.add(l0);
        }
        linkedHashSet0.addAll(arrayList2);
    }

    public final void z(v3.f f0, LinkedHashSet linkedHashSet0, LinkedHashSet linkedHashSet1, AbstractSet abstractSet0, b b0) {
        L l6;
        L l5;
        Iterator iterator0 = linkedHashSet1.iterator();
        while(iterator0.hasNext()) {
            L l0 = null;
            Object object0 = iterator0.next();
            L l1 = (L)object0;
            L l2 = (L)android.support.v4.media.session.a.x(l1);
            L l3 = null;
            if(l2 != null) {
                String s = android.support.v4.media.session.a.v(l2);
                J2.j.c(s);
                for(Object object1: ((Collection)b0.b(v3.f.e(s)))) {
                    t t0 = ((L)object1).s0();
                    t0.L(f0);
                    t0.K();
                    t0.x();
                    u u0 = t0.c();
                    J2.j.c(u0);
                    L l4 = (L)u0;
                    if(n.G(l2, l4)) {
                        l0 = n.C(l4, l2, linkedHashSet0);
                        break;
                    }
                }
            }
            V3.k.a(abstractSet0, l0);
            u u1 = g3.f.a(l1);
            if(u1 == null) {
                l6 = null;
            }
            else {
                v3.f f1 = ((a3.m)u1).getName();
                J2.j.e(f1, "getName(...)");
                for(Object object2: ((Iterable)b0.b(f1))) {
                    if(!n.M(((L)object2), u1)) {
                        continue;
                    }
                    goto label_33;
                }
                object2 = null;
            label_33:
                if(((L)object2) == null) {
                    l5 = null;
                }
                else {
                    t t1 = ((L)object2).s0();
                    List list0 = u1.z0();
                    J2.j.e(list0, "getValueParameters(...)");
                    ArrayList arrayList0 = new ArrayList(x2.k.E(list0));
                    for(Object object3: list0) {
                        arrayList0.add(((S)object3).getType());
                    }
                    List list1 = ((L)object2).z0();
                    J2.j.e(list1, "getValueParameters(...)");
                    t1.g(a0.i(arrayList0, list1, u1));
                    t1.K();
                    t1.x();
                    t1.G();
                    l5 = (L)t1.c();
                }
                if(l5 != null) {
                    if(!this.N(l5)) {
                        l5 = null;
                    }
                    if(l5 != null) {
                        l6 = n.C(l5, u1, linkedHashSet0);
                    }
                }
            }
            V3.k.a(abstractSet0, l6);
            if(l1.n()) {
                v3.f f2 = l1.getName();
                J2.j.e(f2, "getName(...)");
                for(Object object4: ((Iterable)b0.b(f2))) {
                    L l7 = n.D(((L)object4));
                    if(l7 == null || !n.F(l7, l1)) {
                        l7 = null;
                    }
                    if(l7 != null) {
                        l3 = l7;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            V3.k.a(abstractSet0, l3);
        }
    }
}

