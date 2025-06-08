package z1;

import H1.b;
import H1.c;
import H1.d;

public final class r implements c {
    public static final r a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;

    static {
        r.a = new r();  // 初始化器: Ljava/lang/Object;-><init>()V
        r.b = b.a("timestamp");
        r.c = b.a("type");
        r.d = b.a("app");
        r.e = b.a("device");
        r.f = b.a("log");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).b(r.b, ((F)(((m0)object0))).a);
        ((d)object1).f(r.c, ((F)(((m0)object0))).b);
        ((d)object1).f(r.d, ((F)(((m0)object0))).c);
        ((d)object1).f(r.e, ((F)(((m0)object0))).d);
        ((d)object1).f(r.f, ((F)(((m0)object0))).e);
    }
}

