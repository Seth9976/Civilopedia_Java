package com.google.gson.internal.bind;

import B.c;
import Y1.a;
import Y1.b;
import com.google.gson.h;
import com.google.gson.internal.d;
import com.google.gson.internal.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashSet;

public final class CollectionTypeAdapterFactory implements o {
    static final class Adapter extends n {
        public final n a;
        public final k b;

        public Adapter(h h0, Type type0, n n0, k k0) {
            this.a = new TypeAdapterRuntimeTypeWrapper(h0, n0, type0);
            this.b = k0;
        }

        @Override  // com.google.gson.n
        public final Object b(a a0) {
            if(a0.v() == 9) {
                a0.r();
                return null;
            }
            Collection collection0 = (Collection)this.b.F();
            a0.a();
            while(a0.i()) {
                collection0.add(((TypeAdapterRuntimeTypeWrapper)this.a).b.b(a0));
            }
            a0.e();
            return collection0;
        }

        @Override  // com.google.gson.n
        public final void c(b b0, Object object0) {
            if(((Collection)object0) == null) {
                b0.j();
                return;
            }
            b0.b();
            for(Object object1: ((Collection)object0)) {
                this.a.c(b0, object1);
            }
            b0.e();
        }
    }

    public final c i;

    public CollectionTypeAdapterFactory(c c0) {
        this.i = c0;
    }

    @Override  // com.google.gson.o
    public final n a(h h0, X1.a a0) {
        Class class0 = Collection.class;
        Class class1 = a0.a;
        if(!class0.isAssignableFrom(class1)) {
            return null;
        }
        Type type0 = a0.b instanceof WildcardType ? ((WildcardType)a0.b).getUpperBounds()[0] : a0.b;
        d.c(class0.isAssignableFrom(class1));
        Type type1 = d.i(type0, class1, d.f(type0, class1, class0), new HashSet());
        if(type1 instanceof WildcardType) {
            type1 = ((WildcardType)type1).getUpperBounds()[0];
        }
        if(type1 instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType)type1).getActualTypeArguments()[0];
            return new Adapter(h0, type2, h0.c(new X1.a(type2)), this.i.u(a0));
        }
        return new Adapter(h0, Object.class, h0.c(new X1.a(Object.class)), this.i.u(a0));
    }
}

