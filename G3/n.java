package g3;

import J2.j;
import java.util.Collection;
import n3.g;
import n3.h;

public final class n {
    public final h a;
    public final Collection b;
    public final boolean c;

    public n(h h0, Collection collection0) {
        this(h0, collection0, h0.a == g.k);
    }

    public n(h h0, Collection collection0, boolean z) {
        j.f(collection0, "qualifierApplicabilityTypes");
        super();
        this.a = h0;
        this.b = collection0;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        if(!j.a(this.a, ((n)object0).a)) {
            return false;
        }
        return j.a(this.b, ((n)object0).b) ? this.c == ((n)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c ? (v1 + v * 0x1F) * 0x1F + 0x4CF : (v1 + v * 0x1F) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.a + ", qualifierApplicabilityTypes=" + this.b + ", definitelyNotNull=" + this.c + ')';
    }
}

