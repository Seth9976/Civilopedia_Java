package com.google.gson;

import Y1.a;
import Y1.b;
import java.util.Date;

final class DefaultDateTypeAdapter extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        a0.t();
        throw null;
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        if(((Date)object0) != null) {
            throw null;
        }
        b0.j();
    }

    @Override
    public final String toString() {
        throw null;
    }
}

