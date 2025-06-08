package I3;

import E1.d;
import I2.a;
import J2.l;
import X2.k;
import java.util.List;
import q3.G;
import x2.i;
import x2.r;

public final class p extends l implements a {
    public final s i;
    public final boolean j;
    public final G k;

    public p(s s0, boolean z, G g0) {
        this.i = s0;
        this.j = z;
        this.k = g0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        List list0;
        s s0 = this.i;
        v v0 = s0.a(((k)s0.a.k));
        if(v0 == null) {
            list0 = null;
        }
        else {
            d d0 = s0.a;
            G g0 = this.k;
            list0 = this.j ? i.o0(((I3.i)d0.i).e.e(v0, g0)) : i.o0(((I3.i)d0.i).e.f(v0, g0));
        }
        return list0 == null ? r.i : list0;
    }
}

