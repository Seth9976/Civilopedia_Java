package S3;

import C3.e;
import I2.b;
import J2.j;
import J2.l;
import K3.x;
import M3.A;
import M3.Z;
import M3.w;
import N3.d;
import U2.m;
import X2.k;
import X2.u;
import a3.S;
import a3.v;
import java.util.Collection;
import java.util.List;
import o1.a;
import x2.i;
import x3.g;
import y3.f;

public final class h extends l implements b {
    public final int i;
    public static final h j;
    public static final h k;
    public static final h l;
    public static final h m;
    public static final h n;
    public static final h o;
    public static final h p;
    public static final h q;
    public static final h r;

    static {
        h.j = new h(1, 0);
        h.k = new h(1, 1);
        h.l = new h(1, 2);
        h.m = new h(1, 3);
        h.n = new h(1, 4);
        h.o = new h(1, 5);
        h.p = new h(1, 6);
        h.q = new h(1, 7);
        h.r = new h(1, 8);
    }

    public h(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        boolean z4;
        boolean z3;
        boolean z = true;
        String s = null;
        switch(this.i) {
            case 0: {
                j.f(((u)object0), "$this$null");
                return null;
            }
            case 1: {
                j.f(((u)object0), "$this$null");
                return null;
            }
            case 2: {
                j.f(((u)object0), "$this$null");
                return null;
            }
            case 3: {
                j.f(((u)object0), "$this$$receiver");
                List list0 = ((u)object0).z0();
                j.e(list0, "getValueParameters(...)");
                S s1 = (S)i.b0(list0);
                return s1 != null && !e.a(s1) && s1.r == null ? null : "last parameter should not have a default value or be a vararg";
            }
            case 4: {
                j.f(((u)object0), "$this$$receiver");
                k k0 = ((u)object0).p();
                j.e(k0, "getContainingDeclaration(...)");
                if(!(k0 instanceof X2.e) || !U2.h.b(((X2.e)k0), m.a)) {
                    Collection collection0 = ((u)object0).s();
                    j.e(collection0, "getOverriddenDescriptors(...)");
                    if(!collection0.isEmpty()) {
                        for(Object object1: collection0) {
                            k k1 = ((u)object1).p();
                            j.e(k1, "getContainingDeclaration(...)");
                            if(k1 instanceof X2.e && U2.h.b(((X2.e)k1), m.a)) {
                                return null;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    k k2 = ((u)object0).p();
                    X2.e e0 = k2 instanceof X2.e ? ((X2.e)k2) : null;
                    if(e0 == null) {
                    label_46:
                        StringBuilder stringBuilder0 = new StringBuilder("must override \'\'equals()\'\' in Any");
                        k k3 = ((u)object0).p();
                        j.e(k3, "getContainingDeclaration(...)");
                        if(f.e(k3)) {
                            k k4 = ((u)object0).p();
                            j.d(k4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            A a1 = ((X2.e)k4).k();
                            j.e(a1, "getDefaultType(...)");
                            Z z2 = a.N(a1);
                            stringBuilder0.append(" or define \'\'equals(other: " + g.d.V(z2) + "): Boolean\'\'");
                        }
                        s = stringBuilder0.toString();
                        j.e(s, "toString(...)");
                    }
                    else {
                        if(!f.e(e0)) {
                            e0 = null;
                        }
                        if(e0 == null) {
                            goto label_46;
                        }
                        else {
                            A a0 = e0.k();
                            if(a0 == null) {
                                goto label_46;
                            }
                            else {
                                Z z1 = a.N(a0);
                                if(z1 == null) {
                                    goto label_46;
                                }
                                else {
                                    w w0 = ((u)object0).r();
                                    if(w0 == null || !j.a(((a3.m)(((u)object0))).getName(), s.d) || !U2.h.B(w0, m.h) && !U2.h.E(w0) || ((u)object0).z0().size() != 1) {
                                        goto label_46;
                                    }
                                    else {
                                        w w1 = ((S)((u)object0).z0().get(0)).getType();
                                        j.e(w1, "getType(...)");
                                        if(!j.a(a.N(w1), z1) || !((u)object0).T().isEmpty() || ((u)object0).J() != null) {
                                            goto label_46;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return s;
            }
            case 5: {
                j.f(((u)object0), "$this$$receiver");
                v v0 = ((u)object0).A();
                if(v0 == null) {
                    v0 = ((u)object0).J();
                }
                if(v0 == null) {
                    z = false;
                }
                else {
                    w w2 = ((u)object0).r();
                    if(w2 == null) {
                        z3 = false;
                    }
                    else {
                        w w3 = v0.getType();
                        z3 = d.a.b(w2, w3);
                    }
                    if(!z3) {
                        G3.e e1 = v0.M0();
                        j.e(e1, "getValue(...)");
                        if(e1 instanceof G3.d) {
                            X2.e e2 = ((G3.d)e1).i;
                            if(e2.Z()) {
                                v3.b b0 = e.f(e2);
                                if(b0 == null) {
                                    z4 = false;
                                }
                                else {
                                    X2.h h0 = X2.w.e(e.j(e2), b0);
                                    X2.S s2 = h0 instanceof X2.S ? ((X2.S)h0) : null;
                                    if(s2 == null) {
                                        z4 = false;
                                    }
                                    else {
                                        w w4 = ((u)object0).r();
                                        if(w4 == null) {
                                            z4 = false;
                                        }
                                        else {
                                            A a2 = ((x)s2).N0();
                                            z4 = d.a.b(w4, a2);
                                        }
                                    }
                                }
                            }
                            else {
                                z4 = false;
                            }
                        }
                        else {
                            z4 = false;
                        }
                        if(!z4) {
                            return "receiver must be a supertype of the return type";
                        }
                    }
                }
                return z ? null : "receiver must be a supertype of the return type";
            }
            case 6: {
                j.f(((U2.h)object0), "$this$null");
                return ((U2.h)object0).s(U2.j.n);
            }
            case 7: {
                j.f(((U2.h)object0), "$this$null");
                return ((U2.h)object0).s(U2.j.r);
            }
            default: {
                j.f(((U2.h)object0), "$this$null");
                return ((U2.h)object0).w();
            }
        }
    }
}

