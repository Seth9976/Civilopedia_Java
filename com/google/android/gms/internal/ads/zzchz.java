package com.google.android.gms.internal.ads;

public final class zzchz implements Runnable {
    public final zzcij zza;
    public final String zzb;

    public zzchz(zzcij zzcij0, String s) {
        this.zza = zzcij0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        String s = this.zzb;
        zzcgw zzcgw0 = this.zza.n;
        if(zzcgw0 != null) {
            zzcgw0.zzb("ExoPlayerAdapter error", s);
        }
    }
}

