package com.google.android.gms.internal.ads;

import android.graphics.Point;
import java.util.List;

public final class zzuj implements zzuz {
    public final zzut zza;
    public final int[] zzb;

    public zzuj(zzut zzut0, int[] arr_v) {
        this.zza = zzut0;
        this.zzb = arr_v;
    }

    @Override  // com.google.android.gms.internal.ads.zzuz
    public final List zza(int v, zzck zzck0, int[] arr_v) {
        int v10;
        int v9;
        zzut zzut0 = this.zza;
        int v1 = this.zzb[v];
        int v2 = zzut0.zzl;
        int v3 = zzut0.zzm;
        boolean z = zzut0.zzn;
        int v4 = 0x7FFFFFFF;
        if(v2 != 0x7FFFFFFF && v3 != 0x7FFFFFFF) {
            int v5 = 0x7FFFFFFF;
            for(int v6 = 0; v6 <= 0; ++v6) {
                zzad zzad0 = zzck0.zzb(v6);
                int v7 = zzad0.zzr;
                if(v7 > 0) {
                    int v8 = zzad0.zzs;
                    if(v8 > 0) {
                        if(!z || (v7 > v8 ? 1 : 0) == (v2 > v3 ? 1 : 0)) {
                            v10 = v2;
                            v9 = v3;
                        }
                        else {
                            v9 = v2;
                            v10 = v3;
                        }
                        int v11 = v7 * v9;
                        int v12 = v8 * v10;
                        Point point0 = v11 < v12 ? new Point(zzeg.zze(v11, v8), v9) : new Point(v10, zzeg.zze(v12, v7));
                        int v13 = zzad0.zzr * zzad0.zzs;
                        if(zzad0.zzr >= ((int)(((float)point0.x) * 0.98f)) && zzad0.zzs >= ((int)(((float)point0.y) * 0.98f)) && v13 < v5) {
                            v5 = v13;
                        }
                    }
                }
            }
            v4 = v5;
        }
        zzfrg zzfrg0 = zzfrj.zzi();
        for(int v14 = 0; v14 <= 0; ++v14) {
            int v15 = zzck0.zzb(v14).zza();
            zzfrg0.zze(new Fb(v, zzck0, v14, zzut0, arr_v[v14], v4 == 0x7FFFFFFF || v15 != -1 && v15 <= v4));
        }
        return zzfrg0.zzg();
    }
}

