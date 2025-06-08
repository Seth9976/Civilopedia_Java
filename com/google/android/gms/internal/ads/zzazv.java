package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzazv {
    public final List zza;
    public final int zzb;

    public zzazv(List list0, int v) {
        this.zza = list0;
        this.zzb = v;
    }

    public static zzazv zza(zzazh zzazh0) throws zzarw {
        try {
            zzazh0.zzw(21);
            int v = zzazh0.zzg();
            int v1 = zzazh0.zzg();
            int v2 = zzazh0.zzc();
            int v4 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                zzazh0.zzw(1);
                int v5 = zzazh0.zzj();
                for(int v6 = 0; v6 < v5; ++v6) {
                    int v7 = zzazh0.zzj();
                    v4 += v7 + 4;
                    zzazh0.zzw(v7);
                }
            }
            zzazh0.zzv(v2);
            byte[] arr_b = new byte[v4];
            int v9 = 0;
            for(int v8 = 0; v8 < v1; ++v8) {
                zzazh0.zzw(1);
                int v10 = zzazh0.zzj();
                for(int v11 = 0; v11 < v10; ++v11) {
                    int v12 = zzazh0.zzj();
                    System.arraycopy(zzazf.zza, 0, arr_b, v9, 4);
                    System.arraycopy(zzazh0.zza, zzazh0.zzc(), arr_b, v9 + 4, v12);
                    v9 = v9 + 4 + v12;
                    zzazh0.zzw(v12);
                }
            }
            return new zzazv((v4 == 0 ? null : Collections.singletonList(arr_b)), (v & 3) + 1);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
        }
        throw new zzarw("Error parsing HEVC config", arrayIndexOutOfBoundsException0);
    }
}

