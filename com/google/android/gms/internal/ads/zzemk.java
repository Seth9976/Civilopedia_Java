package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzemk implements zzdee {
    public final AtomicReference i;

    public zzemk() {
        this.i = new AtomicReference();
    }

    public final void zza(zzde zzde0) {
        this.i.set(zzde0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zzg(zzs zzs0) {
        zzemj zzemj0 = new zzemj(zzs0);
        zzeyo.zza(this.i, zzemj0);
    }
}

