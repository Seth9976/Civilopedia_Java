package com.google.android.gms.internal.ads;

public final class zzcig implements Runnable {
    public final zzcij zza;
    public final int zzb;
    public final int zzc;

    public zzcig(zzcij zzcij0, int v, int v1) {
        this.zza = zzcij0;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final void run() {
        int v = this.zzb;
        int v1 = this.zzc;
        zzcgw zzcgw0 = this.zza.n;
        if(zzcgw0 != null) {
            zzcgw0.zzj(v, v1);
        }
    }
}

