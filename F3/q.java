package F3;

import I2.a;
import J2.l;
import a3.L;
import x2.j;

public final class q extends l implements a {
    public final int i;
    public final r j;

    public q(r r0, int v) {
        this.i = v;
        this.j = r0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        r r0 = this.j;
        if(this.i != 0) {
            return r0.c ? j.A(y3.l.h(r0.b)) : x2.r.i;
        }
        return j.z(new L[]{y3.l.i(r0.b), y3.l.j(r0.b)});
    }
}

