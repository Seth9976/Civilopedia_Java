package k3;

import A3.g;
import A3.y;
import J2.j;
import J2.o;
import J2.r;
import L3.i;
import M3.A;
import M3.N;
import M3.V;
import M3.w;
import O2.q;
import O3.k;
import O3.l;
import U2.m;
import X2.O;
import X2.T;
import Y2.b;
import a3.S;
import d3.E;
import d3.d;
import d3.e;
import d3.p;
import d3.t;
import d3.v;
import d3.z;
import g3.x;
import i3.h;
import j3.a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Map;
import v3.c;

public final class f implements b, h {
    public final B.f a;
    public final e b;
    public final L3.h c;
    public final i d;
    public final c3.f e;
    public final i f;
    public final boolean g;
    public static final q[] h;

    static {
        o o0 = new o(r.a.b(f.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;");
        o o1 = new o(r.a.b(f.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;");
        o o2 = new o(r.a.b(f.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;");
        f.h = new q[]{r.a.e(o0), r.a.e(o1), r.a.e(o2)};
    }

    public f(B.f f0, e e0, boolean z) {
        j.f(f0, "c");
        j.f(e0, "javaAnnotation");
        super();
        this.a = f0;
        this.b = e0;
        a a0 = (a)f0.j;
        k3.e e1 = new k3.e(this, 1);
        a0.a.getClass();
        this.c = new L3.h(a0.a, e1);
        k3.e e2 = new k3.e(this, 2);
        a0.a.getClass();
        this.d = new i(a0.a, e2);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.e = a0.j.a(e0);
        k3.e e3 = new k3.e(this, 0);
        a0.a.getClass();
        this.f = new i(a0.a, e3);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.g = z;
    }

    @Override  // Y2.b
    public final c a() {
        q q0 = f.h[0];
        j.f(this.c, "<this>");
        j.f(q0, "p");
        return (c)this.c.invoke();
    }

    @Override  // Y2.b
    public final Map b() {
        return (Map)android.support.v4.media.session.a.A(this.f, f.h[2]);
    }

    public final g c(m3.a a0) {
        z z0;
        w w0;
        if(a0 instanceof v) {
            return A3.i.a.b(null, ((v)a0).b);
        }
        if(a0 instanceof t) {
            Class class0 = ((t)a0).b.getClass();
            if(!class0.isEnum()) {
                class0 = class0.getEnclosingClass();
            }
            j.c(class0);
            return new A3.j(d.a(class0), v3.f.e(((t)a0).b.name()));
        }
        B.f f0 = this.a;
        if(a0 instanceof d3.h) {
            v3.f f1 = ((d3.h)a0).a;
            if(f1 == null) {
                f1 = x.b;
            }
            j.c(f1);
            ArrayList arrayList0 = ((d3.h)a0).a();
            A a1 = (A)android.support.v4.media.session.a.A(this.d, f.h[1]);
            j.e(a1, "<get-type>(...)");
            if(!M3.c.i(a1)) {
                X2.e e0 = C3.e.d(this);
                j.c(e0);
                S s0 = android.support.v4.media.session.a.p(f1, e0);
                if(s0 == null) {
                    w0 = ((a)f0.j).o.l.g(l.c(k.L, new String[0]));
                }
                else {
                    w0 = s0.getType();
                    if(w0 == null) {
                        w0 = ((a)f0.j).o.l.g(l.c(k.L, new String[0]));
                    }
                }
                ArrayList arrayList1 = new ArrayList(x2.k.E(arrayList0));
                for(Object object0: arrayList0) {
                    g g0 = this.c(((m3.a)object0));
                    if(g0 == null) {
                        g0 = new A3.v(null);  // 初始化器: LA3/g;-><init>(Ljava/lang/Object;)V
                    }
                    arrayList1.add(g0);
                }
                return new y(arrayList1, w0);
            }
        }
        else {
            if(a0 instanceof d3.g) {
                return new A3.a(new f(f0, new e(((d3.g)a0).b), false));  // 初始化器: LA3/g;-><init>(Ljava/lang/Object;)V
            }
            if(a0 instanceof p) {
                Class class1 = ((p)a0).b;
                if(class1.isPrimitive()) {
                    z0 = new z(class1);
                }
                else if(class1 instanceof GenericArrayType || class1.isArray()) {
                    z0 = new d3.i(class1);
                }
                else if(class1 instanceof WildcardType) {
                    z0 = new E(((WildcardType)class1));
                }
                else {
                    z0 = new d3.q(class1);
                }
                w w1 = ((B1.a)f0.n).H(z0, android.support.v4.media.session.a.P(V.j, false, null, 7));
                if(!M3.c.i(w1)) {
                    w w2 = w1;
                    int v;
                    for(v = 0; U2.h.y(w2); ++v) {
                        w2 = ((N)x2.i.i0(w2.A0())).b();
                        j.e(w2, "getType(...)");
                    }
                    X2.h h0 = w2.H0().q();
                    if(h0 instanceof X2.e) {
                        v3.b b0 = C3.e.f(h0);
                        return b0 == null ? new A3.t(new A3.q(w1)) : new A3.t(b0, v);  // 初始化器: LA3/g;-><init>(Ljava/lang/Object;)V
                    }
                    if(h0 instanceof T) {
                        return new A3.t(v3.b.j(m.a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override  // Y2.b
    public final w getType() {
        return (A)android.support.v4.media.session.a.A(this.d, f.h[1]);
    }

    @Override  // Y2.b
    public final O q() {
        return this.e;
    }

    @Override
    public final String toString() {
        return x3.g.c.v(this, null);
    }
}

