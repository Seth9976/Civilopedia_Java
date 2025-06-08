package com.google.android.gms.internal.common;

public final class a extends zzag {
    public final transient Object[] k;
    public final transient int l;
    public static final a m;

    static {
        a.m = new a(0, new Object[0]);
    }

    public a(int v, Object[] arr_object) {
        this.k = arr_object;
        this.l = v;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    public final void a(Object[] arr_object) {
        System.arraycopy(this.k, 0, arr_object, 0, this.l);
    }

    @Override
    public final Object get(int v) {
        zzs.zza(v, this.l, "index");
        Object object0 = this.k[v];
        object0.getClass();
        return object0;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final int h() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final int i() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final boolean j() {
        return false;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final Object[] k() {
        return this.k;
    }

    @Override
    public final int size() {
        return this.l;
    }
}

