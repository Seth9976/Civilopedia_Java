package U2;

import I2.a;
import J2.l;

public final class i extends l implements a {
    public final int i;
    public final j j;

    public i(j j0, int v) {
        this.i = v;
        this.j = j0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        return this.i == 0 ? n.l.c(this.j.j) : n.l.c(this.j.i);
    }
}

