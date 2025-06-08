package com.google.android.gms.internal.ads;

public final class zzdyf implements Runnable {
    public final zzdyj zza;
    public final zzcga zzb;

    public zzdyf(zzdyj zzdyj0, zzcga zzcga0) {
        this.zza = zzdyj0;
        this.zzb = zzcga0;
    }

    @Override
    public final void run() {
        this.zza.getClass();
        zzdxy zzdxy0 = new zzdxy(this.zza, this.zzb);
        this.zza.i.execute(zzdxy0);
    }
}

