package R2;

import I2.a;
import J2.l;

public final class c0 extends l implements a {
    public final int i;
    public final d0 j;

    public c0(d0 d00, int v) {
        this.i = v;
        this.j = d00;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        return this.i != 0 ? this.j.s() : new b0(this.j);
    }
}

