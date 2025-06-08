package R2;

import D3.b;
import J2.j;
import L3.m;
import T1.c;
import U2.l;
import W2.i;
import W2.o;
import W2.q;
import X2.I;
import X2.P;
import a3.A;
import c3.e;
import d3.d;
import f0.g;
import g1.n;
import g3.t;
import h3.h;
import j3.a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o2.G;
import v3.f;
import w2.k;
import x2.r;

public abstract class r0 {
    public static final ConcurrentHashMap a;

    static {
        r0.a = new ConcurrentHashMap();
    }

    public static final e a(Class class0) {
        o o2;
        o o1;
        j.f(class0, "<this>");
        ClassLoader classLoader0 = d.d(class0);
        y0 y00 = new y0(classLoader0);
        ConcurrentHashMap concurrentHashMap0 = r0.a;
        WeakReference weakReference0 = (WeakReference)concurrentHashMap0.get(y00);
        if(weakReference0 != null) {
            e e0 = (e)weakReference0.get();
            if(e0 != null) {
                return e0;
            }
            concurrentHashMap0.remove(y00, weakReference0);
        }
        c c0 = new c(classLoader0, 22);
        ClassLoader classLoader1 = k.class.getClassLoader();
        j.e(classLoader1, "getClassLoader(...)");
        c c1 = new c(classLoader1, 22);
        b b0 = new b(classLoader0, 14);
        c3.d d0 = c3.d.b;
        c3.d d1 = c3.d.c;
        j.f(("runtime module for " + classLoader0), "moduleName");
        m m0 = new m("DeserializationComponentsForJava.ModuleData");
        i i0 = new i(m0);
        A a0 = new A(f.g(("<" + ("runtime module for " + classLoader0) + '>')), m0, i0, 56);
        L3.o o0 = m0.a;
        o0.q();
        if(i0.a == null) {
            i0.a = a0;
            o0.n();
            i0.f = new U2.k(a0, 1);
            o3.d d2 = new o3.d();  // 初始化器: Ljava/lang/Object;-><init>()V
            b b1 = new b(24);
            g g0 = new g(m0, a0);
            r r0 = r.i;
            J3.d d3 = new J3.d(m0);
            l l0 = new l(a0, g0);
            g3.c c2 = new g3.c(t.c);
            n3.c c3 = new n3.c();  // 初始化器: Ljava/lang/Object;-><init>()V
            N3.k.b.getClass();
            N3.l l1 = N3.j.b;
            o3.e e1 = new o3.e();  // 初始化器: Ljava/lang/Object;-><init>()V
            j3.d d4 = new j3.d(new a(m0, b0, c0, d2, h.c, d0, h.a, d3, d1, b1, o3.e.c, P.k, f3.a.a, a0, l0, c2, c3, g3.m.a, j3.b.i, l1, t.c, e1));
            j.f(u3.f.g, "jvmMetadataVersion");
            n n0 = new n(c0, d2, 20, false);
            C1.d d5 = new C1.d(c0);
            d5.j = m0.b(new A3.h(d5, 25));
            d5.k = a0;
            d5.l = g0;
            d5.m = new B.c(a0, g0);
            d5.n = u3.f.g;
            List list0 = G.p(M3.l.a);
            i i1 = a0.l instanceof i ? ((i)a0.l) : null;
            o3.e e2 = o3.e.b;
            if(i1 == null) {
                o1 = Z2.a.b;
            }
            else {
                o1 = i1.I();
                if(o1 == null) {
                    o1 = Z2.a.b;
                }
            }
            if(i1 == null) {
                o2 = Z2.a.d;
            }
            else {
                o2 = i1.I();
                if(o2 == null) {
                    o2 = Z2.a.d;
                }
            }
            J3.d d6 = new J3.d(m0);
            I3.i i2 = new I3.i(m0, a0, n0, d5, d4, d0, e2, r0, g0, o1, o2, u3.h.a, l1, d6, list0, I3.j.f);
            d2.a = i2;
            b1.j = new b(d4, 0);
            o o3 = i0.I();
            o o4 = i0.I();
            J3.d d7 = new J3.d(m0);
            j.f(o3, "additionalClassPartsProvider");
            j.f(o4, "platformDependentDeclarationFilter");
            q q0 = new q(m0, c1, a0);
            q0.c = new I3.i(m0, a0, new b(q0, 3), new B.c(a0, g0, J3.a.m), q0, x2.j.z(new Z2.c[]{new V2.a(m0, a0), new W2.g(m0, a0)}), g0, o3, o4, J3.a.m.a, l1, d7, 0x40000);
            a0.o = new b(x2.g.Q(new A[]{a0}), 12);
            a0.p = new a3.l(x2.j.z(new I[]{d4, q0}), "CompositeProvider@RuntimeModuleData for " + a0);
            e e3 = new e(i2, new B1.a(d2, c0));
            while(true) {
                WeakReference weakReference1 = (WeakReference)concurrentHashMap0.putIfAbsent(y00, new WeakReference(e3));
                if(weakReference1 == null) {
                    return e3;
                }
                e e4 = (e)weakReference1.get();
                if(e4 != null) {
                    return e4;
                }
                concurrentHashMap0.remove(y00, weakReference1);
            }
        }
        try {
            throw new AssertionError("Built-ins module is already set: " + i0.a + " (attempting to reset to " + a0 + ")");
        }
        catch(Throwable throwable0) {
            try {
                m0.b.getClass();
                throw throwable0;
            }
            catch(Throwable throwable1) {
                o0.n();
                throw throwable1;
            }
        }
    }
}

