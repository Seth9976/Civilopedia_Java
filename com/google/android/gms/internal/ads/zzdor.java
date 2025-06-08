package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

public final class zzdor implements zzcmt {
    public final zzdos zza;
    public final Map zzb;

    public zzdor(zzdos zzdos0, Map map0) {
        this.zza = zzdos0;
        this.zzb = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmt
    public final void zza(boolean z) {
        this.zza.getClass();
        HashMap hashMap0 = new HashMap();
        hashMap0.put("messageType", "htmlLoaded");
        hashMap0.put("id", ((String)this.zzb.get("id")));
        this.zza.b.zzg("sendMessageToNativeJs", hashMap0);
    }
}

