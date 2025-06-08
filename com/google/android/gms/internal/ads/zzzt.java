package com.google.android.gms.internal.ads;

public class zzzt implements zzzu {
    public final long a;
    public final zzzs b;

    public zzzt(long v, long v1) {
        this.a = v;
        zzzv zzzv0 = v1 == 0L ? zzzv.zza : new zzzv(0L, v1);
        this.b = new zzzs(zzzv0, zzzv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        return this.b;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return false;
    }
}

