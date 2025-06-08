package R2;

import J2.j;
import J2.o;
import J2.r;
import O2.n;
import O2.q;
import S2.g;
import X2.L;
import a3.J;
import o1.a;
import w2.c;
import w2.d;
import x2.w;

public abstract class i0 extends g0 implements n {
    public final s0 l;
    public final Object m;
    public static final q[] n;

    static {
        o o0 = new o(r.a.b(i0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;");
        i0.n = new q[]{r.a.e(o0)};
    }

    public i0() {
        this.l = a.H(null, new h0(this, 1));
        h0 h00 = new h0(this, 0);
        this.m = w.p(d.i, h00);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof i0 && j.a(this.t(), ((i0)object0).t());
    }

    @Override  // O2.b
    public final String getName() {
        return "<get-" + this.t().m + '>';
    }

    @Override
    public final int hashCode() {
        return this.t().hashCode();
    }

    @Override  // R2.r
    public final g i() {
        return (g)((c)this.m).getValue();
    }

    @Override  // R2.r
    public final X2.c l() {
        q q0 = i0.n[0];
        Object object0 = this.l.invoke();
        j.e(object0, "getValue(...)");
        return (J)object0;
    }

    @Override  // R2.g0
    public final L s() {
        q q0 = i0.n[0];
        Object object0 = this.l.invoke();
        j.e(object0, "getValue(...)");
        return (J)object0;
    }

    @Override
    public final String toString() {
        return "getter of " + this.t();
    }
}

