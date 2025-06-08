package com.google.android.gms.internal.ads;

public abstract class u {
    public final int a;

    public u(int v) {
        this.a = v;
    }

    public static int a(int v) {
        return v >> 24 & 0xFF;
    }

    public static String b(int v) {
        return ((char)(v >> 24 & 0xFF)) + ((char)(v >> 16 & 0xFF)) + ((char)(v >> 8 & 0xFF)) + ((char)(v & 0xFF));
    }

    @Override
    public String toString() {
        return u.b(this.a);
    }
}

