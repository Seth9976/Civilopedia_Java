package O2;

import J2.j;
import R2.o0;
import kotlin.NoWhenBranchMatchedException;

public final class t {
    public final u a;
    public final o0 b;
    public static final t c;

    static {
        t.c = new t(null, null);
    }

    public t(u u0, o0 o00) {
        this.a = u0;
        this.b = o00;
        if((u0 == null ? 1 : 0) != (o00 == null ? 1 : 0)) {
            throw new IllegalArgumentException((u0 == null ? "Star projection must have no type specified." : "The projection variance " + u0 + " requires type to be specified.").toString());
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof t)) {
            return false;
        }
        return this.a == ((t)object0).a ? j.a(this.b, ((t)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        o0 o00 = this.b;
        if(o00 != null) {
            v = o00.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        int v = this.a == null ? -1 : s.a[this.a.ordinal()];
        if(v != -1) {
            o0 o00 = this.b;
            switch(v) {
                case 1: {
                    return String.valueOf(o00);
                }
                case 2: {
                    return "in " + o00;
                }
                case 3: {
                    return "out " + o00;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return "*";
    }
}

