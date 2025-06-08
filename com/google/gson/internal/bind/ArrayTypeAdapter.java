package com.google.gson.internal.bind;

import X1.a;
import Y1.b;
import com.google.gson.h;
import com.google.gson.internal.d;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter extends n {
    public final Class a;
    public final n b;
    public static final o c;

    static {
        ArrayTypeAdapter.c = new o() {
            @Override  // com.google.gson.o
            public final n a(h h0, a a0) {
                Type type1;
                Type type0 = a0.b;
                if(!(type0 instanceof GenericArrayType) && (!(type0 instanceof Class) || !((Class)type0).isArray())) {
                    return null;
                }
                if(type0 instanceof GenericArrayType) {
                    type1 = ((GenericArrayType)type0).getGenericComponentType();
                    return new ArrayTypeAdapter(h0, h0.c(new a(type1)), d.g(type1));
                }
                type1 = ((Class)type0).getComponentType();
                return new ArrayTypeAdapter(h0, h0.c(new a(type1)), d.g(type1));
            }
        };
    }

    public ArrayTypeAdapter(h h0, n n0, Class class0) {
        this.b = new TypeAdapterRuntimeTypeWrapper(h0, n0, class0);
        this.a = class0;
    }

    @Override  // com.google.gson.n
    public final Object b(Y1.a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        a0.a();
        while(a0.i()) {
            arrayList0.add(((TypeAdapterRuntimeTypeWrapper)this.b).b.b(a0));
        }
        a0.e();
        int v = arrayList0.size();
        Object object0 = Array.newInstance(this.a, v);
        for(int v1 = 0; v1 < v; ++v1) {
            Array.set(object0, v1, arrayList0.get(v1));
        }
        return object0;
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        if(object0 == null) {
            b0.j();
            return;
        }
        b0.b();
        int v = Array.getLength(object0);
        for(int v1 = 0; v1 < v; ++v1) {
            Object object1 = Array.get(object0, v1);
            this.b.c(b0, object1);
        }
        b0.e();
    }
}

