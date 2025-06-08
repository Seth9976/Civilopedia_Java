package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;

public final class zzdqs implements zzfuj {
    public final zzdqz zza;
    public final zzq zzb;
    public final zzfbl zzc;
    public final zzfbo zzd;
    public final String zze;
    public final String zzf;

    public zzdqs(zzdqz zzdqz0, zzq zzq0, zzfbl zzfbl0, zzfbo zzfbo0, String s, String s1) {
        this.zza = zzdqz0;
        this.zzb = zzq0;
        this.zzc = zzfbl0;
        this.zzd = zzfbo0;
        this.zze = s;
        this.zzf = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzdqz zzdqz0 = this.zza;
        String s = this.zze;
        String s1 = this.zzf;
        zzcli zzcli0 = zzdqz0.c.zza(this.zzb, this.zzc, this.zzd);
        zzfvl zzfvl0 = zzcfz.zza(zzcli0);
        if(zzdqz0.a.zzb == null) {
            zzdsh zzdsh0 = zzdqz0.d.zzb();
            zzcmv zzcmv0 = zzcli0.zzP();
            new zzb(zzdqz0.e, null, null);
            zzcmv0.zzL(zzdsh0, zzdsh0, zzdsh0, zzdsh0, zzdsh0, false, null, null, null, null, zzdqz0.i, zzdqz0.h, zzdqz0.f, zzdqz0.g, null, zzdsh0);
            zzdqz.b(zzcli0);
        }
        else {
            zzdqz0.a(zzcli0);
            zzcli0.zzai(zzcmx.zzd());
        }
        zzcli0.zzP().zzz(new zzdqt(zzdqz0, zzcli0, ((zzcfz)zzfvl0)));
        zzcli0.zzad(s, s1, null);
        return zzfvl0;
    }
}

