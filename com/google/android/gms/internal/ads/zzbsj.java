package com.google.android.gms.internal.ads;

public final class zzbsj implements Runnable {
    public final a2 zza;
    public final zzbrh zzb;

    public zzbsj(a2 a20, zzbrh zzbrh0) {
        this.zza = a20;
        this.zzb = zzbrh0;
    }

    @Override
    public final void run() {
        this.zzb.zzr("/result", zzbol.zzo);
        this.zzb.zzc();
    }
}

