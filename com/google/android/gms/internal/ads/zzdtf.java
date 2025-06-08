package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;

public final class zzdtf implements zza {
    public final zzdto zza;

    public zzdtf(zzdto zzdto0) {
        this.zza = zzdto0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.a.onAdClicked();
    }
}

