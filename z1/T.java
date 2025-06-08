package z1;

import H1.b;
import H1.c;
import H1.d;

public final class t implements c {
    public static final t a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;

    static {
        t.a = new t();  // 初始化器: Ljava/lang/Object;-><init>()V
        t.b = b.a("platform");
        t.c = b.a("version");
        t.d = b.a("buildVersion");
        t.e = b.a("jailbroken");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).a(t.b, ((P)(((n0)object0))).a);
        ((d)object1).f(t.c, ((P)(((n0)object0))).b);
        ((d)object1).f(t.d, ((P)(((n0)object0))).c);
        ((d)object1).c(t.e, ((P)(((n0)object0))).d);
    }
}

