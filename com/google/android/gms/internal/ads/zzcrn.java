package com.google.android.gms.internal.ads;

public final class zzcrn implements Runnable {
    public final zzcrp zza;
    public final Runnable zzb;

    public zzcrn(zzcrp zzcrp0, Runnable runnable0) {
        this.zza = zzcrp0;
        this.zzb = runnable0;
    }

    @Override
    public final void run() {
        zzcro zzcro0 = new zzcro(this.zza, this.zzb);
        zzcfv.zze.execute(zzcro0);
    }
}

