package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzdom implements zzbom {
    public final zzdos zza;

    public zzdom(zzdos zzdos0) {
        this.zza = zzdos0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzcli zzcli0 = (zzcli)object0;
        this.zza.b.zzg("sendMessageToNativeJs", map0);
    }
}

