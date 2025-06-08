package com.google.android.gms.internal.ads;

public final class zzsd implements Runnable {
    public final zzsj zza;
    public final zzsk zzb;
    public final zzrw zzc;

    public zzsd(zzsj zzsj0, zzsk zzsk0, zzrw zzrw0) {
        this.zza = zzsj0;
        this.zzb = zzsk0;
        this.zzc = zzrw0;
    }

    @Override
    public final void run() {
        this.zzb.zzaf(this.zza.zza, this.zza.zzb, this.zzc);
    }
}

