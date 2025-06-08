package com.google.android.gms.internal.ads;

public final class zzvq implements Runnable {
    public final Gb zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    public zzvq(Gb gb0, int v, long v1, long v2) {
        this.zza = gb0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
    }

    @Override
    public final void run() {
        this.zza.b.zzY(this.zzb, this.zzc, this.zzd);
    }
}

