package j0;

import n1.a;

public final class e implements Runnable {
    public final j i;
    public final a j;

    public e(j j0, a a0) {
        this.i = j0;
        this.j = a0;
    }

    @Override
    public final void run() {
        if(this.i.i != this) {
            return;
        }
        Object object0 = h.f(this.j);
        if(h.n.i(this.i, this, object0)) {
            h.c(this.i);
        }
    }
}

