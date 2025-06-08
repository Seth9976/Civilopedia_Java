package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;

public final class zzfgq implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzfgq(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzgqo zzgqo0 = zzgqt.zza(this.a);
        zzgqo zzgqo1 = zzgqt.zza(this.b);
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.c.zzb();
        zzfgp zzfgp0 = ((Boolean)zzay.zzc().zzb(zzbhz.zzhk)).booleanValue() ? new m6(((zzfgp)zzgqo0.zzb()), scheduledExecutorService0) : ((zzfgp)zzgqo1.zzb());
        zzgrc.zzb(zzfgp0);
        return zzfgp0;
    }
}

