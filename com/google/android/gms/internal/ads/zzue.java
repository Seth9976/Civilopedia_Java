package com.google.android.gms.internal.ads;

import java.util.ArrayList;

public final class zzue extends zzug {
    public final zzvu f;
    public final zzcx g;

    public zzue(zzck zzck0, int[] arr_v, zzvu zzvu0, zzfrj zzfrj0, zzcx zzcx0) {
        super(zzck0, arr_v, 0);
        this.f = zzvu0;
        zzfrj.zzm(zzfrj0);
        this.g = zzcx0;
    }

    public static void a(ArrayList arrayList0, long[] arr_v) {
        long v = 0L;
        for(int v2 = 0; v2 < 2; ++v2) {
            v += arr_v[v2];
        }
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            zzfrg zzfrg0 = (zzfrg)arrayList0.get(v1);
            if(zzfrg0 != null) {
                zzfrg0.zze(new zzuc(v, arr_v[v1]));
            }
        }
    }
}

