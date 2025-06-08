package a3;

import C3.e;
import J2.j;
import L3.p;
import M3.w;
import O3.k;
import O3.l;
import X2.P;
import X2.T;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import y3.a;
import y3.b;

public final class g extends M3.g {
    public final P c;
    public final h d;

    public g(h h0, p p0, P p1) {
        if(p0 != null) {
            this.d = h0;
            super(p0);
            this.c = p1;
            return;
        }
        g.h(0);
        throw null;
    }

    @Override  // M3.g
    public final Collection b() {
        Collection collection0 = this.d.N0();
        if(collection0 != null) {
            return collection0;
        }
        g.h(1);
        throw null;
    }

    @Override  // M3.g
    public final w c() {
        return l.c(k.o, new String[0]);
    }

    @Override  // M3.g
    public final P d() {
        P p0 = this.c;
        if(p0 != null) {
            return p0;
        }
        g.h(5);
        throw null;
    }

    @Override  // M3.g
    public final boolean f(X2.h h0) {
        if(h0 instanceof T) {
            j.f(this.d, "a");
            return b.a.d(this.d, ((T)h0), true, a.k);
        }
        return false;
    }

    @Override  // M3.g
    public final List g(List list0) {
        List list1 = this.d.M0(list0);
        if(list1 != null) {
            return list1;
        }
        g.h(8);
        throw null;
    }

    public static void h(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
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
            case 4: 
            case 5: 
            case 8: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 6: {
                arr_object[0] = "type";
                break;
            }
            case 7: {
                arr_object[0] = "supertypes";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            }
            case 9: {
                arr_object[0] = "classifier";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 1: {
                arr_object[1] = "computeSupertypes";
                break;
            }
            case 2: {
                arr_object[1] = "getParameters";
                break;
            }
            case 3: {
                arr_object[1] = "getDeclarationDescriptor";
                break;
            }
            case 4: {
                arr_object[1] = "getBuiltIns";
                break;
            }
            case 5: {
                arr_object[1] = "getSupertypeLoopChecker";
                break;
            }
            case 8: {
                arr_object[1] = "processSupertypesWithoutCycles";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            }
        }
        switch(v) {
            case 6: {
                arr_object[2] = "reportSupertypeLoopError";
                break;
            }
            case 7: {
                arr_object[2] = "processSupertypesWithoutCycles";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                break;
            }
            case 9: {
                arr_object[2] = "isSameClassifier";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                illegalStateException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalStateException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalStateException0;
    }

    @Override  // M3.K
    public final U2.h m() {
        U2.h h0 = e.e(this.d);
        if(h0 != null) {
            return h0;
        }
        g.h(4);
        throw null;
    }

    @Override  // M3.K
    public final List o() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        g.h(2);
        throw null;
    }

    @Override  // M3.K
    public final boolean p() {
        return true;
    }

    @Override  // M3.K
    public final X2.h q() {
        X2.h h0 = this.d;
        if(h0 != null) {
            return h0;
        }
        g.h(3);
        throw null;
    }

    @Override
    public final String toString() {
        return this.d.getName().i;
    }
}

