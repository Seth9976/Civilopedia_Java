package com.google.gson;

import Y1.a;
import Y1.b;

class Gson.2 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        return (float)a0.m();
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        if(((Number)object0) == null) {
            b0.j();
            return;
        }
        h.a(((Number)object0).floatValue());
        b0.n(((Number)object0));
    }
}

