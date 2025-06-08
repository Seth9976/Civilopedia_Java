package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzby;

public final class zzbbb extends zzby {
    public final AppEventListener i;

    public zzbbb(AppEventListener appEventListener0) {
        this.i = appEventListener0;
    }

    public final AppEventListener zzb() {
        return this.i;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbz
    public final void zzc(String s, String s1) {
        this.i.onAppEvent(s, s1);
    }
}

