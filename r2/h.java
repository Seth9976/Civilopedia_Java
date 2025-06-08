package R2;

import J2.j;
import java.lang.reflect.Method;
import z1.a0;

public final class h extends a0 {
    public final Method k;

    public h(Method method0) {
        j.f(method0, "method");
        super();
        this.k = method0;
    }

    @Override  // z1.a0
    public final String c() {
        return a0.b(this.k);
    }
}

