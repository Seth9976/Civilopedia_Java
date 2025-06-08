package com.google.android.gms.internal.ads;

public final class zzatu implements zzaud {
    public final long a;
    public final int[] zza;
    public final long[] zzb;
    public final long[] zzc;
    public final long[] zzd;

    public zzatu(int[] arr_v, long[] arr_v1, long[] arr_v2, long[] arr_v3) {
        this.zza = arr_v;
        this.zzb = arr_v1;
        this.zzc = arr_v2;
        this.zzd = arr_v3;
        if(arr_v.length > 0) {
            this.a = arr_v2[arr_v.length - 1] + arr_v3[arr_v.length - 1];
            return;
        }
        this.a = 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaud
    public final long zza() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.ads.zzaud
    public final long zzb(long v) {
        return this.zzb[zzazo.zzc(this.zzd, v, true, true)];
    }

    @Override  // com.google.android.gms.internal.ads.zzaud
    public final boolean zzc() {
        return true;
    }
}

