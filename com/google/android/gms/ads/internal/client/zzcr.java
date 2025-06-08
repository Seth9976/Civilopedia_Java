package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

public final class zzcr extends zzcp {
    public final MuteThisAdListener i;

    public zzcr(MuteThisAdListener muteThisAdListener0) {
        this.i = muteThisAdListener0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcq
    public final void zze() {
        this.i.onAdMuted();
    }
}

