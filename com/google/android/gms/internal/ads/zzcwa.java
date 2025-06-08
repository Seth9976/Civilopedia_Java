package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

public final class zzcwa implements zzddh {
    public final Context zza;
    public final zzcfo zzb;
    public final zzfbl zzc;
    public final zzfcd zzd;

    public zzcwa(Context context0, zzcfo zzcfo0, zzfbl zzfbl0, zzfcd zzfcd0) {
        this.zza = context0;
        this.zzb = zzcfo0;
        this.zzc = zzfbl0;
        this.zzd = zzfcd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        zzt.zzs().zzn(this.zza, this.zzb.zza, this.zzc.zzD.toString(), this.zzd.zzf);
    }
}

