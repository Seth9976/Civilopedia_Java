package u3;

import J2.j;
import o2.G;

public final class e extends G {
    public final String c;
    public final String d;

    public e(String s, String s1) {
        j.f(s, "name");
        j.f(s1, "desc");
        super(6);
        this.c = s;
        this.d = s1;
    }

    @Override  // o2.G
    public final String a() {
        return this.c + this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        return j.a(this.c, ((e)object0).c) ? j.a(this.d, ((e)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + this.c.hashCode() * 0x1F;
    }
}

