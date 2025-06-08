package h3;

import J2.j;
import O2.A;
import U2.m;
import d3.d;
import g3.x;
import i3.h;
import java.util.Map;
import m3.b;
import v3.f;
import w2.e;
import x2.w;

public abstract class c {
    public static final f a;
    public static final f b;
    public static final f c;
    public static final Object d;

    static {
        c.a = f.e("message");
        c.b = f.e("allowedTargets");
        c.c = f.e("value");
        c.d = w.s(new e[]{new e(m.t, x.c), new e(m.w, x.d), new e(m.x, x.f)});
    }

    public static h a(v3.c c0, b b0, B.f f0) {
        j.f(c0, "kotlinName");
        j.f(b0, "annotationOwner");
        j.f(f0, "c");
        if(c0.equals(m.m)) {
            j.e(x.e, "DEPRECATED_ANNOTATION");
            d3.e e0 = b0.a(x.e);
            if(e0 != null) {
                return new g(e0, f0);
            }
        }
        v3.c c1 = (v3.c)((Map)c.d).get(c0);
        if(c1 != null) {
            d3.e e1 = b0.a(c1);
            return e1 == null ? null : c.b(f0, e1, false);
        }
        return null;
    }

    public static h b(B.f f0, d3.e e0, boolean z) {
        j.f(e0, "annotation");
        j.f(f0, "c");
        v3.b b0 = d.a(A.y(A.v(e0.a)));
        if(b0.equals(v3.b.j(x.c))) {
            return new h3.j(e0, f0);
        }
        if(b0.equals(v3.b.j(x.d))) {
            return new i(e0, f0);
        }
        if(b0.equals(v3.b.j(x.f))) {
            return new h3.b(f0, e0, m.x);
        }
        return b0.equals(v3.b.j(x.e)) ? null : new k3.f(f0, e0, z);
    }
}

