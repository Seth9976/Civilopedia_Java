package a3;

import F3.m;
import F3.n;
import L3.b;
import M3.K;
import W2.k;
import X2.O;
import X2.P;
import X2.U;
import X2.f;
import X2.o;
import X2.y;
import Y2.g;
import Y2.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class B extends j {
    public final f o;
    public y p;
    public o q;
    public M3.j r;
    public ArrayList s;
    public final ArrayList t;
    public final b u;

    public B(k k0, v3.f f0, b b0) {
        f f1 = f.j;
        P p0 = O.b;
        if(f0 != null) {
            if(b0 != null) {
                super(b0, k0, f0, p0);
                this.t = new ArrayList();
                this.u = b0;
                this.o = f1;
                return;
            }
            B.d0(4);
            throw null;
        }
        B.d0(2);
        throw null;
    }

    @Override  // X2.h
    public final K B() {
        K k0 = this.r;
        if(k0 != null) {
            return k0;
        }
        B.d0(11);
        throw null;
    }

    @Override  // X2.e
    public final boolean D() {
        return false;
    }

    @Override  // X2.e
    public final boolean D0() {
        return false;
    }

    @Override  // X2.e
    public final boolean K() {
        return false;
    }

    @Override  // a3.z
    public final n L(N3.f f0) {
        return m.b;
    }

    @Override  // X2.e
    public final Collection V() {
        Collection collection0 = Collections.emptyList();
        if(collection0 != null) {
            return collection0;
        }
        B.d0(19);
        throw null;
    }

    @Override  // X2.e
    public final boolean Y() {
        return false;
    }

    @Override  // X2.x
    public final boolean Z() {
        return false;
    }

    @Override  // X2.i
    public final boolean a0() {
        return false;
    }

    @Override  // X2.e
    public final o c() {
        o o0 = this.q;
        if(o0 != null) {
            return o0;
        }
        B.d0(10);
        throw null;
    }

    @Override  // a3.j
    public static void d0(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
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
            case 1: {
                arr_object[0] = "kind";
                break;
            }
            case 2: {
                arr_object[0] = "name";
                break;
            }
            case 3: {
                arr_object[0] = "source";
                break;
            }
            case 4: {
                arr_object[0] = "storageManager";
                break;
            }
            case 6: {
                arr_object[0] = "modality";
                break;
            }
            case 9: {
                arr_object[0] = "visibility";
                break;
            }
            case 12: {
                arr_object[0] = "supertype";
                break;
            }
            case 14: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 16: {
                arr_object[0] = "kotlinTypeRefiner";
                break;
            }
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 5: {
                arr_object[1] = "getAnnotations";
                break;
            }
            case 7: {
                arr_object[1] = "getModality";
                break;
            }
            case 8: {
                arr_object[1] = "getKind";
                break;
            }
            case 10: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 11: {
                arr_object[1] = "getTypeConstructor";
                break;
            }
            case 13: {
                arr_object[1] = "getConstructors";
                break;
            }
            case 15: {
                arr_object[1] = "getDeclaredTypeParameters";
                break;
            }
            case 17: {
                arr_object[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 18: {
                arr_object[1] = "getStaticScope";
                break;
            }
            case 19: {
                arr_object[1] = "getSealedSubclasses";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
            }
        }
        switch(v) {
            case 6: {
                arr_object[2] = "setModality";
                break;
            }
            case 9: {
                arr_object[2] = "setVisibility";
                break;
            }
            case 12: {
                arr_object[2] = "addSupertype";
                break;
            }
            case 14: {
                arr_object[2] = "setTypeParameterDescriptors";
                break;
            }
            case 16: {
                arr_object[2] = "getUnsubstitutedMemberScope";
                break;
            }
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @Override  // X2.e
    public final y f() {
        y y0 = this.p;
        if(y0 != null) {
            return y0;
        }
        B.d0(7);
        throw null;
    }

    @Override  // X2.e
    public final Collection g() {
        Collection collection0 = Collections.emptySet();
        if(collection0 != null) {
            return collection0;
        }
        B.d0(13);
        throw null;
    }

    @Override  // X2.e
    public final f j() {
        f f0 = this.o;
        if(f0 != null) {
            return f0;
        }
        B.d0(8);
        throw null;
    }

    @Override  // Y2.a
    public final h l() {
        return g.a;
    }

    @Override  // X2.e
    public final U l0() {
        return null;
    }

    @Override  // X2.e
    public final boolean o() {
        return false;
    }

    @Override  // X2.e
    public final i o0() {
        return null;
    }

    @Override  // X2.e
    public final n p0() {
        return m.b;
    }

    @Override  // X2.e
    public final List t() {
        List list0 = this.s;
        if(list0 != null) {
            return list0;
        }
        B.d0(15);
        throw null;
    }

    @Override
    public final String toString() {
        return a3.m.K0(this);
    }

    @Override  // X2.x
    public final boolean v0() {
        return false;
    }
}

