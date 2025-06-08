package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;

public final class zzbng {
    public final OnCustomTemplateAdLoadedListener a;
    public final OnCustomClickListener b;
    public zzblw c;

    public zzbng(OnCustomTemplateAdLoadedListener nativeCustomTemplateAd$OnCustomTemplateAdLoadedListener0, OnCustomClickListener nativeCustomTemplateAd$OnCustomClickListener0) {
        this.a = nativeCustomTemplateAd$OnCustomTemplateAdLoadedListener0;
        this.b = nativeCustomTemplateAd$OnCustomClickListener0;
    }

    public final zzbmf zzd() {
        return this.b == null ? null : new L1(this);
    }

    public final zzbmi zze() {
        return new M1(this);
    }
}

