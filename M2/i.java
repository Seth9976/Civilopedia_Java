package m2;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import java.io.Serializable;

public final class i implements Serializable {
    public final g i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public i(g g0, String s, String s1, String s2, boolean z, boolean z1, boolean z2) {
        this.i = g0;
        this.j = s;
        this.k = s1;
        this.l = s2;
        this.m = z;
        this.n = z1;
        this.o = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        if(this.i != ((i)object0).i) {
            return false;
        }
        if(!j.a(this.j, ((i)object0).j)) {
            return false;
        }
        if(!j.a(this.k, ((i)object0).k)) {
            return false;
        }
        if(!j.a(this.l, ((i)object0).l)) {
            return false;
        }
        if(this.m != ((i)object0).m) {
            return false;
        }
        return this.n == ((i)object0).n ? this.o == ((i)object0).o : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = f.b((this.i.hashCode() * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F, 0x1F, this.k);
        String s = this.l;
        if(s != null) {
            v = s.hashCode();
        }
        int v2 = 0x4D5;
        int v3 = this.m ? 0x4CF : 0x4D5;
        int v4 = this.n ? 0x4CF : 0x4D5;
        if(this.o) {
            v2 = 0x4CF;
        }
        return (((v1 + v) * 0x1F + v3) * 0x1F + v4) * 0x1F + v2;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("KeyValueField(type=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", icon=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", value=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", hidden=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", enabled=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", locked=");
        return u9.g(stringBuilder0, this.o, ")");
    }
}

