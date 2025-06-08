package z1;

import H1.b;
import H1.c;
import H1.d;

public final class q implements c {
    public static final q a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;

    static {
        q.a = new q();  // 初始化器: Ljava/lang/Object;-><init>()V
        q.b = b.a("batteryLevel");
        q.c = b.a("batteryVelocity");
        q.d = b.a("proximityOn");
        q.e = b.a("orientation");
        q.f = b.a("ramUsed");
        q.g = b.a("diskUsed");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(q.b, ((N)(((k0)object0))).a);
        ((d)object1).a(q.c, ((N)(((k0)object0))).b);
        ((d)object1).c(q.d, ((N)(((k0)object0))).c);
        ((d)object1).a(q.e, ((N)(((k0)object0))).d);
        ((d)object1).b(q.f, ((N)(((k0)object0))).e);
        ((d)object1).b(q.g, ((N)(((k0)object0))).f);
    }
}

