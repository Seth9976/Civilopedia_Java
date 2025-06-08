package com.google.android.gms.internal.ads;

public final class zzdqb implements zzcmt {
    public final zzcfz zza;

    public zzdqb(zzcfz zzcfz0) {
        this.zza = zzcfz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmt
    public final void zza(boolean z) {
        zzcfz zzcfz0 = this.zza;
        if(z) {
            zzcfz0.zzb();
            return;
        }
        zzcfz0.zze(new zzeit(1, "Image Web View failed to load."));
    }
}

