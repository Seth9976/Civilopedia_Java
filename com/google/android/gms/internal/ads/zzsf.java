package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzsf implements Runnable {
    public final zzsj zza;
    public final zzsk zzb;
    public final zzrr zzc;
    public final zzrw zzd;
    public final IOException zze;
    public final boolean zzf;

    public zzsf(zzsj zzsj0, zzsk zzsk0, zzrr zzrr0, zzrw zzrw0, IOException iOException0, boolean z) {
        this.zza = zzsj0;
        this.zzb = zzsk0;
        this.zzc = zzrr0;
        this.zzd = zzrw0;
        this.zze = iOException0;
        this.zzf = z;
    }

    @Override
    public final void run() {
        this.zzb.zzai(this.zza.zza, this.zza.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}

