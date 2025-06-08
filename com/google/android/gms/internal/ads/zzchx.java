package com.google.android.gms.internal.ads;

public final class zzchx implements Runnable {
    public final zzcij zza;

    public zzchx(zzcij zzcij0) {
        this.zza = zzcij0;
    }

    @Override
    public final void run() {
        zzcgw zzcgw0 = this.zza.n;
        if(zzcgw0 != null) {
            zzcgw0.zza();
        }
    }
}

