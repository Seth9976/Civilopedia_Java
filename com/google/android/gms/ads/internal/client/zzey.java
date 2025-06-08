package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

public final class zzey extends zzdd {
    public final OnPaidEventListener i;

    public zzey(OnPaidEventListener onPaidEventListener0) {
        this.i = onPaidEventListener0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzde
    public final void zze(zzs zzs0) {
        OnPaidEventListener onPaidEventListener0 = this.i;
        if(onPaidEventListener0 != null) {
            onPaidEventListener0.onPaidEvent(AdValue.zza(zzs0.zzb, zzs0.zzc, zzs0.zzd));
        }
    }
}

