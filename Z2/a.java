package Z2;

import J2.j;
import K3.w;
import X2.e;
import java.util.Collection;
import v3.f;
import x2.r;

public final class a implements b, d {
    public final int a;
    public static final a b;
    public static final a c;
    public static final a d;

    static {
        a.b = new a(0);
        a.c = new a(1);
        a.d = new a(2);
    }

    public a(int v) {
        this.a = v;
        super();
    }

    @Override  // Z2.b
    public Collection a(e e0) {
        j.f(e0, "classDescriptor");
        return r.i;
    }

    @Override  // Z2.b
    public Collection b(e e0) {
        j.f(e0, "classDescriptor");
        return r.i;
    }

    @Override  // Z2.b
    public Collection c(f f0, e e0) {
        j.f(f0, "name");
        j.f(e0, "classDescriptor");
        return r.i;
    }

    @Override  // Z2.b
    public Collection d(e e0) {
        j.f(e0, "classDescriptor");
        return r.i;
    }

    @Override  // Z2.d
    public boolean e(e e0, w w0) {
        if(this.a != 1) {
            j.f(e0, "classDescriptor");
            return !w0.l().e(Z2.e.a);
        }
        j.f(e0, "classDescriptor");
        return true;
    }
}

