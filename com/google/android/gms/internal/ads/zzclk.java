package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzl;

public final class zzclk implements Runnable {
    public final zzclp zza;

    public zzclk(zzclp zzclp0) {
        this.zza = zzclp0;
    }

    @Override
    public final void run() {
        this.zza.i.zzac();
        zzl zzl0 = this.zza.i.zzN();
        if(zzl0 != null) {
            zzl0.zzx();
        }
    }
}

