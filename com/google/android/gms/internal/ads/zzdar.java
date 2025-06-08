package com.google.android.gms.internal.ads;

public final class zzdar implements Runnable {
    public final zzdat zza;

    public zzdar(zzdat zzdat0) {
        this.zza = zzdat0;
    }

    @Override
    public final void run() {
        zzdat zzdat0 = this.zza;
        synchronized(zzdat0) {
            if(zzdat0.m.isDone()) {
                return;
            }
            zzdat0.m.zzd(Boolean.TRUE);
        }
    }
}

