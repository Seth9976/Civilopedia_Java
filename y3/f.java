package y3;

import J2.j;
import M3.A;
import M3.X;
import M3.w;
import X2.B;
import X2.M;
import X2.U;
import X2.W;
import X2.e;
import X2.h;
import X2.k;
import X2.v;
import a3.J;
import v3.b;
import v3.c;

public abstract class f {
    public static final int a;

    static {
        b.j(new c("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(X2.c c0) {
        j.f(c0, "<this>");
        if(c0 instanceof J) {
            M m0 = ((J)c0).M0();
            j.e(m0, "getCorrespondingProperty(...)");
            if(m0.J() == null) {
                k k0 = m0.p();
                e e0 = k0 instanceof e ? ((e)k0) : null;
                if(e0 != null) {
                    U u0 = e0.l0();
                    if(u0 != null) {
                        v3.f f0 = m0.getName();
                        j.e(f0, "getName(...)");
                        return u0.a(f0);
                    }
                }
            }
        }
        return false;
    }

    public static final boolean b(k k0) {
        j.f(k0, "<this>");
        return k0 instanceof e && ((e)k0).l0() instanceof v;
    }

    public static final boolean c(k k0) {
        j.f(k0, "<this>");
        return k0 instanceof e && ((e)k0).l0() instanceof B;
    }

    public static final boolean d(W w0) {
        if(w0.J() == null) {
            k k0 = w0.p();
            v3.f f0 = null;
            e e0 = k0 instanceof e ? ((e)k0) : null;
            if(e0 != null) {
                U u0 = e0.l0();
                v v0 = u0 instanceof v ? ((v)u0) : null;
                if(v0 != null) {
                    f0 = v0.a;
                }
            }
            return j.a(f0, w0.getName());
        }
        return false;
    }

    public static final boolean e(k k0) {
        j.f(k0, "<this>");
        return f.b(k0) || f.c(k0);
    }

    public static final boolean f(w w0) {
        h h0 = w0.H0().q();
        return h0 == null ? false : f.e(h0);
    }

    public static final boolean g(w w0) {
        j.f(w0, "<this>");
        h h0 = w0.H0().q();
        return h0 != null && f.c(h0) && !X.e(w0);
    }

    public static final A h(w w0) {
        j.f(w0, "<this>");
        h h0 = w0.H0().q();
        e e0 = h0 instanceof e ? ((e)h0) : null;
        if(e0 != null) {
            U u0 = e0.l0();
            v v0 = u0 instanceof v ? ((v)u0) : null;
            return v0 == null ? null : ((A)v0.b);
        }
        return null;
    }
}

