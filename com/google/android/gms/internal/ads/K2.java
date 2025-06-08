package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener;

public final class k2 extends zzbmh {
    public final zzbxf i;

    public k2(zzbxf zzbxf0) {
        this.i = zzbxf0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmi
    public final void zze(zzblv zzblv0) {
        zzbxg zzbxg0;
        zzbxf zzbxf0 = this.i;
        OnCustomFormatAdLoadedListener nativeCustomFormatAd$OnCustomFormatAdLoadedListener0 = zzbxf0.a;
        synchronized(zzbxf0) {
            zzbxg0 = zzbxf0.c;
            if(zzbxg0 == null) {
                zzbxg0 = new zzbxg(zzblv0);
                zzbxf0.c = zzbxg0;
            }
        }
        nativeCustomFormatAd$OnCustomFormatAdLoadedListener0.onCustomFormatAdLoaded(zzbxg0);
    }
}

