package S2;

import J2.j;
import java.lang.reflect.Field;
import o1.a;
import x2.g;

public final class l extends m {
    public final int e;

    public l(Field field0, boolean z, int v) {
        this.e = v;
        super(field0, z);
    }

    @Override  // S2.w
    public void a(Object[] arr_object) {
        if(this.e != 1) {
            super.a(arr_object);
            return;
        }
        j.f(arr_object, "args");
        a.b(this, arr_object);
        this.b(g.H(arr_object));
    }
}

