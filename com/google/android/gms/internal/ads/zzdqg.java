package com.google.android.gms.internal.ads;

public final class zzdqg implements zzfuj {
    public final zzfvl zza;

    public zzdqg(zzfvl zzfvl0) {
        this.zza = zzfvl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzfvl zzfvl0 = this.zza;
        if(((zzcli)object0) == null || ((zzcli)object0).zzs() == null) {
            throw new zzeit(1, "Retrieve video view in html5 ad response failed.");
        }
        return zzfvl0;
    }
}

