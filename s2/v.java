package S2;

import J2.j;
import java.lang.reflect.Method;
import o1.a;
import x2.g;

public final class v extends q {
    public final int g;

    public v(int v, Method method0) {
        this.g = v;
        switch(v) {
            case 1: {
                j.f(method0, "method");
                super(method0, true, 4);
                return;
            }
            case 2: {
                j.f(method0, "method");
                super(method0, false, 6);
                return;
            }
            default: {
                j.f(method0, "method");
                super(method0, false, 6);
            }
        }
    }

    @Override  // S2.q
    public final Object u(Object[] arr_object) {
        switch(this.g) {
            case 0: {
                j.f(arr_object, "args");
                a.b(this, arr_object);
                Object object0 = arr_object[0];
                return arr_object.length > 1 ? this.c(g.F(arr_object, 1, arr_object.length), object0) : this.c(new Object[0], object0);
            }
            case 1: {
                j.f(arr_object, "args");
                a.b(this, arr_object);
                this.b(g.H(arr_object));
                return arr_object.length > 1 ? this.c(g.F(arr_object, 1, arr_object.length), null) : this.c(new Object[0], null);
            }
            default: {
                j.f(arr_object, "args");
                a.b(this, arr_object);
                return this.c(arr_object, null);
            }
        }
    }
}

