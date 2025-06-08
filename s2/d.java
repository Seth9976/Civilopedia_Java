package S2;

import H2.a;
import J2.j;
import O2.A;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import w2.h;
import x2.g;

public final class d implements InvocationHandler {
    public final Class a;
    public final Map b;
    public final h c;
    public final h d;
    public final List e;

    public d(Class class0, Map map0, h h0, h h1, List list0) {
        this.a = class0;
        this.b = map0;
        this.c = h0;
        this.d = h1;
        this.e = list0;
    }

    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        boolean z2;
        Class class0 = this.a;
        j.f(class0, "$annotationClass");
        Map map0 = this.b;
        h h0 = this.c;
        h h1 = this.d;
        List list0 = this.e;
        j.f(list0, "$methods");
        String s = method0.getName();
        if(s != null) {
            switch(s) {
                case "annotationType": {
                    return class0;
                }
                case "hashCode": {
                    return ((Number)h1.getValue()).intValue();
                }
                case "toString": {
                    return (String)h0.getValue();
                }
            }
        }
        boolean z = false;
        if(j.a(s, "equals") && arr_object != null && arr_object.length == 1) {
            boolean z1 = true;
            Object object1 = g.O(arr_object);
            Annotation annotation0 = object1 instanceof Annotation ? ((Annotation)object1) : null;
            if(j.a((annotation0 == null ? null : A.y(A.v(annotation0))), class0)) {
                if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                    for(Object object2: list0) {
                        Object object3 = map0.get(((Method)object2).getName());
                        Object object4 = ((Method)object2).invoke(object1, null);
                        if(object3 instanceof boolean[]) {
                            j.d(object4, "null cannot be cast to non-null type kotlin.BooleanArray");
                            z2 = Arrays.equals(((boolean[])object3), ((boolean[])object4));
                        }
                        else if(object3 instanceof char[]) {
                            j.d(object4, "null cannot be cast to non-null type kotlin.CharArray");
                            z2 = Arrays.equals(((char[])object3), ((char[])object4));
                        }
                        else if(object3 instanceof byte[]) {
                            j.d(object4, "null cannot be cast to non-null type kotlin.ByteArray");
                            z2 = Arrays.equals(((byte[])object3), ((byte[])object4));
                        }
                        else if(object3 instanceof short[]) {
                            j.d(object4, "null cannot be cast to non-null type kotlin.ShortArray");
                            z2 = Arrays.equals(((short[])object3), ((short[])object4));
                        }
                        else if(object3 instanceof int[]) {
                            j.d(object4, "null cannot be cast to non-null type kotlin.IntArray");
                            z2 = Arrays.equals(((int[])object3), ((int[])object4));
                        }
                        else if(object3 instanceof float[]) {
                            j.d(object4, "null cannot be cast to non-null type kotlin.FloatArray");
                            z2 = Arrays.equals(((float[])object3), ((float[])object4));
                        }
                        else if(object3 instanceof long[]) {
                            j.d(object4, "null cannot be cast to non-null type kotlin.LongArray");
                            z2 = Arrays.equals(((long[])object3), ((long[])object4));
                        }
                        else if(object3 instanceof double[]) {
                            j.d(object4, "null cannot be cast to non-null type kotlin.DoubleArray");
                            z2 = Arrays.equals(((double[])object3), ((double[])object4));
                        }
                        else if(object3 instanceof Object[]) {
                            j.d(object4, "null cannot be cast to non-null type kotlin.Array<*>");
                            z2 = Arrays.equals(((Object[])object3), ((Object[])object4));
                        }
                        else {
                            z2 = j.a(object3, object4);
                        }
                        if(!z2) {
                            z1 = false;
                            break;
                        }
                    }
                }
                if(z1) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if(map0.containsKey(s)) {
            return map0.get(s);
        }
        StringBuilder stringBuilder0 = new StringBuilder("Method is not supported: ");
        stringBuilder0.append(method0);
        stringBuilder0.append(" (args: ");
        if(arr_object == null) {
            arr_object = new Object[0];
        }
        stringBuilder0.append(g.Q(arr_object));
        stringBuilder0.append(')');
        throw new a(stringBuilder0.toString(), 1);
    }
}

