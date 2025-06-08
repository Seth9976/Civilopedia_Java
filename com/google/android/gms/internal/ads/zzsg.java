package com.google.android.gms.internal.ads;

public final class zzsg implements Runnable {
    public final zzsj zza;
    public final zzsk zzb;
    public final zzrr zzc;
    public final zzrw zzd;

    public zzsg(zzsj zzsj0, zzsk zzsk0, zzrr zzrr0, zzrw zzrw0) {
        this.zza = zzsj0;
        this.zzb = zzsk0;
        this.zzc = zzrr0;
        this.zzd = zzrw0;
    }

    @Override
    public final void run() {
        this.zzb.zzaj(this.zza.zza, this.zza.zzb, this.zzc, this.zzd);
    }
}

