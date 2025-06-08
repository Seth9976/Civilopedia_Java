package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.n;

class TypeAdapters.16 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        int v = a0.v();
        if(v == 9) {
            a0.r();
            return null;
        }
        return v == 8 ? Boolean.toString(a0.l()) : a0.t();
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.o(((String)object0));
    }
}

