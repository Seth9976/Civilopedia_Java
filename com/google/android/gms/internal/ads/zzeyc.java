package com.google.android.gms.internal.ads;

public final class zzeyc implements zzfuj {
    public final zzeyg zza;

    public zzeyc(zzeyg zzeyg0) {
        this.zza = zzeyg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzeyg zzeyg0 = this.zza;
        zzeyg0.getClass();
        if(((zzfeh)object0) != null && ((zzfeh)object0).zza != null) {
            zzfej zzfej0 = ((zzfeh)object0).zzb;
            if(zzfej0 != null) {
                zzbeb zzbeb0 = zzbeh.zza();
                zzbdz zzbdz0 = zzbea.zza();
                zzbdz0.zzd(2);
                zzbdz0.zzb(zzbee.zzd());
                zzbeb0.zza(zzbdz0);
                zzbeh zzbeh0 = (zzbeh)zzbeb0.zzal();
                ((zzfeh)object0).zza.zza.zzb().zzc().zzi(zzbeh0);
                return zzeyg0.a(((zzfeh)object0).zza, ((L5)zzfej0).b);
            }
        }
        throw new zzdzl(1, "Empty prefetch");
    }
}

