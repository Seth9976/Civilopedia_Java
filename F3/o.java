package F3;

import J2.j;
import X2.h;
import a3.L;
import f3.b;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import v3.f;
import x2.r;

public abstract class o implements n {
    @Override  // F3.n
    public Collection a(f f0, b b0) {
        j.f(f0, "name");
        return r.i;
    }

    @Override  // F3.n
    public Collection b(f f0, b b0) {
        j.f(f0, "name");
        return r.i;
    }

    @Override  // F3.n
    public Set c() {
        Iterable iterable0 = this.g(F3.f.p, V3.b.i);
        Set set0 = new LinkedHashSet();
        for(Object object0: iterable0) {
            if(object0 instanceof L) {
                f f0 = ((L)object0).getName();
                j.e(f0, "getName(...)");
                set0.add(f0);
            }
        }
        return set0;
    }

    @Override  // F3.n
    public Set d() {
        Iterable iterable0 = this.g(F3.f.q, V3.b.i);
        Set set0 = new LinkedHashSet();
        for(Object object0: iterable0) {
            if(object0 instanceof L) {
                f f0 = ((L)object0).getName();
                j.e(f0, "getName(...)");
                set0.add(f0);
            }
        }
        return set0;
    }

    @Override  // F3.n
    public Set e() {
        return null;
    }

    @Override  // F3.p
    public h f(f f0, b b0) {
        j.f(f0, "name");
        j.f(b0, "location");
        return null;
    }

    @Override  // F3.p
    public Collection g(F3.f f0, I2.b b0) {
        j.f(f0, "kindFilter");
        return r.i;
    }
}

