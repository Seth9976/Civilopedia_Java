package com.google.android.gms.internal.ads;

public final class zzyb implements zzzu {
    public final zzye a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public zzyb(zzye zzye0, long v, long v1, long v2, long v3, long v4, long v5) {
        this.a = zzye0;
        this.b = v;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.b;
    }

    public final long zzf(long v) {
        return this.a.zza(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        zzzv zzzv0 = new zzzv(v, zzyd.a(this.a.zza(v), 0L, this.c, this.d, this.e, this.f));
        return new zzzs(zzzv0, zzzv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}

