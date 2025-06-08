package com.google.gson;

import Y1.a;
import Y1.b;
import java.util.concurrent.atomic.AtomicLong;

class Gson.4 extends n {
    public final n a;

    public Gson.4(n n0) {
        this.a = n0;
    }

    @Override  // com.google.gson.n
    public final Object b(a a0) {
        return new AtomicLong(((Number)this.a.b(a0)).longValue());
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        Long long0 = ((AtomicLong)object0).get();
        this.a.c(b0, long0);
    }
}

