package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzegx implements zzefd {
    public final zzcws a;
    public final zzege b;
    public final zzfvm c;
    public final zzdbv d;
    public final ScheduledExecutorService e;

    public zzegx(zzcws zzcws0, zzege zzege0, zzdbv zzdbv0, ScheduledExecutorService scheduledExecutorService0, zzfvm zzfvm0) {
        this.a = zzcws0;
        this.b = zzege0;
        this.d = zzdbv0;
        this.e = scheduledExecutorService0;
        this.c = zzfvm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        zzegu zzegu0 = new zzegu(this, zzfbx0, zzfbl0);
        return this.c.zzb(zzegu0);
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        return zzfbx0.zza.zza.zza() != null && this.b.zzb(zzfbx0, zzfbl0);
    }
}

