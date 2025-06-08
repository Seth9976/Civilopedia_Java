package n3;

import C3.e;
import I2.b;
import J2.j;
import J2.l;
import M3.Z;
import M3.w;
import W2.d;
import X2.c;
import X2.h;
import a3.v;
import l3.g;

public final class m extends l implements b {
    public final int i;
    public static final m j;
    public static final m k;
    public static final m l;
    public static final m m;

    static {
        m.j = new m(1, 0);
        m.k = new m(1, 1);
        m.l = new m(1, 2);
        m.m = new m(1, 3);
    }

    public m(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        boolean z = true;
        switch(this.i) {
            case 0: {
                h h0 = ((Z)object0).H0().q();
                if(h0 == null) {
                    return false;
                }
                if(!j.a(h0.getName(), d.f.f()) || !j.a(e.c(h0), d.f)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            case 1: {
                j.f(((c)object0), "it");
                v v0 = ((c)object0).J();
                j.c(v0);
                return v0.getType();
            }
            case 2: {
                j.f(((c)object0), "it");
                w w0 = ((c)object0).r();
                j.c(w0);
                return w0;
            }
            case 3: {
                j.f(((Z)object0), "it");
                return Boolean.valueOf(((Z)object0) instanceof g);
            }
            default: {
                j.f(((n)object0), "$this$function");
                ((n)object0).c("java/util/Spliterator", new n3.d[]{k.b, k.b});
                return w2.k.a;
            }
        }
    }
}

