package g3;

import J2.j;
import w2.b;

public final class r {
    public final B a;
    public final b b;
    public final B c;
    public static final r d;

    static {
        r.d = new r(B.k, 6);
    }

    public r(B b0, int v) {
        this(b0, ((v & 2) == 0 ? null : new b(1, 0, 0)), b0);
    }

    public r(B b0, b b1, B b2) {
        this.a = b0;
        this.b = b1;
        this.c = b2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r)) {
            return false;
        }
        if(this.a != ((r)object0).a) {
            return false;
        }
        return j.a(this.b, ((r)object0).b) ? this.c == ((r)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.c.hashCode() + v * 961 : this.c.hashCode() + (v * 0x1F + this.b.l) * 0x1F;
    }

    @Override
    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }
}

