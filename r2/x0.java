package R2;

import A3.q;
import E1.d;
import J2.h;
import J2.j;
import J2.p;
import J2.t;
import M3.N;
import O2.A;
import O2.b;
import U2.m;
import X2.O;
import X2.k;
import Y2.a;
import Y3.n;
import a3.v;
import c3.f;
import d3.e;
import d3.s;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o2.G;
import q3.y;
import v3.c;
import w3.l;
import x2.g;
import x2.i;
import x2.o;
import x2.w;
import z1.a0;

public abstract class x0 {
    public static final c a;

    static {
        x0.a = new c("kotlin.jvm.JvmStatic");
    }

    public static final r a(b b0) {
        r r0 = b0 instanceof r ? ((r)b0) : null;
        if(r0 == null) {
            r0 = x0.b(b0);
            if(r0 == null) {
                return x0.c(b0);
            }
        }
        return r0;
    }

    public static final H b(Object object0) {
        H h0 = object0 instanceof H ? ((H)object0) : null;
        if(h0 == null) {
            h h1 = object0 instanceof h ? ((h)object0) : null;
            b b0 = h1 == null ? null : h1.c();
            return b0 instanceof H ? ((H)b0) : null;
        }
        return h0;
    }

    public static final m0 c(Object object0) {
        m0 m00 = object0 instanceof m0 ? ((m0)object0) : null;
        if(m00 == null) {
            p p0 = object0 instanceof p ? ((p)object0) : null;
            b b0 = p0 == null ? null : p0.c();
            return b0 instanceof m0 ? ((m0)b0) : null;
        }
        return m00;
    }

    public static final ArrayList d(a a0) {
        List list0;
        j.f(a0, "<this>");
        Y2.h h0 = a0.l();
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = h0.iterator();
        while(true) {
            Annotation annotation0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Y2.b b0 = (Y2.b)object0;
            O o0 = b0.q();
            if(o0 instanceof c3.a) {
                annotation0 = ((c3.a)o0).i;
            }
            else if(o0 instanceof f) {
                s s0 = ((f)o0).i;
                e e0 = s0 instanceof e ? ((e)s0) : null;
                if(e0 != null) {
                    annotation0 = e0.a;
                }
            }
            else {
                annotation0 = x0.j(b0);
            }
            if(annotation0 != null) {
                arrayList0.add(annotation0);
            }
        }
        if(!arrayList0.isEmpty()) {
            for(Object object1: arrayList0) {
                if(A.y(A.v(((Annotation)object1))).getSimpleName().equals("Container")) {
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object2: arrayList0) {
                        Annotation annotation1 = (Annotation)object2;
                        Class class0 = A.y(A.v(annotation1));
                        if(!class0.getSimpleName().equals("Container") || class0.getAnnotation(t.class) == null) {
                            list0 = G.p(annotation1);
                        }
                        else {
                            Object object3 = class0.getDeclaredMethod("value", null).invoke(annotation1, null);
                            j.d(object3, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            list0 = g.B(((Annotation[])object3));
                        }
                        o.H(list0, arrayList1);
                    }
                    return arrayList1;
                }
                if(false) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    public static final Object e(Type type0) {
        j.f(type0, "type");
        if(type0 instanceof Class && ((Class)type0).isPrimitive()) {
            if(type0.equals(Boolean.TYPE)) {
                return false;
            }
            if(type0.equals(Character.TYPE)) {
                return Character.valueOf('\u0000');
            }
            if(type0.equals(Byte.TYPE)) {
                return (byte)0;
            }
            if(type0.equals(Short.TYPE)) {
                return (short)0;
            }
            if(type0.equals(Integer.TYPE)) {
                return 0;
            }
            if(type0.equals(Float.TYPE)) {
                return 0.0f;
            }
            if(type0.equals(Long.TYPE)) {
                return 0L;
            }
            if(type0.equals(Double.TYPE)) {
                return 0.0;
            }
            if(type0.equals(Void.TYPE)) {
                throw new IllegalStateException("Parameter with void type is illegal");
            }
            throw new UnsupportedOperationException("Unknown primitive: " + type0);
        }
        return null;
    }

    public static final X2.b f(Class class0, l l0, s3.f f0, a3.s s0, s3.a a0, I2.c c0) {
        List list0;
        j.f(class0, "moduleAnchor");
        j.f(l0, "proto");
        j.f(f0, "nameResolver");
        j.f(a0, "metadataVersion");
        c3.e e0 = r0.a(class0);
        if(l0 instanceof y) {
            list0 = ((y)l0).q;
        }
        else if(l0 instanceof q3.G) {
            list0 = ((q3.G)l0).q;
        }
        else {
            throw new IllegalStateException(("Unsupported message: " + l0).toString());
        }
        j.c(list0);
        return (X2.b)c0.a(new I3.s(new d(e0.a, f0, e0.a.b, s0, s3.g.b, a0, null, null, list0)), l0);
    }

    public static final v g(X2.c c0) {
        j.f(c0, "<this>");
        if(c0.A() != null) {
            k k0 = c0.p();
            j.d(k0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return ((X2.e)k0).F0();
        }
        return null;
    }

    public static final boolean h(o0 o00) {
        return o00.a != null && y3.f.g(o00.a);
    }

    public static final Class i(ClassLoader classLoader0, v3.b b0, int v) {
        v3.e e0 = b0.b().i();
        j.e(e0, "toUnsafe(...)");
        v3.b b1 = W2.d.f(e0);
        if(b1 != null) {
            b0 = b1;
        }
        String s = b0.g().b();
        String s1 = b0.h().b();
        if(s.equals("kotlin")) {
            switch(s1) {
                case "Array": {
                    return Object[].class;
                }
                case "BooleanArray": {
                    return boolean[].class;
                }
                case "ByteArray": {
                    return byte[].class;
                }
                case "CharArray": {
                    return char[].class;
                }
                case "DoubleArray": {
                    return double[].class;
                }
                case "FloatArray": {
                    return float[].class;
                }
                case "IntArray": {
                    return int[].class;
                }
                case "LongArray": {
                    return long[].class;
                }
                case "ShortArray": {
                    return short[].class;
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(v > 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append("[");
            }
            stringBuilder0.append("L");
        }
        if(s.length() > 0) {
            stringBuilder0.append(s + ".");
        }
        stringBuilder0.append(n.E0(s1, '.', '$'));
        if(v > 0) {
            stringBuilder0.append(";");
        }
        String s2 = stringBuilder0.toString();
        j.e(s2, "toString(...)");
        return a0.P(classLoader0, s2);
    }

    public static final Annotation j(Y2.b b0) {
        X2.e e0 = C3.e.d(b0);
        Class class0 = e0 == null ? null : x0.k(e0);
        if(!(class0 instanceof Class)) {
            class0 = null;
        }
        if(class0 == null) {
            return null;
        }
        Iterable iterable0 = b0.b().entrySet();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            v3.f f0 = (v3.f)((Map.Entry)object0).getKey();
            A3.g g0 = (A3.g)((Map.Entry)object0).getValue();
            ClassLoader classLoader0 = class0.getClassLoader();
            j.e(classLoader0, "getClassLoader(...)");
            Object object1 = x0.l(g0, classLoader0);
            w2.e e1 = object1 == null ? null : new w2.e(f0.b(), object1);
            if(e1 != null) {
                arrayList0.add(e1);
            }
        }
        Map map0 = w.z(arrayList0);
        Iterable iterable1 = map0.keySet();
        ArrayList arrayList1 = new ArrayList(x2.k.E(iterable1));
        for(Object object2: iterable1) {
            arrayList1.add(class0.getDeclaredMethod(((String)object2), null));
        }
        return (Annotation)android.support.v4.media.session.a.n(class0, map0, arrayList1);
    }

    public static final Class k(X2.e e0) {
        j.f(e0, "<this>");
        O o0 = e0.q();
        j.e(o0, "getSource(...)");
        if(o0 instanceof o3.n) {
            return ((o3.n)o0).i.a;
        }
        if(o0 instanceof f) {
            j.d(((f)o0).i, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((d3.o)((f)o0).i).a;
        }
        v3.b b0 = C3.e.f(e0);
        return b0 == null ? null : x0.i(d3.d.d(e0.getClass()), b0, 0);
    }

    public static final Object l(A3.g g0, ClassLoader classLoader0) {
        boolean[] arr_z;
        X2.e e0;
        int v = 0;
        boolean z = true;
        if(g0 instanceof A3.a) {
            return x0.j(((Y2.b)((A3.a)g0).a));
        }
        if(g0 instanceof A3.b) {
            A3.y y0 = ((A3.b)g0) instanceof A3.y ? ((A3.y)(((A3.b)g0))) : null;
            if(y0 != null) {
                M3.w w0 = y0.c;
                if(w0 != null) {
                    ArrayList arrayList0 = new ArrayList(x2.k.E(((Iterable)((A3.b)g0).a)));
                    for(Object object0: ((Iterable)((A3.b)g0).a)) {
                        arrayList0.add(x0.l(((A3.g)object0), classLoader0));
                    }
                    X2.h h0 = w0.H0().q();
                    U2.j j0 = h0 == null ? null : U2.h.r(h0);
                    int v1 = j0 == null ? -1 : w0.a[j0.ordinal()];
                    Object object1 = ((A3.b)g0).a;
                    switch(v1) {
                        case -1: {
                            if(!U2.h.y(w0)) {
                                throw new IllegalStateException(("Not an array type: " + w0).toString());
                            }
                            M3.w w1 = ((N)i.i0(w0.A0())).b();
                            j.e(w1, "getType(...)");
                            X2.h h1 = w1.H0().q();
                            e0 = h1 instanceof X2.e ? ((X2.e)h1) : null;
                            if(e0 == null) {
                                throw new IllegalStateException(("Not a class type: " + w1).toString());
                            }
                            if(U2.h.D(w1, m.f)) {
                                int v10 = ((List)object1).size();
                                arr_z = new String[v10];
                                while(v < v10) {
                                    Object object10 = arrayList0.get(v);
                                    j.d(object10, "null cannot be cast to non-null type kotlin.String");
                                    arr_z[v] = object10;
                                    ++v;
                                }
                                return arr_z;
                            }
                            if(U2.h.b(e0, m.P)) {
                                int v11 = ((List)object1).size();
                                arr_z = new Class[v11];
                                while(v < v11) {
                                    Object object11 = arrayList0.get(v);
                                    j.d(object11, "null cannot be cast to non-null type java.lang.Class<*>");
                                    arr_z[v] = object11;
                                    ++v;
                                }
                                return arr_z;
                            }
                            break;
                        }
                        case 1: {
                            int v2 = ((List)object1).size();
                            arr_z = new boolean[v2];
                            while(v < v2) {
                                Object object2 = arrayList0.get(v);
                                j.d(object2, "null cannot be cast to non-null type kotlin.Boolean");
                                arr_z[v] = ((Boolean)object2).booleanValue();
                                ++v;
                            }
                            return arr_z;
                        }
                        case 2: {
                            int v3 = ((List)object1).size();
                            arr_z = new char[v3];
                            while(v < v3) {
                                Object object3 = arrayList0.get(v);
                                j.d(object3, "null cannot be cast to non-null type kotlin.Char");
                                arr_z[v] = ((Character)object3).charValue();
                                ++v;
                            }
                            return arr_z;
                        }
                        case 3: {
                            int v4 = ((List)object1).size();
                            arr_z = new byte[v4];
                            while(v < v4) {
                                Object object4 = arrayList0.get(v);
                                j.d(object4, "null cannot be cast to non-null type kotlin.Byte");
                                arr_z[v] = (byte)(((Byte)object4));
                                ++v;
                            }
                            return arr_z;
                        }
                        case 4: {
                            int v5 = ((List)object1).size();
                            arr_z = new short[v5];
                            while(v < v5) {
                                Object object5 = arrayList0.get(v);
                                j.d(object5, "null cannot be cast to non-null type kotlin.Short");
                                arr_z[v] = (short)(((Short)object5));
                                ++v;
                            }
                            return arr_z;
                        }
                        case 5: {
                            int v6 = ((List)object1).size();
                            arr_z = new int[v6];
                            while(v < v6) {
                                Object object6 = arrayList0.get(v);
                                j.d(object6, "null cannot be cast to non-null type kotlin.Int");
                                arr_z[v] = (int)(((Integer)object6));
                                ++v;
                            }
                            return arr_z;
                        }
                        case 6: {
                            int v7 = ((List)object1).size();
                            arr_z = new float[v7];
                            while(v < v7) {
                                Object object7 = arrayList0.get(v);
                                j.d(object7, "null cannot be cast to non-null type kotlin.Float");
                                arr_z[v] = (float)(((Float)object7));
                                ++v;
                            }
                            return arr_z;
                        }
                        case 7: {
                            int v8 = ((List)object1).size();
                            arr_z = new long[v8];
                            while(v < v8) {
                                Object object8 = arrayList0.get(v);
                                j.d(object8, "null cannot be cast to non-null type kotlin.Long");
                                arr_z[v] = (long)(((Long)object8));
                                ++v;
                            }
                            return arr_z;
                        }
                        case 8: {
                            int v9 = ((List)object1).size();
                            arr_z = new double[v9];
                            while(v < v9) {
                                Object object9 = arrayList0.get(v);
                                j.d(object9, "null cannot be cast to non-null type kotlin.Double");
                                arr_z[v] = (double)(((Double)object9));
                                ++v;
                            }
                            return arr_z;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    v3.b b0 = C3.e.f(e0);
                    if(b0 != null) {
                        Class class0 = x0.i(classLoader0, b0, 0);
                        if(class0 != null) {
                            Object object12 = Array.newInstance(class0, ((List)object1).size());
                            j.d(object12, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            int v12 = arrayList0.size();
                            while(v < v12) {
                                ((Object[])object12)[v] = arrayList0.get(v);
                                ++v;
                            }
                            return (Object[])object12;
                        }
                    }
                }
            }
        }
        else if(g0 instanceof A3.j) {
            v3.f f0 = (v3.f)((w2.e)((A3.j)g0).a).j;
            Class class1 = x0.i(classLoader0, ((v3.b)((w2.e)((A3.j)g0).a).i), 0);
            if(class1 != null) {
                return Enum.valueOf(class1, f0.b());
            }
        }
        else if(g0 instanceof A3.t) {
            A3.s s0 = (A3.s)((A3.t)g0).a;
            if(s0 instanceof A3.r) {
                return x0.i(classLoader0, ((A3.r)s0).a.a, ((A3.r)s0).a.b);
            }
            if(!(s0 instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            X2.h h2 = ((q)s0).a.H0().q();
            X2.e e1 = h2 instanceof X2.e ? ((X2.e)h2) : null;
            if(e1 != null) {
                return x0.k(e1);
            }
        }
        else {
            if(!(g0 instanceof A3.k)) {
                z = g0 instanceof A3.v;
            }
            if(!z) {
                return g0.b();
            }
        }
        return null;
    }
}

