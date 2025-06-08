package n2;

import J2.j;

public final class n {
    public w a;
    public w b;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        return j.a(this.a, ((n)object0).a) ? j.a(this.b, ((n)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Line(start=" + this.a + ", end=" + this.b + ")";
    }
}

