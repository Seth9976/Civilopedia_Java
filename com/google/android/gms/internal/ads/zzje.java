package com.google.android.gms.internal.ads;

public final class zzje implements Runnable {
    public final Aa zza;
    public final zzfrg zzb;
    public final zzsa zzc;

    public zzje(Aa aa0, zzfrg zzfrg0, zzsa zzsa0) {
        this.zza = aa0;
        this.zzb = zzfrg0;
        this.zzc = zzsa0;
    }

    @Override
    public final void run() {
        zzfrj zzfrj0 = this.zzb.zzg();
        this.zza.c.zzT(zzfrj0, this.zzc);
    }
}

