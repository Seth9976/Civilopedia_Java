package n2;

import I2.b;
import J2.j;
import J2.l;

public final class z extends l implements b {
    public final int i;
    public static final z j;
    public static final z k;

    static {
        z.j = new z(1, 0);
        z.k = new z(1, 1);
    }

    public z(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        if(this.i != 0) {
            j.f(((a)object0), "it");
            return Boolean.valueOf(((a)object0).e);
        }
        return (int)(((Number)object0).intValue() + 1);
    }
}

