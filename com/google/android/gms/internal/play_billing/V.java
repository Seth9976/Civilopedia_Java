package com.google.android.gms.internal.play_billing;

import java.util.Objects;

public final class v extends zzco {
    public final transient Object[] k;
    public final transient int l;
    public final transient int m;

    public v(Object[] arr_object, int v, int v1) {
        this.k = arr_object;
        this.l = v;
        this.m = v1;
    }

    @Override
    public final Object get(int v) {
        zzbe.zza(v, this.m, "index");
        Object object0 = this.k[v + v + this.l];
        Objects.requireNonNull(object0);
        return object0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final boolean j() {
        return true;
    }

    @Override
    public final int size() {
        return this.m;
    }
}

