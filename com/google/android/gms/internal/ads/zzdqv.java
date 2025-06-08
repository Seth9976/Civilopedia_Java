package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzdqv implements zzban {
    public final zzcli zza;

    public zzdqv(zzcli zzcli0) {
        this.zza = zzcli0;
    }

    @Override  // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbam0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("isVisible", (zzbam0.zzj ? "1" : "0"));
        this.zza.zzd("onAdVisibilityChanged", hashMap0);
    }
}

