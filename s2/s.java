package S2;

import J2.j;
import java.lang.reflect.Method;
import o1.a;

public final class s extends q implements f {
    public s(Method method0) {
        j.f(method0, "method");
        super(method0, false, 4);
    }

    @Override  // S2.q
    public final Object u(Object[] arr_object) {
        j.f(arr_object, "args");
        a.b(this, arr_object);
        return this.c(arr_object, null);
    }
}

