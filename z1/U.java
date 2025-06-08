package z1;

import H1.b;
import H1.c;
import H1.d;

public final class u implements c {
    public static final u a;
    public static final b b;

    static {
        u.a = new u();  // 初始化器: Ljava/lang/Object;-><init>()V
        u.b = b.a("identifier");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(u.b, ((Q)(((o0)object0))).a);
    }
}

