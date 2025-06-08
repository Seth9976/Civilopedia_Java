package m2;

import A.f;
import J2.j;
import i3.e;

public final class p implements r {
    public final String a;
    public final String b;
    public final String c;

    public p(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override  // m2.r
    public final boolean a() {
        return false;
    }

    @Override  // m2.r
    public final String b() {
        return this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p)) {
            return false;
        }
        if(!j.a(this.a, ((p)object0).a)) {
            return false;
        }
        return j.a(this.b, ((p)object0).b) ? j.a(this.c, ((p)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = f.b(this.a.hashCode() * 0x1F, 0x1F, this.b);
        return this.c == null ? v : v + this.c.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Invalid(title=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", reason=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", tag=");
        return e.h(stringBuilder0, this.c, ")");
    }
}

