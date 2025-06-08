package q0;

import H1.b;
import H1.c;
import K1.a;
import java.util.Collections;
import java.util.HashMap;
import t0.e;

public final class d implements c {
    public static final d a;
    public static final b b;
    public static final b c;

    static {
        d.a = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        a a0 = new a(1);
        HashMap hashMap0 = new HashMap();
        hashMap0.put(K1.d.class, a0);
        d.b = new b("logSource", Collections.unmodifiableMap(new HashMap(hashMap0)));
        a a1 = new a(2);
        HashMap hashMap1 = new HashMap();
        hashMap1.put(K1.d.class, a1);
        d.c = new b("logEventDropped", Collections.unmodifiableMap(new HashMap(hashMap1)));
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((H1.d)object1).f(d.b, ((e)object0).a);
        ((H1.d)object1).f(d.c, ((e)object0).b);
    }
}

