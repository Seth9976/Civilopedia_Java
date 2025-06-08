package q0;

import H1.b;
import H1.c;
import K1.a;
import K1.d;
import java.util.Collections;
import java.util.HashMap;

public final class f implements c {
    public static final f a;
    public static final b b;
    public static final b c;

    static {
        f.a = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        a a0 = new a(1);
        HashMap hashMap0 = new HashMap();
        hashMap0.put(d.class, a0);
        f.b = new b("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap0)));
        a a1 = new a(2);
        HashMap hashMap1 = new HashMap();
        hashMap1.put(d.class, a1);
        f.c = new b("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap1)));
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((H1.d)object1).b(f.b, ((t0.f)object0).a);
        ((H1.d)object1).b(f.c, ((t0.f)object0).b);
    }
}

