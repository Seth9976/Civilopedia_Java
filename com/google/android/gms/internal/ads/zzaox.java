package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzaox extends zzamm {
    public Long zza;
    public Long zzb;

    public zzaox() {
    }

    public zzaox(String s) {
        HashMap hashMap0 = zzamm.a(s);
        if(hashMap0 != null) {
            this.zza = (Long)hashMap0.get(0);
            this.zzb = (Long)hashMap0.get(1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamm
    public final HashMap b() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(0, this.zza);
        hashMap0.put(1, this.zzb);
        return hashMap0;
    }
}

