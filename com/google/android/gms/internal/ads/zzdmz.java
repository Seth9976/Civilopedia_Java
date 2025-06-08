package com.google.android.gms.internal.ads;

public final class zzdmz implements Runnable {
    public final zzdnc zza;
    public final zzdpc zzb;

    public zzdmz(zzdnc zzdnc0, zzdpc zzdpc0) {
        this.zza = zzdnc0;
        this.zzb = zzdpc0;
    }

    @Override
    public final void run() {
        this.zza.c(this.zzb);
    }
}

