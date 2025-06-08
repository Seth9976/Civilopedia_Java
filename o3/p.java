package o3;

import I2.b;
import J2.j;
import J2.l;

public final class p extends l implements b {
    public static final p i;

    static {
        p.i = new p(1);  // 初始化器: LJ2/l;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((String)object0), "it");
        return ((String)object0).length() <= 1 ? ((String)object0) : "L" + ((String)object0) + ';';
    }
}

