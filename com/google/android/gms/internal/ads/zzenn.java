package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzenn implements zzetg {
    public final Clock a;
    public final zzfcd b;

    public zzenn(Clock clock0, zzfcd zzfcd0) {
        this.a = clock0;
        this.b = zzfcd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 4;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        long v = this.a.currentTimeMillis();
        return zzfvc.zzi(new zzeno(this.b, v));
    }
}

