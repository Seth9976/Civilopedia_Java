package com.google.android.gms.internal.ads;

import java.io.Serializable;

public enum zzgle {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, 0.0f),
    DOUBLE(Double.class, 0.0),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(zzgji.class, zzgji.zzb),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class i;

    public zzgle(Class class0, Serializable serializable0) {
        this.i = class0;
    }

    public final Class zza() {
        return this.i;
    }
}

