package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

public final class zzflj implements OnFailureListener {
    public final zzfln zza;

    public zzflj(zzfln zzfln0) {
        this.zza = zzfln0;
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception0) {
        zzfln zzfln0 = this.zza;
        zzfln0.getClass();
        if(exception0 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        zzfln0.c.zzc(2025, -1L, exception0);
    }
}

