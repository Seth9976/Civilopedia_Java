package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzul implements zzuz {
    public final zzut zza;
    public final String zzb;

    public zzul(zzut zzut0, String s) {
        this.zza = zzut0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzuz
    public final List zza(int v, zzck zzck0, int[] arr_v) {
        zzut zzut0 = this.zza;
        String s = this.zzb;
        zzfrg zzfrg0 = zzfrj.zzi();
        for(int v1 = 0; v1 <= 0; ++v1) {
            zzfrg0.zze(new Db(v, zzck0, v1, zzut0, arr_v[v1], s));
        }
        return zzfrg0.zzg();
    }
}

