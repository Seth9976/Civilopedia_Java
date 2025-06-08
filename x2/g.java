package X2;

import I2.b;
import J2.j;
import J2.l;
import Y2.h;
import v3.c;

public final class G extends l implements b {
    public final int i;
    public final c j;

    public G(c c0, int v) {
        this.i = v;
        this.j = c0;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        if(this.i != 0) {
            j.f(((h)object0), "it");
            return ((h)object0).c(this.j);
        }
        j.f(((c)object0), "it");
        return ((c)object0).d() || !j.a(((c)object0).e(), this.j) ? false : true;
    }
}

