package p0;

import H1.b;
import H1.c;
import H1.d;

public final class g implements c {
    public static final g a;
    public static final b b;
    public static final b c;

    static {
        g.a = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        g.b = b.a("networkType");
        g.c = b.a("mobileSubtype");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(g.b, ((n)(((v)object0))).a);
        ((d)object1).f(g.c, ((n)(((v)object0))).b);
    }
}

