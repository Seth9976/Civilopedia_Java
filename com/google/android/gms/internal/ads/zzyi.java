package com.google.android.gms.internal.ads;

import android.util.Log;

public final class zzyi {
    public static void zza(long v, zzdy zzdy0, zzzy[] arr_zzzy) {
        int v12;
        int v9;
        int v2;
        while(zzdy0.zza() > 1) {
            int v1 = 0;
            while(true) {
                if(zzdy0.zza() == 0) {
                    v2 = -1;
                    break;
                }
                int v3 = zzdy0.zzk();
                v1 += v3;
                if(v3 != 0xFF) {
                    v2 = v1;
                    break;
                }
            }
            int v4 = 0;
            do {
                if(zzdy0.zza() == 0) {
                    v4 = -1;
                    break;
                }
                int v5 = zzdy0.zzk();
                v4 += v5;
            }
            while(v5 == 0xFF);
            int v6 = zzdy0.zzc() + v4;
            if(v4 == -1 || v4 > zzdy0.zza()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                v6 = zzdy0.zzd();
            }
            else if(v2 == 4 && v4 >= 8) {
                int v7 = zzdy0.zzk();
                int v8 = zzdy0.zzo();
                if(v8 == 49) {
                    v9 = zzdy0.zze();
                    v8 = 49;
                }
                else {
                    v9 = 0;
                }
                int v10 = zzdy0.zzk();
                if(v8 == 0x2F) {
                    zzdy0.zzG(1);
                    v8 = 0x2F;
                }
                int v11 = v7 != 0xB5 || v8 != 0x2F && v8 != 49 || v10 != 3 ? 0 : 1;
                if(v8 == 49) {
                    if(v9 != 1195456820) {
                        v12 = 0;
                    }
                    v11 &= v12;
                }
                if(v11 != 0) {
                    zzyi.zzb(v, zzdy0, arr_zzzy);
                }
            }
            v12 = 1;
            zzdy0.zzF(v6);
        }
    }

    public static void zzb(long v, zzdy zzdy0, zzzy[] arr_zzzy) {
        int v1 = zzdy0.zzk();
        if((v1 & 0x40) != 0) {
            zzdy0.zzG(1);
            int v2 = (v1 & 0x1F) * 3;
            int v3 = zzdy0.zzc();
            for(int v4 = 0; v4 < arr_zzzy.length; ++v4) {
                zzzy zzzy0 = arr_zzzy[v4];
                zzdy0.zzF(v3);
                zzzy0.zzq(zzdy0, v2);
                if(v != 0x8000000000000001L) {
                    zzzy0.zzs(v, 1, v2, 0, null);
                }
            }
        }
    }
}

