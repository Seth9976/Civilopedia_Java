package R2;

import A.f;
import J2.b;
import J2.j;
import O2.A;
import O2.q;
import S2.g;
import X2.M;
import X2.c;
import a3.I;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import o1.a;
import t3.e;
import w2.d;
import x2.w;

public abstract class m0 extends r implements q {
    public final F l;
    public final String m;
    public final String n;
    public final Object o;
    public final Object p;
    public final s0 q;
    public static final Object r;

    static {
        m0.r = new Object();
    }

    public m0(F f0, I i0) {
        j.f(f0, "container");
        j.f(i0, "descriptor");
        String s = i0.getName().b();
        j.e(s, "asString(...)");
        this(f0, s, v0.b(i0).d(), i0, b.i);
    }

    public m0(F f0, String s, String s1, I i0, Object object0) {
        this.l = f0;
        this.m = s;
        this.n = s1;
        this.o = object0;
        l0 l00 = new l0(this, 1);
        this.p = w.p(d.i, l00);
        this.q = a.H(i0, new l0(this, 0));
    }

    // 去混淆评级： 低(25)
    @Override
    public final boolean equals(Object object0) {
        m0 m00 = x0.c(object0);
        return m00 == null ? false : j.a(this.l, m00.l) && j.a(this.m, m00.m) && j.a(this.n, m00.n) && j.a(this.o, m00.o);
    }

    @Override  // O2.b
    public final String getName() {
        return this.m;
    }

    @Override
    public final int hashCode() {
        return this.n.hashCode() + f.b(this.l.hashCode() * 0x1F, 0x1F, this.m);
    }

    @Override  // R2.r
    public final g i() {
        return this.u().i();
    }

    @Override  // R2.r
    public final F j() {
        return this.l;
    }

    @Override  // R2.r
    public final g k() {
        this.u().getClass();
        return null;
    }

    @Override  // R2.r
    public final c l() {
        return this.t();
    }

    @Override  // O2.b
    public final boolean n() {
        return false;
    }

    @Override  // R2.r
    public final boolean r() {
        return !j.a(this.o, b.i);
    }

    public final Member s() {
        if(!this.t().e0()) {
            return null;
        }
        A a0 = v0.b(this.t());
        if(a0 instanceof m) {
            e e0 = ((m)a0).k;
            if((e0.j & 16) == 16) {
                t3.c c0 = e0.o;
                if((c0.j & 1) == 1 && (c0.j & 2) == 2) {
                    String s = ((m)a0).l.getString(c0.k);
                    String s1 = ((m)a0).l.getString(c0.l);
                    return this.l.d(s, s1);
                }
                return null;
            }
        }
        return (Field)((w2.c)this.p).getValue();
    }

    public final M t() {
        Object object0 = this.q.invoke();
        j.e(object0, "invoke(...)");
        return (M)object0;
    }

    @Override
    public final String toString() {
        return u0.c(this.t());
    }

    public abstract i0 u();
}

