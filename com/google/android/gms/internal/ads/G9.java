package com.google.android.gms.internal.ads;

public final class g9 extends h9 {
    public final int k;
    public final int l;

    public g9(byte[] arr_b, int v, int v1) {
        super(arr_b);
        zzgji.q(v, v + v1, arr_b.length);
        this.k = v;
        this.l = v1;
    }

    @Override  // com.google.android.gms.internal.ads.h9
    public final byte h(int v) {
        return this.j[this.k + v];
    }

    @Override  // com.google.android.gms.internal.ads.h9
    public final void j(int v, int v1, int v2, byte[] arr_b) {
        System.arraycopy(this.j, this.k + v, arr_b, v1, v2);
    }

    @Override  // com.google.android.gms.internal.ads.h9
    public final int r() {
        return this.k;
    }

    @Override  // com.google.android.gms.internal.ads.h9
    public final byte zza(int v) {
        zzgji.a(v, this.l);
        return this.j[this.k + v];
    }

    @Override  // com.google.android.gms.internal.ads.h9
    public final int zzd() {
        return this.l;
    }
}

