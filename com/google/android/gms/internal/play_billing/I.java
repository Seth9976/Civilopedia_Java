package com.google.android.gms.internal.play_billing;

import java.util.List;

public final class i extends zzco {
    public final transient zzco k;

    public i(zzco zzco0) {
        this.k = zzco0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzco
    public final boolean contains(Object object0) {
        return this.k.contains(object0);
    }

    @Override
    public final Object get(int v) {
        zzbe.zza(v, this.k.size(), "index");
        return this.k.get(this.k.size() - 1 - v);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzco
    public final int indexOf(Object object0) {
        int v = this.k.lastIndexOf(object0);
        return v < 0 ? -1 : this.k.size() - 1 - v;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final boolean j() {
        return this.k.j();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzco
    public final int lastIndexOf(Object object0) {
        int v = this.k.indexOf(object0);
        return v < 0 ? -1 : this.k.size() - 1 - v;
    }

    @Override
    public final int size() {
        return this.k.size();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzco
    public final List subList(int v, int v1) {
        return this.zzi(v, v1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzco
    public final zzco zzh() {
        return this.k;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzco
    public final zzco zzi(int v, int v1) {
        zzbe.zze(v, v1, this.k.size());
        return this.k.zzi(this.k.size() - v1, this.k.size() - v).zzh();
    }
}

