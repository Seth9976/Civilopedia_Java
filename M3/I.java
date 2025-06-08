package M3;

import J2.j;
import J2.o;
import J2.r;
import O2.c;
import O2.q;
import Y.m;
import Y2.g;

public abstract class i {
    public static final q[] a;
    public static final m b;

    static {
        o o0 = new o(r.a.c("descriptors", i.class), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;");
        i.a = new q[]{r.a.e(o0)};
        c c0 = r.a.b(h.class);
        H.j.getClass();
        String s = c0.h();
        j.c(s);
        i.b = new m(H.j.x(s), 2);
    }

    public static final Y2.h a(H h0) {
        j.f(h0, "<this>");
        q q0 = i.a[0];
        i.b.getClass();
        j.f(q0, "property");
        h h1 = (h)h0.i.get(i.b.j);
        if(h1 != null) {
            Y2.h h2 = h1.a;
            if(h2 != null) {
                return h2;
            }
        }
        return g.a;
    }
}

