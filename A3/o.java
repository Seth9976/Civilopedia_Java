package a3;

import I2.b;
import v3.f;

public final class o implements b {
    public final int i;
    public final p j;

    public o(p p0, int v) {
        this.i = v;
        this.j = p0;
        super();
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        if(this.i != 0) {
            p p0 = this.j;
            if(((f)object0) != null) {
                return p0.j(((f)object0), p0.i().a(((f)object0), f3.b.n));
            }
            p0.getClass();
            p.h(4);
            throw null;
        }
        p p1 = this.j;
        if(((f)object0) != null) {
            return p1.j(((f)object0), p1.i().b(((f)object0), f3.b.n));
        }
        p1.getClass();
        p.h(8);
        throw null;
    }
}

