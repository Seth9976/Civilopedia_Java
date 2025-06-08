package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdwc;

public final class zzi implements Runnable {
    public final zzaa zza;
    public final String zzb;
    public final String zzc;
    public final zzdwc zzd;

    public zzi(zzaa zzaa0, String s, String s1, zzdwc zzdwc0) {
        this.zza = zzaa0;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = zzdwc0;
    }

    @Override
    public final void run() {
        this.zza.t.zzd(this.zzb, this.zzc, this.zzd);
    }
}

