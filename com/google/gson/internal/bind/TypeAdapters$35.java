package com.google.gson.internal.bind;

import X1.a;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;

class TypeAdapters.35 implements o {
    public final Class i;
    public final n j;

    public TypeAdapters.35(Class class0, n n0) {
        this.i = class0;
        this.j = n0;
    }

    @Override  // com.google.gson.o
    public final n a(h h0, a a0) {
        Class class0 = a0.a;
        return !this.i.isAssignableFrom(class0) ? null : new TypeAdapters.35.1(this, class0);
    }

    @Override
    public final String toString() {
        return "Factory[typeHierarchy=" + this.i.getName() + ",adapter=" + this.j + "]";
    }
}

