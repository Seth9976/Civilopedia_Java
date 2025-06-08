package z1;

import H1.b;
import H1.c;
import H1.d;

public final class m implements c {
    public static final m a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;

    static {
        m.a = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
        m.b = b.a("type");
        m.c = b.a("reason");
        m.d = b.a("frames");
        m.e = b.a("causedBy");
        m.f = b.a("overflowCount");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(m.b, ((J)(((e0)object0))).a);
        ((d)object1).f(m.c, ((J)(((e0)object0))).b);
        ((d)object1).f(m.d, ((J)(((e0)object0))).c);
        ((d)object1).f(m.e, ((J)(((e0)object0))).d);
        ((d)object1).a(m.f, ((J)(((e0)object0))).e);
    }
}

