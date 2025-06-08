package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzvi {
    public final int[] a;
    public final zzty[] b;
    public final int[] c;
    public final int[][][] d;
    public final zzty e;

    public zzvi(int[] arr_v, zzty[] arr_zzty, int[] arr_v1, int[][][] arr3_v, zzty zzty0) {
        this.a = arr_v;
        this.b = arr_zzty;
        this.d = arr3_v;
        this.c = arr_v1;
        this.e = zzty0;
    }

    public final int zza(int v, int v1, boolean z) {
        int[][][] arr3_v;
        zzty[] arr_zzty = this.b;
        arr_zzty[v].zzb(v1);
        int[] arr_v = new int[1];
        int v2 = 0;
        int v4 = 0;
        for(int v3 = 0; true; ++v3) {
            arr3_v = this.d;
            if(v3 > 0) {
                break;
            }
            if((arr3_v[v][v1][v3] & 7) == 4) {
                arr_v[v4] = v3;
                ++v4;
            }
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, v4);
        String s = null;
        int v5 = 0;
        int v7 = 16;
        for(int v6 = 0; v2 < arr_v1.length; ++v6) {
            int v8 = arr_v1[v2];
            String s1 = arr_zzty[v].zzb(v1).zzb(v8).zzm;
            if(v6 == 0) {
                s = s1;
            }
            else {
                v5 |= !zzeg.zzS(s, s1);
            }
            v7 = Math.min(v7, arr3_v[v][v1][v2] & 24);
            ++v2;
        }
        return v5 == 0 ? v7 : Math.min(v7, this.c[v]);
    }

    public final int zzb(int v, int v1, int v2) {
        return this.d[v][v1][v2];
    }

    public final int zzc(int v) {
        return this.a[v];
    }

    public final zzty zzd(int v) {
        return this.b[v];
    }

    public final zzty zze() {
        return this.e;
    }
}

