package x3;

import A3.t;
import I2.b;
import J2.j;
import M3.A;
import M3.K;
import M3.N;
import M3.X;
import M3.Z;
import M3.c;
import M3.m;
import O2.q;
import O3.l;
import X2.D;
import X2.F;
import X2.M;
import X2.S;
import X2.T;
import X2.W;
import X2.p;
import X2.w;
import X2.x;
import X2.y;
import Y3.n;
import a3.J;
import a3.r;
import a3.v;
import i3.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import o2.C;
import o2.G;
import q2.a;
import v3.f;
import w2.h;
import z1.a0;

public final class g implements i {
    public final k a;
    public final h b;
    public static final g c;
    public static final g d;
    public static final g e;

    static {
        C.A(d.l);
        C.A(d.j);
        C.A(d.k);
        C.A(d.m);
        C.A(d.r);
        g.c = C.A(d.o);
        C.A(d.p);
        g.d = C.A(d.s);
        g.e = C.A(d.n);
        C.A(d.q);
    }

    public g(k k0) {
        this.a = k0;
        this.b = new h(new a(this, 3));
    }

    public final void A(StringBuilder stringBuilder0, A a0) {
        X2.i i0 = null;
        this.w(stringBuilder0, a0, null);
        if(c.i(a0)) {
            k k0 = this.a;
            if(!(a0 instanceof O3.i) || !((O3.i)a0).l.j || !((Boolean)k0.U.a(k.X[46], k0)).booleanValue()) {
                if(!(a0 instanceof O3.i) || ((Boolean)k0.W.a(k.X[0x30], k0)).booleanValue()) {
                    stringBuilder0.append(a0.H0().toString());
                }
                else {
                    stringBuilder0.append(((O3.i)a0).p);
                }
                stringBuilder0.append(this.W(a0.A0()));
            }
            else {
                if(a0 instanceof O3.i) {
                    O3.i i1 = (O3.i)a0;
                }
                K k1 = a0.H0();
                j.d(k1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                stringBuilder0.append(this.B(((O3.j)k1).b[0]));
            }
        }
        else {
            K k2 = a0.H0();
            X2.h h0 = a0.H0().q();
            if(h0 instanceof X2.i) {
                i0 = (X2.i)h0;
            }
            B1.a a1 = w.a(a0, i0, 0);
            if(a1 == null) {
                stringBuilder0.append(this.X(k2));
                stringBuilder0.append(this.W(a0.A0()));
            }
            else {
                this.R(stringBuilder0, a1);
            }
        }
        if(a0.I0()) {
            stringBuilder0.append("?");
        }
        if(a0 instanceof m) {
            stringBuilder0.append(" & Any");
        }
    }

    public final String B(String s) {
        switch(this.q().ordinal()) {
            case 0: {
                return s;
            }
            case 1: {
                return e.f("<font color=red><b>", s, "</b></font>");
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final String C(String s, String s1, U2.h h0) {
        j.f(s, "lowerRendered");
        j.f(s1, "upperRendered");
        if(G.v(s, s1)) {
            return n.H0(s1, "(") ? e.f("(", s, ")!") : s + "!";
        }
        String s2 = n.K0(this.n().a(h0.i(U2.m.B), this), "Collection");
        String s3 = G.u(s, s2 + "Mutable", s1, s2, s2 + "(Mutable)");
        if(s3 != null) {
            return s3;
        }
        String s4 = G.u(s, s2 + "MutableMap.MutableEntry", s1, s2 + "Map.Entry", s2 + "(Mutable)Map.(Mutable)Entry");
        if(s4 != null) {
            return s4;
        }
        String s5 = n.K0(this.n().a(h0.j("Array"), this), "Array");
        String s6 = G.u(s, s5 + this.m("Array<"), s1, s5 + this.m("Array<out "), s5 + this.m("Array<(out) "));
        return s6 == null ? "(" + s + ".." + s1 + ')' : s6;
    }

    public final String D(M3.w w0) {
        String s = this.V(w0);
        return (!g.g0(w0) || X.e(w0)) && !(w0 instanceof m) ? s : "(" + s + ')';
    }

    public final void E(W w0, StringBuilder stringBuilder0) {
        if(((Boolean)this.a.u.a(k.X[19], this.a)).booleanValue()) {
            A3.g g0 = w0.u0();
            if(g0 != null) {
                String s = this.y(g0);
                if(s != null) {
                    stringBuilder0.append(" = ");
                    stringBuilder0.append(this.m(s));
                }
            }
        }
    }

    public final String F(String s) {
        switch(this.q().ordinal()) {
            case 0: {
                return s;
            }
            case 1: {
                return ((Boolean)this.a.V.a(k.X[0x2F], this.a)).booleanValue() ? s : e.f("<b>", s, "</b>");
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void G(X2.c c0, StringBuilder stringBuilder0) {
        String s;
        if(!this.o().contains(x3.h.q)) {
            return;
        }
        if(this.s() && c0.j() != 1) {
            stringBuilder0.append("/*");
            switch(c0.j()) {
                case 1: {
                    s = "DECLARATION";
                    break;
                }
                case 2: {
                    s = "FAKE_OVERRIDE";
                    break;
                }
                case 3: {
                    s = "DELEGATION";
                    break;
                }
                case 4: {
                    s = "SYNTHESIZED";
                    break;
                }
                default: {
                    throw null;
                }
            }
            stringBuilder0.append(O2.A.e0(s));
            stringBuilder0.append("*/ ");
        }
    }

    public final void H(x x0, StringBuilder stringBuilder0) {
        this.K(stringBuilder0, x0.z(), "external");
        boolean z = false;
        this.K(stringBuilder0, this.o().contains(x3.h.t) && x0.Z(), "expect");
        if(this.o().contains(x3.h.u) && x0.v0()) {
            z = true;
        }
        this.K(stringBuilder0, z, "actual");
    }

    public final void I(y y0, StringBuilder stringBuilder0, y y1) {
        if(!((Boolean)this.a.p.a(k.X[14], this.a)).booleanValue() && y0 == y1) {
            return;
        }
        this.K(stringBuilder0, this.o().contains(x3.h.m), O2.A.e0(y0.name()));
    }

    public final void J(X2.c c0, StringBuilder stringBuilder0) {
        if(y3.d.t(c0) && c0.f() == y.j || ((x3.n)this.a.B.a(k.X[26], this.a)) == x3.n.i && c0.f() == y.l && !c0.s().isEmpty()) {
            return;
        }
        y y0 = c0.f();
        j.e(y0, "getModality(...)");
        this.I(y0, stringBuilder0, g.t(c0));
    }

    public final void K(StringBuilder stringBuilder0, boolean z, String s) {
        if(z) {
            stringBuilder0.append(this.F(s));
            stringBuilder0.append(" ");
        }
    }

    public final String L(f f0, boolean z) {
        String s = this.m(G.s(f0));
        return !((Boolean)this.a.V.a(k.X[0x2F], this.a)).booleanValue() || this.q() != s.j || !z ? s : e.f("<b>", s, "</b>");
    }

    public final void M(X2.k k0, StringBuilder stringBuilder0, boolean z) {
        f f0 = k0.getName();
        j.e(f0, "getName(...)");
        stringBuilder0.append(this.L(f0, z));
    }

    public final void N(StringBuilder stringBuilder0, M3.w w0) {
        Z z0 = w0.K0();
        M3.a a0 = z0 instanceof M3.a ? ((M3.a)z0) : null;
        if(a0 != null) {
            k k0 = this.a;
            q[] arr_q = k.X;
            boolean z1 = ((Boolean)k0.R.a(arr_q[42], k0)).booleanValue();
            A a1 = a0.j;
            if(z1) {
                this.O(stringBuilder0, a1);
                return;
            }
            this.O(stringBuilder0, a0.k);
            if(((Boolean)k0.Q.a(arr_q[41], k0)).booleanValue()) {
                s s0 = this.q();
                x3.q q0 = s.j;
                if(s0 == q0) {
                    stringBuilder0.append("<font color=\"808080\"><i>");
                }
                stringBuilder0.append(" /* = ");
                this.O(stringBuilder0, a1);
                stringBuilder0.append(" */");
                if(this.q() == q0) {
                    stringBuilder0.append("</i></font>");
                }
            }
            return;
        }
        this.O(stringBuilder0, w0);
    }

    public final void O(StringBuilder stringBuilder0, M3.w w0) {
        String s1;
        f f0;
        k k0 = this.a;
        if(w0 instanceof M3.y && k0.l()) {
            L3.i i0 = ((M3.y)w0).l;
            if(i0.k == L3.k.i || i0.k == L3.k.j) {
                stringBuilder0.append("<Not computed yet>");
                return;
            }
        }
        Z z0 = w0.K0();
        if(z0 instanceof M3.q) {
            stringBuilder0.append(((M3.q)z0).P0(this, this));
            return;
        }
        if(z0 instanceof A) {
            if(((A)z0).equals(X.b) || ((A)z0).H0() == X.a.j) {
                stringBuilder0.append("???");
            }
            else {
                K k1 = ((A)z0).H0();
                if(k1 instanceof O3.j && ((O3.j)k1).a == O3.k.r) {
                    if(((Boolean)k0.t.a(k.X[18], k0)).booleanValue()) {
                        K k2 = ((A)z0).H0();
                        j.d(k2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                        stringBuilder0.append(this.B(((O3.j)k2).b[0]));
                        return;
                    }
                    stringBuilder0.append("???");
                    return;
                }
                if(c.i(((A)z0))) {
                    this.A(stringBuilder0, ((A)z0));
                    return;
                }
                if(!g.g0(((A)z0))) {
                    this.A(stringBuilder0, ((A)z0));
                    return;
                }
                int v = stringBuilder0.length();
                ((g)this.b.getValue()).w(stringBuilder0, ((A)z0), null);
                boolean z1 = stringBuilder0.length() != v;
                M3.w w1 = a0.A(((A)z0));
                List list0 = a0.w(((A)z0));
                if(!list0.isEmpty()) {
                    stringBuilder0.append("context(");
                    for(Object object0: list0.subList(0, x2.j.y(list0))) {
                        this.N(stringBuilder0, ((M3.w)object0));
                        stringBuilder0.append(", ");
                    }
                    this.N(stringBuilder0, ((M3.w)x2.i.a0(list0)));
                    stringBuilder0.append(") ");
                }
                boolean z2 = a0.F(((A)z0));
                boolean z3 = ((A)z0).I0();
                boolean z4 = z3 || z1 && w1 != null;
                if(z4) {
                    if(z2) {
                        stringBuilder0.insert(v, '(');
                    }
                    else {
                        if(z1) {
                            if(stringBuilder0.length() == 0) {
                                throw new NoSuchElementException("Char sequence is empty.");
                            }
                            Character.isWhitespace(stringBuilder0.charAt(n.v0(stringBuilder0)));
                            if(stringBuilder0.charAt(n.v0(stringBuilder0) - 1) != 41) {
                                stringBuilder0.insert(n.v0(stringBuilder0), "()");
                            }
                        }
                        stringBuilder0.append("(");
                    }
                }
                this.K(stringBuilder0, z2, "suspend");
                if(w1 != null) {
                    boolean z5 = g.g0(w1) && !w1.I0() || a0.F(w1) || !w1.l().isEmpty() || w1 instanceof m;
                    if(z5) {
                        stringBuilder0.append("(");
                    }
                    this.N(stringBuilder0, w1);
                    if(z5) {
                        stringBuilder0.append(")");
                    }
                    stringBuilder0.append(".");
                }
                stringBuilder0.append("(");
                if(!a0.E(((A)z0)) || ((A)z0).l().c(U2.m.p) == null || ((A)z0).A0().size() > 1) {
                    int v1 = 0;
                    for(Object object1: a0.C(((A)z0))) {
                        N n0 = (N)object1;
                        if(v1 > 0) {
                            stringBuilder0.append(", ");
                        }
                        if(((Boolean)k0.T.a(k.X[44], k0)).booleanValue()) {
                            M3.w w2 = n0.b();
                            j.e(w2, "getType(...)");
                            f0 = a0.p(w2);
                        }
                        else {
                            f0 = null;
                        }
                        if(f0 != null) {
                            stringBuilder0.append(this.L(f0, false));
                            stringBuilder0.append(": ");
                        }
                        j.f(n0, "typeProjection");
                        StringBuilder stringBuilder1 = new StringBuilder();
                        x2.i.X(G.p(n0), stringBuilder1, null, null, new x3.f(this, 0), 60);
                        String s = stringBuilder1.toString();
                        j.e(s, "toString(...)");
                        stringBuilder0.append(s);
                        ++v1;
                    }
                }
                else {
                    stringBuilder0.append("???");
                }
                stringBuilder0.append(") ");
                switch(this.q().ordinal()) {
                    case 0: {
                        s1 = this.m("->");
                        break;
                    }
                    case 1: {
                        s1 = "&rarr;";
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                stringBuilder0.append(s1);
                stringBuilder0.append(" ");
                a0.E(((A)z0));
                M3.w w3 = ((N)x2.i.a0(((A)z0).A0())).b();
                j.e(w3, "getType(...)");
                this.N(stringBuilder0, w3);
                if(z4) {
                    stringBuilder0.append(")");
                }
                if(z3) {
                    stringBuilder0.append("?");
                }
            }
        }
    }

    public final void P(X2.c c0, StringBuilder stringBuilder0) {
        if(!this.o().contains(x3.h.n)) {
            return;
        }
        if(!c0.s().isEmpty() && ((x3.n)this.a.B.a(k.X[26], this.a)) != x3.n.j) {
            this.K(stringBuilder0, true, "override");
            if(this.s()) {
                stringBuilder0.append("/*");
                stringBuilder0.append(c0.s().size());
                stringBuilder0.append("*/ ");
            }
        }
    }

    public final void Q(v3.c c0, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(this.F(s));
        v3.e e0 = c0.i();
        j.e(e0, "toUnsafe(...)");
        String s1 = this.m(G.t(e0.e()));
        if(s1.length() > 0) {
            stringBuilder0.append(" ");
            stringBuilder0.append(s1);
        }
    }

    public final void R(StringBuilder stringBuilder0, B1.a a0) {
        B1.a a1 = (B1.a)a0.l;
        X2.i i0 = (X2.i)a0.j;
        if(a1 == null) {
            K k0 = i0.B();
            j.e(k0, "getTypeConstructor(...)");
            stringBuilder0.append(this.X(k0));
        }
        else {
            this.R(stringBuilder0, a1);
            stringBuilder0.append('.');
            f f0 = i0.getName();
            j.e(f0, "getName(...)");
            stringBuilder0.append(this.L(f0, false));
        }
        stringBuilder0.append(this.W(((List)a0.k)));
    }

    public final void S(X2.c c0, StringBuilder stringBuilder0) {
        v v0 = c0.J();
        if(v0 != null) {
            this.w(stringBuilder0, v0, Y2.d.o);
            M3.w w0 = v0.getType();
            j.e(w0, "getType(...)");
            stringBuilder0.append(this.D(w0));
            stringBuilder0.append(".");
        }
    }

    public final void T(X2.c c0, StringBuilder stringBuilder0) {
        if(!((Boolean)this.a.F.a(k.X[30], this.a)).booleanValue()) {
            return;
        }
        v v0 = c0.J();
        if(v0 != null) {
            stringBuilder0.append(" on ");
            M3.w w0 = v0.getType();
            j.e(w0, "getType(...)");
            stringBuilder0.append(this.V(w0));
        }
    }

    public static void U(StringBuilder stringBuilder0) {
        int v = stringBuilder0.length();
        if(v == 0 || stringBuilder0.charAt(v - 1) != 0x20) {
            stringBuilder0.append(' ');
        }
    }

    public final String V(M3.w w0) {
        j.f(w0, "type");
        StringBuilder stringBuilder0 = new StringBuilder();
        this.N(stringBuilder0, ((M3.w)((b)this.a.y.a(k.X[23], this.a)).b(w0)));
        String s = stringBuilder0.toString();
        j.e(s, "toString(...)");
        return s;
    }

    public final String W(List list0) {
        j.f(list0, "typeArguments");
        if(list0.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.m("<"));
        x2.i.X(list0, stringBuilder0, null, null, new x3.f(this, 0), 60);
        stringBuilder0.append(this.m(">"));
        String s = stringBuilder0.toString();
        j.e(s, "toString(...)");
        return s;
    }

    public final String X(K k0) {
        j.f(k0, "typeConstructor");
        X2.h h0 = k0.q();
        if(((h0 instanceof T ? true : h0 instanceof X2.e) ? true : h0 instanceof S)) {
            j.f(h0, "klass");
            return l.f(h0) ? h0.B().toString() : this.n().a(h0, this);
        }
        if(h0 != null) {
            throw new IllegalStateException(("Unexpected classifier: " + h0.getClass()).toString());
        }
        return k0 instanceof M3.v ? ((M3.v)k0).c(d.u) : k0.toString();
    }

    public final void Y(T t0, StringBuilder stringBuilder0, boolean z) {
        if(z) {
            stringBuilder0.append(this.m("<"));
        }
        if(this.s()) {
            stringBuilder0.append("/*");
            stringBuilder0.append(t0.U());
            stringBuilder0.append("*/ ");
        }
        this.K(stringBuilder0, t0.P(), "reified");
        String s = t0.b0().i;
        boolean z1 = true;
        this.K(stringBuilder0, s.length() > 0, s);
        this.w(stringBuilder0, t0, null);
        this.M(t0, stringBuilder0, z);
        int v = t0.getUpperBounds().size();
        if(v > 1 && !z || v == 1) {
            Object object0 = t0.getUpperBounds().iterator().next();
            if(((M3.w)object0) == null) {
                U2.h.a(0x8E);
                throw null;
            }
            else if(!U2.h.x(((M3.w)object0)) || !((M3.w)object0).I0()) {
                stringBuilder0.append(" : ");
                stringBuilder0.append(this.V(((M3.w)object0)));
            }
        }
        else if(z) {
            for(Object object1: t0.getUpperBounds()) {
                M3.w w0 = (M3.w)object1;
                if(w0 != null) {
                    if(U2.h.x(w0) && w0.I0()) {
                        continue;
                    }
                    if(z1) {
                        stringBuilder0.append(" : ");
                    }
                    else {
                        stringBuilder0.append(" & ");
                    }
                    stringBuilder0.append(this.V(w0));
                    z1 = false;
                    continue;
                }
                U2.h.a(0x8E);
                throw null;
            }
        }
        if(z) {
            stringBuilder0.append(this.m(">"));
        }
    }

    public final void Z(StringBuilder stringBuilder0, List list0) {
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            this.Y(((T)object0), stringBuilder0, false);
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
    }

    @Override  // x3.i
    public final void a() {
        this.a.a();
    }

    public final void a0(List list0, StringBuilder stringBuilder0, boolean z) {
        if(((Boolean)this.a.w.a(k.X[21], this.a)).booleanValue()) {
            return;
        }
        if(!list0.isEmpty()) {
            stringBuilder0.append(this.m("<"));
            this.Z(stringBuilder0, list0);
            stringBuilder0.append(this.m(">"));
            if(z) {
                stringBuilder0.append(" ");
            }
        }
    }

    @Override  // x3.i
    public final void b() {
        this.a.b();
    }

    public final void b0(W w0, StringBuilder stringBuilder0, boolean z) {
        if(z || !(w0 instanceof a3.S)) {
            stringBuilder0.append(this.F((w0.G() ? "var" : "val")));
            stringBuilder0.append(" ");
        }
    }

    @Override  // x3.i
    public final void c(x3.c c0) {
        this.a.c(c0);
    }

    public final void c0(a3.S s0, boolean z, StringBuilder stringBuilder0, boolean z1) {
        boolean z2;
        if(z1) {
            stringBuilder0.append(this.F("value-parameter"));
            stringBuilder0.append(" ");
        }
        if(this.s()) {
            stringBuilder0.append("/*");
            stringBuilder0.append(s0.n);
            stringBuilder0.append("*/ ");
        }
        a3.i i0 = null;
        this.w(stringBuilder0, s0, null);
        this.K(stringBuilder0, s0.p, "crossinline");
        this.K(stringBuilder0, s0.q, "noinline");
        k k0 = this.a;
        q[] arr_q = k.X;
        if(((Boolean)k0.r.a(arr_q[16], k0)).booleanValue()) {
            X2.b b0 = s0.O0();
            if(b0 instanceof a3.i) {
                i0 = (a3.i)b0;
            }
            z2 = i0 == null || !i0.L ? false : true;
        }
        else {
            z2 = false;
        }
        if(z2) {
            this.K(stringBuilder0, ((Boolean)k0.s.a(arr_q[17], k0)).booleanValue(), "actual");
        }
        M3.w w0 = s0.getType();
        j.e(w0, "getType(...)");
        M3.w w1 = s0.r;
        this.K(stringBuilder0, w1 != null, "vararg");
        if(z2 || z1 && !this.p()) {
            this.b0(s0, stringBuilder0, z2);
        }
        if(z) {
            this.M(s0, stringBuilder0, z1);
            stringBuilder0.append(": ");
        }
        stringBuilder0.append(this.V((w1 == null ? w0 : w1)));
        this.E(s0, stringBuilder0);
        if(this.s() && w1 != null) {
            stringBuilder0.append(" /*");
            stringBuilder0.append(this.V(w0));
            stringBuilder0.append("*/");
        }
        if(((b)k0.z.a(arr_q[24], k0)) != null && (k0.l() ? s0.N0() : C3.e.a(s0))) {
            b b1 = (b)k0.z.a(arr_q[24], k0);
            j.c(b1);
            stringBuilder0.append(" = " + ((String)b1.b(s0)));
        }
    }

    @Override  // x3.i
    public final void d() {
        this.a.d();
    }

    public final void d0(Collection collection0, boolean z, StringBuilder stringBuilder0) {
        boolean z1;
        switch(((o)this.a.E.a(k.X[29], this.a)).ordinal()) {
            case 0: {
                z1 = true;
                break;
            }
            case 1: {
                z1 = z ? false : true;
                break;
            }
            case 2: {
                z1 = false;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        int v = collection0.size();
        this.r().getClass();
        j.f(stringBuilder0, "builder");
        stringBuilder0.append("(");
        int v1 = 0;
        for(Object object0: collection0) {
            this.r().getClass();
            j.f(((a3.S)object0), "parameter");
            this.c0(((a3.S)object0), z1, stringBuilder0, false);
            this.r().getClass();
            if(v1 != v - 1) {
                stringBuilder0.append(", ");
            }
            ++v1;
        }
        this.r().getClass();
        stringBuilder0.append(")");
    }

    @Override  // x3.i
    public final void e(o o0) {
        this.a.e(o0);
    }

    public final boolean e0(X2.o o0, StringBuilder stringBuilder0) {
        if(!this.o().contains(x3.h.l)) {
            return false;
        }
        k k0 = this.a;
        q[] arr_q = k.X;
        if(((Boolean)k0.n.a(arr_q[12], k0)).booleanValue()) {
            o0 = p.f(o0.a.m());
        }
        if(!((Boolean)k0.o.a(arr_q[13], k0)).booleanValue() && j.a(o0, p.j)) {
            return false;
        }
        stringBuilder0.append(this.F(o0.a.f()));
        stringBuilder0.append(" ");
        return true;
    }

    @Override  // x3.i
    public final void f(Set set0) {
        j.f(set0, "<set-?>");
        this.a.f(set0);
    }

    public final void f0(StringBuilder stringBuilder0, List list0) {
        if(((Boolean)this.a.w.a(k.X[21], this.a)).booleanValue()) {
            return;
        }
        ArrayList arrayList0 = new ArrayList(0);
        for(Object object0: list0) {
            T t0 = (T)object0;
            List list1 = t0.getUpperBounds();
            j.e(list1, "getUpperBounds(...)");
            for(Object object1: x2.i.O(list1)) {
                f f0 = t0.getName();
                j.e(f0, "getName(...)");
                j.c(((M3.w)object1));
                arrayList0.add(this.L(f0, false) + " : " + this.V(((M3.w)object1)));
            }
        }
        if(!arrayList0.isEmpty()) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.F("where"));
            stringBuilder0.append(" ");
            x2.i.X(arrayList0, stringBuilder0, null, null, null, 0x7C);
        }
    }

    @Override  // x3.i
    public final void g() {
        this.a.g();
    }

    public static boolean g0(M3.w w0) {
        if(a0.E(w0)) {
            Iterable iterable0 = w0.A0();
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object0: iterable0) {
                    if(((N)object0).c()) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override  // x3.i
    public final void h() {
        this.a.h();
    }

    @Override  // x3.i
    public final void i() {
        this.a.i();
    }

    @Override  // x3.i
    public final void j() {
        this.a.j();
    }

    @Override  // x3.i
    public final void k() {
        this.a.k();
    }

    public static final void l(g g0, M m0, StringBuilder stringBuilder0) {
        if(!g0.p()) {
            k k0 = g0.a;
            q[] arr_q = k.X;
            if(!((Boolean)k0.g.a(arr_q[5], k0)).booleanValue()) {
                if(g0.o().contains(x3.h.o)) {
                    g0.w(stringBuilder0, m0, null);
                    r r0 = m0.R();
                    if(r0 != null) {
                        g0.w(stringBuilder0, r0, Y2.d.j);
                    }
                    r r1 = m0.M();
                    if(r1 != null) {
                        g0.w(stringBuilder0, r1, Y2.d.r);
                    }
                    if(((x3.p)k0.H.a(arr_q[0x20], k0)) == x3.p.j) {
                        J j0 = m0.d();
                        if(j0 != null) {
                            g0.w(stringBuilder0, j0, Y2.d.m);
                        }
                        a3.K k1 = m0.e();
                        if(k1 != null) {
                            g0.w(stringBuilder0, k1, Y2.d.n);
                            List list0 = k1.z0();
                            j.e(list0, "getValueParameters(...)");
                            a3.S s0 = (a3.S)x2.i.i0(list0);
                            j.c(s0);
                            g0.w(stringBuilder0, s0, Y2.d.q);
                        }
                    }
                }
                List list1 = m0.T();
                j.e(list1, "getContextReceiverParameters(...)");
                g0.z(stringBuilder0, list1);
                X2.o o0 = m0.c();
                j.e(o0, "getVisibility(...)");
                g0.e0(o0, stringBuilder0);
                g0.K(stringBuilder0, g0.o().contains(x3.h.v) && m0.E(), "const");
                g0.H(m0, stringBuilder0);
                g0.J(m0, stringBuilder0);
                g0.P(m0, stringBuilder0);
                g0.K(stringBuilder0, g0.o().contains(x3.h.w) && m0.W(), "lateinit");
                g0.G(m0, stringBuilder0);
            }
            g0.b0(m0, stringBuilder0, false);
            List list2 = m0.u();
            j.e(list2, "getTypeParameters(...)");
            g0.a0(list2, stringBuilder0, true);
            g0.S(m0, stringBuilder0);
        }
        g0.M(m0, stringBuilder0, true);
        stringBuilder0.append(": ");
        M3.w w0 = m0.getType();
        j.e(w0, "getType(...)");
        stringBuilder0.append(g0.V(w0));
        g0.T(m0, stringBuilder0);
        g0.E(m0, stringBuilder0);
        List list3 = m0.u();
        j.e(list3, "getTypeParameters(...)");
        g0.f0(stringBuilder0, list3);
    }

    public final String m(String s) {
        return this.q().a(s);
    }

    public final x3.c n() {
        return (x3.c)this.a.b.a(k.X[0], this.a);
    }

    public final Set o() {
        return (Set)this.a.e.a(k.X[3], this.a);
    }

    public final boolean p() {
        return ((Boolean)this.a.f.a(k.X[4], this.a)).booleanValue();
    }

    public final s q() {
        return (s)this.a.D.a(k.X[28], this.a);
    }

    public final x3.e r() {
        return (x3.e)this.a.C.a(k.X[27], this.a);
    }

    public final boolean s() {
        return ((Boolean)this.a.j.a(k.X[8], this.a)).booleanValue();
    }

    public static y t(x x0) {
        y y0 = y.m;
        X2.f f0 = X2.f.j;
        y y1 = y.j;
        if(x0 instanceof X2.e) {
            return ((X2.e)x0).j() == f0 ? y0 : y1;
        }
        X2.k k0 = x0.p();
        X2.e e0 = k0 instanceof X2.e ? ((X2.e)k0) : null;
        if(e0 == null) {
            return y1;
        }
        if(!(x0 instanceof X2.c)) {
            return y1;
        }
        Collection collection0 = ((X2.c)x0).s();
        j.e(collection0, "getOverriddenDescriptors(...)");
        y y2 = y.l;
        if(!collection0.isEmpty() && e0.f() != y1) {
            return y2;
        }
        if(e0.j() == f0 && !j.a(((X2.c)x0).c(), p.a)) {
            return ((X2.c)x0).f() == y0 ? y0 : y2;
        }
        return y1;
    }

    public final String u(X2.k k0) {
        String s;
        j.f(k0, "declarationDescriptor");
        StringBuilder stringBuilder0 = new StringBuilder();
        k0.c0(new o3.k(this), stringBuilder0);
        k k1 = this.a;
        q[] arr_q = k.X;
        if(((Boolean)k1.c.a(arr_q[1], k1)).booleanValue() && !(k0 instanceof F) && !(k0 instanceof X2.J)) {
            X2.k k2 = k0.p();
            if(k2 != null && !(k2 instanceof X2.A)) {
                stringBuilder0.append(" ");
                switch(this.q().ordinal()) {
                    case 0: {
                        s = "defined in";
                        break;
                    }
                    case 1: {
                        s = "<i>defined in</i>";
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                stringBuilder0.append(s);
                stringBuilder0.append(" ");
                v3.e e0 = y3.d.g(k2);
                j.e(e0, "getFqName(...)");
                stringBuilder0.append((e0.a.isEmpty() ? "root package" : this.m(G.t(e0.e()))));
                if(((Boolean)k1.d.a(arr_q[2], k1)).booleanValue() && k2 instanceof F && k0 instanceof X2.l) {
                    ((X2.l)k0).q().getClass();
                }
            }
        }
        String s1 = stringBuilder0.toString();
        j.e(s1, "toString(...)");
        return s1;
    }

    public final String v(Y2.b b0, Y2.d d0) {
        j.f(b0, "annotation");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('@');
        if(d0 != null) {
            stringBuilder0.append(d0.i + ':');
        }
        M3.w w0 = b0.getType();
        stringBuilder0.append(this.V(w0));
        k k0 = this.a;
        q[] arr_q = k.X;
        x3.j j0 = k0.N;
        if(((x3.a)j0.a(arr_q[38], k0)).i) {
            Map map0 = b0.b();
            x2.r r0 = null;
            X2.e e0 = ((Boolean)k0.I.a(arr_q[33], k0)).booleanValue() ? C3.e.d(b0) : null;
            if(e0 != null) {
                a3.i i0 = e0.o0();
                if(i0 != null) {
                    List list0 = i0.z0();
                    if(list0 != null) {
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object0: list0) {
                            if(((a3.S)object0).N0()) {
                                arrayList0.add(object0);
                            }
                        }
                        r0 = new ArrayList(x2.k.E(arrayList0));
                        for(Object object1: arrayList0) {
                            ((ArrayList)r0).add(((a3.S)object1).getName());
                        }
                    }
                }
            }
            if(r0 == null) {
                r0 = x2.r.i;
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object2: r0) {
                j.c(((f)object2));
                if(!map0.containsKey(((f)object2))) {
                    arrayList1.add(object2);
                }
            }
            ArrayList arrayList2 = new ArrayList(x2.k.E(arrayList1));
            for(Object object3: arrayList1) {
                arrayList2.add(((f)object3).b() + " = ...");
            }
            Iterable iterable0 = map0.entrySet();
            ArrayList arrayList3 = new ArrayList(x2.k.E(iterable0));
            for(Object object4: iterable0) {
                f f0 = (f)((Map.Entry)object4).getKey();
                A3.g g0 = (A3.g)((Map.Entry)object4).getValue();
                arrayList3.add(f0.b() + " = " + (r0.contains(f0) ? "..." : this.y(g0)));
            }
            List list1 = x2.i.l0(x2.i.e0(arrayList3, arrayList2));
            if(((x3.a)j0.a(k.X[38], k0)).j || !list1.isEmpty()) {
                x2.i.X(list1, stringBuilder0, "(", ")", null, 0x70);
            }
        }
        if(this.s() && (c.i(w0) || w0.H0().q() instanceof D)) {
            stringBuilder0.append(" /* annotation class not found */");
        }
        String s = stringBuilder0.toString();
        j.e(s, "toString(...)");
        return s;
    }

    public final void w(StringBuilder stringBuilder0, Y2.a a0, Y2.d d0) {
        if(!this.o().contains(x3.h.o)) {
            return;
        }
        k k0 = this.a;
        Set set0 = a0 instanceof M3.w ? k0.m() : ((Set)k0.K.a(k.X[35], k0));
        b b0 = (b)k0.M.a(k.X[37], k0);
        for(Object object0: a0.l()) {
            Y2.b b1 = (Y2.b)object0;
            if(!x2.i.M(set0, b1.a()) && !j.a(b1.a(), U2.m.r) && (b0 == null || ((Boolean)b0.b(b1)).booleanValue())) {
                stringBuilder0.append(this.v(b1, d0));
                if(((Boolean)k0.J.a(k.X[34], k0)).booleanValue()) {
                    stringBuilder0.append('\n');
                }
                else {
                    stringBuilder0.append(" ");
                }
            }
        }
    }

    public final void x(X2.i i0, StringBuilder stringBuilder0) {
        List list0 = i0.t();
        j.e(list0, "getDeclaredTypeParameters(...)");
        List list1 = i0.B().o();
        j.e(list1, "getParameters(...)");
        if(this.s() && i0.a0() && list1.size() > list0.size()) {
            stringBuilder0.append(" /*captured type parameters: ");
            this.Z(stringBuilder0, list1.subList(list0.size(), list1.size()));
            stringBuilder0.append("*/");
        }
    }

    public final String y(A3.g g0) {
        b b0 = (b)this.a.v.a(k.X[20], this.a);
        if(b0 != null) {
            return (String)b0.b(g0);
        }
        if(g0 instanceof A3.b) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: ((Iterable)((A3.b)g0).a)) {
                String s = this.y(((A3.g)object0));
                if(s != null) {
                    arrayList0.add(s);
                }
            }
            return x2.i.Y(arrayList0, ", ", "{", "}", null, 56);
        }
        if(g0 instanceof A3.a) {
            return n.C0(this.v(((Y2.b)((A3.a)g0).a), null), "@");
        }
        if(g0 instanceof t) {
            A3.s s1 = (A3.s)((t)g0).a;
            if(s1 instanceof A3.q) {
                return ((A3.q)s1).a + "::class";
            }
            if(!(s1 instanceof A3.r)) {
                throw new NoWhenBranchMatchedException();
            }
            String s2 = ((A3.r)s1).a.a.b().b();
            A3.f f0 = ((A3.r)s1).a;
            for(int v = 0; v < f0.b; ++v) {
                s2 = "kotlin.Array<" + s2 + '>';
            }
            return q.e.b(s2, "::class");
        }
        return g0.toString();
    }

    public final void z(StringBuilder stringBuilder0, List list0) {
        if(!list0.isEmpty()) {
            stringBuilder0.append("context(");
            int v = 0;
            for(Object object0: list0) {
                this.w(stringBuilder0, ((v)object0), Y2.d.o);
                M3.w w0 = ((v)object0).getType();
                j.e(w0, "getType(...)");
                stringBuilder0.append(this.D(w0));
                if(v == x2.j.y(list0)) {
                    stringBuilder0.append(") ");
                }
                else {
                    stringBuilder0.append(", ");
                }
                ++v;
            }
        }
    }
}

