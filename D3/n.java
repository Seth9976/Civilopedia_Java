package d3;

import I2.b;
import J2.h;
import J2.j;
import J2.r;
import O2.e;
import java.lang.reflect.Method;

public final class n extends h implements b {
    public static final n q;

    static {
        n.q = new n(1);  // 初始化器: LJ2/h;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((Method)object0), "p0");
        return new x(((Method)object0));
    }

    @Override  // J2.c
    public final e g() {
        return r.a.b(x.class);
    }

    @Override  // J2.c, O2.b
    public final String getName() {
        return "<init>";
    }

    @Override  // J2.c
    public final String i() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }
}

