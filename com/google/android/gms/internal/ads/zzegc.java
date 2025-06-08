package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzff;

public final class zzegc implements Runnable {
    public final zzege zza;
    public final zzcli zzb;

    public zzegc(zzege zzege0, zzcli zzcli0) {
        this.zza = zzege0;
        this.zzb = zzcli0;
    }

    @Override
    public final void run() {
        this.zza.getClass();
        this.zzb.zzaa();
        zzcme zzcme0 = this.zzb.zzs();
        zzff zzff0 = this.zza.d.zza;
        if(zzff0 != null && zzcme0 != null) {
            zzcme0.zzs(zzff0);
        }
    }
}

