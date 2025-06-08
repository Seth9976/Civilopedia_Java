package k3;

import F3.n;
import I2.b;
import J2.l;
import X2.e;
import X2.h;
import a3.L;
import d3.w;
import java.lang.reflect.Modifier;

public final class j extends l implements b {
    public final int i;
    public static final j j;
    public static final j k;
    public static final j l;
    public static final j m;
    public static final j n;

    static {
        j.j = new j(1, 0);
        j.k = new j(1, 1);
        j.l = new j(1, 2);
        j.m = new j(1, 3);
        j.n = new j(1, 4);
    }

    public j(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        switch(this.i) {
            case 0: {
                J2.j.f(((w)object0), "it");
                return Boolean.valueOf(!Modifier.isStatic(((w)object0).b().getModifiers()));
            }
            case 1: {
                J2.j.f(((L)object0), "$this$selectMostSpecificInEachOverridableGroup");
                return (L)object0;
            }
            case 2: {
                J2.j.f(((w)object0), "it");
                return Boolean.valueOf(Modifier.isStatic(((w)object0).b().getModifiers()));
            }
            case 3: {
                J2.j.f(((n)object0), "it");
                return ((n)object0).d();
            }
            default: {
                h h0 = ((M3.w)object0).H0().q();
                return h0 instanceof e ? ((e)h0) : null;
            }
        }
    }
}

