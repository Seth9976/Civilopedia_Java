package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.n;

class TypeAdapters.15 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        String s = a0.t();
        if(s.length() != 1) {
            throw new JsonSyntaxException("Expecting character, got: " + s);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return Character.valueOf(s.charAt(0));
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.o((((Character)object0) == null ? null : String.valueOf(((Character)object0))));
    }
}

