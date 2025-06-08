package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;

public final class zzclr implements zzfui {
    public final Context zza;
    public final zzaoc zzb;
    public final zzcfo zzc;
    public final zza zzd;
    public final String zze;

    public zzclr(Context context0, zzaoc zzaoc0, zzcfo zzcfo0, zza zza0, String s) {
        this.zza = context0;
        this.zzb = zzaoc0;
        this.zzc = zzcfo0;
        this.zzd = zza0;
        this.zze = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final zzfvl zza() {
        zzcmx zzcmx0 = zzcmx.zza();
        zzbdm zzbdm0 = zzbdm.zza();
        zzcli zzcli0 = zzclu.zza(this.zza, zzcmx0, "", false, false, this.zzb, null, this.zzc, null, null, this.zzd, zzbdm0, null, null);
        zzfvl zzfvl0 = zzcfz.zza(zzcli0);
        zzcli0.zzP().zzz(new zzcls(((zzcfz)zzfvl0)));
        zzcli0.loadUrl(this.zze);
        return zzfvl0;
    }
}

