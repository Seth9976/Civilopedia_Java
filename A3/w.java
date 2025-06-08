package a3;

import F3.m;
import I2.a;
import J2.l;
import O2.q;
import X2.F;
import java.util.ArrayList;
import java.util.List;
import x2.i;
import x2.k;
import z1.a0;

public final class w extends l implements a {
    public final int i;
    public final x j;

    public w(x x0, int v) {
        this.i = v;
        this.j = x0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        switch(this.i) {
            case 0: {
                this.j.k.L0();
                return Boolean.valueOf(X2.w.h(((a3.l)this.j.k.s.getValue()), this.j.l));
            }
            case 1: {
                this.j.k.L0();
                return X2.w.i(((a3.l)this.j.k.s.getValue()), this.j.l);
            }
            default: {
                x x0 = this.j;
                q[] arr_q = x.p;
                if(((Boolean)android.support.v4.media.session.a.A(x0.n, arr_q[1])).booleanValue()) {
                    return m.b;
                }
                Iterable iterable0 = (List)android.support.v4.media.session.a.A(x0.m, arr_q[0]);
                ArrayList arrayList0 = new ArrayList(k.E(iterable0));
                for(Object object0: iterable0) {
                    arrayList0.add(((F)object0).x0());
                }
                ArrayList arrayList1 = i.f0(arrayList0, new M(x0.k, x0.l));
                return a0.j(("package view scope for " + x0.l + " in " + x0.k.getName()), arrayList1);
            }
        }
    }
}

