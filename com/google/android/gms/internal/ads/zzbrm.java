package com.google.android.gms.internal.ads;

public final class zzbrm implements Runnable {
    public final zzbrp zza;
    public final String zzb;

    public zzbrm(zzbrp zzbrp0, String s) {
        this.zza = zzbrp0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.i.loadData(this.zzb, "text/html", "UTF-8");
    }
}

