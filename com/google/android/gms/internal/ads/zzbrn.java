package com.google.android.gms.internal.ads;

public final class zzbrn implements Runnable {
    public final zzbrp zza;
    public final String zzb;

    public zzbrn(zzbrp zzbrp0, String s) {
        this.zza = zzbrp0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.i.loadUrl(this.zzb);
    }
}

