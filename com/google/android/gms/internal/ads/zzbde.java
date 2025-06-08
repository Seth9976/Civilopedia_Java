package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

public final class zzbde implements Runnable {
    public final zzcga zza;
    public final Future zzb;

    public zzbde(zzcga zzcga0, Future future0) {
        this.zza = zzcga0;
        this.zzb = future0;
    }

    @Override
    public final void run() {
        Future future0 = this.zzb;
        if(this.zza.isCancelled()) {
            future0.cancel(true);
        }
    }
}

