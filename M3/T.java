package M3;

import J2.j;
import X2.T;
import X2.h;

public final class t extends Q {
    public final T[] b;
    public final N[] c;
    public final boolean d;

    public t(T[] arr_t, N[] arr_n, boolean z) {
        j.f(arr_t, "parameters");
        j.f(arr_n, "arguments");
        super();
        this.b = arr_t;
        this.c = arr_n;
        this.d = z;
    }

    @Override  // M3.Q
    public final boolean b() {
        return this.d;
    }

    @Override  // M3.Q
    public final N d(w w0) {
        h h0 = w0.H0().q();
        T t0 = h0 instanceof T ? ((T)h0) : null;
        if(t0 == null) {
            return null;
        }
        int v = t0.U();
        return v >= this.b.length || !j.a(this.b[v].B(), t0.B()) ? null : this.c[v];
    }

    @Override  // M3.Q
    public final boolean e() {
        return this.c.length == 0;
    }
}

