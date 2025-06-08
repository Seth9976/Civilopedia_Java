package com.google.android.gms.internal.ads;

public final class g7 {
    public final Object a;
    public final Object b;
    public final Object c;

    public g7(Object object0, Object object1, Object object2) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
    }

    public final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.a + "=" + this.b + " and " + this.a + "=" + this.c);
    }
}

