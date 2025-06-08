package z1;

import H1.c;
import H1.d;

public final class b implements c {
    public static final b a;
    public static final H1.b b;
    public static final H1.b c;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        b.b = H1.b.a("key");
        b.c = H1.b.a("value");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(b.b, ((x)(((X)object0))).a);
        ((d)object1).f(b.c, ((x)(((X)object0))).b);
    }
}

