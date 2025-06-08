package R2;

import I2.a;
import J2.j;
import J2.l;
import d3.d;
import java.lang.reflect.Type;

public final class n0 extends l implements a {
    public final int i;
    public final o0 j;

    public n0(o0 o00, int v) {
        this.i = v;
        this.j = o00;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        if(this.i != 0) {
            return this.j.a(this.j.a);
        }
        s0 s00 = this.j.b;
        Type type0 = s00 == null ? null : ((Type)s00.invoke());
        j.c(type0);
        return d.c(type0);
    }
}

