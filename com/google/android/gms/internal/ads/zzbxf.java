package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener;

public final class zzbxf {
    public final OnCustomFormatAdLoadedListener a;
    public final OnCustomClickListener b;
    public zzbxg c;

    public zzbxf(OnCustomFormatAdLoadedListener nativeCustomFormatAd$OnCustomFormatAdLoadedListener0, OnCustomClickListener nativeCustomFormatAd$OnCustomClickListener0) {
        this.a = nativeCustomFormatAd$OnCustomFormatAdLoadedListener0;
        this.b = nativeCustomFormatAd$OnCustomClickListener0;
    }

    public final zzbmf zza() {
        return this.b == null ? null : new j2(this);
    }

    public final zzbmi zzb() {
        return new k2(this);
    }
}

