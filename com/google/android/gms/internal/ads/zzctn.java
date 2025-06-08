package com.google.android.gms.internal.ads;

public final class zzctn implements Runnable {
    public final zzcts zza;
    public final int zzb;
    public final int zzc;

    public zzctn(zzcts zzcts0, int v, int v1) {
        this.zza = zzcts0;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final void run() {
        this.zza.b(this.zzb - 1, this.zzc);
    }
}

