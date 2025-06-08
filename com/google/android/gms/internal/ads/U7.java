package com.google.android.gms.internal.ads;

import java.util.AbstractMap.SimpleImmutableEntry;

public final class u7 extends zzfrj {
    public final v7 k;

    public u7(v7 v70) {
        this.k = v70;
        super();
    }

    @Override
    public final Object get(int v) {
        zzfou.zza(v, this.k.m, "index");
        int v1 = v + v;
        Object object0 = this.k.l[v1];
        object0.getClass();
        Object object1 = this.k.l[v1 + 1];
        object1.getClass();
        return new AbstractMap.SimpleImmutableEntry(object0, object1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final boolean j() {
        return true;
    }

    @Override
    public final int size() {
        return this.k.m;
    }
}

