package d3;

import J2.j;
import java.util.Collection;
import m3.b;
import v3.c;
import x2.r;

public final class y extends s implements b {
    public final c a;

    public y(c c0) {
        j.f(c0, "fqName");
        super();
        this.a = c0;
    }

    @Override  // m3.b
    public final e a(c c0) {
        j.f(c0, "fqName");
        return null;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof y && j.a(this.a, ((y)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // m3.b
    public final Collection l() {
        return r.i;
    }

    @Override
    public final String toString() {
        return y.class.getName() + ": " + this.a;
    }
}

