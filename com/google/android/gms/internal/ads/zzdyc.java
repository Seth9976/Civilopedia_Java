package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

public final class zzdyc implements Runnable {
    public final zzdyj zza;

    public zzdyc(zzdyj zzdyj0) {
        this.zza = zzdyj0;
    }

    @Override
    public final void run() {
        zzdyj zzdyj0 = this.zza;
        synchronized(zzdyj0) {
            if(zzdyj0.c) {
                return;
            }
            zzdyj0.b("com.google.android.gms.ads.MobileAds", ((int)(zzt.zzA().elapsedRealtime() - zzdyj0.d)), "Timeout.", false);
            zzdyj0.l.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            zzdyj0.o.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            zzdyj0.e.zze(new Exception());
        }
    }
}

