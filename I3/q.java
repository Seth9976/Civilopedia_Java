package I3;

import A3.g;
import I2.a;
import J2.j;
import J2.l;
import K3.v;
import L3.h;
import L3.m;
import M3.w;
import X2.k;
import q3.G;

public final class q extends l implements a {
    public final int i;
    public final s j;
    public final G k;
    public final v l;

    public q(s s0, G g0, v v0, int v1) {
        this.i = v1;
        this.j = s0;
        this.k = g0;
        this.l = v0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        switch(this.i) {
            case 0: {
                I3.v v0 = this.j.a(((k)this.j.a.k));
                j.c(v0);
                I3.a a0 = ((i)this.j.a.i).e;
                w w0 = this.l.r();
                j.e(w0, "getReturnType(...)");
                return (g)a0.k(v0, this.k, w0);
            }
            case 1: {
                m m1 = ((i)this.j.a.i).a;
                q q1 = new q(this.j, this.k, this.l, 0);
                m1.getClass();
                return new h(m1, q1);
            }
            case 2: {
                I3.v v1 = this.j.a(((k)this.j.a.k));
                j.c(v1);
                I3.a a1 = ((i)this.j.a.i).e;
                w w1 = this.l.r();
                j.e(w1, "getReturnType(...)");
                return (g)a1.j(v1, this.k, w1);
            }
            default: {
                m m0 = ((i)this.j.a.i).a;
                q q0 = new q(this.j, this.k, this.l, 2);
                m0.getClass();
                return new h(m0, q0);
            }
        }
    }
}

