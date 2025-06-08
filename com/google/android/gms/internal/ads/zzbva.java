package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbva extends zzbui {
    public final MediationInterscrollerAd i;

    public zzbva(MediationInterscrollerAd mediationInterscrollerAd0) {
        this.i = mediationInterscrollerAd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbuj
    public final IObjectWrapper zze() {
        return ObjectWrapper.wrap(this.i.getView());
    }

    @Override  // com.google.android.gms.internal.ads.zzbuj
    public final boolean zzf() {
        return this.i.shouldDelegateInterscrollerEffect();
    }
}

