package com.google.android.gms.internal.ads;

public final class zzbrk implements Runnable {
    public final zzbrp zza;
    public final String zzb;

    public zzbrk(zzbrp zzbrp0, String s) {
        this.zza = zzbrp0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.i.zza(this.zzb);
    }
}

