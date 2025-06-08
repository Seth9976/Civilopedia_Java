package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzfui;
import com.google.android.gms.internal.ads.zzfvl;

public final class zzu implements zzfui {
    public final zzaa zza;

    public zzu(zzaa zzaa0) {
        this.zza = zzaa0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final zzfvl zza() {
        return this.zza.c(this.zza.j, null, AdFormat.BANNER.name(), null, null).zzc();
    }
}

