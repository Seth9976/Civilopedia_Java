package R2;

import J2.j;
import O2.A;
import d3.d;
import g3.w;
import java.lang.reflect.Field;

public final class k extends A {
    public final Field i;

    public k(Field field0) {
        j.f(field0, "field");
        super();
        this.i = field0;
    }

    @Override  // O2.A
    public final String d() {
        String s = this.i.getName();
        j.e(s, "getName(...)");
        Class class0 = this.i.getType();
        j.e(class0, "getType(...)");
        return w.a(s) + "()" + d.b(class0);
    }
}

