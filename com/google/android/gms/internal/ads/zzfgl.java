package com.google.android.gms.internal.ads;

public final class zzfgl implements Runnable {
    public final zzfgm zza;
    public final String zzb;

    public zzfgl(zzfgm zzfgm0, String s) {
        this.zza = zzfgm0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.b.zza(this.zzb);
    }
}

