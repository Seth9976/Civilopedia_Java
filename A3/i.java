package a3;

import I2.a;
import J2.l;
import L3.h;
import M3.Q;
import M3.U;
import M3.w;
import X2.L;
import X2.M;
import X2.O;
import X2.P;
import X2.b;
import X2.c;
import X2.e;
import X2.k;
import X2.m;
import X2.o;
import X2.u;
import X2.y;
import Y2.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import v3.f;

public class I extends T implements M {
    public List A;
    public v B;
    public v C;
    public ArrayList D;
    public J E;
    public K F;
    public r G;
    public r H;
    public final boolean n;
    public h o;
    public l p;
    public final y q;
    public o r;
    public Collection s;
    public final M t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public I(k k0, M m0, Y2.h h0, y y0, o o0, boolean z, f f0, int v, O o1, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        if(k0 != null) {
            if(h0 != null) {
                if(y0 != null) {
                    if(o0 != null) {
                        if(f0 != null) {
                            if(v != 0) {
                                if(o1 != null) {
                                    super(k0, h0, f0, null, o1);
                                    this.n = z;
                                    this.s = null;
                                    this.A = Collections.emptyList();
                                    this.q = y0;
                                    this.r = o0;
                                    M m1 = m0 == null ? this : m0;
                                    this.t = m1;
                                    this.u = v;
                                    this.v = z1;
                                    this.w = z2;
                                    this.x = z3;
                                    this.y = z4;
                                    this.z = z5;
                                    return;
                                }
                                I.G0(6);
                                throw null;
                            }
                            I.G0(5);
                            throw null;
                        }
                        I.G0(4);
                        throw null;
                    }
                    I.G0(3);
                    throw null;
                }
                I.G0(2);
                throw null;
            }
            I.G0(1);
            throw null;
        }
        I.G0(0);
        throw null;
    }

    @Override  // a3.T, X2.b
    public final v A() {
        return this.B;
    }

    @Override  // X2.W
    public boolean E() {
        return this.w;
    }

    @Override  // X2.W
    public final boolean G() {
        return this.n;
    }

    @Override  // a3.T
    public static void G0(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        if(v == 28 || v == 38 || v == 39 || v == 41 || v == 42) {
            s = "@NotNull method %s.%s must not return null";
        }
        else {
            switch(v) {
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: {
                    s = "@NotNull method %s.%s must not return null";
                    break;
                }
                default: {
                    s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
                }
            }
        }
        if(v == 28 || v == 38 || v == 39 || v == 41 || v == 42) {
            v1 = 2;
        }
        else {
            switch(v) {
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: {
                    v1 = 2;
                    break;
                }
                default: {
                    v1 = 3;
                }
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 1: 
            case 8: {
                arr_object[0] = "annotations";
                break;
            }
            case 2: 
            case 9: {
                arr_object[0] = "modality";
                break;
            }
            case 4: 
            case 11: {
                arr_object[0] = "name";
                break;
            }
            case 14: {
                arr_object[0] = "inType";
                break;
            }
            case 15: 
            case 17: {
                arr_object[0] = "outType";
                break;
            }
            case 16: 
            case 18: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 19: {
                arr_object[0] = "contextReceiverParameters";
                break;
            }
            case 3: 
            case 10: 
            case 20: {
                arr_object[0] = "visibility";
                break;
            }
            case 27: {
                arr_object[0] = "originalSubstitutor";
                break;
            }
            case 29: {
                arr_object[0] = "copyConfiguration";
                break;
            }
            case 30: {
                arr_object[0] = "substitutor";
                break;
            }
            case 0x1F: {
                arr_object[0] = "accessorDescriptor";
                break;
            }
            case 0x20: {
                arr_object[0] = "newOwner";
                break;
            }
            case 33: {
                arr_object[0] = "newModality";
                break;
            }
            case 34: {
                arr_object[0] = "newVisibility";
                break;
            }
            case 5: 
            case 12: 
            case 35: {
                arr_object[0] = "kind";
                break;
            }
            case 36: {
                arr_object[0] = "newName";
                break;
            }
            case 6: 
            case 13: 
            case 37: {
                arr_object[0] = "source";
                break;
            }
            case 40: {
                arr_object[0] = "overriddenDescriptors";
                break;
            }
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 28: 
            case 38: 
            case 39: 
            case 41: 
            case 42: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 21: {
                arr_object[1] = "getTypeParameters";
                break;
            }
            case 22: {
                arr_object[1] = "getContextReceiverParameters";
                break;
            }
            case 23: {
                arr_object[1] = "getReturnType";
                break;
            }
            case 24: {
                arr_object[1] = "getModality";
                break;
            }
            case 25: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 26: {
                arr_object[1] = "getAccessors";
                break;
            }
            case 28: {
                arr_object[1] = "getSourceToUseForCopy";
                break;
            }
            case 38: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 39: {
                arr_object[1] = "getKind";
                break;
            }
            case 41: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 42: {
                arr_object[1] = "copy";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
            }
        }
        switch(v) {
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                arr_object[2] = "create";
                break;
            }
            case 14: {
                arr_object[2] = "setInType";
                break;
            }
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                arr_object[2] = "setType";
                break;
            }
            case 20: {
                arr_object[2] = "setVisibility";
                break;
            }
            case 27: {
                arr_object[2] = "substitute";
                break;
            }
            case 29: {
                arr_object[2] = "doSubstitute";
                break;
            }
            case 30: 
            case 0x1F: {
                arr_object[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            }
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: {
                arr_object[2] = "createSubstitutedCopy";
                break;
            }
            case 40: {
                arr_object[2] = "setOverriddenDescriptors";
                break;
            }
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 28: 
            case 38: 
            case 39: 
            case 41: 
            case 42: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        if(v == 28 || v == 38 || v == 39 || v == 41 || v == 42) {
            illegalStateException0 = new IllegalStateException(s1);
        }
        else {
            switch(v) {
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: {
                    illegalStateException0 = new IllegalStateException(s1);
                    break;
                }
                default: {
                    illegalStateException0 = new IllegalArgumentException(s1);
                }
            }
        }
        throw illegalStateException0;
    }

    @Override  // a3.T, X2.b
    public final v J() {
        return this.C;
    }

    @Override  // a3.n
    public final X2.l L0() {
        return this.a();
    }

    @Override  // X2.M
    public final r M() {
        return this.H;
    }

    public final I M0(e e0, y y0, o o0) {
        H h0 = new H(this);
        if(e0 != null) {
            h0.a = e0;
            h0.d = null;
            h0.b = y0;
            if(o0 != null) {
                h0.c = o0;
                h0.e = 2;
                h0.g = false;
                I i0 = h0.b();
                if(i0 != null) {
                    return i0;
                }
                I.G0(42);
                throw null;
            }
            H.a(8);
            throw null;
        }
        H.a(0);
        throw null;
    }

    public static I N0(e e0, y y0, o o0, boolean z, f f0, int v, O o1) {
        Y2.f f1 = g.a;
        if(e0 != null) {
            if(o0 != null) {
                if(f0 != null) {
                    if(v != 0) {
                        if(o1 != null) {
                            return new I(e0, null, f1, y0, o0, z, f0, v, o1, false, false, false, false, false);
                        }
                        I.G0(13);
                        throw null;
                    }
                    I.G0(12);
                    throw null;
                }
                I.G0(11);
                throw null;
            }
            I.G0(10);
            throw null;
        }
        I.G0(7);
        throw null;
    }

    public I O0(k k0, y y0, o o0, M m0, int v, f f0) {
        P p0 = O.b;
        if(k0 != null) {
            if(y0 != null) {
                if(o0 != null) {
                    if(v != 0) {
                        if(f0 != null) {
                            Y2.h h0 = this.l();
                            boolean z = this.E();
                            boolean z1 = this.z();
                            return new I(k0, m0, h0, y0, o0, this.n, f0, v, p0, this.v, z, this.x, z1, this.z);
                        }
                        I.G0(36);
                        throw null;
                    }
                    I.G0(35);
                    throw null;
                }
                I.G0(34);
                throw null;
            }
            I.G0(33);
            throw null;
        }
        I.G0(0x20);
        throw null;
    }

    public static u P0(U u0, L l0) {
        if(l0 != null) {
            u u1 = ((G)l0).t;
            return u1 == null ? null : u1.b(u0);
        }
        I.G0(0x1F);
        throw null;
    }

    public final void Q0(J j0, K k0, r r0, r r1) {
        this.E = j0;
        this.F = k0;
        this.G = r0;
        this.H = r1;
    }

    @Override  // X2.M
    public final r R() {
        return this.G;
    }

    public final void R0(h h0, a a0) {
        if(a0 == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'compileTimeInitializerFactory\' of kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl.setCompileTimeInitializer must not be null");
        }
        this.p = (l)a0;
        if(h0 == null) {
            h0 = (h)a0.invoke();
        }
        this.o = h0;
    }

    public void S0(w w0) {
    }

    @Override  // X2.b
    public final List T() {
        List list0 = this.A;
        if(list0 != null) {
            return list0;
        }
        I.G0(22);
        throw null;
    }

    public final void T0(w w0, List list0, v v0, v v1, List list1) {
        if(w0 != null) {
            if(list0 != null) {
                if(list1 != null) {
                    this.m = w0;
                    this.D = new ArrayList(list0);
                    this.C = v1;
                    this.B = v0;
                    this.A = list1;
                    return;
                }
                I.G0(19);
                throw null;
            }
            I.G0(18);
            throw null;
        }
        I.G0(17);
        throw null;
    }

    @Override  // X2.W
    public final boolean W() {
        return this.v;
    }

    @Override  // X2.x
    public final boolean Z() {
        return this.x;
    }

    @Override  // X2.M
    public final M a() {
        M m0 = this.t;
        M m1 = m0 == this ? this : m0.a();
        if(m1 != null) {
            return m1;
        }
        I.G0(38);
        throw null;
    }

    @Override  // X2.b
    public final b a() {
        return this.a();
    }

    @Override  // X2.c
    public final c a() {
        return this.a();
    }

    @Override  // a3.n, X2.k
    public final k a() {
        return this.a();
    }

    @Override  // X2.M
    public final M b(U u0) {
        if(u0 != null) {
            if(u0.a.e()) {
                return this;
            }
            H h0 = new H(this);
            Q q0 = u0.f();
            if(q0 != null) {
                h0.f = q0;
                h0.d = this.a();
                return h0.b();
            }
            H.a(15);
            throw null;
        }
        I.G0(27);
        throw null;
    }

    @Override  // X2.Q
    public final X2.l b(U u0) {
        return this.b(u0);
    }

    @Override  // X2.x, X2.n
    public final o c() {
        o o0 = this.r;
        if(o0 != null) {
            return o0;
        }
        I.G0(25);
        throw null;
    }

    @Override  // X2.k
    public final Object c0(m m0, Object object0) {
        return m0.I(this, object0);
    }

    @Override  // X2.M
    public final J d() {
        return this.E;
    }

    @Override  // X2.M
    public final K e() {
        return this.F;
    }

    @Override  // X2.M
    public final boolean e0() {
        return this.z;
    }

    @Override  // X2.x
    public final y f() {
        y y0 = this.q;
        if(y0 != null) {
            return y0;
        }
        I.G0(24);
        throw null;
    }

    @Override  // X2.c
    public final void g0(Collection collection0) {
        if(collection0 != null) {
            this.s = collection0;
            return;
        }
        I.G0(40);
        throw null;
    }

    @Override  // X2.c
    public final int j() {
        int v = this.u;
        if(v != 0) {
            return v;
        }
        I.G0(39);
        throw null;
    }

    @Override  // X2.c
    public final c j0(e e0, y y0, o o0) {
        return this.M0(e0, y0, o0);
    }

    @Override  // X2.b
    public Object n0(X2.a a0) {
        return null;
    }

    @Override  // a3.T, X2.b
    public final w r() {
        w w0 = this.getType();
        if(w0 != null) {
            return w0;
        }
        I.G0(23);
        throw null;
    }

    @Override  // X2.c, X2.b
    public final Collection s() {
        Collection collection0 = this.s;
        if(collection0 == null) {
            collection0 = Collections.emptyList();
        }
        if(collection0 != null) {
            return collection0;
        }
        I.G0(41);
        throw null;
    }

    @Override  // a3.T, X2.b
    public final List u() {
        List list0 = this.D;
        if(list0 == null) {
            throw new IllegalStateException("typeParameters == null for " + this);
        }
        return list0;
    }

    @Override  // X2.W
    public final A3.g u0() {
        return this.o == null ? null : ((A3.g)this.o.invoke());
    }

    @Override  // X2.x
    public final boolean v0() {
        return false;
    }

    @Override  // X2.M
    public final ArrayList w() {
        ArrayList arrayList0 = new ArrayList(2);
        J j0 = this.E;
        if(j0 != null) {
            arrayList0.add(j0);
        }
        K k0 = this.F;
        if(k0 != null) {
            arrayList0.add(k0);
        }
        return arrayList0;
    }

    @Override  // X2.x
    public boolean z() {
        return this.y;
    }
}

