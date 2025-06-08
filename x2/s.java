package X2;

import I2.b;
import J2.j;
import J2.l;
import a3.C;
import java.util.List;
import x2.i;

public final class s extends l implements b {
    public final int i;
    public static final s j;
    public static final s k;
    public static final s l;
    public static final s m;
    public static final s n;

    static {
        s.j = new s(1, 0);
        s.k = new s(1, 1);
        s.l = new s(1, 2);
        s.m = new s(1, 3);
        s.n = new s(1, 4);
    }

    public s(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        switch(this.i) {
            case 0: {
                j.f(((v3.b)object0), "it");
                return 0;
            }
            case 1: {
                j.f(((F)object0), "it");
                return ((C)(((F)object0))).m;
            }
            case 2: {
                j.f(((k)object0), "it");
                return Boolean.valueOf(((k)object0) instanceof X2.b);
            }
            case 3: {
                j.f(((k)object0), "it");
                return Boolean.valueOf(!(((k)object0) instanceof X2.j));
            }
            default: {
                j.f(((k)object0), "it");
                List list0 = ((X2.b)(((k)object0))).u();
                j.e(list0, "getTypeParameters(...)");
                return i.L(list0);
            }
        }
    }
}

