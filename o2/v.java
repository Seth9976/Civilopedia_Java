package O2;

import I2.b;
import J2.i;
import J2.j;
import java.lang.reflect.Type;

public final class v extends i implements b {
    public static final v q;

    static {
        v.q = new v(A.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);  // 初始化器: LJ2/i;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((Type)object0), "p0");
        return A.a(((Type)object0));
    }
}

