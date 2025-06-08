package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;

public final class zzenq implements Callable {
    public final zzenr zza;

    public zzenq(zzenr zzenr0) {
        this.zza = zzenr0;
    }

    @Override
    public final Object call() {
        this.zza.getClass();
        return new zzens((!((Boolean)zzay.zzc().zzb(zzbhz.zzgg)).booleanValue() || !"requester_type_2".equals(zzf.zzb(this.zza.b.zzd)) ? null : zzfcp.zza()));
    }
}

