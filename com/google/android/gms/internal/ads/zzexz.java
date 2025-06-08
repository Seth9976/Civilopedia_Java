package com.google.android.gms.internal.ads;

public final class zzexz implements zzfuj {
    public final zzeyb zza;
    public final zzfdx zzb;
    public final zzcza zzc;

    public zzexz(zzeyb zzeyb0, zzfdx zzfdx0, zzcza zzcza0) {
        this.zza = zzeyb0;
        this.zzb = zzfdx0;
        this.zzc = zzcza0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzcza zzcza0 = this.zzc;
        this.zzb.zzb = (zzfbx)object0;
        boolean z = false;
        for(Object object1: ((zzfbx)object0).zzb.zza) {
            for(Object object2: ((zzfbl)object1).zza) {
                if(((String)object2).contains("FirstPartyRenderer")) {
                    z = true;
                    continue;
                }
                return zzfvc.zzi(null);
            }
        }
        return z ? zzcza0.zzh(zzfvc.zzi(((zzfbx)object0))) : zzfvc.zzi(null);
    }
}

