package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzcmt;

public final class zzd implements zzcmt {
    public final zzl zza;

    public zzd(zzl zzl0) {
        this.zza = zzl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmt
    public final void zza(boolean z) {
        zzcli zzcli0 = this.zza.k;
        if(zzcli0 != null) {
            zzcli0.zzZ();
        }
    }
}

