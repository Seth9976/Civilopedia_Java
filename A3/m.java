package a3;

import F3.f;
import F3.o;
import I2.b;
import J2.j;
import V3.k;
import X2.A;
import android.support.v4.media.session.a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import v3.c;
import x2.r;
import x2.t;

public final class M extends o {
    public final A b;
    public final c c;

    public M(A a0, c c0) {
        j.f(a0, "moduleDescriptor");
        j.f(c0, "fqName");
        super();
        this.b = a0;
        this.c = c0;
    }

    @Override  // F3.o
    public final Set e() {
        return t.i;
    }

    @Override  // F3.o
    public final Collection g(f f0, b b0) {
        j.f(f0, "kindFilter");
        Collection collection0 = r.i;
        if(!f0.a(f.h)) {
            return collection0;
        }
        c c0 = this.c;
        if(c0.d() && f0.a.contains(F3.c.a)) {
            return collection0;
        }
        A a0 = this.b;
        Collection collection1 = a0.h(c0, b0);
        Collection collection2 = new ArrayList(collection1.size());
        Iterator iterator0 = collection1.iterator();
        while(iterator0.hasNext()) {
            x x0 = null;
            Object object0 = iterator0.next();
            v3.f f1 = ((c)object0).f();
            j.e(f1, "shortName(...)");
            if(((Boolean)b0.b(f1)).booleanValue()) {
                if(!f1.j) {
                    x x1 = (x)a0.m0(c0.c(f1));
                    if(!((Boolean)a.A(x1.n, x.p[1])).booleanValue()) {
                        x0 = x1;
                    }
                }
                k.a(((AbstractCollection)collection2), x0);
            }
        }
        return collection2;
    }

    @Override
    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}

