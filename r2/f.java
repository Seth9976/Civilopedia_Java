package R2;

import B.d;
import J2.j;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import x2.g;
import x2.i;
import z1.a0;

public final class f extends a0 {
    public final List k;

    public f(Class class0) {
        j.f(class0, "jClass");
        super();
        Method[] arr_method = class0.getDeclaredMethods();
        j.e(arr_method, "getDeclaredMethods(...)");
        d d0 = new d(3);
        if(arr_method.length != 0) {
            arr_method = Arrays.copyOf(arr_method, arr_method.length);
            j.e(arr_method, "copyOf(...)");
            if(arr_method.length > 1) {
                Arrays.sort(arr_method, d0);
            }
        }
        this.k = g.B(arr_method);
    }

    @Override  // z1.a0
    public final String c() {
        return i.Y(this.k, "", "<init>(", ")V", b.l, 24);
    }
}

