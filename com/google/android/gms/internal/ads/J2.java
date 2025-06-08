package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener;

public final class j2 extends zzbme {
    public final zzbxf i;

    public j2(zzbxf zzbxf0) {
        this.i = zzbxf0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmf
    public final void zze(zzblv zzblv0, String s) {
        zzbxg zzbxg0;
        zzbxf zzbxf0 = this.i;
        OnCustomClickListener nativeCustomFormatAd$OnCustomClickListener0 = zzbxf0.b;
        if(nativeCustomFormatAd$OnCustomClickListener0 == null) {
            return;
        }
        synchronized(zzbxf0) {
            zzbxg0 = zzbxf0.c;
            if(zzbxg0 == null) {
                zzbxg0 = new zzbxg(zzblv0);
                zzbxf0.c = zzbxg0;
            }
        }
        nativeCustomFormatAd$OnCustomClickListener0.onCustomClick(zzbxg0, s);
    }
}

