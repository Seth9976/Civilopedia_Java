package w3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class t implements Iterator {
    public int i;
    public final int j;
    public final u k;

    public t(u u0) {
        this.k = u0;
        this.i = 0;
        this.j = u0.j.length;
    }

    public final byte a() {
        try {
            int v = this.i;
            this.i = v + 1;
            return this.k.j[v];
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw new NoSuchElementException(arrayIndexOutOfBoundsException0.getMessage());
        }
    }

    @Override
    public final boolean hasNext() {
        return this.i < this.j;
    }

    @Override
    public final Object next() {
        return this.a();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

