package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.JsonIOException;
import com.google.gson.n;
import java.net.URI;
import java.net.URISyntaxException;

class TypeAdapters.22 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        try {
            String s = a0.t();
            return "null".equals(s) ? null : new URI(s);
        }
        catch(URISyntaxException uRISyntaxException0) {
            throw new JsonIOException(uRISyntaxException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
        }
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.o((((URI)object0) == null ? null : ((URI)object0).toASCIIString()));
    }
}

