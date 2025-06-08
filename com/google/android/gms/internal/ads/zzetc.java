package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzetc implements zzetf {
    public final Bundle zza;

    public zzetc(Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        ((Bundle)object0).putBundle("shared_pref", this.zza);
    }
}

