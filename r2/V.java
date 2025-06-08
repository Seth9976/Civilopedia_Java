package R2;

import I2.a;
import I2.c;
import J2.l;
import X2.o;
import X2.p;

public final class v extends l implements a, c {
    public static final v i;
    public static final v j;

    static {
        v.i = new v(0);  // 初始化器: LJ2/l;-><init>(I)V
        v.j = new v(2);  // 初始化器: LJ2/l;-><init>(I)V
    }

    @Override  // I2.c
    public Object a(Object object0, Object object1) {
        Integer integer0 = p.b(((o)object0), ((o)object1));
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // I2.a
    public Object invoke() {
        return Object.class;
    }
}

