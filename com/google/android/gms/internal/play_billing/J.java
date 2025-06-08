package com.google.android.gms.internal.play_billing;

import java.util.List;

public final class j extends zzco {
    public final transient int k;
    public final transient int l;
    public final zzco m;

    public j(zzco zzco0, int v, int v1) {
        this.m = zzco0;
        super();
        this.k = v;
        this.l = v1;
    }

    @Override
    public final Object get(int v) {
        zzbe.zza(v, this.l, "index");
        return this.m.get(v + this.k);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int h() {
        return this.m.i() + this.k + this.l;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int i() {
        return this.m.i() + this.k;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final boolean j() {
        return true;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] k() {
        return this.m.k();
    }

    @Override
    public final int size() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzco
    public final List subList(int v, int v1) {
        return this.zzi(v, v1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzco
    public final zzco zzi(int v, int v1) {
        zzbe.zze(v, v1, this.l);
        return this.m.zzi(v + this.k, v1 + this.k);
    }
}

