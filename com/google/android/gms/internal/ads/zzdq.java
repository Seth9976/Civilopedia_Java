package com.google.android.gms.internal.ads;

public final class zzdq implements Runnable {
    public final zzdw zza;
    public final zzvw zzb;

    public zzdq(zzdw zzdw0, zzvw zzvw0, byte[] arr_b) {
        this.zza = zzdw0;
        this.zzb = zzvw0;
    }

    @Override
    public final void run() {
        int v = this.zza.zza();
        zzvy.zzh(this.zzb.zza, v);
    }
}

