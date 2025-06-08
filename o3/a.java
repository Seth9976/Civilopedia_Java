package o3;

import I2.c;
import J2.j;
import J2.l;
import x2.r;

public final class a extends l implements I2.a, c {
    public final int i;
    public static final a j;
    public static final a k;
    public static final a l;

    static {
        a.j = new a(2, 0);
        a.k = new a(2, 1);
        a.l = new a(0, 2);
    }

    public a(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.c
    public Object a(Object object0, Object object1) {
        if(this.i != 0) {
            j.f(((o3.c)object0), "$this$loadConstantFromProperty");
            j.f(((o)object1), "it");
            return ((o3.c)object0).b.get(((o)object1));
        }
        j.f(((o3.c)object0), "$this$loadConstantFromProperty");
        j.f(((o)object1), "it");
        return ((o3.c)object0).c.get(((o)object1));
    }

    @Override  // I2.a
    public Object invoke() {
        return r.i;
    }
}

