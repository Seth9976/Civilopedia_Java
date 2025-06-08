package com.google.android.gms.internal.consent_sdk;

public final class zzbd implements Runnable {
    public final zzbg zza;
    public final String zzb;

    public zzbd(zzbg zzbg0, String s) {
        this.zza = zzbg0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        zzce.zza(this.zza, this.zzb);
    }
}

