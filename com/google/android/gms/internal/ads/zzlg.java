package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzlg implements zzdj {
    public final zzki zza;
    public final zzrr zzb;
    public final zzrw zzc;
    public final IOException zzd;
    public final boolean zze;

    public zzlg(zzki zzki0, zzrr zzrr0, zzrw zzrw0, IOException iOException0, boolean z) {
        this.zza = zzki0;
        this.zzb = zzrr0;
        this.zzc = zzrw0;
        this.zzd = iOException0;
        this.zze = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzdj
    public final void zza(Object object0) {
        ((zzkk)object0).zzj(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}

