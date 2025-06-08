package I3;

import B.c;
import E1.d;
import J2.j;
import K3.l;
import K3.w;
import K3.z;
import X2.F;
import X2.O;
import X2.P;
import X2.k;
import Y2.g;
import Y2.h;
import a3.C;
import a3.J;
import a3.K;
import a3.S;
import java.util.ArrayList;
import java.util.List;
import l.L0;
import o1.a;
import q3.A;
import q3.G;
import q3.Q;
import q3.Z;
import q3.f0;
import q3.y;
import s3.b;
import s3.e;
import s3.f;
import x2.r;

public final class s {
    public final d a;
    public final c b;

    public s(d d0) {
        j.f(d0, "c");
        super();
        this.a = d0;
        this.b = new c(((i)d0.i).b, ((i)d0.i).l);
    }

    public final v a(k k0) {
        if(k0 instanceof F) {
            return new u(((C)(((F)k0))).m, ((f)this.a.j), ((a3.s)this.a.l), ((o3.f)this.a.o));
        }
        return k0 instanceof l ? ((l)k0).D : null;
    }

    public final h b(w3.l l0, int v, int v1) {
        return !e.c.c(v).booleanValue() ? g.a : new z(((i)this.a.i).a, new o(this, l0, v1, 0));
    }

    public final h c(G g0, boolean z) {
        return !e.c.c(g0.l).booleanValue() ? g.a : new z(((i)this.a.i).a, new p(this, z, g0));
    }

    public final K3.c d(q3.l l0, boolean z) {
        k k0 = (k)this.a.k;
        j.d(k0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        K3.c c0 = new K3.c(((X2.e)k0), null, this.b(l0, l0.l, 1), z, 1, l0, ((f)this.a.j), ((a3.s)this.a.l), ((s3.g)this.a.m), ((o3.f)this.a.o), null);
        d d0 = d.c(this.a, c0, r.i);
        List list0 = l0.m;
        j.e(list0, "getValueParameterList(...)");
        c0.a1(((s)d0.q).g(list0, l0, 1), a.n(((f0)e.d.c(l0.l))));
        c0.W0(((X2.e)k0).k());
        c0.z = ((X2.e)k0).Z();
        c0.D = !e.o.c(l0.l).booleanValue();
        return c0;
    }

    public final w e(y y0) {
        a3.v v3;
        j.f(y0, "proto");
        int v = (y0.k & 1) == 1 ? y0.l : (y0.m >> 8 << 6) + (y0.m & 0x3F);
        h h0 = this.b(y0, v, 1);
        Y2.f f0 = g.a;
        d d0 = this.a;
        K3.a a0 = y0.p() || (y0.k & 0x40) == 0x40 ? new K3.a(((i)d0.i).a, new o(this, y0, 1, 1)) : f0;
        v3.c c0 = C3.e.g(((k)d0.k));
        int v1 = y0.n;
        f f1 = (f)d0.j;
        s3.g g0 = c0.c(android.support.v4.media.session.a.w(f1, v1)).equals(I3.y.a) ? s3.g.b : ((s3.g)d0.m);
        v3.f f2 = android.support.v4.media.session.a.w(f1, y0.n);
        int v2 = a.I(((q3.z)e.p.c(v)));
        a3.s s0 = (a3.s)d0.l;
        w w0 = new w(((k)d0.k), null, h0, f2, v2, y0, ((f)d0.j), s0, g0, ((o3.f)d0.o), null);
        List list0 = y0.q;
        j.e(list0, "getTypeParameterList(...)");
        d d1 = d.c(d0, w0, list0);
        Q q0 = o2.C.u(y0, s0);
        L0 l00 = (L0)d1.p;
        if(q0 == null) {
            v3 = null;
        }
        else {
            M3.w w1 = l00.g(q0);
            v3 = w1 == null ? null : y3.l.k(w0, w1, a0);
        }
        k k0 = (k)d0.k;
        X2.e e0 = k0 instanceof X2.e ? ((X2.e)k0) : null;
        a3.v v4 = e0 == null ? null : e0.F0();
        List list1 = y0.t.isEmpty() ? null : y0.t;
        if(list1 == null) {
            List list2 = y0.u;
            j.e(list2, "getContextReceiverTypeIdList(...)");
            ArrayList arrayList0 = new ArrayList(x2.k.E(list2));
            for(Object object0: list2) {
                j.c(((Integer)object0));
                arrayList0.add(s0.a(((int)(((Integer)object0)))));
            }
            list1 = arrayList0;
        }
        ArrayList arrayList1 = new ArrayList();
        int v5 = 0;
        for(Object object1: list1) {
            if(v5 >= 0) {
                a3.v v6 = y3.l.e(w0, l00.g(((Q)object1)), null, f0, v5);
                if(v6 != null) {
                    arrayList1.add(v6);
                }
                ++v5;
                continue;
            }
            x2.j.D();
            throw null;
        }
        List list3 = l00.b();
        List list4 = y0.w;
        j.e(list4, "getValueParameterList(...)");
        w0.a1(v3, v4, arrayList1, list3, ((s)d1.q).g(list4, y0, 1), l00.g(o2.C.v(y0, s0)), I3.j.f(((A)e.e.c(v))), a.n(((f0)e.d.c(v))), x2.s.i);
        w0.u = e.q.c(v).booleanValue();
        w0.v = e.r.c(v).booleanValue();
        w0.w = e.u.c(v).booleanValue();
        w0.x = e.s.c(v).booleanValue();
        w0.y = e.t.c(v).booleanValue();
        w0.C = e.v.c(v).booleanValue();
        w0.z = e.w.c(v).booleanValue();
        w0.D = !e.x.c(v).booleanValue();
        ((i)d0.i).m.getClass();
        return w0;
    }

    public final K3.v f(G g0) {
        K k3;
        J j2;
        J j1;
        J j0;
        int v10;
        d d3;
        s3.c c3;
        d d2;
        b b6;
        s3.c c2;
        b b5;
        b b4;
        a3.v v4;
        Q q1;
        j.f(g0, "proto");
        int v = (g0.k & 1) == 1 ? g0.l : (g0.m >> 8 << 6) + (g0.m & 0x3F);
        k k0 = (k)this.a.k;
        h h0 = this.b(g0, v, 2);
        X2.y y0 = I3.j.f(((A)e.e.c(v)));
        X2.o o0 = a.n(((f0)e.d.c(v)));
        boolean z = e.y.c(v).booleanValue();
        v3.f f0 = android.support.v4.media.session.a.w(((f)this.a.j), g0.n);
        int v1 = a.I(((q3.z)e.p.c(v)));
        boolean z1 = e.C.c(v).booleanValue();
        boolean z2 = e.B.c(v).booleanValue();
        boolean z3 = e.E.c(v).booleanValue();
        boolean z4 = e.F.c(v).booleanValue();
        boolean z5 = e.G.c(v).booleanValue();
        a3.s s0 = (a3.s)this.a.l;
        K3.v v2 = new K3.v(k0, null, h0, y0, o0, z, f0, v1, z1, z2, z3, z4, z5, g0, ((f)this.a.j), s0, ((s3.g)this.a.m), ((o3.f)this.a.o));
        List list0 = g0.q;
        j.e(list0, "getTypeParameterList(...)");
        d d0 = this.a;
        d d1 = d.c(d0, v2, list0);
        boolean z6 = e.z.c(v).booleanValue();
        Y2.f f1 = g.a;
        if(z6 && (g0.p() || (g0.k & 0x40) == 0x40)) {
            f1 = new K3.a(((i)d0.i).a, new o(this, g0, 3, 1));
        }
        Q q0 = o2.C.w(g0, s0);
        L0 l00 = (L0)d1.p;
        M3.w w0 = l00.g(q0);
        List list1 = l00.b();
        k k1 = (k)d0.k;
        X2.e e0 = k1 instanceof X2.e ? ((X2.e)k1) : null;
        a3.v v3 = e0 == null ? null : e0.F0();
        if(g0.p()) {
            q1 = g0.r;
        }
        else {
            q1 = (g0.k & 0x40) == 0x40 ? s0.a(g0.s) : null;
        }
        if(q1 == null) {
            v4 = null;
        }
        else {
            M3.w w1 = l00.g(q1);
            v4 = w1 == null ? null : y3.l.k(v2, w1, f1);
        }
        List list2 = g0.t.isEmpty() ? null : g0.t;
        if(list2 == null) {
            List list3 = g0.u;
            j.e(list3, "getContextReceiverTypeIdList(...)");
            ArrayList arrayList0 = new ArrayList(x2.k.E(list3));
            for(Object object0: list3) {
                j.c(((Integer)object0));
                arrayList0.add(s0.a(((int)(((Integer)object0)))));
            }
            list2 = arrayList0;
        }
        ArrayList arrayList1 = new ArrayList(x2.k.E(list2));
        int v5 = 0;
        for(Object object1: list2) {
            if(v5 >= 0) {
                arrayList1.add(y3.l.e(v2, ((L0)d1.p).g(((Q)object1)), null, g.a, v5));
                ++v5;
                continue;
            }
            x2.j.D();
            throw null;
        }
        v2.T0(w0, list1, v3, v4, arrayList1);
        b b0 = e.c;
        boolean z7 = b0.c(v).booleanValue();
        s3.c c0 = e.d;
        f0 f00 = (f0)c0.c(v);
        s3.c c1 = e.e;
        A a0 = (A)c1.c(v);
        if(f00 != null) {
            if(a0 != null) {
                int v6 = a0.a();
                int v7 = f00.a();
                int v8 = (z7 ? 1 << b0.a : 0) | v6 << c1.a | v7 << c0.a;
                b b1 = e.K;
                b1.getClass();
                b b2 = e.L;
                b2.getClass();
                b b3 = e.M;
                b3.getClass();
                P p0 = O.b;
                if(z6) {
                    int v9 = (g0.k & 0x100) == 0x100 ? g0.x : v8;
                    boolean z8 = b1.c(v9).booleanValue();
                    boolean z9 = b2.c(v9).booleanValue();
                    boolean z10 = b3.c(v9).booleanValue();
                    h h1 = this.b(g0, v9, 3);
                    if(z8) {
                        b4 = b3;
                        b5 = b2;
                        c2 = c1;
                        b6 = b1;
                        d2 = d0;
                        c3 = c0;
                        d3 = d1;
                        v10 = v;
                        j0 = new J(v2, h1, I3.j.f(((A)c1.c(v9))), a.n(((f0)c0.c(v9))), false, z9, z10, v2.j(), null, p0);
                    }
                    else {
                        b4 = b3;
                        b5 = b2;
                        b6 = b1;
                        c2 = c1;
                        d2 = d0;
                        d3 = d1;
                        c3 = c0;
                        v10 = v;
                        j0 = y3.l.f(v2, h1);
                    }
                    j0.P0(v2.r());
                    j1 = j0;
                }
                else {
                    b4 = b3;
                    b5 = b2;
                    b6 = b1;
                    c2 = c1;
                    d2 = d0;
                    d3 = d1;
                    c3 = c0;
                    v10 = v;
                    j1 = null;
                }
                if(e.A.c(v10).booleanValue()) {
                    int v11 = (g0.k & 0x200) == 0x200 ? g0.y : v8;
                    boolean z11 = b6.c(v11).booleanValue();
                    boolean z12 = b5.c(v11).booleanValue();
                    boolean z13 = b4.c(v11).booleanValue();
                    h h2 = this.b(g0, v11, 4);
                    if(z11) {
                        j2 = j1;
                        K k2 = new K(v2, h2, I3.j.f(((A)c2.c(v11))), a.n(((f0)c3.c(v11))), false, z12, z13, v2.j(), null, p0);
                        d d4 = d.c(d3, k2, r.i);
                        List list4 = o2.G.p(g0.w);
                        S s1 = (S)x2.i.i0(((s)d4.q).g(list4, g0, 4));
                        if(s1 != null) {
                            k2.u = s1;
                            k3 = k2;
                            goto label_146;
                        }
                        K.G0(6);
                        throw null;
                    }
                    else {
                        j2 = j1;
                        k3 = y3.l.g(v2, h2);
                    }
                }
                else {
                    j2 = j1;
                    k3 = null;
                }
            label_146:
                if(e.D.c(v10).booleanValue()) {
                    v2.R0(null, new q(this, g0, v2, 1));
                }
                k k4 = (k)d2.k;
                X2.e e1 = k4 instanceof X2.e ? ((X2.e)k4) : null;
                if((e1 == null ? null : e1.j()) == X2.f.m) {
                    v2.R0(null, new q(this, g0, v2, 3));
                }
                v2.Q0(j2, k3, new a3.r(this.c(g0, false)), new a3.r(this.c(g0, true)));  // 初始化器: LG3/a;-><init>(LY2/h;)V / 初始化器: LG3/a;-><init>(LY2/h;)V
                return v2;
            }
            e.a(11);
            throw null;
        }
        e.a(10);
        throw null;
    }

    public final List g(List list0, w3.l l0, int v) {
        Q q1;
        d d0 = this.a;
        k k0 = (k)d0.k;
        j.d(k0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        k k1 = ((X2.b)k0).p();
        j.e(k1, "getContainingDeclaration(...)");
        v v1 = this.a(k1);
        ArrayList arrayList0 = new ArrayList(x2.k.E(list0));
        int v2 = 0;
        for(Object object0: list0) {
            if(v2 >= 0) {
                int v3 = (((Z)object0).k & 1) == 1 ? ((Z)object0).l : 0;
                Y2.f f0 = v1 == null || !e.c.c(v3).booleanValue() ? g.a : new z(((i)d0.i).a, new I3.r(this, v1, l0, v, v2, ((Z)object0)));
                v3.f f1 = android.support.v4.media.session.a.w(((f)d0.j), ((Z)object0).m);
                a3.s s0 = (a3.s)d0.l;
                Q q0 = o2.C.y(((Z)object0), s0);
                L0 l00 = (L0)d0.p;
                M3.w w0 = l00.g(q0);
                boolean z = e.H.c(v3).booleanValue();
                boolean z1 = e.I.c(v3).booleanValue();
                boolean z2 = e.J.c(v3).booleanValue();
                int v4 = ((Z)object0).k;
                if((v4 & 16) == 16) {
                    q1 = ((Z)object0).p;
                }
                else {
                    q1 = (v4 & 0x20) == 0x20 ? s0.a(((Z)object0).q) : null;
                }
                arrayList0.add(new S(((X2.b)k0), null, v2, f0, f1, w0, z, z1, z2, (q1 == null ? null : l00.g(q1)), O.b));
                ++v2;
                continue;
            }
            x2.j.D();
            throw null;
        }
        return x2.i.o0(arrayList0);
    }
}

