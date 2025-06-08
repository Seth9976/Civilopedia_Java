package j3;

import B.f;
import L3.j;
import O2.A;
import U2.m;
import X3.k;
import X3.l;
import X3.n;
import Y2.h;
import d3.e;
import java.util.Iterator;
import m3.b;
import x2.g;
import x2.i;

public final class c implements h {
    public final f i;
    public final b j;
    public final boolean k;
    public final j l;

    public c(f f0, b b0, boolean z) {
        J2.j.f(f0, "c");
        J2.j.f(b0, "annotationOwner");
        super();
        this.i = f0;
        this.j = b0;
        this.k = z;
        this.l = ((a)f0.j).a.c(new A3.h(this, 16));
    }

    @Override  // Y2.h
    public final Y2.b c(v3.c c0) {
        J2.j.f(c0, "fqName");
        b b0 = this.j;
        e e0 = b0.a(c0);
        if(e0 != null) {
            Y2.b b1 = (Y2.b)this.l.b(e0);
            if(b1 != null) {
                return b1;
            }
        }
        return h3.c.a(c0, b0, this.i);
    }

    @Override  // Y2.h
    public final boolean e(v3.c c0) {
        return A.J(this, c0);
    }

    @Override  // Y2.h
    public final boolean isEmpty() {
        return this.j.l().isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new S3.b(new X3.f(l.u0(g.C(new k[]{l.w0(i.L(this.j.l()), this.l), g.C(new Object[]{h3.c.a(m.m, this.j, this.i)})})), false, n.l));
    }
}

