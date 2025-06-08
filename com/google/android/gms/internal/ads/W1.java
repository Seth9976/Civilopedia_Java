package com.google.android.gms.internal.ads;

public final class w1 implements Runnable {
    public final int i;
    public final long j;
    public final zzbah k;

    public w1(zzbah zzbah0, int v, long v1) {
        this.k = zzbah0;
        this.i = v;
        this.j = v1;
    }

    @Override
    public final void run() {
        this.k.b.zzl(this.i, this.j);
    }
}

