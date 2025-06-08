package q0;

import H1.b;
import H1.c;
import K1.d;
import java.util.Collections;
import java.util.HashMap;

public final class a implements c {
    public static final a a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        K1.a a0 = new K1.a(1);
        HashMap hashMap0 = new HashMap();
        hashMap0.put(d.class, a0);
        a.b = new b("window", Collections.unmodifiableMap(new HashMap(hashMap0)));
        K1.a a1 = new K1.a(2);
        HashMap hashMap1 = new HashMap();
        hashMap1.put(d.class, a1);
        a.c = new b("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap1)));
        K1.a a2 = new K1.a(3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d.class, a2);
        a.d = new b("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)));
        K1.a a3 = new K1.a(4);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(d.class, a3);
        a.e = new b("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap3)));
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((H1.d)object1).f(a.b, ((t0.a)object0).a);
        ((H1.d)object1).f(a.c, ((t0.a)object0).b);
        ((H1.d)object1).f(a.d, ((t0.a)object0).c);
        ((H1.d)object1).f(a.e, ((t0.a)object0).d);
    }
}

