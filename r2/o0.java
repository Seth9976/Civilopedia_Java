package R2;

import I2.a;
import I3.A;
import J2.j;
import J2.k;
import J2.o;
import J2.r;
import M3.N;
import M3.X;
import M3.w;
import O2.d;
import O2.q;
import X2.S;
import X2.T;
import X2.e;
import X2.h;
import java.lang.reflect.Array;
import java.util.List;
import x2.i;

public final class o0 implements k {
    public final w a;
    public final s0 b;
    public final s0 c;
    public final s0 d;
    public static final q[] e;

    static {
        o o0 = new o(r.a.b(o0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;");
        o o1 = new o(r.a.b(o0.class), "arguments", "getArguments()Ljava/util/List;");
        o0.e = new q[]{r.a.e(o0), r.a.e(o1)};
    }

    public o0(w w0, a a0) {
        j.f(w0, "type");
        super();
        this.a = w0;
        s0 s00 = a0 instanceof s0 ? ((s0)a0) : null;
        if(s00 == null) {
            s00 = a0 == null ? null : o1.a.H(null, a0);
        }
        this.b = s00;
        this.c = o1.a.H(null, new n0(this, 1));
        this.d = o1.a.H(null, new A(5, this, a0));
    }

    public final d a(w w0) {
        h h0 = w0.H0().q();
        if(h0 instanceof e) {
            Class class0 = x0.k(((e)h0));
            if(class0 == null) {
                return null;
            }
            if(class0.isArray()) {
                N n0 = (N)i.k0(w0.A0());
                if(n0 != null) {
                    w w1 = n0.b();
                    if(w1 != null) {
                        d d0 = this.a(w1);
                        if(d0 == null) {
                            throw new H2.a("Cannot determine classifier for array element type: " + this, 1);
                        }
                        return new R2.A(Array.newInstance(O2.A.y(O2.A.D(d0)), 0).getClass());
                    }
                }
                return new R2.A(class0);
            }
            if(!X.e(w0)) {
                Class class1 = (Class)d3.d.b.get(class0);
                if(class1 != null) {
                    class0 = class1;
                }
                return new R2.A(class0);
            }
            return new R2.A(class0);
        }
        if(h0 instanceof T) {
            return new p0(null, ((T)h0));
        }
        if(h0 instanceof S) {
            throw new H2.a("An operation is not implemented: Type alias classifiers are not yet supported");  // 初始化器: Ljava/lang/Error;-><init>(Ljava/lang/String;)V
        }
        return null;
    }

    public final List b() {
        q q0 = o0.e[1];
        Object object0 = this.d.invoke();
        j.e(object0, "getValue(...)");
        return (List)object0;
    }

    public final d c() {
        q q0 = o0.e[0];
        return (d)this.c.invoke();
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof o0 && j.a(this.a, ((o0)object0).a) && j.a(this.c(), ((o0)object0).c()) && this.b().equals(((o0)object0).b());
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        d d0 = this.c();
        return d0 == null ? this.b().hashCode() + v * 961 : this.b().hashCode() + (v * 0x1F + d0.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return u0.d(this.a);
    }
}

