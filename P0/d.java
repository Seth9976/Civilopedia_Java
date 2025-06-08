package p0;

import H1.b;
import H1.c;

public final class d implements c {
    public static final d a;
    public static final b b;
    public static final b c;

    static {
        d.a = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d.b = b.a("clientType");
        d.c = b.a("androidClientInfo");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((j)(((q)object0))).getClass();
        ((H1.d)object1).f(d.b, p.i);
        ((H1.d)object1).f(d.c, ((j)(((q)object0))).a);
    }
}

