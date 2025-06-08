package d3;

import A3.h;
import J2.j;
import X3.f;
import X3.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import m3.b;
import m3.e;
import o1.a;
import v3.c;
import x2.g;
import x2.r;
import z1.a0;

public final class o extends s implements b, e {
    public final Class a;

    public o(Class class0) {
        j.f(class0, "klass");
        super();
        this.a = class0;
    }

    @Override  // m3.b
    public final d3.e a(c c0) {
        j.f(c0, "fqName");
        Class class0 = this.a;
        if(class0 != null) {
            Annotation[] arr_annotation = class0.getDeclaredAnnotations();
            return arr_annotation == null ? null : a0.q(arr_annotation, c0);
        }
        return null;
    }

    public final Collection b() {
        Field[] arr_field = this.a.getDeclaredFields();
        j.e(arr_field, "getDeclaredFields(...)");
        return l.y0(l.w0(new f(g.C(arr_field), false, d3.l.q), m.q));
    }

    public final c c() {
        return d.a(this.a).b();
    }

    public final Collection d() {
        Method[] arr_method = this.a.getDeclaredMethods();
        j.e(arr_method, "getDeclaredMethods(...)");
        return l.y0(l.w0(new f(g.C(arr_method), true, new h(this, 13)), n.q));
    }

    public final v3.f e() {
        Class class0 = this.a;
        if(class0.isAnonymousClass()) {
            String s = class0.getName();
            int v = Y3.n.z0(6, s, ".");
            if(v != -1) {
                s = s.substring(v + 1, s.length());
                j.e(s, "substring(...)");
            }
            return v3.f.e(s);
        }
        return v3.f.e(class0.getSimpleName());
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof o && j.a(this.a, ((o)object0).a);
    }

    public final ArrayList f() {
        Class class0 = this.a;
        j.f(class0, "clazz");
        f0.g g0 = a.a;
        Object[] arr_object = null;
        if(g0 == null) {
            try {
                g0 = new f0.g(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 15);
            }
            catch(NoSuchMethodException unused_ex) {
                g0 = new f0.g(null, null, null, null, 15);
            }
            a.a = g0;
        }
        Method method0 = (Method)g0.m;
        if(method0 != null) {
            arr_object = (Object[])method0.invoke(class0, null);
        }
        if(arr_object == null) {
            arr_object = new Object[0];
        }
        ArrayList arrayList0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            arrayList0.add(new A(arr_object[v]));
        }
        return arrayList0;
    }

    public final boolean g() {
        Class class0 = this.a;
        j.f(class0, "clazz");
        f0.g g0 = a.a;
        Boolean boolean0 = null;
        if(g0 == null) {
            try {
                g0 = new f0.g(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 15);
            }
            catch(NoSuchMethodException unused_ex) {
                g0 = new f0.g(null, null, null, null, 15);
            }
            a.a = g0;
        }
        Method method0 = (Method)g0.l;
        if(method0 != null) {
            Object object0 = method0.invoke(class0, null);
            j.d(object0, "null cannot be cast to non-null type kotlin.Boolean");
            boolean0 = (Boolean)object0;
        }
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public final boolean h() {
        Class class0 = this.a;
        j.f(class0, "clazz");
        f0.g g0 = a.a;
        Boolean boolean0 = null;
        if(g0 == null) {
            try {
                g0 = new f0.g(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 15);
            }
            catch(NoSuchMethodException unused_ex) {
                g0 = new f0.g(null, null, null, null, 15);
            }
            a.a = g0;
        }
        Method method0 = (Method)g0.j;
        if(method0 != null) {
            Object object0 = method0.invoke(class0, null);
            j.d(object0, "null cannot be cast to non-null type kotlin.Boolean");
            boolean0 = (Boolean)object0;
        }
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // m3.b
    public final Collection l() {
        Class class0 = this.a;
        if(class0 != null) {
            Annotation[] arr_annotation = class0.getDeclaredAnnotations();
            if(arr_annotation != null) {
                return a0.u(arr_annotation);
            }
        }
        return r.i;
    }

    @Override
    public final String toString() {
        return o.class.getName() + ": " + this.a;
    }

    @Override  // m3.e
    public final ArrayList u() {
        TypeVariable[] arr_typeVariable = this.a.getTypeParameters();
        j.e(arr_typeVariable, "getTypeParameters(...)");
        ArrayList arrayList0 = new ArrayList(arr_typeVariable.length);
        for(int v = 0; v < arr_typeVariable.length; ++v) {
            arrayList0.add(new C(arr_typeVariable[v]));
        }
        return arrayList0;
    }
}

