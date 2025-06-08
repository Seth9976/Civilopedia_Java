package X2;

import I2.b;
import J2.h;
import J2.j;
import O2.e;

public final class r extends h implements b {
    public static final r q;

    static {
        r.q = new r(1);  // 初始化器: LJ2/h;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((v3.b)object0), "p0");
        return ((v3.b)object0).f();
    }

    @Override  // J2.c
    public final e g() {
        return J2.r.a.b(v3.b.class);
    }

    @Override  // J2.c, O2.b
    public final String getName() {
        return "getOuterClassId";
    }

    @Override  // J2.c
    public final String i() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }
}

