package com.google.android.gms.internal.ads;

public final class zzctl implements Runnable {
    public final zzcts zza;
    public final int zzb;
    public final int zzc;

    public zzctl(zzcts zzcts0, int v, int v1) {
        this.zza = zzcts0;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final void run() {
        this.zza.getClass();
        zzctn zzctn0 = new zzctn(this.zza, this.zzb, this.zzc);
        this.zza.j.execute(zzctn0);
    }
}

