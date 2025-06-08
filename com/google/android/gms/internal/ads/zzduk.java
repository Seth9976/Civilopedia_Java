package com.google.android.gms.internal.ads;

public final class zzduk implements zzbdl {
    public final zzbdw zza;
    public final String zzb;
    public final zzbgm zzc;
    public final String zzd;

    public zzduk(zzbdw zzbdw0, String s, zzbgm zzbgm0, String s1) {
        this.zza = zzbdw0;
        this.zzb = s;
        this.zzc = zzbgm0;
        this.zzd = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbdl
    public final void zza(zzbfb zzbfb0) {
        zzbdx zzbdx0 = (zzbdx)zzbfb0.zza().zzaz();
        zzbdx0.zza(this.zza);
        zzbfb0.zze(zzbdx0);
        zzbet zzbet0 = (zzbet)zzbfb0.zzb().zzaz();
        zzbet0.zza(this.zzb);
        zzbet0.zzb(this.zzc);
        zzbfb0.zzg(zzbet0);
        zzbfb0.zzh(this.zzd);
    }
}

