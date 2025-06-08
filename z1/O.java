package z1;

import H1.b;
import H1.c;
import H1.d;

public final class o implements c {
    public static final o a;
    public static final b b;
    public static final b c;
    public static final b d;

    static {
        o.a = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
        o.b = b.a("name");
        o.c = b.a("importance");
        o.d = b.a("frames");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(o.b, ((L)(((h0)object0))).a);
        ((d)object1).a(o.c, ((L)(((h0)object0))).b);
        ((d)object1).f(o.d, ((L)(((h0)object0))).c);
    }
}

