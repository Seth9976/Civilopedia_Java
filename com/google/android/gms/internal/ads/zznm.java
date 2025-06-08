package com.google.android.gms.internal.ads;

import A.f;

public final class zznm extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzad zzc;

    public zznm(int v, int v1, int v2, int v3, zzad zzad0, boolean z, Exception exception0) {
        StringBuilder stringBuilder0 = f.n("AudioTrack init failed ", v, " Config(", v1, ", ");
        f.q(stringBuilder0, v2, ", ", v3, ")");
        stringBuilder0.append((z ? " (recoverable)" : ""));
        super(stringBuilder0.toString(), exception0);
        this.zza = v;
        this.zzb = z;
        this.zzc = zzad0;
    }
}

