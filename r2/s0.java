package R2;

import I2.a;
import java.lang.ref.SoftReference;
import t1.c;

public final class s0 implements a {
    public final a i;
    public volatile SoftReference j;
    public static final c k;

    static {
        s0.k = new c(5);
    }

    public s0(X2.c c0, a a0) {
        if(a0 == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'initializer\' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        super();
        this.j = null;
        this.i = a0;
        if(c0 != null) {
            this.j = new SoftReference(c0);
        }
    }

    @Override  // I2.a
    public final Object invoke() {
        SoftReference softReference0 = this.j;
        c c0 = s0.k;
        if(softReference0 != null) {
            Object object0 = softReference0.get();
            if(object0 != null) {
                return object0 == c0 ? null : object0;
            }
        }
        Object object1 = this.i.invoke();
        if(object1 != null) {
            c0 = object1;
        }
        this.j = new SoftReference(c0);
        return object1;
    }
}

