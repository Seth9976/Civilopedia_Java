package z1;

import H1.b;
import H1.c;
import H1.d;

public final class n implements c {
    public static final n a;
    public static final b b;
    public static final b c;
    public static final b d;

    static {
        n.a = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
        n.b = b.a("name");
        n.c = b.a("code");
        n.d = b.a("address");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(n.b, ((K)(((f0)object0))).a);
        ((d)object1).f(n.c, ((K)(((f0)object0))).b);
        ((d)object1).b(n.d, ((K)(((f0)object0))).c);
    }
}

