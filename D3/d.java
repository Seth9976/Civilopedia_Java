package d3;

import I2.a;
import I2.b;
import J2.r;
import O2.A;
import O2.c;
import X3.h;
import X3.l;
import X3.p;
import Y3.n;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v3.f;
import w2.e;
import x2.g;
import x2.j;
import x2.k;
import x2.w;

public abstract class d {
    public static final List a;
    public static final Map b;
    public static final Map c;

    static {
        int v = 0;
        List list0 = j.z(new c[]{r.a.b(Boolean.TYPE), r.a.b(Byte.TYPE), r.a.b(Character.TYPE), r.a.b(Double.TYPE), r.a.b(Float.TYPE), r.a.b(Integer.TYPE), r.a.b(Long.TYPE), r.a.b(Short.TYPE)});
        d.a = list0;
        ArrayList arrayList0 = new ArrayList(k.E(list0));
        for(Object object0: list0) {
            arrayList0.add(new e(A.z(((c)object0)), A.A(((c)object0))));
        }
        d.b = w.z(arrayList0);
        ArrayList arrayList1 = new ArrayList(k.E(d.a));
        for(Object object1: d.a) {
            arrayList1.add(new e(A.A(((c)object1)), A.z(((c)object1))));
        }
        d.c = w.z(arrayList1);
        Iterable iterable0 = j.z(new Class[]{a.class, b.class, I2.c.class, I2.d.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class, R2.e.class});
        ArrayList arrayList2 = new ArrayList(k.E(iterable0));
        for(Object object2: iterable0) {
            if(v >= 0) {
                arrayList2.add(new e(((Class)object2), v));
                ++v;
                continue;
            }
            j.D();
            throw null;
        }
        w.z(arrayList2);
    }

    public static final v3.b a(Class class0) {
        J2.j.f(class0, "<this>");
        if(class0.isPrimitive()) {
            throw new IllegalArgumentException("Can\'t compute ClassId for primitive type: " + class0);
        }
        if(class0.isArray()) {
            throw new IllegalArgumentException("Can\'t compute ClassId for array type: " + class0);
        }
        if(class0.getEnclosingMethod() == null && class0.getEnclosingConstructor() == null && class0.getSimpleName().length() != 0) {
            Class class1 = class0.getDeclaringClass();
            if(class1 != null) {
                v3.b b0 = d.a(class1);
                return b0 == null ? v3.b.j(new v3.c(class0.getName())) : b0.d(f.e(class0.getSimpleName()));
            }
            return v3.b.j(new v3.c(class0.getName()));
        }
        v3.c c0 = new v3.c(class0.getName());
        return new v3.b(c0.e(), v3.c.j(c0.f()), true);
    }

    public static final String b(Class class0) {
        J2.j.f(class0, "<this>");
        if(class0.isPrimitive()) {
            switch(class0.getName()) {
                case "boolean": {
                    return "Z";
                }
                case "byte": {
                    return "B";
                }
                case "char": {
                    return "C";
                }
                case "double": {
                    return "D";
                }
                case "float": {
                    return "F";
                }
                case "int": {
                    return "I";
                }
                case "long": {
                    return "J";
                }
                case "short": {
                    return "S";
                }
                case "void": {
                    return "V";
                }
                default: {
                    throw new IllegalArgumentException("Unsupported primitive type: " + class0);
                }
            }
        }
        return class0.isArray() ? n.E0(class0.getName(), '.', '/') : "L" + n.E0(class0.getName(), '.', '/') + ';';
    }

    public static final List c(Type type0) {
        J2.j.f(type0, "<this>");
        if(!(type0 instanceof ParameterizedType)) {
            return x2.r.i;
        }
        if(((ParameterizedType)type0).getOwnerType() == null) {
            Type[] arr_type = ((ParameterizedType)type0).getActualTypeArguments();
            J2.j.e(arr_type, "getActualTypeArguments(...)");
            return g.Q(arr_type);
        }
        return l.y0(new h(l.v0(type0, d3.c.j), d3.c.k, p.q));
    }

    public static final ClassLoader d(Class class0) {
        J2.j.f(class0, "<this>");
        ClassLoader classLoader0 = class0.getClassLoader();
        if(classLoader0 == null) {
            classLoader0 = ClassLoader.getSystemClassLoader();
            J2.j.e(classLoader0, "getSystemClassLoader(...)");
        }
        return classLoader0;
    }
}

