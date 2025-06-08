package p0;

import H1.b;
import H1.c;
import H1.d;

public final class f implements c {
    public static final f a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;

    static {
        f.a = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        f.b = b.a("requestTimeMs");
        f.c = b.a("requestUptimeMs");
        f.d = b.a("clientInfo");
        f.e = b.a("logSource");
        f.f = b.a("logSourceName");
        f.g = b.a("logEvent");
        f.h = b.a("qosTier");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).b(f.b, ((l)(((s)object0))).a);
        ((d)object1).b(f.c, ((l)(((s)object0))).b);
        ((d)object1).f(f.d, ((l)(((s)object0))).c);
        ((d)object1).f(f.e, ((l)(((s)object0))).d);
        ((d)object1).f(f.f, ((l)(((s)object0))).e);
        ((d)object1).f(f.g, ((l)(((s)object0))).f);
        ((d)object1).f(f.h, w.i);
    }
}

