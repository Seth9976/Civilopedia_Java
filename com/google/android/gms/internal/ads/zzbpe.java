package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

public final class zzbpe extends zzbpg {
    public final OnH5AdsEventListener i;

    public zzbpe(OnH5AdsEventListener onH5AdsEventListener0) {
        this.i = onH5AdsEventListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzb(String s) {
        this.i.onH5AdsEvent(s);
    }
}

