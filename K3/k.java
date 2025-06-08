package k3;

import I2.b;
import J2.j;
import J2.l;
import v3.f;

public final class k extends l implements b {
    public final int i;
    public final n j;

    public k(n n0, int v) {
        this.i = v;
        this.j = n0;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        if(this.i != 0) {
            j.f(((f)object0), "it");
            return n.w(this.j, ((f)object0));
        }
        j.f(((f)object0), "it");
        return n.v(this.j, ((f)object0));
    }
}

