package k3;

import B.f;
import F3.k;
import F3.o;
import J2.r;
import L3.c;
import L3.e;
import L3.i;
import L3.j;
import L3.l;
import L3.m;
import M3.V;
import M3.Z;
import O2.q;
import X2.P;
import X2.T;
import a3.A;
import a3.S;
import a3.u;
import a3.v;
import com.google.android.gms.internal.ads.U;
import d3.B;
import d3.C;
import d3.D;
import f3.b;
import j3.a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import x2.s;
import z1.a0;

public abstract class y extends o {
    public final f b;
    public final n c;
    public final c d;
    public final i e;
    public final e f;
    public final j g;
    public final e h;
    public final i i;
    public final i j;
    public final i k;
    public final e l;
    public static final q[] m;

    static {
        J2.o o0 = new J2.o(r.a.b(y.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;");
        J2.o o1 = new J2.o(r.a.b(y.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;");
        J2.o o2 = new J2.o(r.a.b(y.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;");
        y.m = new q[]{r.a.e(o0), r.a.e(o1), r.a.e(o2)};
    }

    public y(f f0, n n0) {
        J2.j.f(f0, "c");
        super();
        this.b = f0;
        this.c = n0;
        m m0 = ((a)f0.j).a;
        w w0 = new w(this, 0);
        m0.getClass();
        this.d = new c(m0, w0);  // 初始化器: LL3/i;-><init>(LL3/m;LI2/a;)V
        w w1 = new w(this, 2);
        m0.getClass();
        this.e = new i(m0, w1);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.f = m0.b(new x(this, 1));
        this.g = m0.c(new x(this, 0));
        this.h = m0.b(new x(this, 2));
        w w2 = new w(this, 3);
        m0.getClass();
        this.i = new i(m0, w2);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        w w3 = new w(this, 4);
        m0.getClass();
        this.j = new i(m0, w3);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        w w4 = new w(this, 1);
        m0.getClass();
        this.k = new i(m0, w4);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
        this.l = m0.b(new x(this, 3));
    }

    @Override  // F3.o
    public Collection a(v3.f f0, b b0) {
        J2.j.f(f0, "name");
        return !this.d().contains(f0) ? x2.r.i : ((Collection)this.l.b(f0));
    }

    @Override  // F3.o
    public Collection b(v3.f f0, b b0) {
        J2.j.f(f0, "name");
        J2.j.f(b0, "location");
        return !this.c().contains(f0) ? x2.r.i : ((Collection)this.h.b(f0));
    }

    @Override  // F3.o
    public final Set c() {
        return (Set)android.support.v4.media.session.a.A(this.i, y.m[0]);
    }

    @Override  // F3.o
    public final Set d() {
        return (Set)android.support.v4.media.session.a.A(this.j, y.m[1]);
    }

    @Override  // F3.o
    public final Set e() {
        return (Set)android.support.v4.media.session.a.A(this.k, y.m[2]);
    }

    @Override  // F3.o
    public Collection g(F3.f f0, I2.b b0) {
        J2.j.f(f0, "kindFilter");
        return (Collection)this.d.invoke();
    }

    public abstract Set h(F3.f arg1, k arg2);

    public abstract Set i(F3.f arg1, k arg2);

    public void j(ArrayList arrayList0, v3.f f0) {
        J2.j.f(f0, "name");
    }

    public abstract k3.c k();

    public static M3.w l(d3.x x0, f f0) {
        J2.j.f(x0, "method");
        Class class0 = ((Method)x0.b()).getDeclaringClass();
        J2.j.e(class0, "getDeclaringClass(...)");
        l3.a a0 = android.support.v4.media.session.a.P(V.j, class0.isAnnotation(), null, 6);
        B b0 = x0.f();
        return ((B1.a)f0.n).H(b0, a0);
    }

    public abstract void m(LinkedHashSet arg1, v3.f arg2);

    public abstract void n(ArrayList arg1, v3.f arg2);

    public abstract Set o(F3.f arg1);

    public abstract v p();

    public abstract X2.k q();

    public boolean r(i3.f f0) {
        return true;
    }

    public abstract k3.v s(d3.x arg1, ArrayList arg2, M3.w arg3, List arg4);

    public final i3.f t(d3.x x0) {
        J2.j.f(x0, "method");
        j3.c c0 = a0.J(this.b, x0);
        i3.f f0 = i3.f.b1(this.q(), c0, x0.c(), ((a)this.b.j).j.a(x0), ((k3.c)this.e.invoke()).c(x0.c()) != null && ((ArrayList)x0.g()).isEmpty());
        J2.j.f(this.b, "<this>");
        Object object0 = this.b.l;
        f f1 = new f(((a)this.b.j), new U(this.b, f0, x0, 0), ((w2.c)object0));
        ArrayList arrayList0 = x0.u();
        ArrayList arrayList1 = new ArrayList(x2.k.E(arrayList0));
        for(Object object1: arrayList0) {
            T t0 = ((j3.e)f1.k).a(((C)object1));
            J2.j.c(t0);
            arrayList1.add(t0);
        }
        l l0 = y.u(f1, f0, x0.g());
        k3.v v0 = this.s(x0, arrayList1, y.l(x0, f1), ((List)l0.c));
        v v1 = this.p();
        boolean z = Modifier.isAbstract(((Method)x0.b()).getModifiers());
        boolean z1 = Modifier.isFinal(((Method)x0.b()).getModifiers());
        X2.y.i.getClass();
        X2.y y0 = P.a(false, z, !z1);
        X2.o o0 = o1.a.W(x0.e());
        f0.a1(null, v1, x2.r.i, v0.c, v0.b, v0.a, y0, o0, s.i);
        f0.c1(false, l0.b);
        if(v0.d.isEmpty()) {
            return f0;
        }
        ((a)f1.j).e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override
    public String toString() {
        return "Lazy scope for " + this.q();
    }

    public static l u(f f0, u u0, List list0) {
        v3.f f2;
        w2.e e0;
        X3.o o0 = x2.i.u0(list0);
        ArrayList arrayList0 = new ArrayList(x2.k.E(o0));
        Iterator iterator0 = o0.iterator();
        boolean z = false;
        while(((X3.b)iterator0).j.hasNext()) {
            x2.u u1 = (x2.u)((X3.b)iterator0).next();
            int v = u1.a;
            D d0 = (D)u1.b;
            j3.c c0 = a0.J(f0, d0);
            v3.f f1 = null;
            l3.a a0 = android.support.v4.media.session.a.P(V.j, false, null, 7);
            a a1 = (a)f0.j;
            B b0 = d0.a;
            B1.a a2 = (B1.a)f0.n;
            A a3 = a1.o;
            if(d0.d) {
                d3.i i0 = b0 instanceof d3.i ? ((d3.i)b0) : null;
                if(i0 == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + d0);
                }
                Z z1 = a2.G(i0, a0, true);
                e0 = new w2.e(z1, a3.l.f(z1));
            }
            else {
                e0 = new w2.e(a2.H(b0, a0), null);
            }
            M3.w w0 = (M3.w)e0.i;
            M3.w w1 = (M3.w)e0.j;
            if(!J2.j.a(u0.getName().b(), "equals") || list0.size() != 1 || !a3.l.o().equals(w0)) {
                String s = d0.c;
                if(s != null) {
                    f1 = v3.f.d(s);
                }
                if(f1 == null) {
                    z = true;
                }
                f2 = f1 == null ? v3.f.e(("p" + v)) : f1;
            }
            else {
                f2 = v3.f.e("other");
            }
            arrayList0.add(new S(u0, null, v, c0, f2, w0, false, false, false, w1, a1.j.a(d0)));
        }
        return new l(x2.i.o0(arrayList0), z, 2);
    }
}

