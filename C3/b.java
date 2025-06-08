package c3;

import J2.j;
import P1.a;
import Y3.n;

public final class b {
    public final Class a;
    public final a b;

    public b(Class class0, a a0) {
        this.a = class0;
        this.b = a0;
    }

    public final String a() {
        return n.E0(this.a.getName(), '.', '/') + ".class";
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof b && j.a(this.a, ((b)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.class.getName() + ": " + this.a;
    }
}

