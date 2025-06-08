package m2;

import I2.b;
import J2.j;
import J2.l;

public final class n extends l implements b {
    public static final n i;

    static {
        n.i = new n(1);  // 初始化器: LJ2/l;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((m2.j)object0), "it");
        return Boolean.valueOf(((m2.j)object0) instanceof h);
    }
}

