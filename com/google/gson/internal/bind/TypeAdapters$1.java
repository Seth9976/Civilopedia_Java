package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.n;

class TypeAdapters.1 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class)object0).getName() + ". Forgot to register a type adapter?");
    }
}

