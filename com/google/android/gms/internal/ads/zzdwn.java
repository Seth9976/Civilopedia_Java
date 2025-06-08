package com.google.android.gms.internal.ads;

public final class zzdwn implements Runnable {
    public final zzdwo zza;
    public final String zzb;

    public zzdwn(zzdwo zzdwo0, String s) {
        this.zza = zzdwo0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.c.zza(this.zzb);
    }
}

