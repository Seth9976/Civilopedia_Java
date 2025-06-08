package Q2;

import I2.c;
import I3.s;
import J2.h;
import J2.j;
import J2.r;
import O2.e;
import q3.y;

public final class a extends h implements c {
    public static final a q;

    static {
        a.q = new a(2);  // 初始化器: LJ2/h;-><init>(I)V
    }

    @Override  // I2.c
    public final Object a(Object object0, Object object1) {
        j.f(((s)object0), "p0");
        j.f(((y)object1), "p1");
        return ((s)object0).e(((y)object1));
    }

    @Override  // J2.c
    public final e g() {
        return r.a.b(s.class);
    }

    @Override  // J2.c, O2.b
    public final String getName() {
        return "loadFunction";
    }

    @Override  // J2.c
    public final String i() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }
}

