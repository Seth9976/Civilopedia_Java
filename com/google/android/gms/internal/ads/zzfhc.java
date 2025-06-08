package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzfhc implements zzfgp {
    public final zzfgz a;
    public final zzfgx b;

    public zzfhc(zzfgz zzfgz0, zzfgx zzfgx0) {
        this.a = zzfgz0;
        this.b = zzfgx0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgp
    public final String zza(zzfgo zzfgo0) {
        Map map0 = zzfgo0.zzj();
        this.b.zza(map0);
        return this.a.zza(map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgp
    public final void zzb(zzfgo zzfgo0) {
    }
}

