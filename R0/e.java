package r0;

import M1.f;
import android.content.Context;
import k.d;
import s0.b;
import t1.c;

public final class e implements b {
    public final int i;
    public final d j;

    public e(d d0, int v) {
        this.i = v;
        this.j = d0;
        super();
    }

    @Override  // v2.a
    public final Object get() {
        return this.i != 0 ? "com.spears.civilopedia" : new r0.d(((Context)this.j.j), new c(21), new f(21));
    }
}

