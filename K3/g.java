package k3;

import I2.a;
import J2.l;
import X2.T;
import X2.w;
import d3.C;
import j3.e;
import java.util.ArrayList;
import x2.k;

public final class g extends l implements a {
    public final int i;
    public final i j;

    public g(i i0, int v) {
        this.i = v;
        this.j = i0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        switch(this.i) {
            case 0: {
                return w.c(this.j);
            }
            case 1: {
                i i1 = this.j;
                ArrayList arrayList0 = i1.p.u();
                ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
                for(Object object0: arrayList0) {
                    C c0 = (C)object0;
                    T t0 = ((e)i1.r.k).a(c0);
                    if(t0 == null) {
                        throw new AssertionError("Parameter " + c0 + " surely belongs to class " + i1.p + ", so it must be resolved");
                    }
                    arrayList1.add(t0);
                }
                return arrayList1;
            }
            default: {
                i i0 = this.j;
                if(C3.e.f(i0) != null) {
                    ((j3.a)i0.o.j).w.getClass();
                }
                return null;
            }
        }
    }
}

