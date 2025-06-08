package com.google.android.gms.internal.ads;

public class zzyk implements zzzu {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;

    public zzyk(long v, long v1, int v2, int v3, boolean z) {
        this.a = v;
        this.b = v1;
        if(v3 == -1) {
            v3 = 1;
        }
        this.c = v3;
        this.e = v2;
        if(v == -1L) {
            this.d = -1L;
            this.f = 0x8000000000000001L;
            return;
        }
        long v4 = v - v1;
        this.d = v4;
        this.f = Math.max(0L, v4) * 8000000L / ((long)v2);
    }

    public final long zza(long v) {
        return Math.max(0L, v - this.b) * 8000000L / ((long)this.e);
    }

    public long zzc(long v) {
        return this.zza(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.f;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        long v1 = this.b;
        long v2 = this.d;
        if(Long.compare(v2, -1L) != 0) {
            int v3 = this.c;
            long v4 = v1 + Math.max(Math.min(((long)this.e) * v / 8000000L / ((long)v3) * ((long)v3), v2 - ((long)v3)), 0L);
            long v5 = this.zza(v4);
            zzzv zzzv0 = new zzzv(v5, v4);
            if(v2 != -1L && v5 < v) {
                long v6 = v4 + ((long)v3);
                return v6 >= this.a ? new zzzs(zzzv0, zzzv0) : new zzzs(zzzv0, new zzzv(this.zza(v6), v6));
            }
            return new zzzs(zzzv0, zzzv0);
        }
        zzzv zzzv1 = new zzzv(0L, v1);
        return new zzzs(zzzv1, zzzv1);
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return this.d != -1L;
    }
}

