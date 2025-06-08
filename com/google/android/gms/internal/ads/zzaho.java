package com.google.android.gms.internal.ads;

public final class zzaho {
    public static int zza(byte[] arr_b, int v, int v1) {
        while(v < v1 && arr_b[v] != 71) {
            ++v;
        }
        return v;
    }

    public static long zzb(zzdy zzdy0, int v, int v1) {
        zzdy0.zzF(v);
        if(zzdy0.zza() < 5) {
            return 0x8000000000000001L;
        }
        int v2 = zzdy0.zze();
        if((0x800000 & v2) != 0) {
            return 0x8000000000000001L;
        }
        if((v2 >> 8 & 0x1FFF) != v1) {
            return 0x8000000000000001L;
        }
        if((v2 & 0x20) != 0 && zzdy0.zzk() >= 7 && zzdy0.zza() >= 7 && (zzdy0.zzk() & 16) == 16) {
            byte[] arr_b = new byte[6];
            zzdy0.zzB(arr_b, 0, 6);
            long v3 = ((long)arr_b[3]) & 0xFFL;
            return (((long)arr_b[1]) & 0xFFL) << 17 | (((long)arr_b[0]) & 0xFFL) << 25 | (((long)arr_b[2]) & 0xFFL) << 9 | v3 + v3 | (((long)arr_b[4]) & 0xFFL) >> 7;
        }
        return 0x8000000000000001L;
    }
}

