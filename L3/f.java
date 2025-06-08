package l3;

import I2.b;
import J2.j;
import J2.l;

public final class f extends l implements b {
    public static final f i;

    static {
        f.i = new f(1);  // 初始化器: LJ2/l;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((String)object0), "it");
        return "(raw) " + ((String)object0);
    }
}

