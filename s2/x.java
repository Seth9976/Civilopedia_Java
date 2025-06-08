package S2;

import J2.j;
import java.lang.reflect.Method;
import java.util.Arrays;
import o1.a;
import x2.r;

public final class x extends z implements f {
    public final Object d;

    public x(Method method0, Object object0) {
        super(method0, r.i);
        this.d = object0;
    }

    @Override  // S2.g
    public final Object u(Object[] arr_object) {
        j.f(arr_object, "args");
        a.b(this, arr_object);
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        return this.a.invoke(this.d, arr_object1);
    }
}

