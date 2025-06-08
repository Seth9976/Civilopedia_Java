package S2;

import java.lang.reflect.Field;
import o1.a;

public final class j extends m implements f {
    public final Object e;

    public j(Field field0, Object object0) {
        J2.j.f(field0, "field");
        super(field0, false);
        this.e = object0;
    }

    @Override  // S2.m
    public final Object u(Object[] arr_object) {
        J2.j.f(arr_object, "args");
        a.b(this, arr_object);
        return ((Field)this.a).get(this.e);
    }
}

