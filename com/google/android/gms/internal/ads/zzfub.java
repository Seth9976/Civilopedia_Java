package com.google.android.gms.internal.ads;

public final class zzfub implements Runnable {
    public final b8 zza;
    public final zzfre zzb;

    public zzfub(b8 b80, zzfre zzfre0) {
        this.zza = b80;
        this.zzb = zzfre0;
    }

    @Override
    public final void run() {
        this.zza.p(this.zzb);
    }
}

