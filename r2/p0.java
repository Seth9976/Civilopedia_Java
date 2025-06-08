package R2;

import A3.m;
import J2.j;
import J2.o;
import K3.n;
import O2.q;
import O2.r;
import O2.u;
import X2.T;
import X2.c;
import X2.e;
import X2.h;
import X2.k;
import c3.b;
import kotlin.NoWhenBranchMatchedException;
import o1.a;
import o3.f;

public final class p0 implements r, B {
    public final T i;
    public final s0 j;
    public final q0 k;
    public static final q[] l;

    static {
        o o0 = new o(J2.r.a.b(p0.class), "upperBounds", "getUpperBounds()Ljava/util/List;");
        p0.l = new q[]{J2.r.a.e(o0)};
    }

    public p0(q0 q00, T t0) {
        j.f(t0, "descriptor");
        A a0;
        super();
        this.i = t0;
        b b0 = null;
        this.j = a.H(null, new m(this, 17));
        if(q00 == null) {
            k k0 = t0.p();
            j.e(k0, "getContainingDeclaration(...)");
            if(k0 instanceof e) {
                a0 = p0.c(((e)k0));
                j.c(a0);
                q00 = a0;
            }
            else {
                if(!(k0 instanceof c)) {
                    throw new H2.a("Unknown type parameter container: " + k0, 1);
                }
                k k1 = ((c)k0).p();
                j.e(k1, "getContainingDeclaration(...)");
                if(k1 instanceof e) {
                    a0 = k0.c0(new T1.c(p0.c(((e)k1))), w2.k.a);
                    j.c(a0);
                    q00 = a0;
                }
                else {
                    K3.o o0 = k0 instanceof K3.o ? ((K3.o)k0) : null;
                    if(o0 == null) {
                        throw new H2.a("Non-class callable descriptor must be deserialized: " + k0, 1);
                    }
                    n n0 = o0.x();
                    f f0 = n0 instanceof f ? ((f)n0) : null;
                    b b1 = f0 == null ? null : f0.k;
                    if(b1 instanceof b) {
                        b0 = b1;
                    }
                    if(b0 != null) {
                        Class class0 = b0.a;
                        if(class0 != null) {
                            a0 = k0.c0(new T1.c(((A)O2.A.E(class0))), w2.k.a);
                            j.c(a0);
                            q00 = a0;
                            this.k = q00;
                            return;
                        }
                    }
                    throw new H2.a("Container of deserialized member is not resolved: " + o0, 1);
                }
            }
        }
        this.k = q00;
    }

    public final String a() {
        String s = this.i.getName().b();
        j.e(s, "asString(...)");
        return s;
    }

    @Override  // R2.B
    public final h b() {
        return this.i;
    }

    public static A c(e e0) {
        Class class0 = x0.k(e0);
        O2.c c0 = class0 == null ? null : O2.A.E(class0);
        if(((A)c0) == null) {
            throw new H2.a("Type parameter container is not resolved: " + e0.p(), 1);
        }
        return (A)c0;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof p0 && j.a(this.k, ((p0)object0).k) && this.a().equals(((p0)object0).a());
    }

    @Override
    public final int hashCode() {
        return this.a().hashCode() + this.k.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        u u0;
        StringBuilder stringBuilder0 = new StringBuilder();
        switch(this.i.b0().ordinal()) {
            case 0: {
                u0 = u.i;
                break;
            }
            case 1: {
                u0 = u.j;
                break;
            }
            case 2: {
                u0 = u.k;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        switch(u0.ordinal()) {
            case 1: {
                stringBuilder0.append("in ");
                break;
            }
            case 2: {
                stringBuilder0.append("out ");
            }
        }
        stringBuilder0.append(this.a());
        String s = stringBuilder0.toString();
        j.e(s, "toString(...)");
        return s;
    }
}

