package x1;

import java.util.concurrent.Callable;
import y1.a;

public final class g implements Callable {
    public final long a;
    public final String b;
    public final i c;

    public g(i i0, long v, String s) {
        this.c = i0;
        this.a = v;
        this.b = s;
    }

    @Override
    public final Object call() {
        i i0 = this.c;
        if(i0.l == null || !i0.l.e.get()) {
            ((a)i0.h.b).e(this.b, this.a);
        }
        return null;
    }
}

