package k3;

import I2.a;
import J2.j;
import J2.l;
import X3.f;
import d3.c;
import d3.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import x2.g;
import x2.i;
import x2.k;
import x2.w;
import x2.z;

public final class m extends l implements a {
    public final int i;
    public final n j;

    public m(n n0, int v) {
        this.i = v;
        this.j = n0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        switch(this.i) {
            case 0: {
                Iterable iterable0 = this.j.o.b();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    if(((u)object0).a.isEnumConstant()) {
                        arrayList0.add(object0);
                    }
                }
                int v = w.q(k.E(arrayList0));
                if(v < 16) {
                    v = 16;
                }
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
                for(Object object1: arrayList0) {
                    linkedHashMap0.put(((u)object1).c(), object1);
                }
                return linkedHashMap0;
            }
            case 1: {
                Class[] arr_class = this.j.o.a.getDeclaredClasses();
                j.e(arr_class, "getDeclaredClasses(...)");
                return i.s0(X3.l.y0(X3.l.x0(new f(g.C(arr_class), false, c.l), c.m)));
            }
            default: {
                return z.w(this.j.c(), this.j.d());
            }
        }
    }
}

