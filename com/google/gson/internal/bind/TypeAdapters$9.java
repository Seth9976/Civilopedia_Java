package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.n;
import java.util.concurrent.atomic.AtomicBoolean;

class TypeAdapters.9 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        return new AtomicBoolean(a0.l());
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.p(((AtomicBoolean)object0).get());
    }
}

