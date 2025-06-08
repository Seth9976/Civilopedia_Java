package U2;

import J2.j;
import J2.l;
import L3.m;
import java.util.ServiceLoader;
import x2.i;

public final class a extends l implements I2.a {
    public final int i;
    public static final a j;
    public static final a k;

    static {
        a.j = new a(0, 0);
        a.k = new a(0, 1);
    }

    public a(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.a
    public final Object invoke() {
        if(this.i != 0) {
            e e0 = new e(new m("DefaultBuiltIns"));  // 初始化器: LU2/h;-><init>(LL3/m;)V
            e0.c();
            return e0;
        }
        ServiceLoader serviceLoader0 = ServiceLoader.load(c.class, c.class.getClassLoader());
        j.c(serviceLoader0);
        c c0 = (c)i.T(serviceLoader0);
        if(c0 == null) {
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }
        return c0;
    }
}

