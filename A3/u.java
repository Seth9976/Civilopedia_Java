package a3;

import B.c;
import G3.b;
import J2.j;
import M3.A;
import M3.U;
import M3.a0;
import M3.w;
import X2.O;
import X2.T;
import X2.e;
import X2.k;
import X2.m;
import X2.o;
import X2.p;
import X2.y;
import Y2.h;
import android.support.v4.media.session.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import v3.f;
import x2.i;
import y3.l;

public abstract class u extends n implements X2.u {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public Collection F;
    public volatile c G;
    public final X2.u H;
    public final int I;
    public X2.u J;
    public Map K;
    public List m;
    public List n;
    public w o;
    public List p;
    public v q;
    public v r;
    public y s;
    public o t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public u(int v, k k0, X2.u u0, O o0, h h0, f f0) {
        if(k0 != null) {
            if(h0 != null) {
                if(f0 != null) {
                    if(v != 0) {
                        if(o0 != null) {
                            super(k0, h0, f0, o0);
                            this.t = p.i;
                            this.u = false;
                            this.v = false;
                            this.w = false;
                            this.x = false;
                            this.y = false;
                            this.z = false;
                            this.A = false;
                            this.B = false;
                            this.C = false;
                            this.D = true;
                            this.E = false;
                            this.F = null;
                            this.G = null;
                            this.J = null;
                            this.K = null;
                            if(u0 == null) {
                                u0 = this;
                            }
                            this.H = u0;
                            this.I = v;
                            return;
                        }
                        u.G0(4);
                        throw null;
                    }
                    u.G0(3);
                    throw null;
                }
                u.G0(2);
                throw null;
            }
            u.G0(1);
            throw null;
        }
        u.G0(0);
        throw null;
    }

    @Override  // X2.b
    public final v A() {
        return this.r;
    }

    @Override  // X2.u
    public final boolean B0() {
        if(this.v) {
            return true;
        }
        for(Object object0: this.a().s()) {
            if(((X2.u)object0).B0()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // a3.n
    public static void G0(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 1: {
                arr_object[0] = "annotations";
                break;
            }
            case 2: {
                arr_object[0] = "name";
                break;
            }
            case 3: {
                arr_object[0] = "kind";
                break;
            }
            case 4: {
                arr_object[0] = "source";
                break;
            }
            case 5: {
                arr_object[0] = "contextReceiverParameters";
                break;
            }
            case 6: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 8: 
            case 10: {
                arr_object[0] = "visibility";
                break;
            }
            case 11: {
                arr_object[0] = "unsubstitutedReturnType";
                break;
            }
            case 12: {
                arr_object[0] = "extensionReceiverParameter";
                break;
            }
            case 17: {
                arr_object[0] = "overriddenDescriptors";
                break;
            }
            case 22: {
                arr_object[0] = "originalSubstitutor";
                break;
            }
            case 25: {
                arr_object[0] = "configuration";
                break;
            }
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            }
            case 7: 
            case 28: 
            case 30: {
                arr_object[0] = "unsubstitutedValueParameters";
                break;
            }
            case 24: 
            case 29: 
            case 0x1F: {
                arr_object[0] = "substitutor";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 9: {
                arr_object[1] = "initialize";
                break;
            }
            case 13: {
                arr_object[1] = "getContextReceiverParameters";
                break;
            }
            case 14: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 15: {
                arr_object[1] = "getModality";
                break;
            }
            case 16: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 18: {
                arr_object[1] = "getTypeParameters";
                break;
            }
            case 19: {
                arr_object[1] = "getValueParameters";
                break;
            }
            case 20: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 21: {
                arr_object[1] = "getKind";
                break;
            }
            case 23: {
                arr_object[1] = "newCopyBuilder";
                break;
            }
            case 26: {
                arr_object[1] = "copy";
                break;
            }
            case 27: {
                arr_object[1] = "getSourceToUseForCopy";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
            }
        }
        switch(v) {
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                arr_object[2] = "initialize";
                break;
            }
            case 10: {
                arr_object[2] = "setVisibility";
                break;
            }
            case 11: {
                arr_object[2] = "setReturnType";
                break;
            }
            case 12: {
                arr_object[2] = "setExtensionReceiverParameter";
                break;
            }
            case 17: {
                arr_object[2] = "setOverriddenDescriptors";
                break;
            }
            case 22: {
                arr_object[2] = "substitute";
                break;
            }
            case 24: {
                arr_object[2] = "newCopyBuilder";
                break;
            }
            case 25: {
                arr_object[2] = "doSubstitute";
                break;
            }
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                break;
            }
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: {
                arr_object[2] = "getSubstitutedValueParameters";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @Override  // X2.b
    public final v J() {
        return this.q;
    }

    public final X2.u M0(e e0, y y0, o o0) {
        X2.u u0 = this.s0().i(e0).C(y0).M(o0).s(2).a().c();
        if(u0 != null) {
            return u0;
        }
        u.G0(26);
        throw null;
    }

    public L N0(e e0, y y0, o o0) {
        return (L)this.M0(e0, y0, o0);
    }

    public abstract u O0(int arg1, k arg2, X2.u arg3, O arg4, h arg5, f arg6);

    public u P0(t t0) {
        v v7;
        v v4;
        if(t0 != null) {
            boolean[] arr_z = new boolean[1];
            h h0 = t0.A == null ? this.l() : a.h(this.l(), t0.A);
            k k0 = t0.j;
            X2.u u0 = t0.m;
            int v = t0.n;
            f f0 = t0.t;
            O o0 = t0.w ? ((n)(u0 == null ? this.a() : u0)).q() : O.b;
            if(o0 != null) {
                u u1 = this.O0(v, k0, u0, o0, h0, f0);
                List list0 = t0.z;
                if(list0 == null) {
                    list0 = this.u();
                }
                arr_z[0] |= !list0.isEmpty();
                ArrayList arrayList0 = new ArrayList(list0.size());
                U u2 = M3.c.v(list0, t0.i, u1, arrayList0, arr_z);
                if(u2 == null) {
                    return null;
                }
                ArrayList arrayList1 = new ArrayList();
                a0 a00 = a0.l;
                if(!t0.p.isEmpty()) {
                    int v1 = 0;
                    for(Object object0: t0.p) {
                        w w0 = u2.i(((v)object0).getType(), a00);
                        if(w0 == null) {
                            return null;
                        }
                        arrayList1.add(l.e(u1, w0, ((b)((v)object0).M0()).K0(), ((v)object0).l(), v1));
                        arr_z[0] |= w0 != ((v)object0).getType();
                        ++v1;
                    }
                }
                v v2 = t0.q;
                if(v2 == null) {
                    v4 = null;
                }
                else {
                    w w1 = u2.i(v2.getType(), a00);
                    if(w1 == null) {
                        return null;
                    }
                    t0.q.M0();
                    v v3 = new v(u1, new G3.c(u1, w1), t0.q.l());
                    boolean z = arr_z[0];
                    arr_z[0] = w1 != t0.q.getType() | z;
                    v4 = v3;
                }
                v v5 = t0.r;
                if(v5 == null) {
                    v7 = null;
                }
                else {
                    v v6 = v5.N0(u2);
                    if(v6 == null) {
                        return null;
                    }
                    arr_z[0] |= v6 != t0.r;
                    v7 = v6;
                }
                ArrayList arrayList2 = u.Q0(u1, t0.o, u2, t0.x, t0.w, arr_z);
                if(arrayList2 == null) {
                    return null;
                }
                w w2 = u2.i(t0.s, a0.m);
                if(w2 == null) {
                    return null;
                }
                int v8 = arr_z[0] | w2 != t0.s;
                arr_z[0] = v8;
                if(v8 == 0 && t0.E) {
                    return this;
                }
                u1.R0(v4, v7, arrayList1, arrayList0, arrayList2, w2, t0.k, t0.l);
                u1.u = this.u;
                u1.v = this.v;
                u1.w = this.w;
                u1.x = this.x;
                u1.y = this.y;
                u1.C = this.C;
                u1.z = this.z;
                u1.U0(this.D);
                u1.A = t0.y;
                u1.B = t0.B;
                u1.V0((t0.D == null ? this.E : t0.D.booleanValue()));
                if(!t0.C.isEmpty() || this.K != null) {
                    LinkedHashMap linkedHashMap0 = t0.C;
                    Map map0 = this.K;
                    if(map0 != null) {
                        for(Object object1: map0.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object1;
                            if(!linkedHashMap0.containsKey(map$Entry0.getKey())) {
                                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                            }
                        }
                    }
                    if(linkedHashMap0.size() == 1) {
                        Object object2 = linkedHashMap0.keySet().iterator().next();
                        Object object3 = linkedHashMap0.values().iterator().next();
                        u1.K = Collections.singletonMap(object2, object3);
                    }
                    else {
                        u1.K = linkedHashMap0;
                    }
                }
                if(t0.v || this.J != null) {
                    X2.u u3 = this.J;
                    if(u3 == null) {
                        u3 = this;
                    }
                    u1.J = u3.b(u2);
                }
                if(t0.u && !this.a().s().isEmpty()) {
                    if(t0.i.e()) {
                        c c0 = this.G;
                        if(c0 != null) {
                            u1.G = c0;
                            return u1;
                        }
                        u1.g0(this.s());
                        return u1;
                    }
                    u1.G = new c(this, u2, 22, false);
                }
                return u1;
            }
            u.G0(27);
            throw null;
        }
        u.G0(25);
        throw null;
    }

    @Override  // X2.b
    public boolean Q() {
        return this.E;
    }

    public static ArrayList Q0(X2.u u0, List list0, U u1, boolean z, boolean z1, boolean[] arr_z) {
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list0) {
                S s0 = (S)object0;
                w w0 = u1.i(s0.getType(), a0.l);
                w w1 = s0.r;
                w w2 = w1 == null ? null : u1.i(w1, a0.l);
                if(w0 == null) {
                    return null;
                }
                if((w0 != s0.getType() || w1 != w2) && arr_z != null) {
                    arr_z[0] = true;
                }
                s s1 = s0 instanceof Q ? new s(((List)((Q)s0).t.getValue())) : null;
                S s2 = z ? null : s0;
                h h0 = s0.l();
                f f0 = s0.getName();
                boolean z2 = s0.N0();
                O o0 = z1 ? s0.q() : O.b;
                j.f(h0, "annotations");
                j.f(f0, "name");
                j.f(o0, "source");
                int v = s0.n;
                boolean z3 = s0.p;
                boolean z4 = s0.q;
                S s3 = s1 == null ? new S(u0, s2, v, h0, f0, w0, z2, z3, z4, w2, o0) : new Q(u0, s2, v, h0, f0, w0, z2, z3, z4, w2, o0, s1);
                arrayList0.add(s3);
            }
            return arrayList0;
        }
        u.G0(30);
        throw null;
    }

    public void R0(v v0, v v1, List list0, List list1, List list2, w w0, y y0, o o0) {
        if(list0 != null) {
            if(list1 != null) {
                if(list2 != null) {
                    if(o0 != null) {
                        this.m = i.o0(list1);
                        this.n = i.o0(list2);
                        this.o = w0;
                        this.s = y0;
                        this.t = o0;
                        this.q = v0;
                        this.r = v1;
                        this.p = list0;
                        for(int v3 = 0; v3 < list1.size(); ++v3) {
                            T t0 = (T)list1.get(v3);
                            if(t0.U() != v3) {
                                throw new IllegalStateException(t0 + " index is " + t0.U() + " but position is " + v3);
                            }
                        }
                        for(int v2 = 0; v2 < list2.size(); ++v2) {
                            S s0 = (S)list2.get(v2);
                            if(s0.n != v2) {
                                throw new IllegalStateException(s0 + "index is " + s0.n + " but position is " + v2);
                            }
                        }
                        return;
                    }
                    u.G0(8);
                    throw null;
                }
                u.G0(7);
                throw null;
            }
            u.G0(6);
            throw null;
        }
        u.G0(5);
        throw null;
    }

    public final t S0(U u0) {
        if(u0 != null) {
            return new t(this, u0.f(), this.p(), this.f(), this.c(), this.j(), this.z0(), this.T(), this.q, this.r());
        }
        u.G0(24);
        throw null;
    }

    @Override  // X2.b
    public final List T() {
        List list0 = this.p;
        if(list0 != null) {
            return list0;
        }
        u.G0(13);
        throw null;
    }

    public final void T0(X2.a a0, Object object0) {
        if(this.K == null) {
            this.K = new LinkedHashMap();
        }
        this.K.put(a0, object0);
    }

    public void U0(boolean z) {
        this.D = z;
    }

    public void V0(boolean z) {
        this.E = z;
    }

    public final void W0(A a0) {
        if(a0 != null) {
            this.o = a0;
            return;
        }
        u.G0(11);
        throw null;
    }

    @Override  // X2.x
    public final boolean Z() {
        return this.z;
    }

    @Override  // X2.u
    public X2.u a() {
        X2.u u0 = this.H;
        X2.u u1 = u0 == this ? this : u0.a();
        if(u1 != null) {
            return u1;
        }
        u.G0(20);
        throw null;
    }

    @Override  // X2.Q
    public X2.l b(U u0) {
        return this.b(u0);
    }

    @Override  // X2.u
    public X2.u b(U u0) {
        if(u0 != null) {
            if(u0.a.e()) {
                return this;
            }
            t t0 = this.S0(u0);
            t0.m = this.a();
            t0.w = true;
            t0.E = true;
            return t0.F.P0(t0);
        }
        u.G0(22);
        throw null;
    }

    @Override  // X2.x, X2.n
    public final o c() {
        o o0 = this.t;
        if(o0 != null) {
            return o0;
        }
        u.G0(16);
        throw null;
    }

    @Override  // X2.k
    public Object c0(m m0, Object object0) {
        return m0.J(this, object0);
    }

    @Override  // X2.x
    public final y f() {
        y y0 = this.s;
        if(y0 != null) {
            return y0;
        }
        u.G0(15);
        throw null;
    }

    @Override  // X2.u
    public final boolean f0() {
        return this.A;
    }

    @Override  // X2.c
    public void g0(Collection collection0) {
        if(collection0 != null) {
            this.F = collection0;
            for(Object object0: collection0) {
                if(((X2.u)object0).r0()) {
                    this.B = true;
                    return;
                }
                if(false) {
                    break;
                }
            }
            return;
        }
        u.G0(17);
        throw null;
    }

    @Override  // X2.u
    public boolean h0() {
        return this.y;
    }

    @Override  // X2.u
    public final boolean i0() {
        if(this.u) {
            return true;
        }
        for(Object object0: this.a().s()) {
            if(((X2.u)object0).i0()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // X2.c
    public final int j() {
        int v = this.I;
        if(v != 0) {
            return v;
        }
        u.G0(21);
        throw null;
    }

    @Override  // X2.c
    public X2.c j0(e e0, y y0, o o0) {
        return this.N0(e0, y0, o0);
    }

    @Override  // X2.u
    public boolean n() {
        return this.C;
    }

    @Override  // X2.b
    public Object n0(X2.a a0) {
        return this.K == null ? null : this.K.get(a0);
    }

    @Override  // X2.u
    public boolean o() {
        return this.x;
    }

    @Override  // X2.b
    public w r() {
        return this.o;
    }

    @Override  // X2.u
    public final boolean r0() {
        return this.B;
    }

    @Override  // X2.c
    public Collection s() {
        c c0 = this.G;
        if(c0 != null) {
            this.F = (Collection)c0.invoke();
            this.G = null;
        }
        Collection collection0 = this.F;
        if(collection0 == null) {
            collection0 = Collections.emptyList();
        }
        if(collection0 != null) {
            return collection0;
        }
        u.G0(14);
        throw null;
    }

    @Override  // X2.u
    public X2.t s0() {
        return this.S0(U.b);
    }

    @Override  // X2.b
    public final List u() {
        List list0 = this.m;
        if(list0 == null) {
            throw new IllegalStateException("typeParameters == null for " + this);
        }
        return list0;
    }

    @Override  // X2.x
    public final boolean v0() {
        return false;
    }

    @Override  // X2.u
    public final X2.u y() {
        return this.J;
    }

    @Override  // X2.x
    public boolean z() {
        return this.w;
    }

    @Override  // X2.b
    public final List z0() {
        List list0 = this.n;
        if(list0 != null) {
            return list0;
        }
        u.G0(19);
        throw null;
    }
}

