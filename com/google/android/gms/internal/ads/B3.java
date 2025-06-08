package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class b3 implements Runnable {
    public final String i;
    public final String j;
    public final int k;
    public final zzcju l;

    public b3(zzcju zzcju0, String s, String s1, int v) {
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
        hashMap0.put("totalBytes", Integer.toString(this.k));
        zzcju.a(this.l, hashMap0);
    }
}

