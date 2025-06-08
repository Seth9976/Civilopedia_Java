package i3;

import J2.j;
import J2.l;
import M3.X;
import M3.w;
import U2.m;
import U2.r;
import X2.M;
import X2.O;
import X2.P;
import X2.k;
import X2.o;
import X2.y;
import Y2.h;
import a3.I;
import a3.J;
import a3.K;
import a3.S;
import a3.v;
import g3.x;
import j3.c;
import java.util.ArrayList;
import v3.f;
import w2.e;

public class g extends I implements a {
    public final boolean I;
    public final e J;

    public g(k k0, h h0, y y0, o o0, boolean z, f f0, O o1, M m0, int v, boolean z1, e e0) {
        if(k0 != null) {
            if(h0 != null) {
                if(y0 != null) {
                    if(o0 != null) {
                        if(f0 != null) {
                            if(o1 != null) {
                                if(v != 0) {
                                    super(k0, m0, h0, y0, o0, z, f0, v, o1, false, false, false, false, false);
                                    this.I = z1;
                                    this.J = e0;
                                    return;
                                }
                                g.G0(6);
                                throw null;
                            }
                            g.G0(5);
                            throw null;
                        }
                        g.G0(4);
                        throw null;
                    }
                    g.G0(3);
                    throw null;
                }
                g.G0(2);
                throw null;
            }
            g.G0(1);
            throw null;
        }
        g.G0(0);
        throw null;
    }

    @Override  // a3.I
    public final boolean E() {
        w w0 = this.getType();
        if(this.I) {
            j.f(w0, "type");
            if((U2.h.F(w0) || r.a(w0)) && !X.e(w0) || U2.h.D(w0, m.f)) {
                j.e(x.p, "ENHANCED_NULLABILITY_ANNOTATION");
                return !N3.g.u(w0, x.p) || U2.h.D(w0, m.f);
            }
        }
        return false;
    }

    @Override  // i3.a
    public final a F(w w0, ArrayList arrayList0, w w1, e e0) {
        M m0 = this.a() == this ? null : this.a();
        k k0 = this.p();
        h h0 = this.l();
        y y0 = this.f();
        o o0 = this.c();
        f f0 = this.getName();
        O o1 = this.q();
        int v = this.j();
        g g0 = new g(k0, h0, y0, o0, this.n, f0, o1, m0, v, this.I, e0);
        J j0 = this.E;
        if(j0 != null) {
            h h1 = j0.l();
            y y1 = j0.f();
            o o2 = j0.c();
            boolean z = j0.m;
            int v1 = this.j();
            J j1 = m0 == null ? null : m0.d();
            O o3 = j0.q();
            new J(g0, h1, y1, o2, z, j0.n, j0.q, v1, j1, o3);
            0.t = j0.t;
            0.u = w1;
        }
        K k1 = this.F;
        if(k1 != null) {
            h h2 = k1.l();
            y y2 = k1.f();
            o o4 = k1.c();
            boolean z1 = k1.m;
            int v2 = this.j();
            K k2 = m0 == null ? null : m0.e();
            O o5 = k1.q();
            new K(g0, h2, y2, o4, z1, k1.n, k1.q, v2, k2, o5);
            0.t = 0.t;
            S s0 = (S)k1.z0().get(0);
            if(s0 != null) {
                0.u = s0;
                goto label_38;
            }
            K.G0(6);
            throw null;
        }
    label_38:
        g0.Q0(null, null, this.G, this.H);
        l l0 = this.p;
        if(l0 != null) {
            g0.R0(this.o, ((I2.a)l0));
        }
        g0.g0(this.s());
        v v3 = w0 == null ? null : y3.l.k(this, w0, Y2.g.a);
        g0.T0(w1, this.u(), this.B, v3, x2.r.i);
        return g0;
    }

    @Override  // a3.I
    public static void G0(int v) {
        Object[] arr_object = new Object[(v == 21 ? 2 : 3)];
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
            case 3: 
            case 10: {
                arr_object[0] = "visibility";
                break;
            }
            case 4: 
            case 11: {
                arr_object[0] = "name";
                break;
            }
            case 13: {
                arr_object[0] = "newOwner";
                break;
            }
            case 14: {
                arr_object[0] = "newModality";
                break;
            }
            case 15: {
                arr_object[0] = "newVisibility";
                break;
            }
            case 6: 
            case 16: {
                arr_object[0] = "kind";
                break;
            }
            case 17: {
                arr_object[0] = "newName";
                break;
            }
            case 5: 
            case 12: 
            case 18: {
                arr_object[0] = "source";
                break;
            }
            case 19: {
                arr_object[0] = "enhancedValueParameterTypes";
                break;
            }
            case 20: {
                arr_object[0] = "enhancedReturnType";
                break;
            }
            case 21: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            }
            case 22: {
                arr_object[0] = "inType";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        arr_object[1] = v == 21 ? "enhance" : "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        switch(v) {
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                arr_object[2] = "create";
                break;
            }
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: {
                arr_object[2] = "createSubstitutedCopy";
                break;
            }
            case 19: 
            case 20: {
                arr_object[2] = "enhance";
                break;
            }
            case 21: {
                break;
            }
            case 22: {
                arr_object[2] = "setInType";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 21 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 21 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @Override  // a3.I
    public final I O0(k k0, y y0, o o0, M m0, int v, f f0) {
        P p0 = O.b;
        if(k0 != null) {
            if(y0 != null) {
                if(o0 != null) {
                    if(v != 0) {
                        if(f0 != null) {
                            return new g(k0, this.l(), y0, o0, this.n, f0, p0, m0, v, this.I, this.J);
                        }
                        g.G0(17);
                        throw null;
                    }
                    g.G0(16);
                    throw null;
                }
                g.G0(15);
                throw null;
            }
            g.G0(14);
            throw null;
        }
        g.G0(13);
        throw null;
    }

    @Override  // a3.T, X2.b
    public final boolean Q() {
        return false;
    }

    @Override  // a3.I
    public final void S0(w w0) {
    }

    public static g U0(k k0, c c0, o o0, boolean z, f f0, c3.f f1, boolean z1) {
        y y0 = y.j;
        if(k0 != null) {
            if(f0 != null) {
                return new g(k0, c0, y0, o0, z, f0, f1, null, 1, z1, null);
            }
            g.G0(11);
            throw null;
        }
        g.G0(7);
        throw null;
    }

    @Override  // a3.I, X2.b
    public final Object n0(X2.a a0) {
        return this.J == null || !((X2.a)this.J.i).equals(a0) ? null : this.J.j;
    }
}

