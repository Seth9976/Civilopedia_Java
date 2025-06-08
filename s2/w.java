package S2;

import J2.u;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import o1.a;
import x2.j;

public abstract class w implements g {
    public final Member a;
    public final Type b;
    public final Class c;
    public final List d;

    public w(Member member0, Type type0, Class class0, Type[] arr_type) {
        List list0;
        this.a = member0;
        this.b = type0;
        this.c = class0;
        if(class0 == null) {
            list0 = x2.g.Q(arr_type);
        }
        else {
            u u0 = new u(2);
            u0.a(class0);
            u0.b(arr_type);
            list0 = j.z(u0.a.toArray(new Type[u0.a.size()]));
        }
        this.d = list0;
    }

    public void a(Object[] arr_object) {
        a.b(this, arr_object);
    }

    public final void b(Object object0) {
        if(object0 == null || !this.a.getDeclaringClass().isInstance(object0)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override  // S2.g
    public final Type r() {
        return this.b;
    }

    @Override  // S2.g
    public final List s() {
        return this.d;
    }

    @Override  // S2.g
    public final Member t() {
        return this.a;
    }
}

