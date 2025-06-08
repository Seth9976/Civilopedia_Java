package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Callable;

public final class zzerm implements Callable {
    public final zzern zza;

    public zzerm(zzern zzern0) {
        this.zza = zzern0;
    }

    @Override
    public final Object call() {
        this.zza.getClass();
        zzbhr zzbhr0 = zzbhz.zzeb;
        String s = null;
        if(((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue() && (this.zza.b.contains("rewarded") || this.zza.b.contains("interstitial") || this.zza.b.contains("native") || this.zza.b.contains("banner"))) {
            if(((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue()) {
                s = "a.1.3.3-google_20200416";
            }
            return new zzero(s);
        }
        return new zzero(null);
    }
}

