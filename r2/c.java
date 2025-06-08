package R2;

import J2.j;
import J2.l;
import java.util.concurrent.ConcurrentHashMap;

public abstract class c {
    public static final B.c a;
    public static final B.c b;

    static {
        c.a = new B.c(b.j);
        c.b = new B.c(b.k);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static final A a(Class class0) {
        j.f(class0, "jClass");
        B.c c0 = c.a;
        c0.getClass();
        ConcurrentHashMap concurrentHashMap0 = (ConcurrentHashMap)c0.k;
        Object object0 = concurrentHashMap0.get(class0);
        if(object0 == null) {
            Object object1 = ((I2.b)(((l)c0.j))).b(class0);
            Object object2 = concurrentHashMap0.putIfAbsent(class0, object1);
            object0 = object2 == null ? object1 : object2;
        }
        j.d(object0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (A)object0;
    }
}

