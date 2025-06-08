package n0;

import i3.e;

public final class b {
    public final String a;

    public b(String s) {
        if(s == null) {
            throw new NullPointerException("name is null");
        }
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? this.a.equals(((b)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return e.h(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}

