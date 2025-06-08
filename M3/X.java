package M3;

import F3.n;
import I2.b;
import J2.j;
import J2.l;
import N3.f;
import java.util.List;

public final class x extends l implements b {
    public final int i;
    public final K j;
    public final List k;

    public x(n n0, H h0, K k0, List list0, boolean z) {
        this.i = 1;
        this.j = k0;
        this.k = list0;
        super(1);
    }

    public x(H h0, K k0, List list0, boolean z) {
        this.i = 0;
        this.j = k0;
        this.k = list0;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        if(this.i != 0) {
            j.f(((f)object0), "kotlinTypeRefiner");
            this.j.q();
            return null;
        }
        j.f(((f)object0), "refiner");
        this.j.q();
        return null;
    }
}

