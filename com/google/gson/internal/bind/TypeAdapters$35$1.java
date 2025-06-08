package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.n;

class TypeAdapters.35.1 extends n {
    public final Class a;
    public final TypeAdapters.35 b;

    public TypeAdapters.35.1(TypeAdapters.35 typeAdapters$350, Class class0) {
        this.b = typeAdapters$350;
        this.a = class0;
    }

    @Override  // com.google.gson.n
    public final Object b(a a0) {
        Object object0 = this.b.j.b(a0);
        if(object0 != null) {
            Class class0 = this.a;
            if(!class0.isInstance(object0)) {
                throw new JsonSyntaxException("Expected a " + class0.getName() + " but was " + object0.getClass().getName());  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
        return object0;
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        this.b.j.c(b0, object0);
    }
}

