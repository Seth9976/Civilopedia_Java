package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class c3 implements Runnable {
    public final String i;
    public final String j;
    public final long k;
    public final zzcju l;

    public c3(zzcju zzcju0, String s, String s1, long v) {
        this.l = zzcju0;
        this.i = s;
        this.j = s1;
        this.k = v;
    }

    @Override
    public final void run() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("event", "precacheComplete");
        hashMap0.put("src", this.i);
        hashMap0.put("cachedSrc", this.j);
        hashMap0.put("totalDuration", Long.toString(this.k));
        zzcju.a(this.l, hashMap0);
    }
}

