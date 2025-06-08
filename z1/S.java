package z1;

import H1.b;
import H1.c;
import H1.d;

public final class s implements c {
    public static final s a;
    public static final b b;

    static {
        s.a = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
        s.b = b.a("content");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(s.b, ((O)(((l0)object0))).a);
    }
}

