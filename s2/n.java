package S2;

import J2.j;
import java.lang.reflect.Field;
import w2.k;
import x2.g;

public final class n extends q implements f {
    public final Object g;

    public n(Field field0, boolean z, Object object0) {
        j.f(field0, "field");
        super(field0, z, false);
        this.g = object0;
    }

    @Override  // S2.q
    public final Object u(Object[] arr_object) {
        j.f(arr_object, "args");
        this.a(arr_object);
        Object object0 = g.G(arr_object);
        ((Field)this.a).set(this.g, object0);
        return k.a;
    }
}

