package p0;

import H1.b;
import H1.d;

public final class c implements H1.c {
    public static final c a;
    public static final b b;

    static {
        c.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        c.b = b.a("logRequest");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(c.b, ((i)(((o)object0))).a);
    }
}

