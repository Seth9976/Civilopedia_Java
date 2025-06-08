package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzuh implements zzuz {
    public final zzut zza;
    public final boolean zzb;

    public zzuh(zzut zzut0, boolean z) {
        this.zza = zzut0;
        this.zzb = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzuz
    public final List zza(int v, zzck zzck0, int[] arr_v) {
        zzut zzut0 = this.zza;
        boolean z = this.zzb;
        zzfrg zzfrg0 = zzfrj.zzi();
        for(int v1 = 0; v1 <= 0; ++v1) {
            zzfrg0.zze(new Bb(v, zzck0, v1, zzut0, arr_v[v1], z));
        }
        return zzfrg0.zzg();
    }
}

