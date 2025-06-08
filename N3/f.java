package n3;

import J2.j;
import M3.A;
import M3.H;
import M3.X;
import M3.Z;
import M3.c;
import M3.d;
import M3.k;
import M3.n;
import M3.q;
import M3.w;

public final class f extends n implements k {
    public final A j;

    public f(A a0) {
        j.f(a0, "delegate");
        super();
        this.j = a0;
    }

    @Override  // M3.n
    public final boolean I0() {
        return false;
    }

    @Override  // M3.A
    public final Z N0(H h0) {
        j.f(h0, "newAttributes");
        return new f(this.j.P0(h0));
    }

    @Override  // M3.A
    public final A O0(boolean z) {
        return z ? this.j.O0(true) : this;
    }

    @Override  // M3.A
    public final A P0(H h0) {
        j.f(h0, "newAttributes");
        return new f(this.j.P0(h0));
    }

    @Override  // M3.n
    public final A Q0() {
        return this.j;
    }

    @Override  // M3.n
    public final n S0(A a0) {
        return new f(a0);
    }

    @Override  // M3.k
    public final boolean d0() {
        return true;
    }

    @Override  // M3.k
    public final Z i(w w0) {
        j.f(w0, "replacement");
        Z z0 = w0.K0();
        if(!X.f(z0) && !X.e(z0)) {
            return z0;
        }
        if(z0 instanceof A) {
            Z z1 = ((A)z0).O0(false);
            return X.f(((A)z0)) ? new f(((A)z1)) : z1;
        }
        if(!(z0 instanceof q)) {
            throw new IllegalStateException(("Incorrect type: " + z0).toString());
        }
        A a0 = ((q)z0).j.O0(false);
        if(X.f(((q)z0).j)) {
            a0 = new f(a0);
        }
        A a1 = ((q)z0).k.O0(false);
        if(X.f(((q)z0).k)) {
            a1 = new f(a1);
        }
        return c.A(d.j(a0, a1), c.e(z0));
    }
}

