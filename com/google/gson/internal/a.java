package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class a implements Serializable, GenericArrayType {
    public final Type i;

    public a(Type type0) {
        this.i = d.b(type0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof GenericArrayType && d.e(this, ((GenericArrayType)object0));
    }

    @Override
    public final Type getGenericComponentType() {
        return this.i;
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override
    public final String toString() {
        return d.j(this.i) + "[]";
    }
}

