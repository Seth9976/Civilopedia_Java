package V2;

import J2.j;

public final class l {
    public final k a;
    public final int b;

    public l(k k0, int v) {
        this.a = k0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l)) {
            return false;
        }
        return j.a(this.a, ((l)object0).a) ? this.b == ((l)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "KindWithArity(kind=" + this.a + ", arity=" + this.b + ')';
    }
}

