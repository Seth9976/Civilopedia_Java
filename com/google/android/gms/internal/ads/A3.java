package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class a3 implements Runnable {
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final int p;
    public final int q;
    public final zzcju r;

    public a3(zzcju zzcju0, String s, String s1, int v, int v1, long v2, long v3, boolean z, int v4, int v5) {
        this.r = zzcju0;
        this.i = s;
        this.j = s1;
        this.k = v;
        this.l = v1;
        this.m = v2;
        this.n = v3;
        this.o = z;
        this.p = v4;
        this.q = v5;
    }

    @Override
    public final void run() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("event", "precacheProgress");
        hashMap0.put("src", this.i);
        hashMap0.put("cachedSrc", this.j);
        hashMap0.put("bytesLoaded", Integer.toString(this.k));
        hashMap0.put("totalBytes", Integer.toString(this.l));
        hashMap0.put("bufferedDuration", Long.toString(this.m));
        hashMap0.put("totalDuration", Long.toString(this.n));
        hashMap0.put("cacheReady", (this.o ? "1" : "0"));
        hashMap0.put("playerCount", Integer.toString(this.p));
        hashMap0.put("playerPreparedCount", Integer.toString(this.q));
        zzcju.a(this.r, hashMap0);
    }
}

