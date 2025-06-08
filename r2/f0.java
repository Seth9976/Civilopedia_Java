package R2;

import I2.a;
import J2.l;

public final class f0 extends l implements a {
    public final int i;
    public final a0 j;

    public f0(a0 a00, int v) {
        this.i = v;
        this.j = a00;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        return this.i != 0 ? this.j.s() : new e0(this.j);
    }
}

