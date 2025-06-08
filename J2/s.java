package J2;

import O2.c;
import O2.f;
import O2.i;
import O2.p;

public class s {
    public f a(h h0) {
        return h0;
    }

    public c b(Class class0) {
        return new e(class0);
    }

    public O2.e c(String s, Class class0) {
        return new n(s, class0);
    }

    public i d(m m0) {
        return m0;
    }

    public p e(o o0) {
        return o0;
    }

    public String f(g g0) {
        String s = g0.getClass().getGenericInterfaces()[0].toString();
        return s.startsWith("kotlin.jvm.functions.") ? s.substring(21) : s;
    }

    public String g(l l0) {
        return this.f(l0);
    }
}

