package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.n;
import java.net.InetAddress;

class TypeAdapters.23 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        return InetAddress.getByName(a0.t());
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.o((((InetAddress)object0) == null ? null : ((InetAddress)object0).getHostAddress()));
    }
}

