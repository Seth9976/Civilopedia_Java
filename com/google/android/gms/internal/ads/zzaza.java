package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class zzaza {
    public static final byte[] a;
    public static final int[] b;
    public static final int[] c;

    static {
        zzaza.a = new byte[]{0, 0, 0, 1};
        zzaza.b = new int[]{96000, 88200, 0xFA00, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        zzaza.c = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int a(zzazg zzazg0) {
        int v = zzazg0.zza(4);
        if(v == 15) {
            return zzazg0.zza(24);
        }
        zzayz.zzc(v < 13);
        return zzaza.b[v];
    }

    public static Pair zza(byte[] arr_b) {
        zzazg zzazg0 = new zzazg(arr_b, arr_b.length);
        int v = zzazg0.zza(5);
        if(v == 0x1F) {
            v = zzazg0.zza(6) + 0x20;
        }
        int v1 = zzaza.a(zzazg0);
        int v2 = zzazg0.zza(4);
        if(v == 5 || v == 29) {
            v1 = zzaza.a(zzazg0);
            int v3 = zzazg0.zza(5);
            if(v3 == 0x1F) {
                v3 = zzazg0.zza(6) + 0x20;
            }
            if(v3 == 22) {
                v2 = zzazg0.zza(4);
            }
        }
        int v4 = zzaza.c[v2];
        zzayz.zzc(v4 != -1);
        return Pair.create(v1, v4);
    }

    public static byte[] zzb(byte[] arr_b, int v, int v1) {
        byte[] arr_b1 = new byte[v1 + 4];
        System.arraycopy(zzaza.a, 0, arr_b1, 0, 4);
        System.arraycopy(arr_b, v, arr_b1, 4, v1);
        return arr_b1;
    }
}

