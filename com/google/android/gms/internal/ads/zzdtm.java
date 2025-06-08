package com.google.android.gms.internal.ads;

public final class zzdtm implements zzcmt {
    public final zzcga zza;

    public zzdtm(zzcga zzcga0) {
        this.zza = zzcga0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmt
    public final void zza(boolean z) {
        zzcga zzcga0 = this.zza;
        if(z) {
            zzcga0.zzd(null);
            return;
        }
        zzcga0.zze(new Exception("Ad Web View failed to load."));
    }
}

