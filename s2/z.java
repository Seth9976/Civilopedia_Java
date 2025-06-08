package S2;

import J2.j;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

public abstract class z implements g {
    public final Method a;
    public final List b;
    public final Class c;

    public z(Method method0, List list0) {
        this.a = method0;
        this.b = list0;
        Class class0 = method0.getReturnType();
        j.e(class0, "getReturnType(...)");
        this.c = class0;
    }

    @Override  // S2.g
    public final Type r() {
        return this.c;
    }

    @Override  // S2.g
    public final List s() {
        return this.b;
    }

    @Override  // S2.g
    public final Member t() {
        return null;
    }
}

