package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class c implements Serializable, WildcardType {
    public final Type i;
    public final Type j;

    public c(Type[] arr_type, Type[] arr_type1) {
        boolean z = true;
        d.c(arr_type1.length <= 1);
        d.c(arr_type.length == 1);
        if(arr_type1.length == 1) {
            arr_type1[0].getClass();
            d.d(arr_type1[0]);
            Class class0 = Object.class;
            if(arr_type[0] != class0) {
                z = false;
            }
            d.c(z);
            this.j = d.b(arr_type1[0]);
            this.i = class0;
            return;
        }
        arr_type[0].getClass();
        d.d(arr_type[0]);
        this.j = null;
        this.i = d.b(arr_type[0]);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof WildcardType && d.e(this, ((WildcardType)object0));
    }

    @Override
    public final Type[] getLowerBounds() {
        return this.j == null ? d.a : new Type[]{this.j};
    }

    @Override
    public final Type[] getUpperBounds() {
        return new Type[]{this.i};
    }

    @Override
    public final int hashCode() {
        return this.j == null ? 1 ^ this.i.hashCode() + 0x1F : this.j.hashCode() + 0x1F ^ this.i.hashCode() + 0x1F;
    }

    @Override
    public final String toString() {
        Type type0 = this.j;
        if(type0 != null) {
            return "? super " + d.j(type0);
        }
        return this.i == Object.class ? "?" : "? extends " + d.j(this.i);
    }
}

