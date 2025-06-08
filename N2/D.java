package n2;

import J2.j;
import i3.e;

public final class d {
    public final String a;
    public final String b;

    public d(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        return j.a(this.a, ((d)object0).a) ? j.a(this.b, ((d)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        String s = this.b;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("GameEnvironment(civic=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", technology=");
        return e.h(stringBuilder0, this.b, ")");
    }
}

