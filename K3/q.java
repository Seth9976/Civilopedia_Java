package k3;

import J2.j;
import d3.o;
import v3.f;

public final class q {
    public final f a;
    public final o b;

    public q(f f0, o o0) {
        j.f(f0, "name");
        super();
        this.a = f0;
        this.b = o0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof q && j.a(this.a, ((q)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

