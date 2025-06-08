package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public abstract class zzffx {
    public final zzfvm a;
    public final ScheduledExecutorService b;
    public final zzffy c;
    public static final zzfvl d;

    static {
        zzffx.d = zzfvc.zzi(null);
    }

    public zzffx(zzfvm zzfvm0, ScheduledExecutorService scheduledExecutorService0, zzffy zzffy0) {
        this.a = zzfvm0;
        this.b = scheduledExecutorService0;
        this.c = zzffy0;
    }

    public abstract String a(Object arg1);

    public final zzffn zza(Object object0, zzfvl[] arr_zzfvl) {
        return new zzffn(this, object0, Arrays.asList(arr_zzfvl));
    }

    public final zzffw zzb(Object object0, zzfvl zzfvl0) {
        return new zzffw(this, object0, null, zzfvl0, Collections.singletonList(zzfvl0), zzfvl0);
    }
}

