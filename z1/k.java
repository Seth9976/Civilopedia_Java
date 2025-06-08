package z1;

import H1.b;
import H1.c;
import H1.d;

public final class k implements c {
    public static final k a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;

    static {
        k.a = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
        k.b = b.a("baseAddress");
        k.c = b.a("size");
        k.d = b.a("name");
        k.e = b.a("uuid");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).b(k.b, ((I)(((d0)object0))).a);
        ((d)object1).b(k.c, ((I)(((d0)object0))).b);
        ((d)object1).f(k.d, ((I)(((d0)object0))).c);
        String s = ((I)(((d0)object0))).d;
        ((d)object1).f(k.e, (s == null ? null : s.getBytes(q0.a)));
    }
}

