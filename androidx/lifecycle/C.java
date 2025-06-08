package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map.Entry;

public final class c {
    public final HashMap a;
    public final HashMap b;
    public static final c c;

    static {
        c.c = new c();
    }

    public c() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public final a a(Class class0, Method[] arr_method) {
        int v3;
        Class class1 = class0.getSuperclass();
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = this.a;
        if(class1 != null) {
            a a0 = (a)hashMap1.get(class1);
            if(a0 == null) {
                a0 = this.a(class1, null);
            }
            hashMap0.putAll(a0.b);
        }
        Class[] arr_class = class0.getInterfaces();
        for(int v = 0; v < arr_class.length; ++v) {
            Class class2 = arr_class[v];
            a a1 = (a)hashMap1.get(class2);
            if(a1 == null) {
                a1 = this.a(class2, null);
            }
            for(Object object0: a1.b.entrySet()) {
                c.b(hashMap0, ((b)((Map.Entry)object0).getKey()), ((g)((Map.Entry)object0).getValue()), class0);
            }
        }
        if(arr_method == null) {
            arr_method = class0.getDeclaredMethods();
        }
        boolean z = false;
        for(int v1 = 0; v1 < arr_method.length; ++v1) {
            Method method0 = arr_method[v1];
            v v2 = (v)method0.getAnnotation(v.class);
            if(v2 != null) {
                Class[] arr_class1 = method0.getParameterTypes();
                if(arr_class1.length > 0) {
                    if(!arr_class1[0].isAssignableFrom(n.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    v3 = 1;
                }
                else {
                    v3 = 0;
                }
                g g0 = v2.value();
                if(arr_class1.length > 1) {
                    if(!arr_class1[1].isAssignableFrom(g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if(g0 != g.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    v3 = 2;
                }
                if(arr_class1.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c.b(hashMap0, new b(v3, method0), g0, class0);
                z = true;
            }
        }
        a a2 = new a(hashMap0);
        hashMap1.put(class0, a2);
        this.b.put(class0, Boolean.valueOf(z));
        return a2;
    }

    public static void b(HashMap hashMap0, b b0, g g0, Class class0) {
        g g1 = (g)hashMap0.get(b0);
        if(g1 != null && g0 != g1) {
            throw new IllegalArgumentException("Method " + b0.b.getName() + " in " + class0.getName() + " already declared with different @OnLifecycleEvent value: previous value " + g1 + ", new value " + g0);
        }
        if(g1 == null) {
            hashMap0.put(b0, g0);
        }
    }
}

