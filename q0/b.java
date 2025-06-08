package q0;

import H1.c;
import K1.a;
import K1.d;
import java.util.Collections;
import java.util.HashMap;

public final class b implements c {
    public static final b a;
    public static final H1.b b;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        a a0 = new a(1);
        HashMap hashMap0 = new HashMap();
        hashMap0.put(d.class, a0);
        b.b = new H1.b("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap0)));
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((H1.d)object1).f(b.b, ((t0.b)object0).a);
    }
}

