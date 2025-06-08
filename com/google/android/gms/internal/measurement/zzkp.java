package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public enum zzkp {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, 0.0f),
    DOUBLE(Double.class, 0.0),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(zzjd.class, zzjd.zzb),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class i;

    public zzkp(Class class0, Serializable serializable0) {
        this.i = class0;
    }

    public final Class zza() {
        return this.i;
    }
}

