package com.google.android.gms.internal.ads;

public final class zzbyv implements Runnable {
    public final zzcfn zza;
    public final String zzb;

    public zzbyv(zzcfn zzcfn0, String s) {
        this.zza = zzcfn0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

