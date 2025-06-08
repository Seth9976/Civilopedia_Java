package com.google.android.gms.internal.consent_sdk;

import d1.e;

public final class zzau implements Runnable {
    public final zzay zza;

    public zzau(zzay zzay0) {
        this.zza = zzay0;
    }

    @Override
    public final void run() {
        zzj zzj0 = new zzj(4, "Web view timed out.");
        e e0 = (e)this.zza.h.getAndSet(null);
        if(e0 != null) {
            e0.a(zzj0.zza());
        }
    }
}

