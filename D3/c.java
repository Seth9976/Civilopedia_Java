package d3;

import I2.b;
import J2.j;
import J2.l;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import v3.f;
import x2.g;

public final class c extends l implements b {
    public final int i;
    public static final c j;
    public static final c k;
    public static final c l;
    public static final c m;

    static {
        c.j = new c(1, 0);
        c.k = new c(1, 1);
        c.l = new c(1, 2);
        c.m = new c(1, 3);
    }

    public c(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        switch(this.i) {
            case 0: {
                j.f(((ParameterizedType)object0), "it");
                Type type0 = ((ParameterizedType)object0).getOwnerType();
                return type0 instanceof ParameterizedType ? ((ParameterizedType)type0) : null;
            }
            case 1: {
                j.f(((ParameterizedType)object0), "it");
                Type[] arr_type = ((ParameterizedType)object0).getActualTypeArguments();
                j.e(arr_type, "getActualTypeArguments(...)");
                return g.C(arr_type);
            }
            case 2: {
                return ((Class)object0).getSimpleName().length() == 0;
            }
            default: {
                String s = ((Class)object0).getSimpleName();
                if(!f.f(s)) {
                    s = null;
                }
                return s == null ? null : f.e(s);
            }
        }
    }
}

