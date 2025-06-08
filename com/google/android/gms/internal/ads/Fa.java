package com.google.android.gms.internal.ads;

import libcore.io.Memory;

public final class fa extends ha {
    @Override  // com.google.android.gms.internal.ads.ha
    public final byte a(long v) {
        return Memory.peekByte(((int)v));
    }

    @Override  // com.google.android.gms.internal.ads.ha
    public final double b(long v, Object object0) {
        return Double.longBitsToDouble(this.m(v, object0));
    }

    @Override  // com.google.android.gms.internal.ads.ha
    public final float c(long v, Object object0) {
        return Float.intBitsToFloat(this.l(v, object0));
    }

    @Override  // com.google.android.gms.internal.ads.ha
    public final void d(long v, byte[] arr_b, long v1, long v2) {
        Memory.peekByteArray(((int)v), arr_b, ((int)v1), ((int)v2));
    }

    @Override  // com.google.android.gms.internal.ads.ha
    public final void e(Object object0, long v, boolean z) {
        if(ia.h) {
            ia.c(object0, v, ((byte)z));
            return;
        }
        ia.d(object0, v, ((byte)z));
    }

    @Override  // com.google.android.gms.internal.ads.ha
    public final void f(Object object0, long v, byte b) {
        if(ia.h) {
            ia.c(object0, v, b);
            return;
        }
        ia.d(object0, v, b);
    }

    @Override  // com.google.android.gms.internal.ads.ha
    public final void g(Object object0, long v, double f) {
        this.q(object0, v, Double.doubleToLongBits(f));
    }

    @Override  // com.google.android.gms.internal.ads.ha
    public final void h(Object object0, long v, float f) {
        this.p(object0, v, Float.floatToIntBits(f));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.ha
    public final boolean i(long v, Object object0) {
        return ia.h ? ia.s(v, object0) : ia.t(v, object0);
    }
}

