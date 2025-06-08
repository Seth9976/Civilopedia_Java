package S3;

import M3.h;
import java.util.Iterator;

public final class q extends a {
    public final h i;
    public final int j;

    public q(int v, h h0) {
        this.i = h0;
        this.j = v;
    }

    @Override  // S3.a
    public final Object get(int v) {
        return v == this.j ? this.i : null;
    }

    @Override  // S3.a
    public final int h() {
        return 1;
    }

    @Override  // S3.a
    public final void i(int v, h h0) {
        throw new IllegalStateException();
    }

    @Override  // S3.a
    public final Iterator iterator() {
        return new p(this, 0);
    }
}

