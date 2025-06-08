package com.google.gson;

import Y1.a;
import Y1.b;

class TypeAdapter.1 extends n {
    public final n a;

    public TypeAdapter.1(n n0) {
        this.a = n0;
    }

    @Override  // com.google.gson.n
    public final Object b(a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        return this.a.b(a0);
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        if(object0 == null) {
            b0.j();
            return;
        }
        this.a.c(b0, object0);
    }
}

