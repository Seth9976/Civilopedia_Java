package androidx.lifecycle;

import B.b;
import T1.c;
import android.os.Handler;

public final class x implements n {
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public Handler m;
    public final p n;
    public final b o;
    public final c p;
    public static final x q;

    static {
        x.q = new x();
    }

    public x() {
        this.i = 0;
        this.j = 0;
        this.k = true;
        this.l = true;
        this.n = new p(this);
        this.o = new b(this, 21);
        this.p = new c(this, 20);
    }

    @Override  // androidx.lifecycle.n
    public final i getLifecycle() {
        return this.n;
    }
}

