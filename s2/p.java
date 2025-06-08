package S2;

import J2.j;
import java.lang.reflect.Field;
import x2.g;

public final class p extends q {
    public final int g;

    public p(Field field0, boolean z, boolean z1, int v) {
        this.g = v;
        super(field0, z, z1);
    }

    @Override  // S2.q
    public void a(Object[] arr_object) {
        if(this.g != 1) {
            super.a(arr_object);
            return;
        }
        j.f(arr_object, "args");
        super.a(arr_object);
        this.b(g.H(arr_object));
    }
}

