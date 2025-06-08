package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeqz implements zzetf {
    public final Bundle zza;

    public zzeqz(Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        Bundle bundle0 = zzfco.zza(((Bundle)object0), "device");
        bundle0.putBundle("android_mem_info", this.zza);
        ((Bundle)object0).putBundle("device", bundle0);
    }
}

