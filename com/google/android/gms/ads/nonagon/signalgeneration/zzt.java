package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import java.util.ArrayList;

public final class zzt implements zzfuj {
    public final zzaa zza;

    public zzt(zzaa zzaa0) {
        this.zza = zzaa0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        return zzfvc.zzm(this.zza.d("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzn(this.zza, ((ArrayList)object0)), this.zza.n);
    }
}

