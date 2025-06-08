package F3;

import I2.b;
import J2.j;
import J2.l;
import X2.M;
import a3.L;
import v3.f;

public final class k extends l implements b {
    public final int i;
    public static final k j;
    public static final k k;
    public static final k l;
    public static final k m;

    static {
        k.j = new k(1, 0);
        k.k = new k(1, 1);
        k.l = new k(1, 2);
        k.m = new k(1, 3);
    }

    public k(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        switch(this.i) {
            case 0: {
                j.f(((f)object0), "it");
                return true;
            }
            case 1: {
                j.f(((X2.b)object0), "$this$selectMostSpecificInEachOverridableGroup");
                return (X2.b)object0;
            }
            case 2: {
                j.f(((L)object0), "$this$selectMostSpecificInEachOverridableGroup");
                return (L)object0;
            }
            default: {
                j.f(((M)object0), "$this$selectMostSpecificInEachOverridableGroup");
                return (M)object0;
            }
        }
    }
}

