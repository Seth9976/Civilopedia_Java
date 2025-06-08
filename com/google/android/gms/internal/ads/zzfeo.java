package com.google.android.gms.internal.ads;

public final class zzfeo implements zzfuj {
    public final zzfeq zza;
    public final zzfei zzb;
    public final zzfdo zzc;
    public final zzfej zzd;

    public zzfeo(zzfeq zzfeq0, zzfei zzfei0, zzfdo zzfdo0, zzfej zzfej0) {
        this.zza = zzfeq0;
        this.zzb = zzfei0;
        this.zzc = zzfdo0;
        this.zzd = zzfej0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzfeq zzfeq0 = this.zza;
        zzfdo zzfdo0 = this.zzc;
        zzfej zzfej0 = this.zzd;
        synchronized(zzfeq0) {
            zzfeq0.d = true;
            this.zzb.zzb(((zzfdx)object0));
            if(!zzfeq0.c) {
                zzfdo0.zzd(zzfej0.zza(), ((zzfdx)object0));
                return zzfvc.zzi(null);
            }
            return zzfvc.zzi(new zzfeh(((zzfdx)object0), zzfej0));
        }
    }
}

