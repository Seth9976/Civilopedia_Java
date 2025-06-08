package h0;

import q.e;

public final class h {
    public String a;
    public int b;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        return this.b == ((h)object0).b ? this.a.equals(((h)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return e.c(this.b) + v * 0x1F;
    }
}

