package d3;

import I2.b;
import J2.h;
import J2.j;
import J2.r;
import O2.e;
import java.lang.reflect.Member;

public final class l extends h implements b {
    public static final l q;

    static {
        l.q = new l(1);  // 初始化器: LJ2/h;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((Member)object0), "p0");
        return Boolean.valueOf(((Member)object0).isSynthetic());
    }

    @Override  // J2.c
    public final e g() {
        return r.a.b(Member.class);
    }

    @Override  // J2.c, O2.b
    public final String getName() {
        return "isSynthetic";
    }

    @Override  // J2.c
    public final String i() {
        return "isSynthetic()Z";
    }
}

