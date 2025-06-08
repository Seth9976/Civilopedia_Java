package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.h;
import com.google.gson.n;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper extends n {
    public final h a;
    public final n b;
    public final Type c;

    public TypeAdapterRuntimeTypeWrapper(h h0, n n0, Type type0) {
        this.a = h0;
        this.b = n0;
        this.c = type0;
    }

    @Override  // com.google.gson.n
    public final Object b(a a0) {
        return this.b.b(a0);
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        Type type0 = this.c;
        Type type1 = object0 == null || type0 != Object.class && !(type0 instanceof TypeVariable) && !(type0 instanceof Class) ? type0 : object0.getClass();
        n n0 = this.b;
        if(type1 != type0) {
            X1.a a0 = new X1.a(type1);
            n n1 = this.a.c(a0);
            if(!(n1 instanceof Adapter) || n0 instanceof Adapter) {
                n0 = n1;
            }
        }
        n0.c(b0, object0);
    }
}

