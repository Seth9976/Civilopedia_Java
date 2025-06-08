package I3;

import E1.d;
import I2.b;
import J2.j;
import J2.l;
import X2.A;
import X2.S;
import X2.h;
import X2.w;
import a3.s;
import android.support.v4.media.session.a;
import l.L0;
import o2.C;
import q3.Q;
import s3.f;

public final class z extends l implements b {
    public final int i;
    public final L0 j;

    public z(L0 l00, int v) {
        this.i = v;
        this.j = l00;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        switch(this.i) {
            case 0: {
                d d0 = (d)this.j.j;
                v3.b b0 = a.r(((f)d0.j), ((Number)object0).intValue());
                i i0 = (i)d0.i;
                return b0.c ? i0.b(b0) : w.e(i0.b, b0);
            }
            case 1: {
                d d1 = (d)this.j.j;
                v3.b b1 = a.r(((f)d1.j), ((Number)object0).intValue());
                if(!b1.c) {
                    A a0 = ((i)d1.i).b;
                    j.f(a0, "<this>");
                    h h0 = w.e(a0, b1);
                    return h0 instanceof S ? ((S)h0) : null;
                }
                return null;
            }
            default: {
                j.f(((Q)object0), "it");
                return C.r(((Q)object0), ((s)((d)this.j.j).l));
            }
        }
    }
}

