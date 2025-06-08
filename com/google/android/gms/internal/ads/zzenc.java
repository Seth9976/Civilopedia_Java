package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzenc implements Runnable {
    public final z5 zza;
    public final zze zzb;

    public zzenc(z5 z50, zze zze0) {
        this.zza = z50;
        this.zzb = zze0;
    }

    @Override
    public final void run() {
        this.zza.m.d.zza().zza(this.zzb);
    }
}

