package y3;

import I2.c;
import J2.l;
import X2.k;

public final class a extends l implements c {
    public final int i;
    public static final a j;
    public static final a k;

    static {
        a.j = new a(2, 0);
        a.k = new a(2, 1);
    }

    public a(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.c
    public final Object a(Object object0, Object object1) {
        if(this.i != 0) {
            k k0 = (k)object0;
            k k1 = (k)object1;
            return false;
        }
        k k2 = (k)object0;
        k k3 = (k)object1;
        return false;
    }
}

