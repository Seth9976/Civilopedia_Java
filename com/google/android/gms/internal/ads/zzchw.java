package com.google.android.gms.internal.ads;

public final class zzchw implements Runnable {
    public final zzcij zza;
    public final boolean zzb;
    public final long zzc;

    public zzchw(zzcij zzcij0, boolean z, long v) {
        this.zza = zzcij0;
        this.zzb = z;
        this.zzc = v;
    }

    @Override
    public final void run() {
        this.zza.k.zzx(this.zzb, this.zzc);
    }
}

