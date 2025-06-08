package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

public final class zzefe implements zzefd {
    public final zzfok a;
    @VisibleForTesting
    public final zzefd zza;

    public zzefe(zzefd zzefd0, zzfok zzfok0) {
        this.zza = zzefd0;
        this.a = zzfok0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        return zzfvc.zzm(this.zza.zza(zzfbx0, zzfbl0), this.a, zzcfv.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        return this.zza.zzb(zzfbx0, zzfbl0);
    }
}

