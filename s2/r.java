package S2;

import J2.j;
import java.lang.reflect.Method;
import o1.a;

public final class r extends q implements f {
    public final Object g;

    public r(Method method0, Object object0) {
        j.f(method0, "method");
        super(method0, false, 4);
        this.g = object0;
    }

    @Override  // S2.q
    public final Object u(Object[] arr_object) {
        j.f(arr_object, "args");
        a.b(this, arr_object);
        return this.c(arr_object, this.g);
    }
}

