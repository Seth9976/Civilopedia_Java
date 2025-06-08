package W2;

import J2.j;
import U2.h;
import V3.a;
import v3.b;
import v3.c;
import y3.d;

public final class e implements a {
    public static final e i;

    static {
        e.i = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static X2.e a(X2.e e0) {
        v3.e e1 = d.g(e0);
        c c0 = (c)W2.d.k.get(e1);
        if(c0 == null) {
            throw new IllegalArgumentException("Given class " + e0 + " is not a read-only collection");
        }
        return C3.e.e(e0).i(c0);
    }

    public static X2.e b(c c0, h h0) {
        j.f(h0, "builtIns");
        v3.e e0 = c0.i();
        b b0 = (b)W2.d.h.get(e0);
        return b0 == null ? null : h0.i(b0.b());
    }

    @Override  // V3.a
    public Iterable h(Object object0) {
        return ((X2.c)object0).a().s();
    }
}

