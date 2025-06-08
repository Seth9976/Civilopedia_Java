package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.n;

class TypeAdapters.11 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        try {
            return a0.o();
        }
        catch(NumberFormatException numberFormatException0) {
            throw new JsonSyntaxException(numberFormatException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
        }
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.n(((Number)object0));
    }
}

