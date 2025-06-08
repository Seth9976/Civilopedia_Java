package com.google.gson.internal.bind;

import B.c;
import Y1.a;
import Y1.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.d;
import com.google.gson.internal.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class ReflectiveTypeAdapterFactory implements o {
    public static final class Adapter extends n {
        public final k a;
        public final LinkedHashMap b;

        public Adapter(k k0, LinkedHashMap linkedHashMap0) {
            this.a = k0;
            this.b = linkedHashMap0;
        }

        @Override  // com.google.gson.n
        public final Object b(a a0) {
            if(a0.v() == 9) {
                a0.r();
                return null;
            }
            Object object0 = this.a.F();
            try {
                a0.b();
                while(true) {
                    if(!a0.i()) {
                        goto label_20;
                    }
                    String s = a0.p();
                    com.google.gson.internal.bind.a a1 = (com.google.gson.internal.bind.a)this.b.get(s);
                    if(a1 != null && a1.c) {
                        Object object1 = a1.f.b(a0);
                        if(object1 == null && a1.i) {
                            continue;
                        }
                        a1.d.set(object0, object1);
                    }
                    else {
                        a0.A();
                    }
                }
            }
            catch(IllegalStateException illegalStateException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new AssertionError(illegalAccessException0);
            }
            throw new JsonSyntaxException(illegalStateException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
        label_20:
            a0.f();
            return object0;
        }

        @Override  // com.google.gson.n
        public final void c(b b0, Object object0) {
            if(object0 == null) {
                b0.j();
                return;
            }
            b0.c();
            try {
                for(Object object1: this.b.values()) {
                    com.google.gson.internal.bind.a a0 = (com.google.gson.internal.bind.a)object1;
                    Field field0 = a0.d;
                    if(a0.b && field0.get(object0) != object0) {
                        b0.g(a0.a);
                        Object object2 = field0.get(object0);
                        n n0 = a0.f;
                        if(!a0.e) {
                            n0 = new TypeAdapterRuntimeTypeWrapper(a0.g, n0, a0.h.b);
                        }
                        n0.c(b0, object2);
                    }
                }
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new AssertionError(illegalAccessException0);
            }
            b0.f();
        }
    }

    public final c i;
    public final g j;
    public final Excluder k;
    public final JsonAdapterAnnotationTypeAdapterFactory l;
    public final W1.b m;

    public ReflectiveTypeAdapterFactory(c c0, Excluder excluder0, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0) {
        this.m = W1.b.a;
        this.i = c0;
        this.j = g.i;
        this.k = excluder0;
        this.l = jsonAdapterAnnotationTypeAdapterFactory0;
    }

    @Override  // com.google.gson.o
    public final n a(h h0, X1.a a0) {
        k k1;
        c c1;
        n n1;
        LinkedHashMap linkedHashMap1;
        Class class3;
        X1.a a2;
        Field[] arr_field1;
        int v3;
        int v2;
        n n2;
        List list0;
        Type type0;
        Class class0 = Object.class;
        Class class1 = a0.a;
        if(!class0.isAssignableFrom(class1)) {
            return null;
        }
        c c0 = this.i;
        k k0 = c0.u(a0);
        n n0 = null;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        if(!class1.isInterface()) {
            Class class2 = class1;
            X1.a a1 = a0;
            while(class2 != class0) {
                Field[] arr_field = class2.getDeclaredFields();
                int v = arr_field.length;
                int v1 = 0;
                while(true) {
                    type0 = a1.b;
                    if(v1 >= v) {
                        break;
                    }
                    Field field0 = arr_field[v1];
                    boolean z = this.b(field0, true);
                    boolean z1 = this.b(field0, false);
                    if(z || z1) {
                        this.m.a(field0);
                        Type type1 = d.i(type0, class2, field0.getGenericType(), new HashSet());
                        U1.b b0 = (U1.b)field0.getAnnotation(U1.b.class);
                        if(b0 == null) {
                            v2 = v1;
                            v3 = v;
                            list0 = Collections.singletonList(this.j.b(field0));
                        }
                        else {
                            String s = b0.value();
                            String[] arr_s = b0.alternate();
                            v2 = v1;
                            if(arr_s.length == 0) {
                                v3 = v;
                                list0 = Collections.singletonList(s);
                            }
                            else {
                                v3 = v;
                                ArrayList arrayList0 = new ArrayList(arr_s.length + 1);
                                arrayList0.add(s);
                                int v4 = arr_s.length;
                                for(int v5 = 0; v5 < v4; ++v5) {
                                    arrayList0.add(arr_s[v5]);
                                }
                                list0 = arrayList0;
                            }
                        }
                        int v6 = list0.size();
                        com.google.gson.internal.bind.a a3 = null;
                        for(int v7 = 0; v7 < v6; ++v7) {
                            Object object0 = list0.get(v7);
                            if(v7 != 0) {
                                z = false;
                            }
                            X1.a a4 = new X1.a(type1);
                            boolean z2 = a4.a instanceof Class && a4.a.isPrimitive();
                            U1.a a5 = (U1.a)field0.getAnnotation(U1.a.class);
                            if(a5 == null) {
                                n2 = null;
                            }
                            else {
                                this.l.getClass();
                                n2 = JsonAdapterAnnotationTypeAdapterFactory.b(c0, h0, a4, a5);
                            }
                            boolean z3 = n2 != null;
                            if(n2 == null) {
                                n2 = h0.c(a4);
                            }
                            com.google.gson.internal.bind.a a6 = a3;
                            a3 = (com.google.gson.internal.bind.a)linkedHashMap0.put(((String)object0), new com.google.gson.internal.bind.a(((String)object0), z, z1, field0, z3, n2, h0, a4, z2));
                            if(a6 != null) {
                                a3 = a6;
                            }
                        }
                        arr_field1 = arr_field;
                        a2 = a1;
                        class3 = class2;
                        linkedHashMap1 = linkedHashMap0;
                        n1 = n0;
                        c1 = c0;
                        k1 = k0;
                        if(a3 != null) {
                            throw new IllegalArgumentException(a0.b + " declares multiple JSON fields named " + a3.a);
                        }
                    }
                    else {
                        v2 = v1;
                        v3 = v;
                        arr_field1 = arr_field;
                        a2 = a1;
                        class3 = class2;
                        linkedHashMap1 = linkedHashMap0;
                        n1 = n0;
                        c1 = c0;
                        k1 = k0;
                    }
                    v1 = v2 + 1;
                    linkedHashMap0 = linkedHashMap1;
                    n0 = n1;
                    k0 = k1;
                    v = v3;
                    c0 = c1;
                    class2 = class3;
                    arr_field = arr_field1;
                    a1 = a2;
                }
                a1 = new X1.a(d.i(type0, class2, class2.getGenericSuperclass(), new HashSet()));
                class2 = a1.a;
            }
        }
        super(k0, linkedHashMap0);
        return n0;
    }

    public final boolean b(Field field0, boolean z) {
        Class class0 = field0.getType();
        Excluder excluder0 = this.k;
        if(!excluder0.b(class0)) {
            excluder0.c(z);
            if((field0.getModifiers() & 0x88) == 0 && !field0.isSynthetic()) {
                Class class1 = field0.getType();
                if(Enum.class.isAssignableFrom(class1) || !class1.isAnonymousClass() && !class1.isLocalClass()) {
                    List list0 = z ? excluder0.i : excluder0.j;
                    if(!list0.isEmpty()) {
                        Iterator iterator0 = list0.iterator();
                        if(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            object0.getClass();
                            throw new ClassCastException();
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}

