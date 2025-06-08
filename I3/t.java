package I3;

import X2.O;
import a3.s;
import android.support.v4.media.session.a;
import q3.i;
import q3.j;
import s3.e;
import s3.f;
import v3.b;
import v3.c;

public final class t extends v {
    public final j e;
    public final t f;
    public final b g;
    public final i h;
    public final boolean i;

    public t(j j0, f f0, s s0, O o0, t t0) {
        J2.j.f(j0, "classProto");
        J2.j.f(f0, "nameResolver");
        super(f0, s0, o0);
        this.e = j0;
        this.f = t0;
        this.g = a.r(f0, j0.m);
        i i0 = (i)e.f.c(j0.l);
        if(i0 == null) {
            i0 = i.j;
        }
        this.h = i0;
        this.i = e.g.c(j0.l).booleanValue();
    }

    @Override  // I3.v
    public final c j() {
        return this.g.b();
    }
}

