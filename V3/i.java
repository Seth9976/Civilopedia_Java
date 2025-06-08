package v3;

import java.util.LinkedHashMap;
import java.util.Set;
import x2.k;
import x2.w;
import x2.z;

public final class i {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final Set o;
    public static final Set p;
    public static final b q;
    public static final b r;
    public static final b s;
    public static final b t;

    static {
        c c0 = new c("kotlin");
        i.a = c0;
        c c1 = c0.c(f.e("reflect"));
        i.b = c1;
        c c2 = c0.c(f.e("collections"));
        i.c = c2;
        c c3 = c0.c(f.e("ranges"));
        i.d = c3;
        c0.c(f.e("jvm")).c(f.e("internal"));
        c c4 = c0.c(f.e("annotation"));
        i.e = c4;
        c c5 = c0.c(f.e("internal"));
        c5.c(f.e("ir"));
        c c6 = c0.c(f.e("coroutines"));
        i.f = c6;
        i.g = c0.c(f.e("enums"));
        c0.c(f.e("contracts"));
        c0.c(f.e("concurrent"));
        c0.c(f.e("test"));
        z.y(new c[]{c0, c2, c3, c4, c1, c5, c6});
        j.a("Nothing");
        j.a("Unit");
        j.a("Any");
        j.a("Enum");
        j.a("Annotation");
        i.h = j.a("Array");
        b b0 = j.a("Boolean");
        b b1 = j.a("Char");
        b b2 = j.a("Byte");
        b b3 = j.a("Short");
        b b4 = j.a("Int");
        b b5 = j.a("Long");
        b b6 = j.a("Float");
        b b7 = j.a("Double");
        i.i = j.f(b2);
        i.j = j.f(b3);
        i.k = j.f(b4);
        i.l = j.f(b5);
        j.a("CharSequence");
        i.m = j.a("String");
        j.a("Throwable");
        j.a("Cloneable");
        j.e("KProperty");
        j.e("KMutableProperty");
        j.e("KProperty0");
        j.e("KMutableProperty0");
        j.e("KProperty1");
        j.e("KMutableProperty1");
        j.e("KProperty2");
        j.e("KMutableProperty2");
        i.n = j.e("KFunction");
        j.e("KClass");
        j.e("KCallable");
        j.e("KType");
        j.a("Comparable");
        j.a("Number");
        j.a("Function");
        Set set0 = z.y(new b[]{b0, b1, b2, b3, b4, b5, b6, b7});
        i.o = set0;
        int v = w.q(k.E(set0));
        int v1 = 16;
        if(v < 16) {
            v = 16;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
        for(Object object0: set0) {
            f f0 = ((b)object0).i();
            J2.j.e(f0, "getShortClassName(...)");
            linkedHashMap0.put(object0, j.d(f0));
        }
        j.c(linkedHashMap0);
        Set set1 = z.y(new b[]{i.i, i.j, i.k, i.l});
        i.p = set1;
        int v2 = w.q(k.E(set1));
        if(v2 >= 16) {
            v1 = v2;
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(v1);
        for(Object object1: set1) {
            f f1 = ((b)object1).i();
            J2.j.e(f1, "getShortClassName(...)");
            linkedHashMap1.put(object1, j.d(f1));
        }
        j.c(linkedHashMap1);
        z.x(z.w(i.o, i.p), i.m);
        f f2 = f.e("Continuation");
        if(i.f != null) {
            c.j(f2);
            j.b("Iterator");
            j.b("Iterable");
            j.b("Collection");
            j.b("List");
            j.b("ListIterator");
            j.b("Set");
            b b8 = j.b("Map");
            j.b("MutableIterator");
            j.b("CharIterator");
            j.b("MutableIterable");
            j.b("MutableCollection");
            i.q = j.b("MutableList");
            j.b("MutableListIterator");
            i.r = j.b("MutableSet");
            b b9 = j.b("MutableMap");
            i.s = b9;
            b8.d(f.e("Entry"));
            b9.d(f.e("MutableEntry"));
            j.a("Result");
            f f3 = f.e("IntRange");
            if(i.d != null) {
                c.j(f3);
                c.j(f.e("LongRange"));
                c.j(f.e("CharRange"));
                f f4 = f.e("AnnotationRetention");
                if(i.e != null) {
                    c.j(f4);
                    c.j(f.e("AnnotationTarget"));
                    j.a("DeprecationLevel");
                    f f5 = f.e("EnumEntries");
                    i.t = new b(i.g, f5);
                    return;
                }
                b.a(3);
                throw null;
            }
            b.a(3);
            throw null;
        }
        b.a(3);
        throw null;
    }
}

