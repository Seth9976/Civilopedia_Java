package S2;

import J2.j;
import J2.u;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import o1.a;
import x2.g;

public final class t extends q implements f {
    public final Object g;

    public t(Method method0, Object object0) {
        j.f(method0, "method");
        Type[] arr_type = method0.getGenericParameterTypes();
        j.e(arr_type, "getGenericParameterTypes(...)");
        Type[] arr_type1 = arr_type.length <= 1 ? new Type[0] : g.F(arr_type, 1, arr_type.length);
        super(method0, false, arr_type1);
        this.g = object0;
    }

    @Override  // S2.q
    public final Object u(Object[] arr_object) {
        j.f(arr_object, "args");
        a.b(this, arr_object);
        u u0 = new u(2);
        u0.a(this.g);
        u0.b(arr_object);
        return this.c(u0.a.toArray(new Object[u0.a.size()]), null);
    }
}

