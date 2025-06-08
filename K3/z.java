package k3;

import J2.j;
import V3.a;
import X2.e;
import X3.l;
import X3.o;
import java.util.Collection;
import x2.i;

public final class z implements a {
    public static final z i;

    static {
        z.i = new z();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // V3.a
    public final Iterable h(Object object0) {
        Collection collection0 = ((e)object0).B().r();
        j.e(collection0, "getSupertypes(...)");
        return new o(l.x0(i.L(collection0), k3.j.n), 0);
    }
}

