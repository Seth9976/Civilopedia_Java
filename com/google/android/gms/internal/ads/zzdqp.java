package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;

public final class zzdqp implements zzfuj {
    public final zzdqz zza;

    public zzdqp(zzdqz zzdqz0) {
        this.zza = zzdqz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        this.zza.getClass();
        zzq zzq0 = zzq.zzc();
        zzcli zzcli0 = this.zza.c.zza(zzq0, null, null);
        zzfvl zzfvl0 = zzcfz.zza(zzcli0);
        this.zza.a(zzcli0);
        zzcli0.zzP().zzF(new zzdqr(((zzcfz)zzfvl0)));
        zzcli0.loadUrl(((String)zzay.zzc().zzb(zzbhz.zzcO)));
        return zzfvl0;
    }
}

