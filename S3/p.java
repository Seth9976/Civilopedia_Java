package S3;

import K2.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class p implements a, Iterator {
    public final int i;
    public boolean j;
    public final Object k;

    public p(Object object0, int v) {
        this.i = v;
        this.k = object0;
        this.j = true;
        super();
    }

    @Override
    public final boolean hasNext() {
        return this.j;
    }

    @Override
    public final Object next() {
        if(this.i != 0) {
            if(!this.j) {
                throw new NoSuchElementException();
            }
            this.j = false;
            return this.k;
        }
        if(!this.j) {
            throw new NoSuchElementException();
        }
        this.j = false;
        return ((q)this.k).i;
    }

    @Override
    public final void remove() {
        throw this.i == 0 ? new UnsupportedOperationException("Operation is not supported for read-only collection") : new UnsupportedOperationException();
    }
}

