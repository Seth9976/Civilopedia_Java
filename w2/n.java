package W2;

import I2.b;
import J2.j;
import J2.l;
import v3.f;

public final class n extends l implements b {
    public final int i;
    public final f j;

    public n(f f0, int v) {
        this.i = v;
        this.j = f0;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        if(this.i != 0) {
            j.f(((F3.n)object0), "it");
            return ((F3.n)object0).a(this.j, f3.b.m);
        }
        j.f(((F3.n)object0), "it");
        return ((F3.n)object0).b(this.j, f3.b.i);
    }
}

