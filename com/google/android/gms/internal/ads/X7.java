package com.google.android.gms.internal.ads;

public final class x7 extends zzfrj {
    public final transient Object[] k;
    public final transient int l;
    public final transient int m;

    public x7(Object[] arr_object, int v, int v1) {
        this.k = arr_object;
        this.l = v;
        this.m = v1;
    }

    @Override
    public final Object get(int v) {
        zzfou.zza(v, this.m, "index");
        Object object0 = this.k[v + v + this.l];
        object0.getClass();
        return object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final boolean j() {
        return true;
    }

    @Override
    public final int size() {
        return this.m;
    }
}

