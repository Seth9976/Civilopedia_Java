package g3;

import J2.j;
import O2.A;
import Y3.n;
import v3.b;
import v3.c;

public abstract class w {
    public static final c a;
    public static final b b;

    static {
        c c0 = new c("kotlin.jvm.JvmField");
        w.a = c0;
        b.j(c0);
        b.j(new c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        w.b = b.e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String s) {
        j.f(s, "propertyName");
        return w.c(s) ? s : "get" + A.g(s);
    }

    public static final String b(String s) {
        String s1;
        StringBuilder stringBuilder0 = new StringBuilder("set");
        if(w.c(s)) {
            s1 = s.substring(2);
            j.e(s1, "substring(...)");
        }
        else {
            s1 = A.g(s);
        }
        stringBuilder0.append(s1);
        return stringBuilder0.toString();
    }

    public static final boolean c(String s) {
        j.f(s, "name");
        if(!n.H0(s, "is")) {
            return false;
        }
        if(s.length() == 2) {
            return false;
        }
        int v = s.charAt(2);
        return 97 >= v && 97 != v || v >= 0x7A && v != 0x7A;
    }
}

