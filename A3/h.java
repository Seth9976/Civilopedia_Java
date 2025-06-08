package a3;

import C3.e;
import G3.b;
import I2.a;
import J2.l;
import M3.Q;
import M3.U;
import M3.a0;
import M3.c;
import M3.w;
import X2.M;
import X2.O;
import X2.P;
import X2.k;
import X2.o;
import X2.p;
import X2.y;
import Y2.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v3.f;

public final class H {
    public k a;
    public y b;
    public o c;
    public M d;
    public int e;
    public Q f;
    public boolean g;
    public final v h;
    public final f i;
    public final w j;
    public final I k;

    public H(I i0) {
        this.k = i0;
        this.a = i0.p();
        this.b = i0.f();
        this.c = i0.c();
        this.d = null;
        this.e = i0.j();
        this.f = Q.a;
        this.g = true;
        this.h = i0.B;
        this.i = i0.getName();
        this.j = i0.getType();
    }

    public static void a(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 5: 
            case 7: 
            case 9: 
            case 11: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 19: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 5: 
            case 7: 
            case 9: 
            case 11: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 19: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 4: {
                arr_object[0] = "type";
                break;
            }
            case 6: {
                arr_object[0] = "modality";
                break;
            }
            case 8: {
                arr_object[0] = "visibility";
                break;
            }
            case 10: {
                arr_object[0] = "kind";
                break;
            }
            case 12: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 15: {
                arr_object[0] = "substitution";
                break;
            }
            case 18: {
                arr_object[0] = "name";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 5: 
            case 7: 
            case 9: 
            case 11: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 19: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            }
            default: {
                arr_object[0] = "owner";
            }
        }
        switch(v) {
            case 1: {
                arr_object[1] = "setOwner";
                break;
            }
            case 2: {
                arr_object[1] = "setOriginal";
                break;
            }
            case 3: {
                arr_object[1] = "setPreserveSourceElement";
                break;
            }
            case 5: {
                arr_object[1] = "setReturnType";
                break;
            }
            case 7: {
                arr_object[1] = "setModality";
                break;
            }
            case 9: {
                arr_object[1] = "setVisibility";
                break;
            }
            case 11: {
                arr_object[1] = "setKind";
                break;
            }
            case 13: {
                arr_object[1] = "setTypeParameters";
                break;
            }
            case 14: {
                arr_object[1] = "setDispatchReceiverParameter";
                break;
            }
            case 16: {
                arr_object[1] = "setSubstitution";
                break;
            }
            case 17: {
                arr_object[1] = "setCopyOverrides";
                break;
            }
            case 19: {
                arr_object[1] = "setName";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            }
        }
        switch(v) {
            case 4: {
                arr_object[2] = "setReturnType";
                break;
            }
            case 6: {
                arr_object[2] = "setModality";
                break;
            }
            case 8: {
                arr_object[2] = "setVisibility";
                break;
            }
            case 10: {
                arr_object[2] = "setKind";
                break;
            }
            case 12: {
                arr_object[2] = "setTypeParameters";
                break;
            }
            case 15: {
                arr_object[2] = "setSubstitution";
                break;
            }
            case 18: {
                arr_object[2] = "setName";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 5: 
            case 7: 
            case 9: 
            case 11: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 19: {
                break;
            }
            default: {
                arr_object[2] = "setOwner";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 5: 
            case 7: 
            case 9: 
            case 11: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 19: {
                illegalStateException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalStateException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalStateException0;
    }

    public final I b() {
        K k1;
        J j1;
        v v7;
        Iterator iterator1;
        v v5;
        v v4;
        I i0 = this.k;
        i0.getClass();
        P p0 = O.b;
        I i1 = i0.O0(this.a, this.b, this.c, this.d, this.e, this.i);
        List list0 = i0.u();
        ArrayList arrayList0 = new ArrayList(((ArrayList)list0).size());
        U u0 = c.u(list0, this.f, i1, arrayList0);
        a0 a00 = a0.m;
        w w0 = this.j;
        w w1 = u0.i(w0, a00);
        if(w1 != null) {
            a0 a01 = a0.l;
            w w2 = u0.i(w0, a01);
            if(w2 != null) {
                i1.S0(w2);
            }
            v v0 = this.h;
            if(v0 == null) {
                goto label_21;
            }
            v v1 = v0.N0(u0);
            if(v1 != null) {
                v v2 = v1;
                goto label_22;
            label_21:
                v2 = null;
            label_22:
                v v3 = i0.C;
                if(v3 == null) {
                    v5 = null;
                }
                else {
                    w w3 = u0.i(v3.getType(), a01);
                    if(w3 == null) {
                        v4 = null;
                    }
                    else {
                        v3.M0();
                        v4 = new v(i1, new G3.c(i1, w3), v3.l());
                    }
                    v5 = v4;
                }
                ArrayList arrayList1 = new ArrayList();
                for(Iterator iterator0 = i0.A.iterator(); iterator0.hasNext(); iterator0 = iterator1) {
                    Object object0 = iterator0.next();
                    v v6 = (v)object0;
                    w w4 = u0.i(v6.getType(), a01);
                    if(w4 == null) {
                        iterator1 = iterator0;
                        v7 = null;
                    }
                    else {
                        iterator1 = iterator0;
                        f f0 = ((b)v6.M0()).K0();
                        v6.M0();
                        v7 = new v(i1, new b(i1, w4, f0), v6.l());
                    }
                    if(v7 != null) {
                        arrayList1.add(v7);
                    }
                }
                i1.T0(w1, arrayList0, v2, v5, arrayList1);
                J j0 = i0.E;
                if(j0 == null) {
                    j1 = null;
                }
                else {
                    h h0 = j0.l();
                    y y0 = this.b;
                    o o0 = i0.E.c();
                    if(this.e == 2 && p.e(p.f(o0.a.m()))) {
                        o0 = p.h;
                    }
                    J j2 = i0.E;
                    boolean z = j2.m;
                    int v8 = this.e;
                    J j3 = this.d == null ? null : this.d.d();
                    j1 = new J(i1, h0, y0, o0, z, j2.n, j2.q, v8, j3, p0);
                }
                if(j1 != null) {
                    w w5 = i0.E.u;
                    j1.t = I.P0(u0, i0.E);
                    j1.P0((w5 == null ? null : u0.i(w5, a00)));
                }
                K k0 = i0.F;
                if(k0 == null) {
                    k1 = null;
                }
                else {
                    h h1 = k0.l();
                    y y1 = this.b;
                    o o1 = i0.F.c();
                    if(this.e == 2 && p.e(p.f(o1.a.m()))) {
                        o1 = p.h;
                    }
                    K k2 = i0.F;
                    boolean z1 = k2.m;
                    int v9 = this.e;
                    K k3 = this.d == null ? null : this.d.e();
                    k1 = new K(i1, h1, y1, o1, z1, k2.n, k2.q, v9, k3, p0);
                }
                if(k1 != null) {
                    List list1 = u.Q0(k1, i0.F.z0(), u0, false, false, null);
                    if(list1 == null) {
                        list1 = Collections.singletonList(K.O0(k1, e.e(this.a).n(), ((S)i0.F.z0().get(0)).l()));
                    }
                    if(list1.size() != 1) {
                        throw new IllegalStateException();
                    }
                    k1.t = I.P0(u0, i0.F);
                    S s0 = (S)list1.get(0);
                    if(s0 != null) {
                        k1.u = s0;
                        goto label_97;
                    }
                    K.G0(6);
                    throw null;
                }
            label_97:
                r r0 = null;
                r r1 = i0.G == null ? null : new r(i0.G.l(), i1);
                r r2 = i0.H;
                if(r2 != null) {
                    r0 = new r(r2.l(), i1);
                }
                i1.Q0(j1, k1, r1, r0);
                if(this.g) {
                    V3.h h2 = new V3.h();
                    for(Object object1: i0.s()) {
                        h2.add(((M)object1).b(u0));
                    }
                    i1.s = h2;
                }
                if(i0.E()) {
                    l l0 = i0.p;
                    if(l0 != null) {
                        i1.R0(i0.o, ((a)l0));
                    }
                }
                return i1;
            }
        }
        return null;
    }
}

