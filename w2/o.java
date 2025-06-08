package W2;

import J2.j;
import J2.r;
import L3.e;
import L3.g;
import L3.i;
import L3.m;
import M3.Q;
import M3.U;
import M3.y;
import O2.q;
import X2.h;
import X2.p;
import Z2.b;
import Z2.d;
import a3.A;
import a3.L;
import a3.S;
import a3.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o1.a;
import o2.G;
import o2.I;
import v3.c;
import v3.f;
import x2.t;
import x2.w;

public final class o implements b, d {
    public final A a;
    public final i b;
    public final M3.A c;
    public final i d;
    public final e e;
    public final i f;
    public final e g;
    public static final q[] h;

    static {
        J2.o o0 = new J2.o(r.a.b(o.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;");
        J2.o o1 = new J2.o(r.a.b(o.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;");
        J2.o o2 = new J2.o(r.a.b(o.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;");
        o.h = new q[]{r.a.e(o0), r.a.e(o1), r.a.e(o2)};
    }

    public o(A a0, m m0, A3.m m1) {
        this.a = a0;
        this.b = new i(m0, m1);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        k k0 = new k(a0, new c("java.io"), 0);
        List list0 = G.p(new y(m0, new l(this, 0)));
        a3.k k1 = new a3.k(k0, f.e("Serializable"), X2.y.m, X2.f.j, list0, m0);
        k1.A0(F3.m.b, t.i, null);
        this.c = k1.k();
        this.d = new i(m0, new I3.A(9, this, m0));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.e = new e(m0, new ConcurrentHashMap(3, 1.0f, 2), new L3.f(), 0);  // 初始化器: Ljava/lang/Object;-><init>()V
        this.f = new i(m0, new l(this, 1));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.g = m0.b(new W2.m(this, 0));
    }

    @Override  // Z2.b
    public final Collection a(X2.e e0) {
        j.f(e0, "classDescriptor");
        X2.f f0 = e0.j();
        Collection collection0 = x2.r.i;
        if(f0 == X2.f.i) {
            this.g().getClass();
            k3.i i0 = this.f(e0);
            if(i0 == null) {
                return collection0;
            }
            X2.e e1 = W2.e.b(C3.e.g(i0), W2.b.f);
            if(e1 == null) {
                return collection0;
            }
            U u0 = new U(a.l(e1, i0));
            Iterable iterable0 = (List)i0.y.q.invoke();
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = iterable0.iterator();
        alab1:
            while(true) {
                v3.e e2 = null;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                a3.i i1 = (a3.i)object0;
                u u1 = i1;
                if(u1.c().a.j) {
                    Collection collection1 = e1.g();
                    j.e(collection1, "getConstructors(...)");
                    Iterable iterable1 = collection1;
                    if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                        for(Object object1: iterable1) {
                            j.c(((a3.i)object1));
                            if(y3.k.j(((a3.i)object1), i1.c1(u0)) == 1) {
                                continue alab1;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    if(u1.z0().size() == 1) {
                        List list0 = u1.z0();
                        j.e(list0, "getValueParameters(...)");
                        h h0 = ((S)x2.i.i0(list0)).getType().H0().q();
                        if(h0 != null) {
                            e2 = C3.e.h(h0);
                        }
                        if(!j.a(e2, C3.e.h(e0))) {
                            goto label_38;
                        }
                    }
                    else {
                    label_38:
                        if(!U2.h.C(i1)) {
                            String s = w.y(i0, I.h(i1, 3));
                            if(!W2.r.f.contains(s)) {
                                arrayList0.add(object0);
                            }
                        }
                    }
                }
            }
            Collection collection2 = new ArrayList(x2.k.E(arrayList0));
            for(Object object2: arrayList0) {
                ((a3.i)object2).getClass();
                a3.t t0 = ((a3.i)object2).S0(U.b);
                t0.j = e0;
                t0.t(e0.k());
                t0.w = true;
                Q q0 = u0.f();
                if(q0 != null) {
                    t0.i = q0;
                    String s1 = w.y(i0, I.h(((a3.i)object2), 3));
                    if(!W2.r.g.contains(s1)) {
                        t0.k(((Y2.h)android.support.v4.media.session.a.A(this.f, o.h[2])));
                    }
                    u u2 = t0.F.P0(t0);
                    j.d(u2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                    ((ArrayList)collection2).add(((a3.i)u2));
                    continue;
                }
                a3.t.d(37);
                throw null;
            }
            return collection2;
        }
        return collection0;
    }

    @Override  // Z2.b
    public final Collection b(X2.e e0) {
        j.f(e0, "classDescriptor");
        this.g().getClass();
        Set set0 = t.i;
        k3.i i0 = this.f(e0);
        if(i0 != null) {
            Set set1 = i0.A0().c();
            return set1 == null ? set0 : set1;
        }
        return set0;
    }

    // This method was un-flattened
    @Override  // Z2.b
    public final Collection c(f f0, X2.e e0) {
        L l2;
        boolean z1;
        Object object1;
        Collection collection1;
        j.f(f0, "name");
        j.f(e0, "classDescriptor");
        Collection collection0 = x2.r.i;
        q[] arr_q = o.h;
        if(f0.equals(W2.a.e) && e0 instanceof K3.l && (U2.h.b(e0, U2.m.g) || U2.h.r(e0) != null)) {
            List list0 = ((K3.l)e0).m.y;
            j.e(list0, "getFunctionList(...)");
            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                for(Object object0: list0) {
                    if(android.support.v4.media.session.a.w(((s3.f)((K3.l)e0).t.j), ((q3.y)object0).n).equals(W2.a.e)) {
                        return collection0;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            X2.t t0 = ((L)x2.i.h0(((M3.A)android.support.v4.media.session.a.A(this.d, arr_q[1])).x0().b(f0, f3.b.i))).s0();
            t0.i(((K3.l)e0));
            t0.M(p.e);
            t0.t(((K3.l)e0).k());
            t0.b(((K3.l)e0).F0());
            X2.u u0 = t0.c();
            j.c(u0);
            return G.p(((L)u0));
        }
        this.g().getClass();
        n n0 = new n(f0, 0);
        k3.i i0 = this.f(e0);
        if(i0 != null) {
            c c0 = C3.e.g(i0);
            W2.b b0 = W2.b.f;
            j.f(b0, "builtIns");
            X2.e e1 = W2.e.b(c0, b0);
            if(e1 == null) {
                collection1 = t.i;
            }
            else {
                v3.e e2 = C3.e.h(e1);
                c c1 = (c)W2.d.k.get(e2);
                collection1 = c1 == null ? I.s(e1) : x2.j.z(new X2.e[]{e1, b0.i(c1)});
            }
            if(!(collection1 instanceof List)) {
                Iterator iterator1 = collection1.iterator();
                if(iterator1.hasNext()) {
                    Object object2;
                    for(object2 = iterator1.next(); iterator1.hasNext(); object2 = iterator1.next()) {
                    }
                    object1 = object2;
                }
                else {
                    object1 = null;
                }
            }
            else if(!((List)collection1).isEmpty()) {
                object1 = ((List)collection1).get(((List)collection1).size() - 1);
            }
            else {
                object1 = null;
            }
            if(((X2.e)object1) != null) {
                ArrayList arrayList0 = new ArrayList(x2.k.E(collection1));
                for(Object object3: collection1) {
                    arrayList0.add(C3.e.g(((X2.e)object3)));
                }
                V3.h h0 = new V3.h();
                h0.addAll(arrayList0);
                v3.e e3 = y3.d.g(e0);
                boolean z = W2.d.j.containsKey(e3);
                c c2 = C3.e.g(i0);
                I3.A a0 = new I3.A(10, i0, ((X2.e)object1));
                this.e.getClass();
                g g0 = new g(c2, a0);
                Object object4 = this.e.b(g0);
                if(object4 != null) {
                    F3.n n1 = ((X2.e)object4).t0();
                    j.e(n1, "getUnsubstitutedMemberScope(...)");
                    Iterable iterable0 = (Iterable)n0.b(n1);
                    ArrayList arrayList1 = new ArrayList();
                    Iterator iterator3 = iterable0.iterator();
                label_76:
                    while(iterator3.hasNext()) {
                        Object object5 = iterator3.next();
                        L l0 = (L)object5;
                        if(l0.j() == 1 && (l0.c().a.j && !U2.h.C(l0))) {
                            Iterable iterable1 = l0.s();
                            if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                                for(Object object6: iterable1) {
                                    X2.k k0 = ((X2.u)object6).p();
                                    j.e(k0, "getContainingDeclaration(...)");
                                    if(h0.contains(C3.e.g(k0))) {
                                        continue label_76;
                                    }
                                }
                            }
                            X2.k k1 = l0.p();
                            j.d(k1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            String s = w.y(((X2.e)k1), I.h(l0, 3));
                            if((W2.r.e.contains(s) ^ z) == 0) {
                                Collection collection2 = G.p(l0);
                                W2.m m0 = new W2.m(this, 1);
                                Boolean boolean0 = V3.k.g(collection2, W2.e.i, m0);
                                j.e(boolean0, "ifAny(...)");
                                z1 = boolean0.booleanValue();
                            }
                            else {
                                z1 = true;
                            }
                            if(!z1) {
                                arrayList1.add(object5);
                            }
                        }
                    }
                    collection0 = arrayList1;
                    goto label_107;
                }
                e.a(3);
                throw null;
            }
        }
    label_107:
        Collection collection3 = new ArrayList();
        for(Object object7: collection0) {
            L l1 = (L)object7;
            X2.k k2 = l1.p();
            j.d(k2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            X2.u u1 = l1.b(new U(a.l(((X2.e)k2), e0)));
            j.d(u1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            X2.t t1 = ((L)u1).s0();
            t1.i(e0);
            t1.b(e0.F0());
            t1.x();
            X2.k k3 = l1.p();
            j.d(k3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            String s1 = I.h(l1, 3);
            J2.q q0 = new J2.q(0);
            Object object8 = V3.k.e(G.p(((X2.e)k3)), new T1.c(this, 14), new C3.c(q0, s1));
            j.e(object8, "dfs(...)");
            int v = ((W2.j)object8).ordinal();
            if(v != 0) {
                switch(v) {
                    case 2: {
                    label_131:
                        f f1 = l1.getName();
                        boolean z2 = j.a(f1, W2.p.a);
                        e e4 = this.g;
                        if(z2) {
                            t1.k(((Y2.h)e4.b(new w2.e(l1.getName().b(), "first"))));
                        }
                        else {
                            if(!j.a(f1, W2.p.b)) {
                                throw new IllegalStateException(("Unexpected name: " + l1.getName()).toString());
                            }
                            t1.k(((Y2.h)e4.b(new w2.e(l1.getName().b(), "last"))));
                        }
                        goto label_145;
                    }
                    case 3: {
                        t1.k(((Y2.h)android.support.v4.media.session.a.A(this.f, arr_q[2])));
                        goto label_145;
                    }
                    default: {
                        if(v == 4) {
                            break;
                        }
                        else {
                            goto label_145;
                        }
                        goto label_131;
                    }
                }
            }
            else if(e0.f() != X2.y.j || e0.j() == X2.f.k) {
                t1.H();
            label_145:
                X2.u u2 = t1.c();
                j.c(u2);
                l2 = (L)u2;
                goto label_150;
            }
            l2 = null;
        label_150:
            if(l2 != null) {
                ((ArrayList)collection3).add(l2);
            }
        }
        return collection3;
    }

    @Override  // Z2.b
    public final Collection d(X2.e e0) {
        boolean z = true;
        j.f(e0, "classDescriptor");
        v3.e e1 = C3.e.h(e0);
        v3.e e2 = U2.m.g;
        boolean z1 = e1.equals(e2) || U2.m.c0.get(e1) != null;
        M3.A a0 = this.c;
        if(z1) {
            M3.A a1 = (M3.A)android.support.v4.media.session.a.A(this.d, o.h[1]);
            j.e(a1, "<get-cloneableType>(...)");
            return x2.j.z(new M3.w[]{a1, a0});
        }
        if(!e1.equals(e2) && U2.m.c0.get(e1) == null) {
            v3.b b0 = W2.d.f(e1);
            z = false;
            if(b0 != null) {
                try {
                    Class class0 = Class.forName(b0.b().b());
                    z = Serializable.class.isAssignableFrom(class0);
                }
                catch(ClassNotFoundException unused_ex) {
                }
            }
        }
        return z ? G.p(a0) : x2.r.i;
    }

    @Override  // Z2.d
    public final boolean e(X2.e e0, K3.w w0) {
        j.f(e0, "classDescriptor");
        k3.i i0 = this.f(e0);
        if(i0 == null) {
            return true;
        }
        if(!w0.l().e(Z2.e.a)) {
            return true;
        }
        this.g().getClass();
        String s = I.h(w0, 3);
        k3.n n0 = i0.A0();
        f f0 = w0.getName();
        j.e(f0, "getName(...)");
        Iterable iterable0 = n0.b(f0, f3.b.i);
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(I.h(((L)object0), 3).equals(s)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final k3.i f(X2.e e0) {
        if(e0 != null) {
            if(U2.h.b(e0, U2.m.a)) {
                return null;
            }
            if(!U2.h.H(e0)) {
                return null;
            }
            v3.e e1 = C3.e.h(e0);
            if(!e1.d()) {
                return null;
            }
            v3.b b0 = W2.d.f(e1);
            if(b0 != null) {
                c c0 = b0.b();
                X2.e e2 = X2.w.j(this.g().a, c0);
                return e2 instanceof k3.i ? ((k3.i)e2) : null;
            }
            return null;
        }
        U2.h.a(109);
        throw null;
    }

    public final W2.h g() {
        return (W2.h)android.support.v4.media.session.a.A(this.b, o.h[0]);
    }
}

