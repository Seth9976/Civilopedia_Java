package com.google.android.gms.internal.location;

public final class a extends zzbs {
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

    @Override  // com.google.android.gms.internal.location.zzbp
    public final Object[] a() {
        return this.k;
    }

    @Override
    public final Object get(int v) {
        zzbm.zza(v, this.l, "index");
        return this.k[v];
    }

    @Override  // com.google.android.gms.internal.location.zzbp
    public final int h() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.location.zzbp
    public final int i() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.location.zzbp
    public final boolean j() {
        return false;
    }

    @Override  // com.google.android.gms.internal.location.zzbs
    public final void k(Object[] arr_object) {
        System.arraycopy(this.k, 0, arr_object, 0, this.l);
    }

    @Override
    public final int size() {
        return this.l;
    }
}

