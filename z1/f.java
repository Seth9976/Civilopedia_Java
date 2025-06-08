package z1;

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
        f.b = b.a("identifier");
        f.c = b.a("version");
        f.d = b.a("displayVersion");
        f.e = b.a("organization");
        f.f = b.a("installationUuid");
        f.g = b.a("developmentPlatform");
        f.h = b.a("developmentPlatformVersion");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(f.b, ((C)(((b0)object0))).a);
        ((d)object1).f(f.c, ((C)(((b0)object0))).b);
        ((d)object1).f(f.d, ((C)(((b0)object0))).c);
        ((d)object1).f(f.e, null);
        ((d)object1).f(f.f, ((C)(((b0)object0))).d);
        ((d)object1).f(f.g, ((C)(((b0)object0))).e);
        ((d)object1).f(f.h, ((C)(((b0)object0))).f);
    }
}

