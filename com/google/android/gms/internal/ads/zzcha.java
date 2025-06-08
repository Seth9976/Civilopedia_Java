package com.google.android.gms.internal.ads;

public final class zzcha implements Runnable {
    public final zzchf zza;
    public final boolean zzb;

    public zzcha(zzchf zzchf0, boolean z) {
        this.zza = zzchf0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        this.zza.getClass();
        this.zza.b("windowFocusChanged", new String[]{"hasWindowFocus", String.valueOf(this.zzb)});
    }
}

