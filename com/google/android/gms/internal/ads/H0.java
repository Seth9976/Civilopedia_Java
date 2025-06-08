package com.google.android.gms.internal.ads;

public final class h0 implements zzzu {
    public final z a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public h0(z z0, int v, long v1, long v2) {
        this.a = z0;
        this.b = v;
        this.c = v1;
        long v3 = (v2 - v1) / ((long)z0.d);
        this.d = v3;
        this.e = zzeg.zzw(v3 * ((long)v), 1000000L, z0.c);
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.e;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        long v1 = zzeg.zzr(((long)this.a.c) * v / (((long)this.b) * 1000000L), 0L, this.d - 1L);
        long v2 = zzeg.zzw(v1 * ((long)this.b), 1000000L, this.a.c);
        int v3 = this.a.d;
        zzzv zzzv0 = new zzzv(v2, ((long)v3) * v1 + this.c);
        return v2 >= v || v1 == this.d - 1L ? new zzzs(zzzv0, zzzv0) : new zzzs(zzzv0, new zzzv(zzeg.zzw((v1 + 1L) * ((long)this.b), 1000000L, this.a.c), (v1 + 1L) * ((long)v3) + this.c));
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}

