package com.google.android.gms.internal.ads;

public final class t7 extends zzfrj {
    public final transient Object[] k;
    public final transient int l;
    public static final t7 m;

    static {
        t7.m = new t7(0, new Object[0]);
    }

    public t7(int v, Object[] arr_object) {
        this.k = arr_object;
        this.l = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfrj
    public final int a(int v, Object[] arr_object) {
        System.arraycopy(this.k, 0, arr_object, v, this.l);
        return v + this.l;
    }

    @Override
    public final Object get(int v) {
        zzfou.zza(v, this.l, "index");
        Object object0 = this.k[v];
        object0.getClass();
        return object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final int h() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final int i() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final boolean j() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final Object[] k() {
        return this.k;
    }

    @Override
    public final int size() {
        return this.l;
    }
}

