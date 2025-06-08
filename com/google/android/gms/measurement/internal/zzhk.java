package com.google.android.gms.measurement.internal;

public final class zzhk implements Runnable {
    public final zzij zza;
    public final String zzb;

    public zzhk(zzij zzij0, String s) {
        this.zza = zzij0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        zzij zzij0 = this.zza;
        zzel zzel0 = zzij0.a.zzh();
        boolean z = zzel0.p != null && !zzel0.p.equals(this.zzb);
        zzel0.p = this.zzb;
        if(z) {
            zzij0.a.zzh().c();
        }
    }
}

