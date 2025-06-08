package n;

import java.util.Iterator;

public final class d implements Iterator, e {
    public c i;
    public boolean j;
    public final f k;

    public d(f f0) {
        this.k = f0;
        this.j = true;
    }

    @Override  // n.e
    public final void a(c c0) {
        c c1 = this.i;
        if(c0 == c1) {
            this.i = c1.l;
            this.j = c1.l == null;
        }
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.j ? this.k.i != null : this.i != null && this.i.k != null;
    }

    @Override
    public final Object next() {
        if(this.j) {
            this.j = false;
            this.i = this.k.i;
            return this.i;
        }
        this.i = this.i == null ? null : this.i.k;
        return this.i;
    }
}

