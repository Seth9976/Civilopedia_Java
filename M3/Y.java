package M3;

import F3.n;
import I2.a;
import I3.A;
import J2.j;
import J2.l;
import L3.i;
import L3.k;
import L3.m;
import N3.f;
import java.util.List;

public final class y extends w {
    public final m j;
    public final l k;
    public final i l;

    public y(m m0, a a0) {
        j.f(m0, "storageManager");
        super();
        this.j = m0;
        this.k = (l)a0;
        this.l = new i(m0, a0);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    @Override  // M3.w
    public final List A0() {
        return this.L0().A0();
    }

    @Override  // M3.w
    public final H G0() {
        return this.L0().G0();
    }

    @Override  // M3.w
    public final K H0() {
        return this.L0().H0();
    }

    @Override  // M3.w
    public final boolean I0() {
        return this.L0().I0();
    }

    @Override  // M3.w
    public final w J0(f f0) {
        j.f(f0, "kotlinTypeRefiner");
        A a0 = new A(2, f0, this);
        return new y(this.j, a0);
    }

    @Override  // M3.w
    public final Z K0() {
        w w0;
        for(w0 = this.L0(); w0 instanceof y; w0 = ((y)w0).L0()) {
        }
        j.d(w0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (Z)w0;
    }

    public final w L0() {
        return (w)this.l.invoke();
    }

    @Override
    public final String toString() {
        return this.l.k == k.i || this.l.k == k.j ? "<Not computed yet>" : this.L0().toString();
    }

    @Override  // M3.w
    public final n x0() {
        return this.L0().x0();
    }
}

