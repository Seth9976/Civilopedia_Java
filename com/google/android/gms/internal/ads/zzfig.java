package com.google.android.gms.internal.ads;

public final class zzfig implements Runnable {
    public final zzfii zza;
    public final String zzb;

    public zzfig(zzfii zzfii0, String s) {
        this.zza = zzfii0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.c.zza(this.zzb);
    }
}

