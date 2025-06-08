package l3;

import J2.j;
import M3.A;
import M3.H;
import M3.N;
import M3.Z;
import M3.q;
import M3.w;
import N3.d;
import N3.f;
import X2.h;
import Y3.n;
import java.util.ArrayList;
import o1.a;
import o2.G;
import w2.e;
import x2.i;
import x2.k;

public final class g extends q {
    public g(A a0, A a1) {
        j.f(a0, "lowerBound");
        j.f(a1, "upperBound");
        super(a0, a1);
        d.a.b(a0, a1);
    }

    @Override  // M3.w
    public final w J0(f f0) {
        j.f(f0, "kotlinTypeRefiner");
        j.f(this.j, "type");
        j.f(this.k, "type");
        return new g(this.j, this.k);  // 初始化器: LM3/q;-><init>(LM3/A;LM3/A;)V
    }

    @Override  // M3.Z
    public final Z L0(boolean z) {
        return new g(this.j.O0(z), this.k.O0(z));
    }

    @Override  // M3.Z
    public final Z M0(f f0) {
        j.f(f0, "kotlinTypeRefiner");
        j.f(this.j, "type");
        j.f(this.k, "type");
        return new g(this.j, this.k);  // 初始化器: LM3/q;-><init>(LM3/A;LM3/A;)V
    }

    @Override  // M3.Z
    public final Z N0(H h0) {
        j.f(h0, "newAttributes");
        return new g(this.j.P0(h0), this.k.P0(h0));
    }

    @Override  // M3.q
    public final A O0() {
        return this.j;
    }

    @Override  // M3.q
    public final String P0(x3.g g0, x3.g g1) {
        j.f(g0, "renderer");
        A a0 = this.j;
        String s = g0.V(a0);
        A a1 = this.k;
        String s1 = g0.V(a1);
        if(g1.a.l()) {
            return "raw (" + s + ".." + s1 + ')';
        }
        if(a1.A0().isEmpty()) {
            return g0.C(s, s1, a.u(this));
        }
        ArrayList arrayList0 = g.Q0(g0, a0);
        ArrayList arrayList1 = g.Q0(g0, a1);
        String s2 = i.Y(arrayList0, ", ", null, null, l3.f.i, 30);
        ArrayList arrayList2 = i.v0(arrayList0, arrayList1);
        if(!arrayList2.isEmpty()) {
            for(Object object0: arrayList2) {
                String s3 = n.C0(((String)((e)object0).j), "out ");
                if(!j.a(((String)((e)object0).i), s3) && !((String)((e)object0).j).equals("*")) {
                    goto label_21;
                }
            }
        }
        s1 = g.R0(s1, s2);
    label_21:
        String s4 = g.R0(s, s2);
        return j.a(s4, s1) ? s4 : g0.C(s4, s1, a.u(this));
    }

    public static final ArrayList Q0(x3.g g0, w w0) {
        Iterable iterable0 = w0.A0();
        ArrayList arrayList0 = new ArrayList(k.E(iterable0));
        for(Object object0: iterable0) {
            g0.getClass();
            j.f(((N)object0), "typeProjection");
            StringBuilder stringBuilder0 = new StringBuilder();
            i.X(G.p(((N)object0)), stringBuilder0, null, null, new x3.f(g0, 0), 60);
            String s = stringBuilder0.toString();
            j.e(s, "toString(...)");
            arrayList0.add(s);
        }
        return arrayList0;
    }

    public static final String R0(String s, String s1) {
        String s2;
        j.f(s, "<this>");
        if(n.y0(s, '<', 0, 2) >= 0) {
            StringBuilder stringBuilder0 = new StringBuilder();
            j.f(s, "<this>");
            int v = n.y0(s, '<', 0, 6);
            if(v == -1) {
                s2 = s;
            }
            else {
                s2 = s.substring(0, v);
                j.e(s2, "substring(...)");
            }
            stringBuilder0.append(s2);
            stringBuilder0.append('<');
            stringBuilder0.append(s1);
            stringBuilder0.append('>');
            stringBuilder0.append(n.J0(s, '>'));
            return stringBuilder0.toString();
        }
        return s;
    }

    @Override  // M3.q
    public final F3.n x0() {
        h h0 = this.H0().q();
        X2.e e0 = h0 instanceof X2.e ? ((X2.e)h0) : null;
        if(e0 == null) {
            throw new IllegalStateException(("Incorrect classifier: " + this.H0().q()).toString());
        }
        F3.n n0 = e0.S(new l3.e());
        j.e(n0, "getMemberScope(...)");
        return n0;
    }
}

