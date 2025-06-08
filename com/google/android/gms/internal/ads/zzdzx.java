package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final class zzdzx implements zzgqu {
    public final zzgrh a;

    public zzdzx(zzgrh zzgrh0) {
        this.a = zzgrh0;
    }

    public final ApplicationInfo zza() {
        ApplicationInfo applicationInfo0 = ((Context)this.a.zzb()).getApplicationInfo();
        zzgrc.zzb(applicationInfo0);
        return applicationInfo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

