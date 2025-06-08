package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener;

public final class zzbnk extends zzbmu {
    public final UnconfirmedClickListener i;

    public zzbnk(UnconfirmedClickListener unifiedNativeAd$UnconfirmedClickListener0) {
        this.i = unifiedNativeAd$UnconfirmedClickListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmv
    public final void zze() {
        this.i.onUnconfirmedClickCancelled();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmv
    public final void zzf(String s) {
        this.i.onUnconfirmedClickReceived(s);
    }
}

