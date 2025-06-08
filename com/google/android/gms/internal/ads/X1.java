package com.google.android.gms.internal.ads;

public final class x1 implements Runnable {
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final zzbah m;

    public x1(zzbah zzbah0, int v, int v1, int v2, float f) {
        this.m = zzbah0;
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.l = f;
    }

    @Override
    public final void run() {
        this.m.b.zzo(this.i, this.j, this.k, this.l);
    }
}

