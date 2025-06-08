package n2;

public final class k {
    public final j a;
    public final t b;

    public k(j j0, t t0) {
        J2.j.f(j0, "edge");
        super();
        this.a = j0;
        this.b = t0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k)) {
            return false;
        }
        return this.a == ((k)object0).a ? J2.j.a(this.b, ((k)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "HexagonEdgePosition(edge=" + this.a + ", position=" + this.b + ")";
    }
}

