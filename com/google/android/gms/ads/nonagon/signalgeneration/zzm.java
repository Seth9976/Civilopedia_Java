package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfok;

public final class zzm implements zzfok {
    public final zzaa zza;
    public final Uri zzb;

    public zzm(zzaa zzaa0, Uri uri0) {
        this.zza = zzaa0;
        this.zzb = uri0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        return TextUtils.isEmpty(((String)object0)) ? this.zzb : zzaa.h(this.zzb, "nas", ((String)object0));
    }
}

