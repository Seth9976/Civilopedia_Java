package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

public final class zzclj implements Runnable {
    public final String zza;

    public zzclj(String s) {
        this.zza = s;
    }

    @Override
    public final void run() {
        zzt.zzo().zzf().zze(this.zza);
    }
}

