package com.google.android.gms.internal.play_billing;

import java.util.Objects;

public final class r extends zzco {
    public final transient Object[] k;
    public final transient int l;
    public static final r m;

    static {
        r.m = new r(0, new Object[0]);
    }

    public r(int v, Object[] arr_object) {
        this.k = arr_object;
        this.l = v;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzco
    public final int a(Object[] arr_object) {
        System.arraycopy(this.k, 0, arr_object, 0, this.l);
        return this.l;
    }

    @Override
    public final Object get(int v) {
        zzbe.zza(v, this.l, "index");
        Object object0 = this.k[v];
        Objects.requireNonNull(object0);
        return object0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int h() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final int i() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final boolean j() {
        return false;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] k() {
        return this.k;
    }

    @Override
    public final int size() {
        return this.l;
    }
}

