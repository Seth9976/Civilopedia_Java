package j2;

import A.f;
import J2.j;
import i3.e;

public final class a {
    public final Integer a;
    public final String b;
    public final Integer c;
    public final Boolean d;
    public final Integer e;
    public final String f;
    public final String g;

    public a(String s, String s1, String s2, Integer integer0, Integer integer1, Integer integer2, Boolean boolean0) {
        j.f(s, "type");
        super();
        this.a = integer0;
        this.b = s;
        this.c = integer1;
        this.d = boolean0;
        this.e = integer2;
        this.f = s1;
        this.g = s2;
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
        if(!j.a(this.b, ((a)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((a)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((a)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((a)object0).e)) {
            return false;
        }
        return j.a(this.f, ((a)object0).f) ? j.a(this.g, ((a)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = f.b((this.a == null ? 0 : this.a.hashCode()) * 0x1F, 0x1F, this.b);
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        int v4 = this.e == null ? 0 : this.e.hashCode();
        int v5 = this.f == null ? 0 : this.f.hashCode();
        String s = this.g;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ5FeatureLike(movement=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", type=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", inBorderHappiness=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", impassable=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", defense=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", help=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", civilopedia=");
        return e.h(stringBuilder0, this.g, ")");
    }
}

