package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener;

public final class zzbxi extends zzbmu {
    public final UnconfirmedClickListener i;

    public zzbxi(UnconfirmedClickListener nativeAd$UnconfirmedClickListener0) {
        this.i = nativeAd$UnconfirmedClickListener0;
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

