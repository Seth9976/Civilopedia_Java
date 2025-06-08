package R2;

import I2.a;
import J2.l;
import Y2.g;
import a3.J;

public final class h0 extends l implements a {
    public final int i;
    public final i0 j;

    public h0(i0 i00, int v) {
        this.i = v;
        this.j = i00;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        if(this.i != 0) {
            J j0 = this.j.t().t().d();
            return j0 == null ? y3.l.f(this.j.t().t(), g.a) : j0;
        }
        return android.support.v4.media.session.a.e(this.j, true);
    }
}

