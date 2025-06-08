package com.google.android.gms.internal.ads;

public final class zzdqa implements zzfuj {
    public final zzfvl zza;

    public zzdqa(zzfvl zzfvl0) {
        this.zza = zzfvl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzfvl zzfvl0 = this.zza;
        if(((zzcli)object0) == null) {
            throw new zzeit(1, "Retrieve Web View from image ad response failed.");
        }
        return zzfvl0;
    }
}

