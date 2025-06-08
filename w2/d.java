package W2;

import J2.j;
import U2.m;
import U2.n;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import o1.a;
import o2.I;
import v3.b;
import v3.c;
import v3.e;
import v3.f;
import v3.h;
import v3.i;

public final class d {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final b e;
    public static final c f;
    public static final b g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final List n;

    static {
        d.a = "kotlin" + '.' + "Function";
        d.b = "kotlin.reflect" + '.' + "KFunction";
        d.c = "kotlin.coroutines" + '.' + "SuspendFunction";
        d.d = "kotlin.reflect" + '.' + "KSuspendFunction";
        b b0 = b.j(new c("kotlin.jvm.functions.FunctionN"));
        d.e = b0;
        d.f = b0.b();
        d.g = i.n;
        d.d(Class.class);
        d.h = new HashMap();
        d.i = new HashMap();
        d.j = new HashMap();
        d.k = new HashMap();
        d.l = new HashMap();
        d.m = new HashMap();
        b b1 = b.j(m.A);
        c c0 = b1.g();
        c c1 = b1.g();
        j.e(c1, "getPackageFqName(...)");
        b b2 = new b(c0, I.t(m.I, c1), false);
        W2.c c2 = new W2.c(d.d(Iterable.class), b1, b2);
        b b3 = b.j(m.z);
        c c3 = b3.g();
        c c4 = b3.g();
        j.e(c4, "getPackageFqName(...)");
        b b4 = new b(c3, I.t(m.H, c4), false);
        W2.c c5 = new W2.c(d.d(Iterator.class), b3, b4);
        b b5 = b.j(m.B);
        c c6 = b5.g();
        c c7 = b5.g();
        j.e(c7, "getPackageFqName(...)");
        b b6 = new b(c6, I.t(m.J, c7), false);
        W2.c c8 = new W2.c(d.d(Collection.class), b5, b6);
        b b7 = b.j(m.C);
        c c9 = b7.g();
        c c10 = b7.g();
        j.e(c10, "getPackageFqName(...)");
        b b8 = new b(c9, I.t(m.K, c10), false);
        W2.c c11 = new W2.c(d.d(List.class), b7, b8);
        b b9 = b.j(m.E);
        c c12 = b9.g();
        c c13 = b9.g();
        j.e(c13, "getPackageFqName(...)");
        b b10 = new b(c12, I.t(m.M, c13), false);
        W2.c c14 = new W2.c(d.d(Set.class), b9, b10);
        b b11 = b.j(m.D);
        c c15 = b11.g();
        c c16 = b11.g();
        j.e(c16, "getPackageFqName(...)");
        b b12 = new b(c15, I.t(m.L, c16), false);
        W2.c c17 = new W2.c(d.d(ListIterator.class), b11, b12);
        b b13 = b.j(m.F);
        c c18 = b13.g();
        c c19 = b13.g();
        j.e(c19, "getPackageFqName(...)");
        b b14 = new b(c18, I.t(m.N, c19), false);
        W2.c c20 = new W2.c(d.d(Map.class), b13, b14);
        b b15 = b.j(m.F).d(m.G.f());
        c c21 = b15.g();
        c c22 = b15.g();
        j.e(c22, "getPackageFqName(...)");
        b b16 = new b(c21, I.t(m.O, c22), false);
        List list0 = x2.j.z(new W2.c[]{c2, c5, c8, c11, c14, c17, c20, new W2.c(d.d(Map.Entry.class), b15, b16)});
        d.n = list0;
        d.c(Object.class, m.a);
        d.c(String.class, m.f);
        d.c(CharSequence.class, m.e);
        d.a(d.d(Throwable.class), b.j(m.k));
        d.c(Cloneable.class, m.c);
        d.c(Number.class, m.i);
        d.a(d.d(Comparable.class), b.j(m.l));
        d.c(Enum.class, m.j);
        d.a(d.d(Annotation.class), b.j(m.s));
        for(Object object0: list0) {
            d.a(((W2.c)object0).a, ((W2.c)object0).b);
            d.b(((W2.c)object0).c.b(), ((W2.c)object0).a);
            d.l.put(((W2.c)object0).c, ((W2.c)object0).b);
            d.m.put(((W2.c)object0).b, ((W2.c)object0).c);
            c c23 = ((W2.c)object0).b.b();
            c c24 = ((W2.c)object0).c.b();
            e e0 = ((W2.c)object0).c.b().i();
            j.e(e0, "toUnsafe(...)");
            d.j.put(e0, c23);
            e e1 = c23.i();
            j.e(e1, "toUnsafe(...)");
            d.k.put(e1, c24);
        }
        D3.d[] arr_d = D3.d.values();
        for(int v1 = 0; v1 < arr_d.length; ++v1) {
            D3.d d0 = arr_d[v1];
            b b17 = b.j(d0.e());
            U2.j j0 = d0.d();
            j.e(j0, "getPrimitiveType(...)");
            d.a(b17, b.j(n.l.c(j0.i)));
        }
        for(Object object1: U2.d.a) {
            d.a(b.j(new c("kotlin.jvm.internal." + ((b)object1).i().b() + "CompanionObject")), ((b)object1).d(h.b));
        }
        for(int v2 = 0; v2 < 23; ++v2) {
            b b18 = b.j(new c("kotlin.jvm.functions.Function" + v2));
            f f0 = f.e(("Function" + v2));
            d.a(b18, new b(n.l, f0));
            d.b(new c("kotlin.reflect.KFunction" + v2), d.g);
        }
        for(int v = 0; v < 22; ++v) {
            d.b(new c("kotlin.reflect" + '.' + "KSuspendFunction" + v), d.g);
        }
        c c25 = m.b.g();
        j.e(c25, "toSafe(...)");
        d.b(c25, d.d(Void.class));
    }

    public static void a(b b0, b b1) {
        e e0 = b0.b().i();
        j.e(e0, "toUnsafe(...)");
        d.h.put(e0, b1);
        d.b(b1.b(), b0);
    }

    public static void b(c c0, b b0) {
        e e0 = c0.i();
        j.e(e0, "toUnsafe(...)");
        d.i.put(e0, b0);
    }

    public static void c(Class class0, e e0) {
        c c0 = e0.g();
        j.e(c0, "toSafe(...)");
        d.a(d.d(class0), b.j(c0));
    }

    public static b d(Class class0) {
        class0.isPrimitive();
        Class class1 = class0.getDeclaringClass();
        return class1 == null ? b.j(new c(class0.getCanonicalName())) : d.d(class1).d(f.e(class0.getSimpleName()));
    }

    public static boolean e(e e0, String s) {
        String s1 = e0.a;
        if(s1 != null) {
            String s2 = Y3.n.I0(s1, s, "");
            if(s2.length() > 0 && !a.o(s2.charAt(0), '0', false)) {
                Integer integer0 = Y3.n.L0(s2);
                return integer0 != null && ((int)integer0) >= 23;
            }
            return false;
        }
        e.a(4);
        throw null;
    }

    // 去混淆评级： 低(20)
    public static b f(e e0) {
        boolean z = d.e(e0, d.a);
        b b0 = d.e;
        if(!z && !d.e(e0, "kotlin.coroutines.SuspendFunction")) {
            return d.e(e0, "kotlin.reflect.KFunction") || d.e(e0, "kotlin.reflect.KSuspendFunction") ? d.g : ((b)d.i.get(e0));
        }
        return b0;
    }
}

