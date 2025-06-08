package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.n;
import java.util.Currency;

class TypeAdapters.25 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        return Currency.getInstance(a0.t());
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.o(((Currency)object0).getCurrencyCode());
    }
}

