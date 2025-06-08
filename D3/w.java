package d3;

import J2.j;
import X2.b0;
import X2.e0;
import X2.h0;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import m3.b;
import m3.c;
import v3.f;
import v3.h;
import x2.r;
import z1.a0;

public abstract class w extends s implements b, c {
    @Override  // m3.b
    public final e a(v3.c c0) {
        j.f(c0, "fqName");
        Member member0 = this.b();
        j.d(member0, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] arr_annotation = ((AnnotatedElement)member0).getDeclaredAnnotations();
        return arr_annotation == null ? null : a0.q(arr_annotation, c0);
    }

    public abstract Member b();

    public final f c() {
        String s = this.b().getName();
        f f0 = s == null ? null : f.e(s);
        return f0 == null ? h.a : f0;
    }

    public final ArrayList d(Type[] arr_type, Annotation[][] arr2_annotation, boolean z) {
        String s;
        z z2;
        i i0;
        ArrayList arrayList1;
        a a1;
        Method method0;
        ArrayList arrayList0 = new ArrayList(arr_type.length);
        d3.b b0 = d3.b.a;
        Member member0 = this.b();
        j.f(member0, "member");
        a a0 = d3.b.b;
        if(a0 == null) {
            synchronized(b0) {
                a0 = d3.b.b;
                if(a0 == null) {
                    Class class0 = member0.getClass();
                    try {
                        method0 = class0.getMethod("getParameters", null);
                    }
                    catch(NoSuchMethodException unused_ex) {
                        a1 = new a(null, null);
                        goto label_16;
                    }
                    a1 = new a(method0, d.d(class0).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                label_16:
                    d3.b.b = a1;
                    a0 = a1;
                }
            }
        }
        Method method1 = a0.a;
        if(method1 == null) {
            arrayList1 = null;
        }
        else {
            Method method2 = a0.b;
            if(method2 == null) {
                arrayList1 = null;
            }
            else {
                Object object0 = method1.invoke(member0, null);
                j.d(object0, "null cannot be cast to non-null type kotlin.Array<*>");
                arrayList1 = new ArrayList(((Object[])object0).length);
                for(int v1 = 0; v1 < ((Object[])object0).length; ++v1) {
                    Object object1 = method2.invoke(((Object[])object0)[v1], null);
                    j.d(object1, "null cannot be cast to non-null type kotlin.String");
                    arrayList1.add(((String)object1));
                }
            }
        }
        int v2 = arrayList1 == null ? 0 : arrayList1.size() - arr_type.length;
        for(int v3 = 0; v3 < arr_type.length; ++v3) {
            Type type0 = arr_type[v3];
            j.f(type0, "type");
            boolean z1 = type0 instanceof Class;
            if(!z1 || !((Class)type0).isPrimitive()) {
                if(type0 instanceof GenericArrayType || z1 && ((Class)type0).isArray()) {
                    i0 = new i(type0);
                }
                else if(type0 instanceof WildcardType) {
                    i0 = new E(((WildcardType)type0));
                }
                else {
                    i0 = new q(type0);
                }
                z2 = i0;
            }
            else {
                z2 = new z(((Class)type0));
            }
            if(arrayList1 == null) {
                s = null;
            }
            else {
                s = (String)x2.i.V(v3 + v2, arrayList1);
                if(s == null) {
                    throw new IllegalStateException(("No parameter with index " + v3 + '+' + v2 + " (name=" + this.c() + " type=" + z2 + ") in " + this).toString());
                }
            }
            arrayList0.add(new D(z2, arr2_annotation[v3], s, z && v3 == arr_type.length - 1));
        }
        return arrayList0;
    }

    public final h0 e() {
        int v = this.b().getModifiers();
        if(Modifier.isPublic(v)) {
            return e0.l;
        }
        if(Modifier.isPrivate(v)) {
            return b0.l;
        }
        if(Modifier.isProtected(v)) {
            return Modifier.isStatic(v) ? b3.c.l : b3.b.l;
        }
        return b3.a.l;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof w && j.a(this.b(), ((w)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }

    @Override  // m3.b
    public final Collection l() {
        Member member0 = this.b();
        j.d(member0, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] arr_annotation = ((AnnotatedElement)member0).getDeclaredAnnotations();
        return arr_annotation != null ? a0.u(arr_annotation) : r.i;
    }

    @Override
    public final String toString() {
        return this.getClass().getName() + ": " + this.b();
    }
}

