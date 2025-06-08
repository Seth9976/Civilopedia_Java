package com.google.gson;

import Y1.a;
import Y1.b;

class Gson.FutureTypeAdapter extends n {
    public n a;

    @Override  // com.google.gson.n
    public final Object b(a a0) {
        n n0 = this.a;
        if(n0 == null) {
            throw new IllegalStateException();
        }
        return n0.b(a0);
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        n n0 = this.a;
        if(n0 == null) {
            throw new IllegalStateException();
        }
        n0.c(b0, object0);
    }
}

