package M3;

import J2.j;

public final class h {
    public final Y2.h a;

    public h(Y2.h h0) {
        j.f(h0, "annotations");
        super();
        this.a = h0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof h ? j.a(((h)object0).a, this.a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

