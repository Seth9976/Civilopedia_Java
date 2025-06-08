package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

public final class zzmu {
    public final Ka a;
    public static final zzmu zza;

    static {
        zzmu.zza = zzeg.zza >= 0x1F ? new zzmu(Ka.b) : new zzmu();
    }

    public zzmu() {
        this.a = null;
        zzcw.zzf(zzeg.zza < 0x1F);
    }

    public zzmu(LogSessionId logSessionId0) {
        Ka ka0 = new Ka(logSessionId0);
        super();
        this.a = ka0;
    }

    public zzmu(Ka ka0) {
        this.a = ka0;
    }

    public final LogSessionId zza() {
        this.a.getClass();
        return this.a.a;
    }
}

