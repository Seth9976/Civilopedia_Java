package z1;

import H1.b;
import H1.c;
import H1.d;

public final class i implements c {
    public static final i a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;

    static {
        i.a = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
        i.b = b.a("generator");
        i.c = b.a("identifier");
        i.d = b.a("startedAt");
        i.e = b.a("endedAt");
        i.f = b.a("crashed");
        i.g = b.a("app");
        i.h = b.a("user");
        i.i = b.a("os");
        i.j = b.a("device");
        i.k = b.a("events");
        i.l = b.a("generatorType");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(i.b, ((B)(((p0)object0))).a);
        ((d)object1).f(i.c, ((B)(((p0)object0))).b.getBytes(q0.a));
        ((d)object1).b(i.d, ((B)(((p0)object0))).c);
        ((d)object1).f(i.e, ((B)(((p0)object0))).d);
        ((d)object1).c(i.f, ((B)(((p0)object0))).e);
        ((d)object1).f(i.g, ((B)(((p0)object0))).f);
        ((d)object1).f(i.h, ((B)(((p0)object0))).g);
        ((d)object1).f(i.i, ((B)(((p0)object0))).h);
        ((d)object1).f(i.j, ((B)(((p0)object0))).i);
        ((d)object1).f(i.k, ((B)(((p0)object0))).j);
        ((d)object1).a(i.l, ((B)(((p0)object0))).k);
    }
}

