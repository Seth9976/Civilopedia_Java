package com.google.android.gms.internal.ads;

public final class zzciu implements zzayi {
    public final zzayi zza;
    public final byte[] zzb;

    public zzciu(zzayi zzayi0, byte[] arr_b) {
        this.zza = zzayi0;
        this.zzb = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzayi
    public final zzayj zza() {
        zzayj zzayj0 = this.zza.zza();
        return new T2(new zzayh(this.zzb), this.zzb.length, zzayj0);
    }
}

