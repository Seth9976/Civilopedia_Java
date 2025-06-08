package com.google.android.gms.internal.ads;

public final class zzckc implements Runnable {
    public final zzchr zza;
    public final boolean zzb;
    public final long zzc;

    public zzckc(zzchr zzchr0, boolean z, long v) {
        this.zza = zzchr0;
        this.zzb = z;
        this.zzc = v;
    }

    @Override
    public final void run() {
        this.zza.zzx(this.zzb, this.zzc);
    }
}

