package y3;

import X2.M;
import X2.S;
import X2.e;
import X2.j;
import X2.k;
import X2.u;
import java.util.Comparator;
import o2.C;
import v3.f;

public final class g implements Comparator {
    public final int i;
    public static final g j;

    static {
        g.j = new g(0);
    }

    public g(int v) {
        this.i = v;
        super();
    }

    public static int a(k k0) {
        if(d.n(k0)) {
            return 8;
        }
        if(k0 instanceof j) {
            return 7;
        }
        if(k0 instanceof M) {
            return ((M)k0).J() == null ? 6 : 5;
        }
        if(k0 instanceof u) {
            return ((u)k0).J() == null ? 4 : 3;
        }
        if(k0 instanceof e) {
            return 2;
        }
        return k0 instanceof S ? 1 : 0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        Integer integer0;
        if(this.i != 0) {
            return C.c(C3.e.g(((e)object0)).b(), C3.e.g(((e)object1)).b());
        }
        int v = g.a(((k)object1)) - g.a(((k)object0));
        if(v != 0) {
            integer0 = v;
            return integer0 == null ? 0 : ((int)integer0);
        }
        if(d.n(((k)object0)) && d.n(((k)object1))) {
            return 0;
        }
        f f0 = ((k)object0).getName();
        f f1 = ((k)object1).getName();
        int v1 = f0.i.compareTo(f1.i);
        integer0 = v1 == 0 ? null : v1;
        return integer0 == null ? 0 : ((int)integer0);
    }
}

