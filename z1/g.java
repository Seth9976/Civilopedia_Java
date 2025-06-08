package z1;

import H1.b;
import H1.c;

public final class g implements c {
    public static final g a;

    static {
        g.a = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        b.a("clsId");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        if(object0 != null) {
            throw new ClassCastException();
        }
        throw null;
    }
}

