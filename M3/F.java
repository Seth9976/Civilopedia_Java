package M3;

import I2.b;
import J2.j;
import J2.l;
import o2.G;

public final class f extends l implements b {
    public final int i;
    public static final f j;
    public static final f k;

    static {
        f.j = new f(1, 0);
        f.k = new f(1, 1);
    }

    public f(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        if(this.i != 0) {
            j.f(((w)object0), "it");
            return ((w)object0).toString();
        }
        ((Boolean)object0).getClass();
        return new e(G.p(O3.l.d));
    }
}

