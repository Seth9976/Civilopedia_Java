package F3;

import J2.j;
import K3.l;
import L3.i;
import L3.m;
import O2.q;
import X2.M;
import X2.h;
import a3.L;
import android.support.v4.media.session.a;
import f3.b;
import java.util.Collection;
import java.util.List;
import v3.f;

public final class r extends o {
    public final l b;
    public final boolean c;
    public final i d;
    public final i e;
    public static final q[] f;

    static {
        J2.o o0 = new J2.o(J2.r.a.b(r.class), "functions", "getFunctions()Ljava/util/List;");
        J2.o o1 = new J2.o(J2.r.a.b(r.class), "properties", "getProperties()Ljava/util/List;");
        r.f = new q[]{J2.r.a.e(o0), J2.r.a.e(o1)};
    }

    public r(m m0, l l0, boolean z) {
        j.f(m0, "storageManager");
        super();
        this.b = l0;
        this.c = z;
        this.d = new i(m0, new F3.q(this, 0));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.e = new i(m0, new F3.q(this, 1));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    @Override  // F3.o
    public final Collection a(f f0, b b0) {
        j.f(f0, "name");
        Iterable iterable0 = (List)a.A(this.e, r.f[1]);
        Collection collection0 = new V3.f();
        for(Object object0: iterable0) {
            if(j.a(((M)object0).getName(), f0)) {
                ((V3.f)collection0).add(object0);
            }
        }
        return collection0;
    }

    @Override  // F3.o
    public final Collection b(f f0, b b0) {
        j.f(f0, "name");
        Iterable iterable0 = (List)a.A(this.d, r.f[0]);
        Collection collection0 = new V3.f();
        for(Object object0: iterable0) {
            if(j.a(((L)object0).getName(), f0)) {
                ((V3.f)collection0).add(object0);
            }
        }
        return collection0;
    }

    @Override  // F3.o
    public final h f(f f0, b b0) {
        j.f(f0, "name");
        j.f(b0, "location");
        return null;
    }

    @Override  // F3.o
    public final Collection g(F3.f f0, I2.b b0) {
        j.f(f0, "kindFilter");
        Collection collection0 = (List)a.A(this.d, r.f[0]);
        return x2.i.e0(((List)a.A(this.e, r.f[1])), collection0);
    }
}

