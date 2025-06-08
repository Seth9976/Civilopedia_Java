package z1;

import H1.b;
import H1.c;

public final class d implements c {
    public static final d a;
    public static final b b;
    public static final b c;

    static {
        d.a = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d.b = b.a("files");
        d.c = b.a("orgId");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((H1.d)object1).f(d.b, ((y)(((Z)object0))).a);
        ((H1.d)object1).f(d.c, ((y)(((Z)object0))).b);
    }
}

