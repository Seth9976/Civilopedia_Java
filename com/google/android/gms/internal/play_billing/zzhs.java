package com.google.android.gms.internal.play_billing;

public enum zzhs {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(zzgk.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class i;

    public zzhs(Class class0) {
        this.i = class0;
    }

    public final Class zza() {
        return this.i;
    }
}

