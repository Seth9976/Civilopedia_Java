package com.google.android.gms.internal.ads;

import android.os.Handler;

public final class zzckr {
    public final zzckv zza;

    public zzckr(zzckv zzckv0) {
        this.zza = zzckv0;
    }

    public final zzjt[] zza(Handler handler0, zzxq zzxq0, zznk zznk0, zzua zzua0, zzra zzra0) {
        zzckv zzckv0 = this.zza;
        zzckv0.getClass();
        zzqk zzqk0 = zzqk.zzb;
        zzmv zzmv0 = zzmv.zza;
        zzoa zzoa0 = new zzoa();
        if(zzmv0 == null) {
            throw new NullPointerException("Both parameters are null");
        }
        zzoa0.zzb(zzmv0);
        zzoa0.zzc(new zzmy[0]);
        zzom zzom0 = zzoa0.zzd();
        return new zzjt[]{new zzos(zzckv0.k, zzqc.zza, zzqk0, false, handler0, zznk0, zzom0), new zzwt(zzckv0.k, zzqc.zza, zzqk0, 0L, false, handler0, zzxq0, -1, 30.0f)};
    }
}

