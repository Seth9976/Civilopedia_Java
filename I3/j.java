package I3;

import M3.A;
import M3.w;
import X2.c;
import X2.e;
import X2.y;
import java.util.ArrayList;
import q3.Q;

public final class j implements k, l, m {
    public final int b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;

    static {
        j.c = new j(0);
        j.d = new j(1);
        j.e = new j(2);
        j.f = new j(3);
        j.g = new j(4);
    }

    public j(int v) {
        this.b = v;
        super();
    }

    @Override  // I3.m
    public w a(Q q0, String s, A a0, A a1) {
        J2.j.f(s, "flexibleId");
        J2.j.f(a0, "lowerBound");
        J2.j.f(a1, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override  // I3.l
    public void b(c c0) {
        if(c0 != null) {
            return;
        }
        j.e(2);
        throw null;
    }

    @Override  // I3.l
    public void c(e e0, ArrayList arrayList0) {
        if(e0 != null) {
            return;
        }
        j.e(0);
        throw null;
    }

    @Override  // I3.k
    public Boolean d() {
        return this.b == 1 ? null : true;
    }

    public static void e(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "unresolvedSuperClasses" : "descriptor";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        arr_object[2] = v == 2 ? "reportCannotInferVisibility" : "reportIncompleteHierarchy";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static y f(q3.A a0) {
        y y0 = y.j;
        switch((a0 == null ? -1 : I3.w.a[a0.ordinal()])) {
            case 2: {
                return y.l;
            }
            case 3: {
                return y.m;
            }
            case 4: {
                return y.k;
            }
            default: {
                return y0;
            }
        }
    }
}

