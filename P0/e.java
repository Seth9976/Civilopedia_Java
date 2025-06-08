package p0;

import H1.b;
import H1.c;
import H1.d;

public final class e implements c {
    public static final e a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;

    static {
        e.a = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        e.b = b.a("eventTimeMs");
        e.c = b.a("eventCode");
        e.d = b.a("eventUptimeMs");
        e.e = b.a("sourceExtension");
        e.f = b.a("sourceExtensionJsonProto3");
        e.g = b.a("timezoneOffsetSeconds");
        e.h = b.a("networkConnectionInfo");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).b(e.b, ((k)(((r)object0))).a);
        ((d)object1).f(e.c, ((k)(((r)object0))).b);
        ((d)object1).b(e.d, ((k)(((r)object0))).c);
        ((d)object1).f(e.e, ((k)(((r)object0))).d);
        ((d)object1).f(e.f, ((k)(((r)object0))).e);
        ((d)object1).b(e.g, ((k)(((r)object0))).f);
        ((d)object1).f(e.h, ((k)(((r)object0))).g);
    }
}

