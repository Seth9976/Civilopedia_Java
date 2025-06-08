package com.google.android.gms.internal.ads;

import A.f;
import i3.e;
import java.util.Arrays;

public final class zzyj implements zzzu {
    public final long a;
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;

    public zzyj(int[] arr_v, long[] arr_v1, long[] arr_v2, long[] arr_v3) {
        this.zzb = arr_v;
        this.zzc = arr_v1;
        this.zzd = arr_v2;
        this.zze = arr_v3;
        this.zza = arr_v.length;
        if(arr_v.length > 0) {
            this.a = arr_v2[arr_v.length - 1] + arr_v3[arr_v.length - 1];
            return;
        }
        this.a = 0L;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.zzb);
        String s1 = Arrays.toString(this.zzc);
        String s2 = Arrays.toString(this.zze);
        String s3 = Arrays.toString(this.zzd);
        StringBuilder stringBuilder0 = new StringBuilder("ChunkIndex(length=");
        stringBuilder0.append(this.zza);
        stringBuilder0.append(", sizes=");
        stringBuilder0.append(s);
        stringBuilder0.append(", offsets=");
        f.t(stringBuilder0, s1, ", timeUs=", s2, ", durationsUs=");
        return e.h(stringBuilder0, s3, ")");
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long v) {
        int v1 = zzeg.zzd(this.zze, v, true, true);
        zzzv zzzv0 = new zzzv(this.zze[v1], this.zzc[v1]);
        return zzzv0.zzb >= v || v1 == this.zza - 1 ? new zzzs(zzzv0, zzzv0) : new zzzs(zzzv0, new zzzv(this.zze[v1 + 1], this.zzc[v1 + 1]));
    }

    @Override  // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}

