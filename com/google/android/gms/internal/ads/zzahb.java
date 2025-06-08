package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzahb {
    public final List a;
    public final zzzy[] b;

    public zzahb(List list0) {
        this.a = list0;
        this.b = new zzzy[list0.size()];
    }

    public final void zza(long v, zzdy zzdy0) {
        zzyi.zza(v, zzdy0, this.b);
    }

    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        for(int v = 0; true; ++v) {
            zzzy[] arr_zzzy = this.b;
            if(v >= arr_zzzy.length) {
                break;
            }
            zzahm0.zzc();
            zzzy zzzy0 = zzyu0.zzv(zzahm0.zza(), 3);
            zzad zzad0 = (zzad)this.a.get(v);
            zzcw.zze("application/cea-608".equals(zzad0.zzm) || "application/cea-708".equals(zzad0.zzm), "Invalid closed caption mime type provided: " + zzad0.zzm);
            String s = zzad0.zzb == null ? zzahm0.zzb() : zzad0.zzb;
            zzab zzab0 = new zzab();
            zzab0.zzH(s);
            zzab0.zzS(zzad0.zzm);
            zzab0.zzU(zzad0.zze);
            zzab0.zzK(zzad0.zzd);
            zzab0.zzu(zzad0.zzE);
            zzab0.zzI(zzad0.zzo);
            zzzy0.zzk(zzab0.zzY());
            arr_zzzy[v] = zzzy0;
        }
    }
}

