package f;

import E.q;
import E.u;

public final class k implements Runnable {
    public final int i;
    public final t j;

    public k(t t0, int v) {
        this.i = v;
        this.j = t0;
        super();
    }

    @Override
    public final void run() {
        t t0 = this.j;
        if(this.i != 0) {
            t0.x.showAtLocation(t0.w, 55, 0, 0);
            u u0 = t0.z;
            if(u0 != null) {
                u0.b();
            }
            if(t0.A && (t0.B != null && t0.B.isLaidOut())) {
                t0.w.setAlpha(0.0f);
                u u1 = q.a(t0.w);
                u1.a(1.0f);
                t0.z = u1;
                u1.d(new n(this, 0));
                return;
            }
            t0.w.setAlpha(1.0f);
            t0.w.setVisibility(0);
            return;
        }
        if((1 & t0.Z) != 0) {
            t0.o(0);
        }
        if((t0.Z & 0x1000) != 0) {
            t0.o(108);
        }
        t0.Y = false;
        t0.Z = 0;
    }
}

