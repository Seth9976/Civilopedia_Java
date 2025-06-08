package n3;

import J2.j;

public final class h {
    public final g a;
    public final boolean b;

    public h(g g0) {
        this.a = g0;
        this.b = false;
    }

    public h(g g0, boolean z) {
        this.a = g0;
        this.b = z;
    }

    public static h a(h h0, g g0, boolean z, int v) {
        if((v & 1) != 0) {
            g0 = h0.a;
        }
        if((v & 2) != 0) {
            z = h0.b;
        }
        h0.getClass();
        j.f(g0, "qualifier");
        return new h(g0, z);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        return this.a == ((h)object0).a ? this.b == ((h)object0).b : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.a + ", isForWarningOnly=" + this.b + ')';
    }
}

