package m2;

import J2.j;
import java.util.ArrayList;
import o2.q;

public final class a {
    public final q a;
    public final ArrayList b;
    public final r c;

    public a(q q0, ArrayList arrayList0, r r0) {
        j.f(q0, "page");
        super();
        this.a = q0;
        this.b = arrayList0;
        this.c = r0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(!j.a(this.a, ((a)object0).a)) {
            return false;
        }
        return this.b.equals(((a)object0).b) ? j.a(this.c, ((a)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "CityItemPlacement(page=" + this.a + ", positions=" + this.b + ", status=" + this.c + ")";
    }
}

