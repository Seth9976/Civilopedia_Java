package x3;

import I2.b;
import J2.j;
import J2.l;
import M3.N;
import M3.a0;
import M3.w;

public final class f extends l implements b {
    public final int i;
    public final g j;

    public f(g g0, int v) {
        this.i = v;
        this.j = g0;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        if(this.i != 0) {
            j.c(((w)object0));
            return this.j.V(((w)object0));
        }
        j.f(((N)object0), "it");
        if(((N)object0).c()) {
            return "*";
        }
        w w0 = ((N)object0).b();
        j.e(w0, "getType(...)");
        String s = this.j.V(w0);
        return ((N)object0).a() == a0.k ? s : ((N)object0).a() + ' ' + s;
    }
}

