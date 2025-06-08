package k3;

import B.f;
import M3.K;
import M3.V;
import X2.N;
import X2.P;
import X2.U;
import X2.b0;
import X2.e0;
import X2.e;
import X2.h0;
import X2.k;
import X2.p;
import X2.y;
import a3.j;
import b3.b;
import d3.o;
import d3.q;
import i3.c;
import j3.a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import w2.h;
import x2.r;
import x2.z;
import z1.a0;

public final class i extends j implements c {
    public final F3.i A;
    public final B B;
    public final j3.c C;
    public final L3.i D;
    public final f o;
    public final o p;
    public final e q;
    public final f r;
    public final h s;
    public final X2.f t;
    public final y u;
    public final h0 v;
    public final boolean w;
    public final K3.i x;
    public final n y;
    public final N z;

    static {
        z.y(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    public i(f f0, k k0, o o0, e e0) {
        J2.j.f(f0, "outerContext");
        e0 e00;
        y y0;
        X2.f f4;
        J2.j.f(k0, "containingDeclaration");
        J2.j.f(o0, "jClass");
        a a0 = (a)f0.j;
        v3.f f1 = o0.e();
        c3.f f2 = a0.j.a(o0);
        super(a0.a, k0, f1, f2);
        this.o = f0;
        this.p = o0;
        this.q = e0;
        f f3 = o1.a.c(f0, this, o0, 4);
        this.r = f3;
        a a1 = (a)f3.j;
        a1.g.getClass();
        this.s = new h(new g(this, 2));
        Class class0 = o0.a;
        if(class0.isAnnotation()) {
            f4 = X2.f.m;
        }
        else if(class0.isInterface()) {
            f4 = X2.f.j;
        }
        else {
            f4 = class0.isEnum() ? X2.f.k : X2.f.i;
        }
        this.t = f4;
        if(class0.isAnnotation() || class0.isEnum()) {
            y0 = y.j;
        }
        else {
            boolean z = o0.h();
            boolean z1 = o0.h() || Modifier.isAbstract(class0.getModifiers()) || class0.isInterface();
            boolean z2 = Modifier.isFinal(class0.getModifiers());
            y.i.getClass();
            y0 = P.a(z, z1, !z2);
        }
        this.u = y0;
        int v = class0.getModifiers();
        if(Modifier.isPublic(v)) {
            e00 = e0.l;
        }
        else if(Modifier.isPrivate(v)) {
            e00 = b0.l;
        }
        else if(!Modifier.isProtected(v)) {
            e00 = b3.a.l;
        }
        else if(Modifier.isStatic(v)) {
            e00 = b3.c.l;
        }
        else {
            e00 = b.l;
        }
        this.v = e00;
        Class class1 = class0.getDeclaringClass();
        this.w = (class1 == null ? null : new o(class1)) != null && !Modifier.isStatic(class0.getModifiers());
        this.x = new K3.i(this);
        n n0 = new n(f3, this, o0, e0 != null, null);
        this.y = n0;
        a1.u.getClass();
        A3.h h0 = new A3.h(this, 19);
        N.d.getClass();
        J2.j.f(a1.a, "storageManager");
        this.z = new N(this, a1.a, h0);
        this.A = new F3.i(n0);
        this.B = new B(f3, o0, this);
        this.C = a0.J(f3, o0);
        g g0 = new g(this, 1);
        a1.a.getClass();
        this.D = new L3.i(a1.a, g0);  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    public final n A0() {
        return (n)super.t0();
    }

    @Override  // X2.h
    public final K B() {
        return this.x;
    }

    @Override  // X2.e
    public final boolean D() {
        return false;
    }

    @Override  // X2.e
    public final boolean D0() {
        return false;
    }

    @Override  // X2.e
    public final boolean K() {
        return false;
    }

    @Override  // a3.z
    public final F3.n L(N3.f f0) {
        C3.e.j(this.z.a);
        return (n)(((F3.n)android.support.v4.media.session.a.A(this.z.c, N.e[0])));
    }

    @Override  // X2.e
    public final Collection V() {
        Class[] arr_class;
        Collection collection0 = r.i;
        if(this.u == y.k) {
            l3.a a0 = android.support.v4.media.session.a.P(V.j, false, null, 7);
            Class class0 = this.p.a;
            J2.j.f(class0, "clazz");
            f0.g g0 = o1.a.a;
            if(g0 == null) {
                try {
                    g0 = new f0.g(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 15);
                }
                catch(NoSuchMethodException unused_ex) {
                    g0 = new f0.g(null, null, null, null, 15);
                }
                o1.a.a = g0;
            }
            Method method0 = (Method)g0.k;
            if(method0 == null) {
                arr_class = null;
            }
            else {
                Object object0 = method0.invoke(class0, null);
                J2.j.d(object0, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
                arr_class = (Class[])object0;
            }
            if(arr_class != null) {
                collection0 = new ArrayList(arr_class.length);
                for(int v = 0; v < arr_class.length; ++v) {
                    ((ArrayList)collection0).add(new q(arr_class[v]));
                }
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: collection0) {
                X2.h h0 = ((B1.a)this.r.n).H(((q)object1), a0).H0().q();
                e e0 = h0 instanceof e ? ((e)h0) : null;
                if(e0 != null) {
                    arrayList0.add(e0);
                }
            }
            return x2.i.m0(arrayList0, new k3.h());  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        return collection0;
    }

    @Override  // X2.e
    public final boolean Y() {
        return false;
    }

    @Override  // X2.x
    public final boolean Z() {
        return false;
    }

    @Override  // X2.i
    public final boolean a0() {
        return this.w;
    }

    @Override  // X2.e
    public final X2.o c() {
        h0 h00 = this.v;
        if(J2.j.a(h00, p.a)) {
            Class class0 = this.p.a.getDeclaringClass();
            if((class0 == null ? null : new o(class0)) == null) {
                J2.j.c(g3.o.a);
                return g3.o.a;
            }
        }
        return o1.a.W(h00);
    }

    @Override  // X2.e
    public final y f() {
        return this.u;
    }

    @Override  // X2.e
    public final Collection g() {
        return (List)this.y.q.invoke();
    }

    @Override  // X2.e
    public final X2.f j() {
        return this.t;
    }

    @Override  // a3.b, X2.e
    public final F3.n k0() {
        return this.A;
    }

    @Override  // Y2.a
    public final Y2.h l() {
        return this.C;
    }

    @Override  // X2.e
    public final U l0() {
        return null;
    }

    @Override  // X2.e
    public final boolean o() {
        return false;
    }

    @Override  // X2.e
    public final a3.i o0() {
        return null;
    }

    @Override  // X2.e
    public final F3.n p0() {
        return this.B;
    }

    @Override  // X2.e
    public final List t() {
        return (List)this.D.invoke();
    }

    @Override  // a3.b, X2.e
    public final F3.n t0() {
        return (n)super.t0();
    }

    @Override
    public final String toString() {
        return "Lazy Java class " + C3.e.h(this);
    }

    @Override  // X2.x
    public final boolean v0() {
        return false;
    }
}

