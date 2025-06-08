package com.google.android.gms.internal.ads;

public final class zzzc implements zzzu {
    public final zzze a;
    public final long b;

    public zzzc(zzze zzze0, long v) {
        this.a = zzze0;
        this.b = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.a.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        zzze zzze0 = this.a;
        zzcw.zzb(zzze0.zzk);
        long[] arr_v = zzze0.zzk.zza;
        long[] arr_v1 = zzze0.zzk.zzb;
        int v1 = zzeg.zzd(arr_v, zzze0.zzb(v), true, false);
        long v2 = 0L;
        long v3 = v1 == -1 ? 0L : arr_v[v1];
        if(v1 != -1) {
            v2 = arr_v1[v1];
        }
        zzzv zzzv0 = new zzzv(v3 * 1000000L / ((long)zzze0.zze), v2 + this.b);
        return zzzv0.zzb == v || v1 == arr_v.length - 1 ? new zzzs(zzzv0, zzzv0) : new zzzs(zzzv0, new zzzv(arr_v[v1 + 1] * 1000000L / ((long)zzze0.zze), this.b + arr_v1[v1 + 1]));
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}

