package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;

public final class zzdpz implements zzfuj {
    public final zzdqh zza;
    public final zzq zzb;
    public final zzfbl zzc;
    public final zzfbo zzd;
    public final String zze;
    public final String zzf;

    public zzdpz(zzdqh zzdqh0, zzq zzq0, zzfbl zzfbl0, zzfbo zzfbo0, String s, String s1) {
        this.zza = zzdqh0;
        this.zzb = zzq0;
        this.zzc = zzfbl0;
        this.zzd = zzfbo0;
        this.zze = s;
        this.zzf = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        String s = this.zze;
        String s1 = this.zzf;
        zzcli zzcli0 = this.zza.j.zza(this.zzb, this.zzc, this.zzd);
        zzfvl zzfvl0 = zzcfz.zza(zzcli0);
        zzdsh zzdsh0 = this.zza.l.zzb();
        zzcmv zzcmv0 = zzcli0.zzP();
        new zzb(this.zza.a, null, null);
        zzcmv0.zzL(zzdsh0, zzdsh0, zzdsh0, zzdsh0, zzdsh0, false, null, null, null, null, this.zza.p, this.zza.o, this.zza.m, this.zza.n, null, zzdsh0);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzcP)).booleanValue()) {
            zzcli0.zzaf("/getNativeAdViewSignals", zzbol.zzs);
        }
        zzcli0.zzaf("/getNativeClickMeta", zzbol.zzt);
        zzcli0.zzP().zzz(new zzdqb(((zzcfz)zzfvl0)));
        zzcli0.zzad(s, s1, null);
        return zzfvl0;
    }
}

