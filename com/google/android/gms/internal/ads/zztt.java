package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

public final class zztt {
    public final Random a;
    public final int[] b;
    public final int[] c;

    public zztt(int v) {
        this(new Random());
    }

    public zztt(Random random0) {
        this(new int[0], random0);
    }

    public zztt(int[] arr_v, Random random0) {
        this.b = arr_v;
        this.a = random0;
        this.c = new int[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            this.c[arr_v[v]] = v;
        }
    }

    public final int zza() {
        return this.b.length <= 0 ? -1 : this.b[0];
    }

    public final int zzb() {
        return this.b.length <= 0 ? -1 : this.b[this.b.length - 1];
    }

    public final int zzc() {
        return this.b.length;
    }

    public final int zzd(int v) {
        int v1 = this.c[v] + 1;
        return v1 >= this.b.length ? -1 : this.b[v1];
    }

    public final int zze(int v) {
        int v1 = this.c[v] - 1;
        return v1 < 0 ? -1 : this.b[v1];
    }

    public final zztt zzf() {
        return new zztt(new Random(this.a.nextLong()));
    }

    public final zztt zzg(int v, int v1) {
        Random random0;
        int[] arr_v2;
        int[] arr_v = new int[v1];
        int[] arr_v1 = new int[v1];
        for(int v3 = 0; true; ++v3) {
            arr_v2 = this.b;
            random0 = this.a;
            if(v3 >= v1) {
                break;
            }
            arr_v[v3] = random0.nextInt(arr_v2.length + 1);
            int v4 = random0.nextInt(v3 + 1);
            arr_v1[v3] = arr_v1[v4];
            arr_v1[v4] = v3;
        }
        Arrays.sort(arr_v);
        int[] arr_v3 = new int[arr_v2.length + v1];
        int v5 = 0;
        int v6 = 0;
        for(int v2 = 0; v2 < arr_v2.length + v1; ++v2) {
            if(v5 >= v1 || v6 != arr_v[v5]) {
                int v7 = arr_v2[v6];
                arr_v3[v2] = v7;
                if(v7 >= 0) {
                    arr_v3[v2] = v7 + v1;
                }
                ++v6;
            }
            else {
                arr_v3[v2] = arr_v1[v5];
                ++v5;
            }
        }
        return new zztt(arr_v3, new Random(random0.nextLong()));
    }

    public final zztt zzh(int v, int v1) {
        int[] arr_v = this.b;
        int[] arr_v1 = new int[arr_v.length - v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            int v4 = arr_v[v2];
            if(v4 < 0 || v4 >= v1) {
                if(v4 >= 0) {
                    v4 -= v1;
                }
                arr_v1[v2 - v3] = v4;
            }
            else {
                ++v3;
            }
        }
        return new zztt(arr_v1, new Random(this.a.nextLong()));
    }
}

