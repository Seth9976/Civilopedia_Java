package com.google.android.gms.internal.ads;

public final class zzffq implements Runnable {
    public final zzffw zza;
    public final zzffk zzb;

    public zzffq(zzffw zzffw0, zzffk zzffk0) {
        this.zza = zzffw0;
        this.zzb = zzffk0;
    }

    @Override
    public final void run() {
        this.zza.f.c.zzc(this.zzb);
    }
}

