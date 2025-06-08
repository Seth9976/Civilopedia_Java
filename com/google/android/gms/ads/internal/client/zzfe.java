package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class zzfe extends zzdm {
    public final VideoLifecycleCallbacks i;

    public zzfe(VideoLifecycleCallbacks videoController$VideoLifecycleCallbacks0) {
        this.i = videoController$VideoLifecycleCallbacks0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final void zze() {
        this.i.onVideoEnd();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final void zzf(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final void zzg() {
        this.i.onVideoPause();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final void zzh() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final void zzi() {
        this.i.onVideoStart();
    }
}

