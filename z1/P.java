package z1;

import H1.b;
import H1.c;
import H1.d;

public final class p implements c {
    public static final p a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;

    static {
        p.a = new p();  // 初始化器: Ljava/lang/Object;-><init>()V
        p.b = b.a("pc");
        p.c = b.a("symbol");
        p.d = b.a("file");
        p.e = b.a("offset");
        p.f = b.a("importance");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).b(p.b, ((M)(((g0)object0))).a);
        ((d)object1).f(p.c, ((M)(((g0)object0))).b);
        ((d)object1).f(p.d, ((M)(((g0)object0))).c);
        ((d)object1).b(p.e, ((M)(((g0)object0))).d);
        ((d)object1).a(p.f, ((M)(((g0)object0))).e);
    }
}

