package S2;

import J2.j;
import J2.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Arrays;
import o1.a;

public final class i extends w {
    public final int e;

    public i(Member member0, Type type0, Class class0, Type[] arr_type, int v) {
        this.e = v;
        super(member0, type0, class0, arr_type);
    }

    @Override  // S2.g
    public final Object u(Object[] arr_object) {
        if(this.e != 0) {
            j.f(arr_object, "args");
            a.b(this, arr_object);
            Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
            return ((Constructor)this.a).newInstance(arr_object1);
        }
        j.f(arr_object, "args");
        a.b(this, arr_object);
        u u0 = new u(2);
        u0.b(arr_object);
        u0.a(null);
        Object[] arr_object2 = u0.a.toArray(new Object[u0.a.size()]);
        return ((Constructor)this.a).newInstance(arr_object2);
    }
}

