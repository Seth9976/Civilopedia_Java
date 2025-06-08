package F3;

import J2.j;
import X2.S;
import X2.e;
import X2.h;
import f3.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import v3.f;
import x2.r;

public final class i extends o {
    public final n b;

    public i(n n0) {
        j.f(n0, "workerScope");
        super();
        this.b = n0;
    }

    @Override  // F3.o
    public final Set c() {
        return this.b.c();
    }

    @Override  // F3.o
    public final Set d() {
        return this.b.d();
    }

    @Override  // F3.o
    public final Set e() {
        return this.b.e();
    }

    @Override  // F3.o
    public final h f(f f0, b b0) {
        j.f(f0, "name");
        j.f(b0, "location");
        h h0 = this.b.f(f0, b0);
        if(h0 != null) {
            e e0 = h0 instanceof e ? ((e)h0) : null;
            if(e0 != null) {
                return e0;
            }
            if(h0 instanceof S) {
                return (S)h0;
            }
        }
        return null;
    }

    @Override  // F3.o
    public final Collection g(F3.f f0, I2.b b0) {
        j.f(f0, "kindFilter");
        int v = F3.f.l & f0.b;
        F3.f f1 = v == 0 ? null : new F3.f(v, f0.a);
        if(f1 == null) {
            return r.i;
        }
        Iterable iterable0 = this.b.g(f1, b0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(object0 instanceof X2.i) {
                arrayList0.add(object0);
            }
        }
        return arrayList0;
    }

    @Override
    public final String toString() {
        return "Classes from " + this.b;
    }
}

