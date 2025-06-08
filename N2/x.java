package n2;

import J2.j;

public final class x {
    public final t a;
    public final t b;

    public x(t t0, t t1) {
        j.f(t1, "w");
        super();
        this.a = t0;
        this.b = t1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof x)) {
            return false;
        }
        return j.a(this.a, ((x)object0).a) ? j.a(this.b, ((x)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "RiverEdge(v=" + this.a + ", w=" + this.b + ")";
    }
}

