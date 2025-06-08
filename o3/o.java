package o3;

import J2.j;

public final class o {
    public final String a;

    public o(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof o ? j.a(this.a, ((o)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "MemberSignature(signature=" + this.a + ')';
    }
}

