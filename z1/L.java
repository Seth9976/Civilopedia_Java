package z1;

import H1.b;
import H1.c;
import H1.d;

public final class l implements c {
    public static final l a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;

    static {
        l.a = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
        l.b = b.a("threads");
        l.c = b.a("exception");
        l.d = b.a("appExitInfo");
        l.e = b.a("signal");
        l.f = b.a("binaries");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(l.b, ((H)(((i0)object0))).a);
        ((d)object1).f(l.c, ((H)(((i0)object0))).b);
        ((d)object1).f(l.d, ((H)(((i0)object0))).c);
        ((d)object1).f(l.e, ((H)(((i0)object0))).d);
        ((d)object1).f(l.f, ((H)(((i0)object0))).e);
    }
}

