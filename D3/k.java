package d3;

import I2.b;
import J2.h;
import J2.j;
import O2.e;
import java.lang.reflect.Constructor;

public final class k extends h implements b {
    public static final k q;

    static {
        k.q = new k(1);  // 初始化器: LJ2/h;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((Constructor)object0), "p0");
        return new r(((Constructor)object0));
    }

    @Override  // J2.c
    public final e g() {
        return J2.r.a.b(r.class);
    }

    @Override  // J2.c, O2.b
    public final String getName() {
        return "<init>";
    }

    @Override  // J2.c
    public final String i() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }
}

