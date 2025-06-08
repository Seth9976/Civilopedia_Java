package i3;

import M3.w;
import X2.O;
import X2.e;
import X2.k;
import X2.o;
import X2.u;
import X2.y;
import Y2.g;
import Y2.h;
import a3.i;
import a3.v;
import java.util.ArrayList;
import java.util.List;
import v3.f;
import x2.r;
import y3.l;
import z1.a0;

public final class b extends i implements a {
    public Boolean M;
    public Boolean N;

    public b(e e0, b b0, h h0, boolean z, int v, O o0) {
        if(e0 != null) {
            if(h0 != null) {
                if(v != 0) {
                    if(o0 != null) {
                        super(e0, b0, h0, z, v, o0);
                        this.M = null;
                        this.N = null;
                        return;
                    }
                    b.G0(3);
                    throw null;
                }
                b.G0(2);
                throw null;
            }
            b.G0(1);
            throw null;
        }
        b.G0(0);
        throw null;
    }

    @Override  // i3.a
    public final a F(w w0, ArrayList arrayList0, w w1, w2.e e0) {
        a a0 = this.e1(this.Y0(), null, this.j(), this.l(), this.q());
        v v0 = w0 == null ? null : l.k(a0, w0, g.a);
        v v1 = this.r;
        List list0 = this.u();
        ArrayList arrayList1 = a0.i(arrayList0, this.z0(), ((u)a0));
        y y0 = this.f();
        o o0 = this.c();
        ((a3.u)a0).R0(v0, v1, r.i, list0, arrayList1, w1, y0, o0);
        if(e0 != null) {
            ((a3.u)a0).T0(((X2.a)e0.i), e0.j);
        }
        return a0;
    }

    @Override  // a3.i
    public static void G0(int v) {
        Object[] arr_object = new Object[(v == 11 || v == 18 ? 2 : 3)];
        switch(v) {
            case 3: 
            case 6: 
            case 10: {
                arr_object[0] = "source";
                break;
            }
            case 7: 
            case 12: {
                arr_object[0] = "newOwner";
                break;
            }
            case 2: 
            case 8: 
            case 13: {
                arr_object[0] = "kind";
                break;
            }
            case 14: {
                arr_object[0] = "sourceElement";
                break;
            }
            case 1: 
            case 5: 
            case 9: 
            case 15: {
                arr_object[0] = "annotations";
                break;
            }
            case 16: {
                arr_object[0] = "enhancedValueParameterTypes";
                break;
            }
            case 17: {
                arr_object[0] = "enhancedReturnType";
                break;
            }
            case 11: 
            case 18: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 11: {
                arr_object[1] = "createSubstitutedCopy";
                break;
            }
            case 18: {
                arr_object[1] = "enhance";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
            }
        }
        switch(v) {
            case 4: 
            case 5: 
            case 6: {
                arr_object[2] = "createJavaConstructor";
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                arr_object[2] = "createSubstitutedCopy";
                break;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                arr_object[2] = "createDescriptor";
                break;
            }
            case 16: 
            case 17: {
                arr_object[2] = "enhance";
                break;
            }
            case 11: 
            case 18: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 11 || v == 18 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 11 || v == 18 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // a3.i
    public final a3.u O0(int v, k k0, u u0, O o0, h h0, f f0) {
        return this.e1(k0, u0, v, h0, o0);
    }

    @Override  // a3.u, X2.b
    public final boolean Q() {
        return this.N.booleanValue();
    }

    @Override  // a3.u
    public final void U0(boolean z) {
        this.M = Boolean.valueOf(z);
    }

    @Override  // a3.u
    public final void V0(boolean z) {
        this.N = Boolean.valueOf(z);
    }

    @Override  // a3.i
    public final i X0(int v, k k0, u u0, O o0, h h0, f f0) {
        return this.e1(k0, u0, v, h0, o0);
    }

    public static b d1(e e0, h h0, boolean z, c3.f f0) {
        if(e0 != null) {
            return new b(e0, null, h0, z, 1, f0);
        }
        b.G0(4);
        throw null;
    }

    public final b e1(k k0, u u0, int v, h h0, O o0) {
        if(k0 != null) {
            if(v != 0) {
                if(h0 != null) {
                    if(o0 != null) {
                        if(v != 1 && v != 4) {
                            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + k0 + "\nkind: " + A.f.v(v));
                        }
                        b b0 = new b(((e)k0), ((b)u0), h0, this.L, v, o0);
                        Boolean boolean0 = this.M;
                        boolean0.getClass();
                        b0.M = boolean0;
                        Boolean boolean1 = this.N;
                        boolean1.getClass();
                        b0.N = boolean1;
                        return b0;
                    }
                    b.G0(10);
                    throw null;
                }
                b.G0(9);
                throw null;
            }
            b.G0(8);
            throw null;
        }
        b.G0(7);
        throw null;
    }
}

