package z1;

import H1.b;
import H1.d;

public final class c implements H1.c {
    public static final c a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;

    static {
        c.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        c.b = b.a("sdkVersion");
        c.c = b.a("gmpAppId");
        c.d = b.a("platform");
        c.e = b.a("installationUuid");
        c.f = b.a("buildVersion");
        c.g = b.a("displayVersion");
        c.h = b.a("session");
        c.i = b.a("ndkPayload");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(c.b, ((v)(((q0)object0))).b);
        ((d)object1).f(c.c, ((v)(((q0)object0))).c);
        ((d)object1).a(c.d, ((v)(((q0)object0))).d);
        ((d)object1).f(c.e, ((v)(((q0)object0))).e);
        ((d)object1).f(c.f, ((v)(((q0)object0))).f);
        ((d)object1).f(c.g, ((v)(((q0)object0))).g);
        ((d)object1).f(c.h, ((v)(((q0)object0))).h);
        ((d)object1).f(c.i, ((v)(((q0)object0))).i);
    }
}

