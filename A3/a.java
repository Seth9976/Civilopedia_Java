package a3;

import F3.n;
import M3.H;
import M3.K;
import M3.X;
import M3.d;
import O3.k;
import O3.l;
import U2.f;
import java.util.List;

public final class a implements I2.a {
    public final int i;
    public final b j;

    public a(b b0, int v) {
        this.i = v;
        this.j = b0;
        super();
    }

    @Override  // I2.a
    public final Object invoke() {
        b b0 = this.j;
        if(this.i != 0) {
            return new v(b0);
        }
        n n0 = b0.t0();
        f f0 = new f(this, 1);
        if(l.f(b0)) {
            return l.c(k.s, new String[]{b0.toString()});
        }
        K k0 = b0.B();
        if(k0 != null) {
            if(n0 != null) {
                List list0 = X.d(k0.o());
                H.j.getClass();
                return d.t(H.k, k0, list0, false, n0, f0);
            }
            X.a(13);
            throw null;
        }
        X.a(12);
        throw null;
    }
}

