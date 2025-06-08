package q0;

import H1.b;
import K1.a;
import K1.d;
import java.util.Collections;
import java.util.HashMap;

public final class c implements H1.c {
    public static final c a;
    public static final b b;
    public static final b c;

    static {
        c.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        a a0 = new a(1);
        HashMap hashMap0 = new HashMap();
        hashMap0.put(d.class, a0);
        c.b = new b("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(hashMap0)));
        a a1 = new a(3);
        HashMap hashMap1 = new HashMap();
        hashMap1.put(d.class, a1);
        c.c = new b("reason", Collections.unmodifiableMap(new HashMap(hashMap1)));
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((H1.d)object1).b(c.b, ((t0.d)object0).a);
        ((H1.d)object1).f(c.c, ((t0.d)object0).b);
    }
}

