package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.n;

class TypeAdapters.3 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        int v = a0.v();
        if(v == 9) {
            a0.r();
            return null;
        }
        return v == 6 ? Boolean.valueOf(Boolean.parseBoolean(a0.t())) : Boolean.valueOf(a0.l());
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        if(((Boolean)object0) == null) {
            b0.j();
            return;
        }
        b0.q();
        b0.a();
        b0.i.write((((Boolean)object0).booleanValue() ? "true" : "false"));
    }
}

