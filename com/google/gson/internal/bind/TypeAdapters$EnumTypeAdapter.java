package com.google.gson.internal.bind;

import U1.b;
import Y1.a;
import com.google.gson.n;
import java.util.HashMap;

final class TypeAdapters.EnumTypeAdapter extends n {
    public final HashMap a;
    public final HashMap b;

    public TypeAdapters.EnumTypeAdapter(Class class0) {
        this.a = new HashMap();
        this.b = new HashMap();
        try {
            Enum[] arr_enum = (Enum[])class0.getEnumConstants();
            for(int v = 0; v < arr_enum.length; ++v) {
                Enum enum0 = arr_enum[v];
                String s = enum0.name();
                b b0 = (b)class0.getField(s).getAnnotation(b.class);
                if(b0 != null) {
                    s = b0.value();
                    String[] arr_s = b0.alternate();
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        this.a.put(arr_s[v1], enum0);
                    }
                }
                this.a.put(s, enum0);
                this.b.put(enum0, s);
            }
            return;
        }
        catch(NoSuchFieldException noSuchFieldException0) {
        }
        throw new AssertionError(noSuchFieldException0);
    }

    @Override  // com.google.gson.n
    public final Object b(a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        String s = a0.t();
        return (Enum)this.a.get(s);
    }

    @Override  // com.google.gson.n
    public final void c(Y1.b b0, Object object0) {
        b0.o((((Enum)object0) == null ? null : ((String)this.b.get(((Enum)object0)))));
    }
}

