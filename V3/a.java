package v3;

import J2.j;
import Y3.n;

public final class a {
    public final c a;
    public final f b;

    static {
        c.j(h.f);
    }

    public a(c c0, f f0) {
        j.f(c0, "packageName");
        super();
        this.a = c0;
        this.b = f0;
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
        if(!j.a(null, null)) {
            return false;
        }
        return this.b.equals(((a)object0).b) ? j.a(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return (this.b.hashCode() + this.a.hashCode() * 961) * 0x1F;
    }

    @Override
    public final String toString() {
        String s = n.E0(this.a.b(), '.', '/') + "/" + this.b;
        j.e(s, "toString(...)");
        return s;
    }
}

