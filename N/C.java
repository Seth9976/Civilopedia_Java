package n;

import java.util.Map.Entry;

public final class c implements Map.Entry {
    public final Object i;
    public final Object j;
    public c k;
    public c l;

    public c(Object object0, Object object1) {
        this.i = object0;
        this.j = object1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof c ? this.i.equals(((c)object0).i) && this.j.equals(((c)object0).j) : false;
    }

    @Override
    public final Object getKey() {
        return this.i;
    }

    @Override
    public final Object getValue() {
        return this.j;
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode() ^ this.j.hashCode();
    }

    @Override
    public final Object setValue(Object object0) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    @Override
    public final String toString() {
        return this.i + "=" + this.j;
    }
}

