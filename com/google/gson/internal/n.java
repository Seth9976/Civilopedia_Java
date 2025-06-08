package com.google.gson.internal;

import java.lang.reflect.Method;

public final class n extends d {
    public final Method b;

    public n(Method method0) {
        this.b = method0;
    }

    @Override  // com.google.gson.internal.d
    public final Object h(Class class0) {
        d.a(class0);
        return this.b.invoke(null, class0, Object.class);
    }
}

