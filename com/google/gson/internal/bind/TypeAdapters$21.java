package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.n;
import java.net.URL;

class TypeAdapters.21 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        String s = a0.t();
        return "null".equals(s) ? null : new URL(s);
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.o((((URL)object0) == null ? null : ((URL)object0).toExternalForm()));
    }
}

