package com.google.android.gms.internal.ads;

public final class zzeyi implements zzfuj {
    public final zzeym zza;
    public final zzdbc zzb;

    public zzeyi(zzeym zzeym0, zzdbc zzdbc0) {
        this.zza = zzeym0;
        this.zzb = zzdbc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzeym zzeym0 = this.zza;
        zzdbc zzdbc0 = this.zzb;
        zzeym0.getClass();
        zzfdy zzfdy0 = ((zzeyv)object0).zzb;
        zzbzv zzbzv0 = ((zzeyv)object0).zza;
        zzfdx zzfdx0 = zzfdy0 == null ? null : zzeym0.a.zzb(zzfdy0);
        if(zzfdy0 == null) {
            return zzfvc.zzi(null);
        }
        if(zzfdx0 != null && zzbzv0 != null) {
            zzfvc.zzr(zzdbc0.zzb().zzg(zzbzv0), zzeym0.c, zzeym0.b);
        }
        return zzfvc.zzi(new zzeyl(zzfdy0, zzbzv0, zzfdx0));
    }
}

