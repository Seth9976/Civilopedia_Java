package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.f;
import com.google.gson.n;
import q.e;

class TypeAdapters.14 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        int v = a0.v();
        switch(e.c(v)) {
            case 5: 
            case 6: {
                return new f(a0.t());
            }
            case 8: {
                a0.r();
                return null;
            }
            default: {
                throw new JsonSyntaxException("Expecting number, got: " + A.f.y(v));  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.n(((Number)object0));
    }
}

