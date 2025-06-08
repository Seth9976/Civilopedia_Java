package W2;

import I2.a;
import Y2.e;
import Y2.g;
import Y2.i;
import java.util.List;
import o2.G;

public final class l extends J2.l implements a {
    public final int i;
    public final o j;

    public l(o o0, int v) {
        this.i = v;
        this.j = o0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        if(this.i != 0) {
            List list0 = G.p(e.a(this.j.a.l, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, 6));
            return list0.isEmpty() ? g.a : new i(list0, 0);
        }
        return this.j.a.l.e();
    }
}

