package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzdjp extends zzdhc implements zzbpb {
    public zzdjp(Set set0) {
        super(set0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpb
    public final void zza(zzcax zzcax0) {
        this.a(new zzdjm(zzcax0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbpb
    public final void zzb() {
        this.a(zzdjo.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpb
    public final void zzc() {
        synchronized(this) {
            this.a(zzdjn.zza);
        }
    }
}

