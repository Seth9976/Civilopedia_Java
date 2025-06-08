package p;

import I3.v;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public final class i implements Iterator, Map.Entry {
    public int i;
    public int j;
    public boolean k;
    public final v l;

    public i(v v0) {
        this.l = v0;
        this.k = false;
        this.i = v0.d() - 1;
        this.j = -1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!this.k) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if(!(object0 instanceof Map.Entry)) {
            return false;
        }
        Object object1 = ((Map.Entry)object0).getKey();
        v v0 = this.l;
        Object object2 = v0.b(this.j, 0);
        if(object1 == object2 || object1 != null && object1.equals(object2)) {
            Object object3 = ((Map.Entry)object0).getValue();
            Object object4 = v0.b(this.j, 1);
            return object3 == object4 || object3 != null && object3.equals(object4);
        }
        return false;
    }

    @Override
    public final Object getKey() {
        if(!this.k) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.l.b(this.j, 0);
    }

    @Override
    public final Object getValue() {
        if(!this.k) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.l.b(this.j, 1);
    }

    @Override
    public final boolean hasNext() {
        return this.j < this.i;
    }

    @Override
    public final int hashCode() {
        if(!this.k) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int v = 0;
        Object object0 = this.l.b(this.j, 0);
        Object object1 = this.l.b(this.j, 1);
        int v1 = object0 == null ? 0 : object0.hashCode();
        if(object1 != null) {
            v = object1.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        ++this.j;
        this.k = true;
        return this;
    }

    @Override
    public final void remove() {
        if(!this.k) {
            throw new IllegalStateException();
        }
        this.l.h(this.j);
        --this.j;
        --this.i;
        this.k = false;
    }

    @Override
    public final Object setValue(Object object0) {
        if(!this.k) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.l.i(this.j, object0);
    }

    @Override
    public final String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}

