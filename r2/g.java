package R2;

import J2.j;
import java.lang.reflect.Constructor;
import z1.a0;

public final class g extends a0 {
    public final Constructor k;

    public g(Constructor constructor0) {
        j.f(constructor0, "constructor");
        super();
        this.k = constructor0;
    }

    @Override  // z1.a0
    public final String c() {
        Class[] arr_class = this.k.getParameterTypes();
        j.e(arr_class, "getParameterTypes(...)");
        return x2.g.M(arr_class, "", "<init>(", ")V", b.m, 24);
    }
}

