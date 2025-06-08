package m2;

import J2.j;
import o2.q;

public final class o {
    public final r a;
    public final q b;

    public o(r r0, q q0) {
        j.f(r0, "status");
        j.f(q0, "page");
        super();
        this.a = r0;
        this.b = q0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o)) {
            return false;
        }
        return j.a(this.a, ((o)object0).a) ? j.a(this.b, ((o)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "PlotPage(status=" + this.a + ", page=" + this.b + ")";
    }
}

