package S2;

import J2.j;
import J2.r;
import O2.A;
import d3.d;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import x2.i;
import x2.k;
import x2.w;

public final class c implements g {
    public final Class a;
    public final ArrayList b;
    public final a c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public c(Class class0, ArrayList arrayList0, a a0) {
        b b0 = b.j;
        ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
        for(Object object0: arrayList0) {
            arrayList1.add(class0.getDeclaredMethod(((String)object0), null));
        }
        this(class0, arrayList0, a0, b0, arrayList1);
    }

    public c(Class class0, ArrayList arrayList0, a a0, b b0, List list0) {
        j.f(class0, "jClass");
        j.f(list0, "methods");
        super();
        this.a = class0;
        this.b = arrayList0;
        this.c = a0;
        this.d = list0;
        ArrayList arrayList1 = new ArrayList(k.E(list0));
        for(Object object0: list0) {
            arrayList1.add(((Method)object0).getGenericReturnType());
        }
        this.e = arrayList1;
        ArrayList arrayList2 = new ArrayList(k.E(this.d));
        for(Object object1: this.d) {
            Class class1 = ((Method)object1).getReturnType();
            j.c(class1);
            Class class2 = (Class)d.c.get(class1);
            if(class2 != null) {
                class1 = class2;
            }
            arrayList2.add(class1);
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList(k.E(this.d));
        for(Object object2: this.d) {
            arrayList3.add(((Method)object2).getDefaultValue());
        }
        this.g = arrayList3;
        if(this.c == a.j && b0 == b.i) {
            j.f(this.b, "<this>");
            ArrayList arrayList4 = new ArrayList(k.E(this.b));
            boolean z = false;
            for(Object object3: this.b) {
                boolean z1 = true;
                if(!z && j.a(object3, "value")) {
                    z = true;
                    z1 = false;
                }
                if(z1) {
                    arrayList4.add(object3);
                }
            }
            if(!arrayList4.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override  // S2.g
    public final Type r() {
        return this.a;
    }

    @Override  // S2.g
    public final List s() {
        return this.e;
    }

    @Override  // S2.g
    public final Member t() {
        return null;
    }

    @Override  // S2.g
    public final Object u(Object[] arr_object) {
        String s1;
        O2.c c0;
        Object object1;
        ArrayList arrayList1;
        j.f(arr_object, "args");
        o1.a.b(this, arr_object);
        ArrayList arrayList0 = new ArrayList(arr_object.length);
        int v = 0;
        int v1 = 0;
        while(true) {
            arrayList1 = this.b;
            if(v >= arr_object.length) {
                break;
            }
            Object object0 = arr_object[v];
            ArrayList arrayList2 = this.f;
            if(object0 != null || this.c != a.i) {
                Class class0 = (Class)arrayList2.get(v1);
                if(object0 instanceof Class) {
                    object1 = null;
                }
                else {
                    if(object0 instanceof O2.c) {
                        object0 = A.y(((O2.c)object0));
                    }
                    else if(object0 instanceof Object[]) {
                        if(((Object[])object0) instanceof Class[]) {
                            object1 = null;
                            goto label_37;
                        }
                        else if(((Object[])object0) instanceof O2.c[]) {
                            j.d(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                            O2.c[] arr_c = (O2.c[])object0;
                            ArrayList arrayList3 = new ArrayList(arr_c.length);
                            for(int v2 = 0; v2 < arr_c.length; ++v2) {
                                arrayList3.add(A.y(arr_c[v2]));
                            }
                            object0 = arrayList3.toArray(new Class[0]);
                        }
                        else {
                            object0 = (Object[])object0;
                        }
                    }
                    object1 = class0.isInstance(object0) ? object0 : null;
                }
            }
            else {
                object1 = this.g.get(v1);
            }
        label_37:
            if(object1 == null) {
                String s = (String)arrayList1.get(v1);
                Class class1 = (Class)arrayList2.get(v1);
                Class class2 = Class.class;
                if(j.a(class1, class2)) {
                    c0 = r.a.b(O2.c.class);
                }
                else {
                    c0 = !class1.isArray() || !j.a(class1.getComponentType(), class2) ? A.E(class1) : r.a.b(O2.c[].class);
                }
                if(j.a(c0.h(), r.a.b(Object[].class).h())) {
                    Class class3 = A.y(c0).getComponentType();
                    j.e(class3, "getComponentType(...)");
                    s1 = c0.h() + '<' + A.E(class3).h() + '>';
                }
                else {
                    s1 = c0.h();
                }
                throw new IllegalArgumentException("Argument #" + v1 + ' ' + s + " is not of the required type " + s1);
            }
            arrayList0.add(object1);
            ++v;
            ++v1;
        }
        Map map0 = w.z(i.v0(arrayList1, arrayList0));
        return android.support.v4.media.session.a.n(this.a, map0, this.d);
    }
}

