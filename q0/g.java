package q0;

import H1.b;
import H1.c;
import K1.a;
import K1.d;
import java.util.Collections;
import java.util.HashMap;

public final class g implements c {
    public static final g a;
    public static final b b;
    public static final b c;

    static {
        g.a = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        a a0 = new a(1);
        HashMap hashMap0 = new HashMap();
        hashMap0.put(d.class, a0);
        g.b = new b("startMs", Collections.unmodifiableMap(new HashMap(hashMap0)));
        a a1 = new a(2);
        HashMap hashMap1 = new HashMap();
        hashMap1.put(d.class, a1);
        g.c = new b("endMs", Collections.unmodifiableMap(new HashMap(hashMap1)));
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((H1.d)object1).b(g.b, ((t0.g)object0).a);
        ((H1.d)object1).b(g.c, ((t0.g)object0).b);
    }
}

