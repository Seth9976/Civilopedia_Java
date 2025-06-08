package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdse;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;

public final class zzl implements Runnable {
    public final zzaa zza;
    public final zzdse[] zzb;

    public zzl(zzaa zzaa0, zzdse[] arr_zzdse) {
        this.zza = zzaa0;
        this.zzb = arr_zzdse;
    }

    @Override
    public final void run() {
        zzaa zzaa0 = this.zza;
        zzaa0.getClass();
        zzdse zzdse0 = this.zzb[0];
        if(zzdse0 != null) {
            zzfvl zzfvl0 = zzfvc.zzi(zzdse0);
            zzaa0.l.zzb(zzfvl0);
        }
    }
}

