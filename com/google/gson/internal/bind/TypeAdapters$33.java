package com.google.gson.internal.bind;

import X1.a;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;

class TypeAdapters.33 implements o {
    public final Class i;
    public final Class j;
    public final n k;

    public TypeAdapters.33(Class class0, Class class1, n n0) {
        this.i = class0;
        this.j = class1;
        this.k = n0;
    }

    @Override  // com.google.gson.o
    public final n a(h h0, a a0) {
        return a0.a == this.i || a0.a == this.j ? this.k : null;
    }

    @Override
    public final String toString() {
        return "Factory[type=" + this.j.getName() + "+" + this.i.getName() + ",adapter=" + this.k + "]";
    }
}

