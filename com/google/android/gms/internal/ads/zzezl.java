package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzezl implements Runnable {
    public final O5 zza;
    public final zze zzb;

    public zzezl(O5 o50, zze zze0) {
        this.zza = o50;
        this.zzb = zze0;
    }

    @Override
    public final void run() {
        this.zza.m.d.zza(this.zzb);
    }
}

