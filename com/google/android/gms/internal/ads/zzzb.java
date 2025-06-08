package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

public final class zzzb {
    public static zzbl zza(zzys zzys0, boolean z) throws IOException {
        zzbl zzbl0 = new zzzi().zza(zzys0, (z ? null : zzaca.zza));
        return zzbl0 == null || zzbl0.zza() == 0 ? null : zzbl0;
    }

    public static zzzd zzb(zzdy zzdy0) {
        zzdy0.zzG(1);
        int v = zzdy0.zzm();
        long v1 = ((long)zzdy0.zzc()) + ((long)v);
        long[] arr_v = new long[v / 18];
        long[] arr_v1 = new long[v / 18];
        for(int v2 = 0; v2 < v / 18; ++v2) {
            long v3 = zzdy0.zzr();
            if(v3 == -1L) {
                arr_v = Arrays.copyOf(arr_v, v2);
                arr_v1 = Arrays.copyOf(arr_v1, v2);
                break;
            }
            arr_v[v2] = v3;
            arr_v1[v2] = zzdy0.zzr();
            zzdy0.zzG(2);
        }
        zzdy0.zzG(((int)(v1 - ((long)zzdy0.zzc()))));
        return new zzzd(arr_v, arr_v1);
    }
}

