package l3;

import B.c;
import F3.n;
import J2.j;
import M1.f;
import M3.A;
import M3.F;
import M3.H;
import M3.K;
import M3.N;
import M3.Q;
import M3.V;
import M3.a0;
import M3.d;
import M3.w;
import O3.k;
import O3.l;
import U2.h;
import X2.T;
import java.util.ArrayList;
import java.util.List;
import o2.G;

public final class e extends Q {
    public final c b;
    public static final a c;
    public static final a d;

    static {
        e.c = a.a(android.support.v4.media.session.a.P(V.j, false, null, 5), b.k, false, null, null, 61);
        e.d = a.a(android.support.v4.media.session.a.P(V.j, false, null, 5), b.j, false, null, null, 61);
    }

    public e() {
        this.b = new c(new f(15));
    }

    @Override  // M3.Q
    public final N d(w w0) {
        return new F(this.h(w0, new a(V.j, false, false, null, 62)));
    }

    public final w2.e g(A a0, X2.e e0, a a1) {
        if(a0.H0().o().isEmpty()) {
            return new w2.e(a0, Boolean.FALSE);
        }
        if(h.y(a0)) {
            N n0 = (N)a0.A0().get(0);
            a0 a00 = n0.a();
            w w0 = n0.b();
            j.e(w0, "getType(...)");
            List list0 = G.p(new F(this.h(w0, a1), a00));
            return new w2.e(d.r(a0.G0(), a0.H0(), list0, a0.I0()), Boolean.FALSE);
        }
        if(M3.c.i(a0)) {
            String[] arr_s = {a0.H0().toString()};
            return new w2.e(l.c(k.v, arr_s), Boolean.FALSE);
        }
        n n1 = e0.S(this);
        j.e(n1, "getMemberScope(...)");
        H h0 = a0.G0();
        K k0 = e0.B();
        j.e(k0, "getTypeConstructor(...)");
        List list1 = e0.B().o();
        j.e(list1, "getParameters(...)");
        ArrayList arrayList0 = new ArrayList(x2.k.E(list1));
        for(Object object0: list1) {
            j.c(((T)object0));
            w w1 = this.b.w(((T)object0), a1);
            arrayList0.add(f.a(((T)object0), a1, this.b, w1));
        }
        return new w2.e(d.t(h0, k0, arrayList0, a0.I0(), n1, new A3.h(e0, this, a0, a1)), Boolean.TRUE);
    }

    public final w h(w w0, a a0) {
        X2.h h0 = w0.H0().q();
        if(h0 instanceof T) {
            a0.getClass();
            a a1 = a.a(a0, null, true, null, null, 59);
            return this.h(this.b.w(((T)h0), a1), a0);
        }
        if(!(h0 instanceof X2.e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + h0).toString());
        }
        X2.h h1 = M3.c.y(w0).H0().q();
        if(!(h1 instanceof X2.e)) {
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + h1 + "\" while for lower it\'s \"" + h0 + '\"').toString());
        }
        w2.e e0 = this.g(M3.c.k(w0), ((X2.e)h0), e.c);
        A a2 = (A)e0.i;
        w2.e e1 = this.g(M3.c.y(w0), ((X2.e)h1), e.d);
        A a3 = (A)e1.i;
        return !((Boolean)e0.j).booleanValue() && !((Boolean)e1.j).booleanValue() ? d.j(a2, a3) : new g(a2, a3);
    }
}

