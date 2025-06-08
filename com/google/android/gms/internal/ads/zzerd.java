package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzerd implements zzetf {
    public final zzfbk zza;

    public zzerd(zzfbk zzfbk0) {
        this.zza = zzfbk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        zzfbk zzfbk0 = this.zza;
        if(zzfbk0 != null) {
            ((Bundle)object0).putBoolean("render_in_browser", zzfbk0.zzd());
            ((Bundle)object0).putBoolean("disable_ml", this.zza.zzc());
        }
    }
}

