package R2;

import I2.a;
import J2.l;
import a3.v;

public final class p extends l implements a {
    public final int i;
    public final v j;

    public p(v v0, int v1) {
        this.i = v1;
        this.j = v0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        return this.j;
    }
}

