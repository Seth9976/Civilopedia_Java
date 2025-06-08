package R2;

import J2.j;
import J2.o;
import J2.r;
import O2.g;
import O2.q;
import X2.L;
import a3.K;
import o1.a;
import w2.c;
import w2.d;
import x2.w;

public abstract class k0 extends g0 implements g {
    public final s0 l;
    public final Object m;
    public static final q[] n;

    static {
        o o0 = new o(r.a.b(k0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;");
        k0.n = new q[]{r.a.e(o0)};
    }

    public k0() {
        this.l = a.H(null, new j0(this, 1));
        j0 j00 = new j0(this, 0);
        this.m = w.p(d.i, j00);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof k0 && j.a(this.t(), ((k0)object0).t());
    }

    @Override  // O2.b
    public final String getName() {
        return "<set-" + this.t().m + '>';
    }

    @Override
    public final int hashCode() {
        return this.t().hashCode();
    }

    @Override  // R2.r
    public final S2.g i() {
        return (S2.g)((c)this.m).getValue();
    }

    @Override  // R2.r
    public final X2.c l() {
        q q0 = k0.n[0];
        Object object0 = this.l.invoke();
        j.e(object0, "getValue(...)");
        return (K)object0;
    }

    @Override  // R2.g0
    public final L s() {
        q q0 = k0.n[0];
        Object object0 = this.l.invoke();
        j.e(object0, "getValue(...)");
        return (K)object0;
    }

    @Override
    public final String toString() {
        return "setter of " + this.t();
    }
}

