package a3;

import B.c;
import C3.e;
import F3.n;
import F3.s;
import L3.m;
import M3.A;
import M3.H;
import M3.K;
import M3.Q;
import M3.U;
import M3.X;
import M3.a0;
import M3.j;
import M3.w;
import N3.f;
import X2.B;
import X2.O;
import X2.T;
import X2.l;
import X2.o;
import Y2.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o2.G;
import x2.k;
import y3.d;

public final class y extends z {
    public final z i;
    public final U j;
    public U k;
    public ArrayList l;
    public ArrayList m;
    public j n;

    public y(z z0, U u0) {
        this.i = z0;
        this.j = u0;
    }

    @Override  // X2.h
    public final K B() {
        K k0 = this.i.B();
        if(this.j.a.e()) {
            if(k0 != null) {
                return k0;
            }
            y.d0(0);
            throw null;
        }
        if(this.n == null) {
            U u0 = this.w0();
            Collection collection0 = k0.r();
            ArrayList arrayList0 = new ArrayList(collection0.size());
            for(Object object0: collection0) {
                arrayList0.add(u0.i(((w)object0), a0.k));
            }
            this.n = new j(this, this.l, arrayList0, m.e);
        }
        K k1 = this.n;
        if(k1 != null) {
            return k1;
        }
        y.d0(1);
        throw null;
    }

    @Override  // X2.e
    public final boolean D() {
        return this.i.D();
    }

    @Override  // X2.e
    public final boolean D0() {
        return this.i.D0();
    }

    @Override  // X2.e
    public final v F0() {
        throw new UnsupportedOperationException();
    }

    @Override  // X2.e
    public final boolean K() {
        return this.i.K();
    }

    @Override  // a3.z
    public final n L(f f0) {
        n n0 = this.i.L(f0);
        if(this.j.a.e()) {
            if(n0 != null) {
                return n0;
            }
            y.d0(14);
            throw null;
        }
        return new s(n0, this.w0());
    }

    @Override  // X2.e
    public final n S(Q q0) {
        e.i(d.d(this));
        return this.i(q0, f.a);
    }

    @Override  // X2.e
    public final Collection V() {
        Collection collection0 = this.i.V();
        if(collection0 != null) {
            return collection0;
        }
        y.d0(0x1F);
        throw null;
    }

    @Override  // X2.e
    public final boolean Y() {
        return this.i.Y();
    }

    @Override  // X2.x
    public final boolean Z() {
        return this.i.Z();
    }

    @Override  // X2.e
    public final X2.e a() {
        X2.e e0 = this.i.a();
        if(e0 != null) {
            return e0;
        }
        y.d0(21);
        throw null;
    }

    @Override  // X2.i
    public final boolean a0() {
        return this.i.a0();
    }

    @Override  // X2.Q
    public final l b(U u0) {
        if(u0 != null) {
            return u0.a.e() ? this : new y(this, U.e(u0.f(), this.w0().f()));
        }
        y.d0(23);
        throw null;
    }

    @Override  // X2.e
    public final o c() {
        o o0 = this.i.c();
        if(o0 != null) {
            return o0;
        }
        y.d0(27);
        throw null;
    }

    @Override  // X2.k
    public final Object c0(X2.m m0, Object object0) {
        return m0.w(this, object0);
    }

    public static void d0(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
                break;
            }
            default: {
                s = "@NotNull method %s.%s must not return null";
            }
        }
        switch(v) {
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                v1 = 3;
                break;
            }
            default: {
                v1 = 2;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 2: 
            case 8: {
                arr_object[0] = "typeArguments";
                break;
            }
            case 5: 
            case 10: {
                arr_object[0] = "typeSubstitution";
                break;
            }
            case 3: 
            case 6: 
            case 13: {
                arr_object[0] = "kotlinTypeRefiner";
                break;
            }
            case 23: {
                arr_object[0] = "substitutor";
                break;
            }
            default: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
            }
        }
        switch(v) {
            case 4: 
            case 7: 
            case 9: 
            case 11: {
                arr_object[1] = "getMemberScope";
                break;
            }
            case 12: 
            case 14: {
                arr_object[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 15: {
                arr_object[1] = "getStaticScope";
                break;
            }
            case 16: {
                arr_object[1] = "getDefaultType";
                break;
            }
            case 17: {
                arr_object[1] = "getContextReceivers";
                break;
            }
            case 18: {
                arr_object[1] = "getConstructors";
                break;
            }
            case 19: {
                arr_object[1] = "getAnnotations";
                break;
            }
            case 20: {
                arr_object[1] = "getName";
                break;
            }
            case 21: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 22: {
                arr_object[1] = "getContainingDeclaration";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            }
            case 24: {
                arr_object[1] = "substitute";
                break;
            }
            case 25: {
                arr_object[1] = "getKind";
                break;
            }
            case 26: {
                arr_object[1] = "getModality";
                break;
            }
            case 27: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 28: {
                arr_object[1] = "getUnsubstitutedInnerClassesScope";
                break;
            }
            case 29: {
                arr_object[1] = "getSource";
                break;
            }
            case 30: {
                arr_object[1] = "getDeclaredTypeParameters";
                break;
            }
            case 0x1F: {
                arr_object[1] = "getSealedSubclasses";
                break;
            }
            default: {
                arr_object[1] = "getTypeConstructor";
            }
        }
        switch(v) {
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: {
                arr_object[2] = "getMemberScope";
                break;
            }
            case 13: {
                arr_object[2] = "getUnsubstitutedMemberScope";
                break;
            }
            case 23: {
                arr_object[2] = "substitute";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalStateException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @Override  // X2.e
    public final X2.y f() {
        X2.y y0 = this.i.f();
        if(y0 != null) {
            return y0;
        }
        y.d0(26);
        throw null;
    }

    @Override  // X2.e
    public final Collection g() {
        Collection collection0 = this.i.g();
        Collection collection1 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            ((i)object0).getClass();
            t t0 = ((i)object0).S0(U.b);
            t0.m = ((i)object0).Z0();
            t0.C(((i)object0).f());
            t0.M(((i)object0).c());
            t0.s(((i)object0).j());
            t0.u = false;
            ((ArrayList)collection1).add(((i)t0.F.P0(t0)).c1(this.w0()));
        }
        return collection1;
    }

    @Override  // X2.k
    public final v3.f getName() {
        v3.f f0 = this.i.getName();
        if(f0 != null) {
            return f0;
        }
        y.d0(20);
        throw null;
    }

    @Override  // a3.z
    public final n i(Q q0, f f0) {
        n n0 = this.i.i(q0, f0);
        if(this.j.a.e()) {
            if(n0 != null) {
                return n0;
            }
            y.d0(7);
            throw null;
        }
        return new s(n0, this.w0());
    }

    @Override  // X2.e
    public final X2.f j() {
        X2.f f0 = this.i.j();
        if(f0 != null) {
            return f0;
        }
        y.d0(25);
        throw null;
    }

    @Override  // X2.e
    public final A k() {
        H h1;
        List list0 = X.d(this.B().o());
        h h0 = this.l();
        if(h0.isEmpty()) {
            H.j.getClass();
            h1 = H.k;
        }
        else {
            List list1 = G.p(new M3.h(h0));
            H.j.getClass();
            h1 = c.p(list1);
        }
        K k0 = this.B();
        return M3.d.s(this.t0(), h1, k0, list0, false);
    }

    @Override  // X2.e
    public final n k0() {
        n n0 = this.i.k0();
        if(n0 != null) {
            return n0;
        }
        y.d0(28);
        throw null;
    }

    @Override  // Y2.a
    public final h l() {
        h h0 = this.i.l();
        if(h0 != null) {
            return h0;
        }
        y.d0(19);
        throw null;
    }

    @Override  // X2.e
    public final X2.U l0() {
        X2.U u0 = this.i.l0();
        if(u0 == null) {
            return null;
        }
        a0 a00 = a0.k;
        U u1 = this.j;
        if(u0 instanceof X2.v) {
            A a0 = (A)((X2.v)u0).b;
            if(a0 != null && !u1.a.e()) {
                a0 = (A)this.w0().i(a0, a00);
            }
            return new X2.v(((X2.v)u0).a, a0);
        }
        if(!(u0 instanceof B)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList0 = new ArrayList(k.E(((B)u0).a));
        for(Object object0: ((B)u0).a) {
            v3.f f0 = (v3.f)((w2.e)object0).i;
            A a1 = (A)(((P3.e)((w2.e)object0).j));
            if(a1 != null && !u1.a.e()) {
                a1 = (A)this.w0().i(a1, a00);
            }
            arrayList0.add(new w2.e(f0, a1));
        }
        return new B(arrayList0);
    }

    @Override  // X2.e
    public final boolean o() {
        return this.i.o();
    }

    @Override  // X2.e
    public final i o0() {
        return this.i.o0();
    }

    @Override  // X2.k
    public final X2.k p() {
        X2.k k0 = this.i.p();
        if(k0 != null) {
            return k0;
        }
        y.d0(22);
        throw null;
    }

    @Override  // X2.e
    public final n p0() {
        n n0 = this.i.p0();
        if(n0 != null) {
            return n0;
        }
        y.d0(15);
        throw null;
    }

    @Override  // X2.l
    public final O q() {
        return O.b;
    }

    @Override  // X2.e
    public final List t() {
        this.w0();
        List list0 = this.m;
        if(list0 != null) {
            return list0;
        }
        y.d0(30);
        throw null;
    }

    @Override  // X2.e
    public final n t0() {
        e.i(d.d(this.i));
        return this.L(f.a);
    }

    @Override  // X2.x
    public final boolean v0() {
        return this.i.v0();
    }

    public final U w0() {
        if(this.k == null) {
            U u0 = this.j;
            if(u0.a.e()) {
                this.k = u0;
                return this.k;
            }
            List list0 = this.i.B().o();
            this.l = new ArrayList(list0.size());
            this.k = M3.c.u(list0, u0.f(), this, this.l);
            ArrayList arrayList0 = this.l;
            J2.j.f(arrayList0, "<this>");
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                if(!((T)object0).O()) {
                    arrayList1.add(object0);
                }
            }
            this.m = arrayList1;
        }
        return this.k;
    }

    @Override  // X2.e
    public final List y0() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        y.d0(17);
        throw null;
    }

    @Override  // X2.x
    public final boolean z() {
        return this.i.z();
    }
}

