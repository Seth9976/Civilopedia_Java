package M3;

import L3.m;
import X2.P;
import X2.e;
import a3.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import y3.d;

public final class j extends b {
    public final z c;
    public final List d;
    public final Collection e;

    public j(z z0, List list0, Collection collection0, m m0) {
        if(list0 != null) {
            if(collection0 != null) {
                if(m0 != null) {
                    super(m0);
                    this.c = z0;
                    this.d = Collections.unmodifiableList(new ArrayList(list0));
                    this.e = Collections.unmodifiableCollection(collection0);
                    return;
                }
                j.h(3);
                throw null;
            }
            j.h(2);
            throw null;
        }
        j.h(1);
        throw null;
    }

    @Override  // M3.g
    public final Collection b() {
        Collection collection0 = this.e;
        if(collection0 != null) {
            return collection0;
        }
        j.h(6);
        throw null;
    }

    @Override  // M3.g
    public final P d() {
        return P.k;
    }

    @Override  // M3.b
    public static void h(int v) {
        Object[] arr_object = new Object[(v == 4 || v == 5 || v == 6 || v == 7 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "parameters";
                break;
            }
            case 2: {
                arr_object[0] = "supertypes";
                break;
            }
            case 3: {
                arr_object[0] = "storageManager";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            }
            default: {
                arr_object[0] = "classDescriptor";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "getParameters";
                break;
            }
            case 5: {
                arr_object[1] = "getDeclarationDescriptor";
                break;
            }
            case 6: {
                arr_object[1] = "computeSupertypes";
                break;
            }
            case 7: {
                arr_object[1] = "getSupertypeLoopChecker";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
            }
        }
        if(v != 4 && v != 5 && v != 6 && v != 7) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 4 || v == 5 || v == 6 || v == 7 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 4 || v == 5 || v == 6 || v == 7 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // M3.b
    public final e i() {
        e e0 = this.c;
        if(e0 != null) {
            return e0;
        }
        j.h(5);
        throw null;
    }

    @Override  // M3.K
    public final List o() {
        List list0 = this.d;
        if(list0 != null) {
            return list0;
        }
        j.h(4);
        throw null;
    }

    @Override  // M3.K
    public final boolean p() {
        return true;
    }

    @Override
    public final String toString() {
        String s = d.g(this.c).a;
        if(s != null) {
            return s;
        }
        v3.e.a(4);
        throw null;
    }
}

