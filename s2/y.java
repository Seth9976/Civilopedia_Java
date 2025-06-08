package S2;

import J2.j;
import java.util.Arrays;
import o1.a;
import x2.g;

public final class y extends z {
    @Override  // S2.g
    public final Object u(Object[] arr_object) {
        j.f(arr_object, "args");
        a.b(this, arr_object);
        Object object0 = arr_object[0];
        Object[] arr_object1 = arr_object.length > 1 ? g.F(arr_object, 1, arr_object.length) : new Object[0];
        Object[] arr_object2 = Arrays.copyOf(arr_object1, arr_object1.length);
        return this.a.invoke(object0, arr_object2);
    }
}

