package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeqj implements zzetf {
    public final String zza;
    public final boolean zzb;

    public zzeqj(String s, boolean z) {
        this.zza = s;
        this.zzb = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        ((Bundle)object0).putString("gct", this.zza);
        if(this.zzb) {
            ((Bundle)object0).putString("de", "1");
        }
    }
}

