package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzaou extends zzamm {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzaou() {
    }

    public zzaou(String s) {
        HashMap hashMap0 = zzamm.a(s);
        if(hashMap0 != null) {
            this.zza = (Long)hashMap0.get(0);
            this.zzb = (Boolean)hashMap0.get(1);
            this.zzc = (Boolean)hashMap0.get(2);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzamm
    public final HashMap b() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(0, this.zza);
        hashMap0.put(1, this.zzb);
        hashMap0.put(2, this.zzc);
        return hashMap0;
    }
}

