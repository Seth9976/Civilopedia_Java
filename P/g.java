package p;

import I3.v;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class g implements Iterator {
    public final int i;
    public int j;
    public int k;
    public boolean l;
    public final v m;

    public g(v v0, int v1) {
        this.m = v0;
        this.l = false;
        this.i = v1;
        this.j = v0.d();
    }

    @Override
    public final boolean hasNext() {
        return this.k < this.j;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.m.b(this.k, this.i);
        ++this.k;
        this.l = true;
        return object0;
    }

    @Override
    public final void remove() {
        if(!this.l) {
            throw new IllegalStateException();
        }
        int v = this.k - 1;
        this.k = v;
        --this.j;
        this.l = false;
        this.m.h(v);
    }
}

