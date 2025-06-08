package z1;

import H1.b;
import H1.c;
import H1.d;

public final class e implements c {
    public static final e a;
    public static final b b;
    public static final b c;

    static {
        e.a = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        e.b = b.a("filename");
        e.c = b.a("contents");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(e.b, ((z)(((Y)object0))).a);
        ((d)object1).f(e.c, ((z)(((Y)object0))).b);
    }
}

