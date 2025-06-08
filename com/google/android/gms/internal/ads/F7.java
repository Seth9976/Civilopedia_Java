package com.google.android.gms.internal.ads;

import java.util.List;

public final class f7 extends zzfrj {
    public final transient int k;
    public final transient int l;
    public final zzfrj m;

    public f7(zzfrj zzfrj0, int v, int v1) {
        this.m = zzfrj0;
        super();
        this.k = v;
        this.l = v1;
    }

    @Override
    public final Object get(int v) {
        zzfou.zza(v, this.l, "index");
        return this.m.get(v + this.k);
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final int h() {
        return this.m.i() + this.k + this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final int i() {
        return this.m.i() + this.k;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final boolean j() {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final Object[] k() {
        return this.m.k();
    }

    @Override
    public final int size() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzfrj
    public final List subList(int v, int v1) {
        return this.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfrj
    public final zzfrj zzh(int v, int v1) {
        zzfou.zzg(v, v1, this.l);
        return this.m.zzh(v + this.k, v1 + this.k);
    }
}

