package com.google.android.gms.internal.ads;

public final class q implements p {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public q(long[] arr_v, long[] arr_v1, long v, long v1) {
        this.a = arr_v;
        this.b = arr_v1;
        this.c = v;
        this.d = v1;
    }

    @Override  // com.google.android.gms.internal.ads.p
    public final long zzb() {
        return this.d;
    }

    @Override  // com.google.android.gms.internal.ads.p
    public final long zzc(long v) {
        return this.a[zzeg.zzd(this.b, v, true, true)];
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.c;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        int v1 = zzeg.zzd(this.a, v, true, true);
        zzzv zzzv0 = new zzzv(this.a[v1], this.b[v1]);
        return zzzv0.zzb >= v || v1 == this.a.length - 1 ? new zzzs(zzzv0, zzzv0) : new zzzs(zzzv0, new zzzv(this.a[v1 + 1], this.b[v1 + 1]));
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}

