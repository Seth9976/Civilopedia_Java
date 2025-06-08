package com.google.android.gms.internal.ads;

public final class zzckq implements zzep {
    public final zzep zza;
    public final byte[] zzb;

    public zzckq(zzep zzep0, byte[] arr_b) {
        this.zza = zzep0;
        this.zzb = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzep
    public final zzeq zza() {
        zzeq zzeq0 = this.zza.zza();
        return new f3(new zzel(this.zzb), this.zzb.length, zzeq0);
    }
}

