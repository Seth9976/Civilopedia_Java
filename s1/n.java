package s1;

import N1.a;
import N1.b;

public final class n implements b {
    public a a;
    public volatile b b;
    public static final A1.a c;
    public static final f d;

    static {
        n.c = new A1.a(13);
        n.d = new f(1);
    }

    public n(A1.a a0, b b0) {
        this.a = a0;
        this.b = b0;
    }

    public final void a(a a0) {
        b b1;
        b b2;
        b b0 = this.b;
        f f0 = n.d;
        if(b0 != f0) {
            a0.b(b0);
            return;
        }
        synchronized(this) {
            b1 = this.b;
            if(b1 == f0) {
                this.a = new D1.b(4, this.a, a0);
                b2 = null;
            }
            else {
                b2 = b1;
            }
        }
        if(b2 != null) {
            a0.b(b1);
        }
    }

    @Override  // N1.b
    public final Object get() {
        return this.b.get();
    }
}

