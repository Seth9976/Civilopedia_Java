package com.google.gson.internal.bind;

import X1.a;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;

class TypeAdapters.30 implements o {
    @Override  // com.google.gson.o
    public final n a(h h0, a a0) {
        Class class0 = a0.a;
        if(Enum.class.isAssignableFrom(class0) && class0 != Enum.class) {
            if(!class0.isEnum()) {
                class0 = class0.getSuperclass();
            }
            return new TypeAdapters.EnumTypeAdapter(class0);
        }
        return null;
    }
}

