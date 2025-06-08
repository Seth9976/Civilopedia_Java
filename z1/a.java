package z1;

import H1.b;
import H1.c;
import H1.d;

public final class a implements c {
    public static final a a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a.b = b.a("pid");
        a.c = b.a("processName");
        a.d = b.a("reasonCode");
        a.e = b.a("importance");
        a.f = b.a("pss");
        a.g = b.a("rss");
        a.h = b.a("timestamp");
        a.i = b.a("traceFile");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).a(a.b, ((w)(((W)object0))).a);
        ((d)object1).f(a.c, ((w)(((W)object0))).b);
        ((d)object1).a(a.d, ((w)(((W)object0))).c);
        ((d)object1).a(a.e, ((w)(((W)object0))).d);
        ((d)object1).b(a.f, ((w)(((W)object0))).e);
        ((d)object1).b(a.g, ((w)(((W)object0))).f);
        ((d)object1).b(a.h, ((w)(((W)object0))).g);
        ((d)object1).f(a.i, ((w)(((W)object0))).h);
    }
}

