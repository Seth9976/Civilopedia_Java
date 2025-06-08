package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzaoj extends zzamm {
    public long zza;
    public long zzb;

    public zzaoj() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzaoj(String s) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap hashMap0 = zzamm.a(s);
        if(hashMap0 != null) {
            this.zza = (long)(((Long)hashMap0.get(0)));
            this.zzb = (long)(((Long)hashMap0.get(1)));
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

