package U2;

import J2.j;
import java.util.HashMap;
import java.util.HashSet;
import v3.b;
import v3.c;
import v3.e;
import v3.f;

public abstract class m {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;
    public static final c E;
    public static final c F;
    public static final c G;
    public static final c H;
    public static final c I;
    public static final c J;
    public static final c K;
    public static final c L;
    public static final c M;
    public static final c N;
    public static final c O;
    public static final e P;
    public static final b Q;
    public static final b R;
    public static final b S;
    public static final b T;
    public static final b U;
    public static final c V;
    public static final c W;
    public static final c X;
    public static final c Y;
    public static final HashSet Z;
    public static final e a;
    public static final HashSet a0;
    public static final e b;
    public static final HashMap b0;
    public static final e c;
    public static final HashMap c0;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final c k;
    public static final c l;
    public static final c m;
    public static final c n;
    public static final c o;
    public static final c p;
    public static final c q;
    public static final c r;
    public static final c s;
    public static final c t;
    public static final c u;
    public static final c v;
    public static final c w;
    public static final c x;
    public static final c y;
    public static final c z;

    static {
        m.a = m.d("Any");
        m.b = m.d("Nothing");
        m.c = m.d("Cloneable");
        m.c("Suppress");
        m.d = m.d("Unit");
        m.e = m.d("CharSequence");
        m.f = m.d("String");
        m.g = m.d("Array");
        m.h = m.d("Boolean");
        m.d("Char");
        m.d("Byte");
        m.d("Short");
        m.d("Int");
        m.d("Long");
        m.d("Float");
        m.d("Double");
        m.i = m.d("Number");
        m.j = m.d("Enum");
        m.d("Function");
        m.k = m.c("Throwable");
        m.l = m.c("Comparable");
        f f0 = f.e("IntRange");
        j.e(n.o.c(f0).i(), "toUnsafe(...)");
        f f1 = f.e("LongRange");
        j.e(n.o.c(f1).i(), "toUnsafe(...)");
        m.m = m.c("Deprecated");
        m.c("DeprecatedSinceKotlin");
        m.n = m.c("DeprecationLevel");
        m.o = m.c("ReplaceWith");
        m.p = m.c("ExtensionFunctionType");
        m.q = m.c("ContextFunctionTypeParams");
        c c0 = m.c("ParameterName");
        m.r = c0;
        b.j(c0);
        m.s = m.c("Annotation");
        c c1 = m.a("Target");
        m.t = c1;
        b.j(c1);
        m.u = m.a("AnnotationTarget");
        m.v = m.a("AnnotationRetention");
        c c2 = m.a("Retention");
        m.w = c2;
        b.j(c2);
        b.j(m.a("Repeatable"));
        m.x = m.a("MustBeDocumented");
        m.y = m.c("UnsafeVariance");
        m.c("PublishedApi");
        f f2 = f.e("AccessibleLateinitPropertyLiteral");
        n.p.c(f2);
        m.z = m.b("Iterator");
        m.A = m.b("Iterable");
        m.B = m.b("Collection");
        m.C = m.b("List");
        m.D = m.b("ListIterator");
        m.E = m.b("Set");
        c c3 = m.b("Map");
        m.F = c3;
        m.G = c3.c(f.e("Entry"));
        m.H = m.b("MutableIterator");
        m.I = m.b("MutableIterable");
        m.J = m.b("MutableCollection");
        m.K = m.b("MutableList");
        m.L = m.b("MutableListIterator");
        m.M = m.b("MutableSet");
        c c4 = m.b("MutableMap");
        m.N = c4;
        m.O = c4.c(f.e("MutableEntry"));
        m.P = m.e("KClass");
        m.e("KType");
        m.e("KCallable");
        m.e("KProperty0");
        m.e("KProperty1");
        m.e("KProperty2");
        m.e("KMutableProperty0");
        m.e("KMutableProperty1");
        m.e("KMutableProperty2");
        e e0 = m.e("KProperty");
        m.e("KMutableProperty");
        m.Q = b.j(e0.g());
        m.e("KDeclarationContainer");
        c c5 = m.c("UByte");
        c c6 = m.c("UShort");
        c c7 = m.c("UInt");
        c c8 = m.c("ULong");
        m.R = b.j(c5);
        m.S = b.j(c6);
        m.T = b.j(c7);
        m.U = b.j(c8);
        m.V = m.c("UByteArray");
        m.W = m.c("UShortArray");
        m.X = m.c("UIntArray");
        m.Y = m.c("ULongArray");
        U2.j[] arr_j = U2.j.values();
        int v = 3;
        HashSet hashSet0 = new HashSet((arr_j.length >= 3 ? arr_j.length / 3 + arr_j.length + 1 : 3));
        U2.j[] arr_j1 = U2.j.values();
        for(int v2 = 0; v2 < arr_j1.length; ++v2) {
            hashSet0.add(arr_j1[v2].i);
        }
        m.Z = hashSet0;
        U2.j[] arr_j2 = U2.j.values();
        HashSet hashSet1 = new HashSet((arr_j2.length >= 3 ? arr_j2.length / 3 + arr_j2.length + 1 : 3));
        U2.j[] arr_j3 = U2.j.values();
        for(int v3 = 0; v3 < arr_j3.length; ++v3) {
            hashSet1.add(arr_j3[v3].j);
        }
        m.a0 = hashSet1;
        U2.j[] arr_j4 = U2.j.values();
        HashMap hashMap0 = new HashMap((arr_j4.length >= 3 ? arr_j4.length / 3 + arr_j4.length + 1 : 3));
        U2.j[] arr_j5 = U2.j.values();
        for(int v4 = 0; v4 < arr_j5.length; ++v4) {
            U2.j j0 = arr_j5[v4];
            String s = j0.i.b();
            j.e(s, "asString(...)");
            hashMap0.put(m.d(s), j0);
        }
        m.b0 = hashMap0;
        U2.j[] arr_j6 = U2.j.values();
        if(arr_j6.length >= 3) {
            v = arr_j6.length / 3 + arr_j6.length + 1;
        }
        HashMap hashMap1 = new HashMap(v);
        U2.j[] arr_j7 = U2.j.values();
        for(int v1 = 0; v1 < arr_j7.length; ++v1) {
            U2.j j1 = arr_j7[v1];
            String s1 = j1.j.b();
            j.e(s1, "asString(...)");
            hashMap1.put(m.d(s1), j1);
        }
        m.c0 = hashMap1;
    }

    public static c a(String s) {
        f f0 = f.e(s);
        return n.m.c(f0);
    }

    public static c b(String s) {
        f f0 = f.e(s);
        return n.n.c(f0);
    }

    public static c c(String s) {
        f f0 = f.e(s);
        return n.l.c(f0);
    }

    public static e d(String s) {
        e e0 = m.c(s).i();
        j.e(e0, "toUnsafe(...)");
        return e0;
    }

    public static final e e(String s) {
        f f0 = f.e(s);
        e e0 = n.i.c(f0).i();
        j.e(e0, "toUnsafe(...)");
        return e0;
    }
}

