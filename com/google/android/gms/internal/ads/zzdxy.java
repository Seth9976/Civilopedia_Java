package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

public final class zzdxy implements Runnable {
    public final zzdyj zza;
    public final zzcga zzb;

    public zzdxy(zzdyj zzdyj0, zzcga zzcga0) {
        this.zza = zzdyj0;
        this.zzb = zzcga0;
    }

    @Override
    public final void run() {
        zzcga zzcga0 = this.zzb;
        String s = zzt.zzo().zzh().zzh().zzc();
        if(!TextUtils.isEmpty(s)) {
            zzcga0.zzd(s);
            return;
        }
        zzcga0.zze(new Exception());
    }
}

