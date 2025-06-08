package com.google.android.gms.internal.ads;

public final class zzchb implements Runnable {
    public final zzchf zza;

    public zzchb(zzchf zzchf0) {
        this.zza = zzchf0;
    }

    @Override
    public final void run() {
        this.zza.b("firstFrameRendered", new String[0]);
    }
}

