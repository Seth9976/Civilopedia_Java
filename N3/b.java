package n3;

import M3.w;
import O3.l;
import X2.O;
import X2.e;
import java.util.Map;
import v3.c;

public final class b implements Y2.b {
    public static final b a;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // Y2.b
    public final c a() {
        e e0 = C3.e.d(this);
        if(e0 != null) {
            if(l.f(e0)) {
                e0 = null;
            }
            return e0 == null ? null : C3.e.c(e0);
        }
        return null;
    }

    @Override  // Y2.b
    public final Map b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override  // Y2.b
    public final w getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override  // Y2.b
    public final O q() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override
    public final String toString() {
        return "[EnhancedType]";
    }
}

