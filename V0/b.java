package v0;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import q0.o;
import r0.f;
import w0.d;

public final class b implements c {
    public final d a;
    public final Executor b;
    public final f c;
    public final x0.d d;
    public final y0.b e;
    public static final Logger f;

    static {
        b.f = Logger.getLogger(o.class.getName());
    }

    public b(Executor executor0, f f0, d d0, x0.d d1, y0.b b0) {
        this.b = executor0;
        this.c = f0;
        this.a = d0;
        this.d = d1;
        this.e = b0;
    }
}

