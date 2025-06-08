package R2;

import I2.a;
import J2.l;
import Y2.g;
import a3.K;

public final class j0 extends l implements a {
    public final int i;
    public final k0 j;

    public j0(k0 k00, int v) {
        this.i = v;
        this.j = k00;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        if(this.i != 0) {
            K k0 = this.j.t().t().e();
            return k0 == null ? y3.l.g(this.j.t().t(), g.a) : k0;
        }
        return android.support.v4.media.session.a.e(this.j, false);
    }
}

