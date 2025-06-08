package z1;

import H1.b;
import H1.c;
import H1.d;

public final class j implements c {
    public static final j a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;

    static {
        j.a = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
        j.b = b.a("execution");
        j.c = b.a("customAttributes");
        j.d = b.a("internalKeys");
        j.e = b.a("background");
        j.f = b.a("uiOrientation");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(j.b, ((G)(((j0)object0))).a);
        ((d)object1).f(j.c, ((G)(((j0)object0))).b);
        ((d)object1).f(j.d, ((G)(((j0)object0))).c);
        ((d)object1).f(j.e, ((G)(((j0)object0))).d);
        ((d)object1).a(j.f, ((G)(((j0)object0))).e);
    }
}

