package g3;

import J2.j;
import java.util.Map;
import x2.s;

public final class v {
    public final B a;
    public final B b;
    public final Map c;
    public final boolean d;

    public v(B b0, B b1) {
        this.a = b0;
        this.b = b1;
        this.c = s.i;
        this.d = b0 == B.i && b1 == B.i;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v)) {
            return false;
        }
        if(this.a != ((v)object0).a) {
            return false;
        }
        return this.b == ((v)object0).b ? j.a(this.c, ((v)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.c.hashCode() + v * 961 : this.c.hashCode() + (v * 0x1F + this.b.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}

