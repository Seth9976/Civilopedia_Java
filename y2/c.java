package Y2;

import M3.A;
import M3.w;
import O3.l;
import X2.O;
import X2.e;
import java.util.Map;
import x3.g;

public final class c implements b {
    public final A a;
    public final Map b;
    public final O c;

    public c(A a0, Map map0, O o0) {
        if(a0 != null) {
            if(map0 != null) {
                super();
                this.a = a0;
                this.b = map0;
                this.c = o0;
                return;
            }
            c.c(1);
            throw null;
        }
        c.c(0);
        throw null;
    }

    @Override  // Y2.b
    public final v3.c a() {
        e e0 = C3.e.d(this);
        if(e0 != null) {
            if(l.f(e0)) {
                e0 = null;
            }
            return e0 == null ? null : C3.e.c(e0);
        }
        return null;
    }

    @Override  // Y2.b
    public final Map b() {
        Map map0 = this.b;
        if(map0 != null) {
            return map0;
        }
        c.c(4);
        throw null;
    }

    public static void c(int v) {
        Object[] arr_object = new Object[(v == 3 || v == 4 || v == 5 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "valueArguments";
                break;
            }
            case 2: {
                arr_object[0] = "source";
                break;
            }
            case 3: 
            case 4: 
            case 5: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "annotationType";
            }
        }
        switch(v) {
            case 3: {
                arr_object[1] = "getType";
                break;
            }
            case 4: {
                arr_object[1] = "getAllValueArguments";
                break;
            }
            case 5: {
                arr_object[1] = "getSource";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
            }
        }
        if(v != 3 && v != 4 && v != 5) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 3 || v == 4 || v == 5 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 3 || v == 4 || v == 5 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // Y2.b
    public final w getType() {
        w w0 = this.a;
        if(w0 != null) {
            return w0;
        }
        c.c(3);
        throw null;
    }

    @Override  // Y2.b
    public final O q() {
        O o0 = this.c;
        if(o0 != null) {
            return o0;
        }
        c.c(5);
        throw null;
    }

    @Override
    public final String toString() {
        return g.c.v(this, null);
    }
}

