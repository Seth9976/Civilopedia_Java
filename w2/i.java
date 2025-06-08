package W2;

import I3.A;
import J2.j;
import J2.o;
import J2.r;
import L3.m;
import O2.q;
import U2.h;
import U2.k;
import Z2.b;
import Z2.d;
import android.support.v4.media.session.a;

public final class i extends h {
    public k f;
    public final L3.i g;
    public static final q[] h;

    static {
        o o0 = new o(r.a.b(i.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;");
        i.h = new q[]{r.a.e(o0)};
    }

    public i(m m0) {
        super(m0);
        this.g = new L3.i(m0, new A(8, this, m0));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    public final W2.o I() {
        return (W2.o)a.A(this.g, i.h[0]);
    }

    @Override  // U2.h
    public final b d() {
        return this.I();
    }

    @Override  // U2.h
    public final Iterable l() {
        Iterable iterable0 = super.l();
        a3.A a0 = this.k();
        j.e(a0, "getBuiltInsModule(...)");
        return x2.i.d0(iterable0, new g(this.d, a0));
    }

    @Override  // U2.h
    public final d p() {
        return this.I();
    }
}

