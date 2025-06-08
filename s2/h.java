package S2;

import J2.j;
import J2.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import o1.a;
import x2.g;

public final class h extends w implements f {
    public final int e;
    public final Object f;

    public h(Constructor constructor0, Object object0, int v) {
        this.e = v;
        if(v != 1) {
            j.f(constructor0, "constructor");
            Class class0 = constructor0.getDeclaringClass();
            j.e(class0, "getDeclaringClass(...)");
            Type[] arr_type = constructor0.getGenericParameterTypes();
            j.e(arr_type, "getGenericParameterTypes(...)");
            Type[] arr_type1 = arr_type.length <= 2 ? new Type[0] : g.F(arr_type, 1, arr_type.length - 1);
            super(constructor0, class0, null, arr_type1);
            this.f = object0;
            return;
        }
        j.f(constructor0, "constructor");
        Class class1 = constructor0.getDeclaringClass();
        j.e(class1, "getDeclaringClass(...)");
        Type[] arr_type2 = constructor0.getGenericParameterTypes();
        j.e(arr_type2, "getGenericParameterTypes(...)");
        super(constructor0, class1, null, arr_type2);
        this.f = object0;
    }

    @Override  // S2.g
    public final Object u(Object[] arr_object) {
        if(this.e != 0) {
            j.f(arr_object, "args");
            a.b(this, arr_object);
            u u0 = new u(2);
            u0.a(this.f);
            u0.b(arr_object);
            Object[] arr_object1 = u0.a.toArray(new Object[u0.a.size()]);
            return ((Constructor)this.a).newInstance(arr_object1);
        }
        j.f(arr_object, "args");
        a.b(this, arr_object);
        u u1 = new u(3);
        u1.a(this.f);
        u1.b(arr_object);
        u1.a(null);
        Object[] arr_object2 = u1.a.toArray(new Object[u1.a.size()]);
        return ((Constructor)this.a).newInstance(arr_object2);
    }
}

