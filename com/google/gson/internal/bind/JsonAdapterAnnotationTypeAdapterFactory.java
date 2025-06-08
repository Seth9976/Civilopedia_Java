package com.google.gson.internal.bind;

import B.c;
import X1.a;
import com.google.gson.h;
import com.google.gson.internal.d;
import com.google.gson.n;
import com.google.gson.o;

public final class JsonAdapterAnnotationTypeAdapterFactory implements o {
    public final c i;

    public JsonAdapterAnnotationTypeAdapterFactory(c c0) {
        this.i = c0;
    }

    @Override  // com.google.gson.o
    public final n a(h h0, a a0) {
        U1.a a1 = (U1.a)a0.a.getAnnotation(U1.a.class);
        return a1 == null ? null : JsonAdapterAnnotationTypeAdapterFactory.b(this.i, h0, a0, a1);
    }

    public static n b(c c0, h h0, a a0, U1.a a1) {
        n n0;
        Object object0 = c0.u(new a(a1.value())).F();
        if(object0 instanceof n) {
            n0 = (n)object0;
            return n0 == null || !a1.nullSafe() ? n0 : n0.a();
        }
        if(!(object0 instanceof o)) {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + object0.getClass().getName() + " as a @JsonAdapter for " + d.j(a0.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        n0 = ((o)object0).a(h0, a0);
        return n0 == null || !a1.nullSafe() ? n0 : n0.a();
    }
}

