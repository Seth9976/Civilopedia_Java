package S2;

import J2.j;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import x2.g;

public abstract class m extends w {
    public m(Field field0, boolean z) {
        Type type0 = field0.getGenericType();
        j.e(type0, "getGenericType(...)");
        super(field0, type0, (z ? field0.getDeclaringClass() : null), new Type[0]);
    }

    @Override  // S2.g
    public Object u(Object[] arr_object) {
        j.f(arr_object, "args");
        this.a(arr_object);
        Field field0 = (Field)this.a;
        return this.c == null ? field0.get(null) : field0.get(g.G(arr_object));
    }
}

