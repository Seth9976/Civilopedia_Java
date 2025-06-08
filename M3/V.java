package M3;

import A3.h;
import F3.n;
import I2.b;
import J2.j;
import P3.g;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import o1.a;
import x2.i;
import x2.r;

public final class v implements K, g {
    public w a;
    public final LinkedHashSet b;
    public final int c;

    public v(AbstractCollection abstractCollection0) {
        j.f(abstractCollection0, "typesToIntersect");
        super();
        abstractCollection0.isEmpty();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet(abstractCollection0);
        this.b = linkedHashSet0;
        this.c = linkedHashSet0.hashCode();
    }

    public final A b() {
        H.j.getClass();
        n n0 = a.k("member scope for intersection type", this.b);
        h h0 = new h(this, 6);
        return d.t(H.k, this, r.i, false, n0, h0);
    }

    public final String c(b b0) {
        j.f(b0, "getProperTypeRelatedToStringify");
        u u0 = new u(b0);
        return i.Y(i.m0(this.b, u0), " & ", "{", "}", new h(b0, 7), 24);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof v ? j.a(this.b, ((v)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.c;
    }

    @Override  // M3.K
    public final U2.h m() {
        Object object0 = this.b.iterator().next();
        U2.h h0 = ((w)object0).H0().m();
        j.e(h0, "getBuiltIns(...)");
        return h0;
    }

    @Override  // M3.K
    public final List o() {
        return r.i;
    }

    @Override  // M3.K
    public final boolean p() {
        return false;
    }

    @Override  // M3.K
    public final X2.h q() {
        return null;
    }

    @Override  // M3.K
    public final Collection r() {
        return this.b;
    }

    @Override
    public final String toString() {
        return this.c(f.k);
    }
}

