package h3;

import I2.b;
import J2.j;
import J2.l;
import M3.w;
import O3.k;
import U2.m;
import X2.A;
import X2.e;
import a3.S;
import android.support.v4.media.session.a;

public final class d extends l implements b {
    public static final d i;

    static {
        d.i = new d(1);  // 初始化器: LJ2/l;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((A)object0), "module");
        e e0 = ((A)object0).m().i(m.t);
        S s0 = a.p(c.b, e0);
        w w0 = s0 == null ? null : s0.getType();
        return w0 == null ? O3.l.c(k.K, new String[0]) : w0;
    }
}

