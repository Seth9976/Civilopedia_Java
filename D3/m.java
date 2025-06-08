package d3;

import I2.b;
import J2.h;
import J2.j;
import J2.r;
import O2.e;
import java.lang.reflect.Field;

public final class m extends h implements b {
    public static final m q;

    static {
        m.q = new m(1);  // 初始化器: LJ2/h;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((Field)object0), "p0");
        return new u(((Field)object0));
    }

    @Override  // J2.c
    public final e g() {
        return r.a.b(u.class);
    }

    @Override  // J2.c, O2.b
    public final String getName() {
        return "<init>";
    }

    @Override  // J2.c
    public final String i() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }
}

