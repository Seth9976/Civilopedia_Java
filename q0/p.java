package q0;

import M1.f;
import android.content.Context;
import f0.g;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k.d;
import l.L0;
import s0.b;
import t1.c;
import v2.a;
import w0.j;
import w0.k;

public final class p implements b {
    public final int i;
    public final Object j;
    public final Object k;
    public final Object l;

    public p() {
        this.i = 2;
        super();
        this.j = new d(false);
        this.k = new d(true);
        this.l = new AtomicMarkableReference(null, false);
    }

    public p(b b0, a a0, b b1, int v) {
        this.i = v;
        this.j = b0;
        this.k = a0;
        this.l = b1;
        super();
    }

    @Override  // v2.a
    public Object get() {
        return this.i != 0 ? new w0.d(((Context)((d)this.j).j), ((x0.d)((a)this.k).get()), ((w0.b)((c)this.l).get())) : new o(new c(21), new f(21), ((v0.c)((B.f)this.j).get()), ((j)((L0)this.k).get()), ((k)((g)this.l).get()));
    }
}

