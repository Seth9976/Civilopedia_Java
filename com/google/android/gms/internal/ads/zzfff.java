package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class zzfff implements zzgqu {
    public final zzgrh a;

    public zzfff(zzgrh zzgrh0) {
        this.a = zzgrh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        ScheduledExecutorService scheduledExecutorService0 = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, ((ThreadFactory)this.a.zzb())));
        zzgrc.zzb(scheduledExecutorService0);
        return scheduledExecutorService0;
    }
}

