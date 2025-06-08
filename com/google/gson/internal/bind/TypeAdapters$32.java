package com.google.gson.internal.bind;

import X1.a;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;

class TypeAdapters.32 implements o {
    public final Class i;
    public final n j;

    public TypeAdapters.32(Class class0, n n0) {
        this.i = class0;
        this.j = n0;
    }

    @Override  // com.google.gson.o
    public final n a(h h0, a a0) {
        return a0.a == this.i ? this.j : null;
    }

    @Override
    public final String toString() {
        return "Factory[type=" + this.i.getName() + ",adapter=" + this.j + "]";
    }
}

