package com.google.gson.internal;

import java.lang.reflect.Method;

public final class l extends d {
    public final Method b;
    public final Object c;

    public l(Method method0, Object object0) {
        this.b = method0;
        this.c = object0;
    }

    @Override  // com.google.gson.internal.d
    public final Object h(Class class0) {
        d.a(class0);
        return this.b.invoke(this.c, class0);
    }
}

