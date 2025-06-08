package z1;

import H1.b;
import H1.c;
import H1.d;

public final class h implements c {
    public static final h a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;

    static {
        h.a = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
        h.b = b.a("arch");
        h.c = b.a("model");
        h.d = b.a("cores");
        h.e = b.a("ram");
        h.f = b.a("diskSpace");
        h.g = b.a("simulator");
        h.h = b.a("state");
        h.i = b.a("manufacturer");
        h.j = b.a("modelClass");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).a(h.b, ((E)(((c0)object0))).a);
        ((d)object1).f(h.c, ((E)(((c0)object0))).b);
        ((d)object1).a(h.d, ((E)(((c0)object0))).c);
        ((d)object1).b(h.e, ((E)(((c0)object0))).d);
        ((d)object1).b(h.f, ((E)(((c0)object0))).e);
        ((d)object1).c(h.g, ((E)(((c0)object0))).f);
        ((d)object1).a(h.h, ((E)(((c0)object0))).g);
        ((d)object1).f(h.i, ((E)(((c0)object0))).h);
        ((d)object1).f(h.j, ((E)(((c0)object0))).i);
    }
}

