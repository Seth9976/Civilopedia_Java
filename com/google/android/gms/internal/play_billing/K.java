package com.google.android.gms.internal.play_billing;

import i3.e;

public final class k {
    public final Object a;
    public final Object b;
    public final Object c;

    public k(Object object0, Object object1, Object object2) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
    }

    public final IllegalArgumentException a() {
        StringBuilder stringBuilder0 = e.j("Multiple entries with same key: ", String.valueOf(this.a), "=", String.valueOf(this.b), " and ");
        stringBuilder0.append(String.valueOf(this.a));
        stringBuilder0.append("=");
        stringBuilder0.append(String.valueOf(this.c));
        return new IllegalArgumentException(stringBuilder0.toString());
    }
}

