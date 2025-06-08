package w3;

import java.util.Iterator;

public final class y implements Iterator {
    public final x i;
    public t j;
    public int k;

    public y(z z0) {
        x x0 = new x(z0);
        this.i = x0;
        this.j = new t(x0.a());
        this.k = z0.j;
    }

    @Override
    public final boolean hasNext() {
        return this.k > 0;
    }

    @Override
    public final Object next() {
        if(!this.j.hasNext()) {
            this.j = new t(this.i.a());
        }
        --this.k;
        return this.j.a();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

