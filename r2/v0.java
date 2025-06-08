package R2;

import C3.e;
import K3.v;
import O2.A;
import X2.M;
import X2.O;
import X2.u;
import a3.J;
import a3.K;
import a3.m;
import android.support.v4.media.session.a;
import c3.f;
import d3.o;
import d3.r;
import d3.s;
import d3.x;
import g3.w;
import i3.g;
import java.lang.reflect.Method;
import o2.I;
import q3.G;
import q3.y;
import t3.k;
import u3.h;
import v3.b;
import v3.c;
import y3.d;
import z1.a0;

public abstract class v0 {
    public static final b a;

    static {
        v0.a = b.j(new c("java.lang.Void"));
    }

    public static j a(u u0) {
        String s = a.v(u0);
        if(s == null) {
            if(u0 instanceof J) {
                String s1 = e.k(u0).getName().b();
                J2.j.e(s1, "asString(...)");
                return new j(new u3.e(w.a(s1), I.h(u0, 1)));
            }
            if(u0 instanceof K) {
                String s2 = e.k(u0).getName().b();
                J2.j.e(s2, "asString(...)");
                return new j(new u3.e(w.b(s2), I.h(u0, 1)));
            }
            s = ((m)u0).getName().b();
            J2.j.e(s, "asString(...)");
        }
        return new j(new u3.e(s, I.h(u0, 1)));
    }

    public static A b(M m0) {
        J2.j.f(m0, "possiblyOverriddenProperty");
        M m1 = ((M)d.u(m0)).a();
        J2.j.e(m1, "getOriginal(...)");
        j j0 = null;
        if(m1 instanceof v) {
            J2.j.e(k.d, "propertySignature");
            G g0 = ((v)m1).I;
            Object object0 = I.k(g0, k.d);
            if(((t3.e)object0) != null) {
                return new R2.m(m1, g0, ((t3.e)object0), ((v)m1).J, ((v)m1).K);
            }
        }
        else if(m1 instanceof g) {
            O o0 = ((g)m1).q();
            f f0 = o0 instanceof f ? ((f)o0) : null;
            s s0 = f0 == null ? null : f0.i;
            if(s0 instanceof d3.u) {
                return new R2.k(((d3.u)s0).a);
            }
            if(!(s0 instanceof x)) {
                throw new H2.a("Incorrect resolution sequence for Java field " + m1 + " (source = " + s0 + ')', 1);
            }
            Method method0 = ((x)s0).a;
            K k0 = m1.e();
            O o1 = k0 == null ? null : k0.q();
            f f1 = o1 instanceof f ? ((f)o1) : null;
            s s1 = f1 == null ? null : f1.i;
            x x0 = s1 instanceof x ? ((x)s1) : null;
            if(x0 != null) {
                j0 = x0.a;
            }
            return new l(method0, ((Method)j0));
        }
        J j1 = m1.d();
        J2.j.c(j1);
        j j2 = v0.a(j1);
        K k1 = m1.e();
        if(k1 != null) {
            j0 = v0.a(k1);
        }
        return new n(j2, j0);
    }

    public static a0 c(u u0) {
        s s0 = null;
        J2.j.f(u0, "possiblySubstitutedFunction");
        u u1 = ((u)d.u(u0)).a();
        J2.j.e(u1, "getOriginal(...)");
        if(u1 instanceof K3.b) {
            w3.b b0 = ((K3.b)u1).N();
            if(b0 instanceof y) {
                u3.e e0 = h.c(((y)b0), ((K3.b)u1).C0(), ((K3.b)u1).q0());
                if(e0 != null) {
                    return new j(e0);
                }
            }
            if(b0 instanceof q3.l) {
                u3.e e1 = h.a(((q3.l)b0), ((K3.b)u1).C0(), ((K3.b)u1).q0());
                if(e1 != null) {
                    X2.k k0 = u0.p();
                    J2.j.e(k0, "getContainingDeclaration(...)");
                    if(y3.f.b(k0)) {
                        return new j(e1);
                    }
                    X2.k k1 = u0.p();
                    J2.j.e(k1, "getContainingDeclaration(...)");
                    if(y3.f.c(k1)) {
                        boolean z = ((X2.j)u0).H();
                        String s1 = e1.c;
                        String s2 = e1.d;
                        if(!z) {
                            if(!J2.j.a(s1, "constructor-impl")) {
                                throw new IllegalArgumentException(("Invalid signature: " + e1).toString());
                            }
                            X2.e e2 = ((X2.j)u0).I();
                            J2.j.e(e2, "getConstructedClass(...)");
                            b b1 = e.f(e2);
                            J2.j.c(b1);
                            String s3 = u3.b.b(b1.c());
                            if(Y3.n.u0(s2, ")V")) {
                                String s4 = Y3.n.D0(s2) + s3;
                                J2.j.f(s1, "name");
                                J2.j.f(s4, "desc");
                                return new j(new u3.e(s1, s4));
                            }
                            if(!Y3.n.u0(s2, s3)) {
                                throw new IllegalArgumentException(("Invalid signature: " + e1).toString());
                            }
                        }
                        else if(!J2.j.a(s1, "constructor-impl") || !Y3.n.u0(s2, ")V")) {
                            throw new IllegalArgumentException(("Invalid signature: " + e1).toString());
                        }
                        return new j(e1);
                    }
                    return new i(e1);
                }
            }
            return v0.a(u1);
        }
        if(u1 instanceof i3.f) {
            O o0 = ((i3.f)u1).q();
            f f0 = o0 instanceof f ? ((f)o0) : null;
            s s5 = f0 == null ? null : f0.i;
            if(s5 instanceof x) {
                s0 = (x)s5;
            }
            if(s0 != null) {
                Method method0 = s0.a;
                if(method0 != null) {
                    return new R2.h(method0);
                }
            }
            throw new H2.a("Incorrect resolution sequence for Java method " + u1, 1);
        }
        if(u1 instanceof i3.b) {
            O o1 = ((i3.b)u1).q();
            f f1 = o1 instanceof f ? ((f)o1) : null;
            if(f1 != null) {
                s0 = f1.i;
            }
            if(s0 instanceof r) {
                return new R2.g(((r)s0).a);
            }
            if(!(s0 instanceof o) || !((o)s0).a.isAnnotation()) {
                throw new H2.a("Incorrect resolution sequence for Java constructor " + u1 + " (" + s0 + ')', 1);
            }
            return new R2.f(((o)s0).a);
        }
        if((!((m)u1).getName().equals(U2.n.c) || !y3.l.n(u1)) && (!((m)u1).getName().equals(U2.n.a) || !y3.l.n(u1)) && (!J2.j.a(((m)u1).getName(), W2.a.e) || !u1.z0().isEmpty())) {
            throw new H2.a("Unknown origin of " + u1 + " (" + u1.getClass() + ')', 1);
        }
        return v0.a(u1);
    }
}

