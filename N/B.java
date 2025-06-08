package n;

import java.util.Iterator;

public final class b implements Iterator, e {
    public c i;
    public c j;
    public final int k;

    public b(c c0, c c1, int v) {
        this.k = v;
        super();
        this.i = c1;
        this.j = c0;
    }

    @Override  // n.e
    public final void a(c c0) {
        c c1 = null;
        if(this.i == c0 && c0 == this.j) {
            this.j = null;
            this.i = null;
        }
        c c2 = this.i;
        if(c2 == c0) {
            this.i = this.k == 0 ? c2.l : c2.k;
        }
        c c3 = this.j;
        if(c3 == c0) {
            if(c3 != this.i && this.i != null) {
                c1 = this.b(c3);
            }
            this.j = c1;
        }
    }

    public final c b(c c0) {
        return this.k == 0 ? c0.k : c0.l;
    }

    @Override
    public final boolean hasNext() {
        return this.j != null;
    }

    @Override
    public final Object next() {
        c c0 = this.j;
        this.j = c0 == this.i || this.i == null ? null : this.b(c0);
        return c0;
    }
}

