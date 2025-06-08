package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcyl {
    public final Executor a;
    public final ScheduledExecutorService b;
    public final zzfvl c;
    public volatile boolean d;

    public zzcyl(Executor executor0, ScheduledExecutorService scheduledExecutorService0, zzfvl zzfvl0) {
        this.d = true;
        this.a = executor0;
        this.b = scheduledExecutorService0;
        this.c = zzfvl0;
    }

    public final void zze(zzfuy zzfuy0) {
        i4 i40 = new i4(this, zzfuy0, 0);
        zzfvc.zzr(this.c, i40, this.a);
    }

    public final boolean zzf() {
        return this.d;
    }
}

