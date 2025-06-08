package O2;

import I2.b;
import J2.i;
import J2.j;

public final class z extends i implements b {
    public static final z q;

    static {
        z.q = new z(Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);  // 初始化器: LJ2/i;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((Class)object0), "p0");
        return ((Class)object0).getComponentType();
    }
}

