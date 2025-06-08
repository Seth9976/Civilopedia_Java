package com.google.android.gms.internal.ads;

import A.f;
import java.util.Arrays;

public final class zzzo {
    public static final Object a;
    public static int[] b;
    public static final byte[] zza;
    public static final float[] zzb;

    static {
        zzzo.zza = new byte[]{0, 0, 0, 1};
        zzzo.zzb = new float[]{1.0f, 1.0f, 1.090909f, 0.909091f, 1.454545f, 1.212121f, 2.181818f, 1.818182f, 2.909091f, 2.424242f, 1.636364f, 1.363636f, 1.939394f, 1.616162f, 1.333333f, 1.5f, 2.0f};
        zzzo.a = new Object();
        zzzo.b = new int[10];
    }

    public static int zza(byte[] arr_b, int v, int v1, boolean[] arr_z) {
        boolean z2;
        boolean z1;
        int v2 = v1 - v;
        boolean z = false;
        zzcw.zzf(v2 >= 0);
        if(v2 == 0) {
            return v1;
        }
        if(arr_z[0]) {
            zzzo.zze(arr_z);
            return v - 3;
        }
        if(v2 > 1 && arr_z[1] && arr_b[v] == 1) {
            zzzo.zze(arr_z);
            return v - 2;
        }
        if(v2 > 2 && arr_z[2] && arr_b[v] == 0 && arr_b[v + 1] == 1) {
            zzzo.zze(arr_z);
            return v - 1;
        }
        for(int v3 = v + 2; v3 < v1 - 1; v3 += 3) {
            int v4 = arr_b[v3];
            if((v4 & 0xFE) == 0) {
                if(arr_b[v3 - 2] == 0 && arr_b[v3 - 1] == 0 && v4 == 1) {
                    zzzo.zze(arr_z);
                    return v3 - 2;
                }
                v3 += -2;
            }
        }
        if(v2 <= 2) {
            if(v2 != 2) {
                z1 = arr_z[1] && arr_b[v1 - 1] == 1;
            }
            else if(arr_z[2] && arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 1) {
                z1 = true;
            }
            else {
                z1 = false;
            }
        }
        else if(arr_b[v1 - 3] == 0 && arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 1) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        arr_z[0] = z1;
        if(v2 <= 1) {
            z2 = arr_z[2] && arr_b[v1 - 1] == 0;
        }
        else if(arr_b[v1 - 2] == 0 && arr_b[v1 - 1] == 0) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        arr_z[1] = z2;
        if(arr_b[v1 - 1] == 0) {
            z = true;
        }
        arr_z[2] = z;
        return v1;
    }

    public static int zzb(byte[] arr_b, int v) {
        Object object0 = zzzo.a;
        __monitor_enter(object0);
        int v1 = 0;
        int v2 = 0;
        try {
            while(v1 < v) {
                while(true) {
                    if(v1 < v - 2) {
                        if(arr_b[v1] == 0 && arr_b[v1 + 1] == 0 && arr_b[v1 + 2] == 3) {
                            break;
                        }
                        else {
                            ++v1;
                            continue;
                        }
                    }
                    v1 = v;
                    break;
                }
                if(v1 < v) {
                    int[] arr_v = zzzo.b;
                    int v4 = arr_v.length;
                    if(v4 <= v2) {
                        zzzo.b = Arrays.copyOf(arr_v, v4 + v4);
                    }
                    zzzo.b[v2] = v1;
                    v1 += 3;
                    ++v2;
                }
            }
            int v5 = v - v2;
            int v7 = 0;
            int v8 = 0;
            for(int v6 = 0; v6 < v2; ++v6) {
                int v9 = zzzo.b[v6] - v7;
                System.arraycopy(arr_b, v7, arr_b, v8, v9);
                int v10 = v8 + v9;
                arr_b[v10] = 0;
                v8 = v10 + 2;
                arr_b[v10 + 1] = 0;
                v7 += v9 + 3;
            }
            System.arraycopy(arr_b, v7, arr_b, v8, v5 - v8);
            return v5;
        }
        finally {
            __monitor_exit(object0);
        }
    }

    public static zzzm zzc(byte[] arr_b, int v, int v1) {
        zzzq zzzq0 = new zzzq(arr_b, 4, v1);
        int v2 = zzzq0.zzc();
        int v3 = zzzq0.zzc();
        zzzq0.zzd();
        return new zzzm(v2, v3, zzzq0.zzf());
    }

    public static zzzn zzd(byte[] arr_b, int v, int v1) {
        boolean z2;
        int v19;
        int v18;
        int v17;
        int v16;
        int v8;
        boolean z1;
        boolean z;
        int v7;
        zzzq zzzq0 = new zzzq(arr_b, v, v1);
        int v2 = zzzq0.zza(8);
        int v3 = zzzq0.zza(8);
        int v4 = zzzq0.zza(8);
        int v5 = zzzq0.zzc();
        int v6 = 1;
        switch(v2) {
            case 0x8A: {
                v2 = 0x8A;
                break;
            }
            case 44: 
            case 83: 
            case 86: 
            case 100: 
            case 110: 
            case 0x76: 
            case 0x7A: 
            case 0x80: 
            case 0xF4: {
                break;
            }
            default: {
                v7 = 1;
                z = false;
                goto label_39;
            }
        }
        v7 = zzzq0.zzc();
        if(v7 == 3) {
            z1 = zzzq0.zzf();
            v8 = 3;
        }
        else {
            v8 = v7;
            z1 = false;
        }
        zzzq0.zzc();
        zzzq0.zzc();
        zzzq0.zzd();
        if(zzzq0.zzf()) {
            for(int v9 = 0; v9 < (v8 == 3 ? 12 : 8); ++v9) {
                if(zzzq0.zzf()) {
                    int v10 = v9 >= 6 ? 0x40 : 16;
                    int v12 = 8;
                    int v13 = 8;
                    for(int v11 = 0; v11 < v10; ++v11) {
                        if(v12 != 0) {
                            v12 = (zzzq0.zzb() + v13 + 0x100) % 0x100;
                        }
                        if(v12 != 0) {
                            v13 = v12;
                        }
                    }
                }
            }
        }
        z = z1;
    label_39:
        int v14 = zzzq0.zzc();
        int v15 = zzzq0.zzc();
        if(v15 == 0) {
            v16 = v2;
            v17 = v3;
            v18 = 0;
            v19 = zzzq0.zzc() + 4;
            z2 = false;
        }
        else if(v15 == 1) {
            boolean z3 = zzzq0.zzf();
            zzzq0.zzb();
            zzzq0.zzb();
            v16 = v2;
            long v20 = (long)zzzq0.zzc();
            v17 = v3;
            for(int v21 = 0; ((long)v21) < v20; ++v21) {
                zzzq0.zzc();
            }
            z2 = z3;
            v18 = 1;
            v19 = 0;
        }
        else {
            v16 = v2;
            v17 = v3;
            v18 = v15;
            v19 = 0;
            z2 = false;
        }
        int v22 = zzzq0.zzc();
        zzzq0.zzd();
        int v23 = zzzq0.zzc();
        int v24 = zzzq0.zzc();
        int v25 = zzzq0.zzf();
        int v26 = 2 - v25;
        if(v25 == 0) {
            zzzq0.zzd();
        }
        zzzq0.zzd();
        int v27 = (v23 + 1) * 16;
        int v28 = (v24 + 1) * v26 * 16;
        if(zzzq0.zzf()) {
            int v29 = zzzq0.zzc();
            int v30 = zzzq0.zzc();
            int v31 = zzzq0.zzc();
            int v32 = zzzq0.zzc();
            if(v7 != 0) {
                if(v7 == 1) {
                    v6 = 2;
                }
                v26 *= v6;
                v6 = v7 == 3 ? 1 : 2;
            }
            v27 -= (v29 + v30) * v6;
            v28 -= (v31 + v32) * v26;
        }
        if(zzzq0.zzf() && zzzq0.zzf()) {
            int v33 = zzzq0.zza(8);
            if(v33 == 0xFF) {
                int v34 = zzzq0.zza(16);
                int v35 = zzzq0.zza(16);
                return v34 == 0 || v35 == 0 ? new zzzn(v16, v17, v4, v5, v22, v27, v28, 1.0f, z, ((boolean)v25), v14 + 4, v18, v19, z2) : new zzzn(v16, v17, v4, v5, v22, v27, v28, ((float)v34) / ((float)v35), z, ((boolean)v25), v14 + 4, v18, v19, z2);
            }
            if(v33 < 17) {
                return new zzzn(v16, v17, v4, v5, v22, v27, v28, zzzo.zzb[v33], z, ((boolean)v25), v14 + 4, v18, v19, z2);
            }
            f.p(v33, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
            return new zzzn(v16, v17, v4, v5, v22, v27, v28, 1.0f, z, ((boolean)v25), v14 + 4, v18, v19, z2);
        }
        return new zzzn(v16, v17, v4, v5, v22, v27, v28, 1.0f, z, ((boolean)v25), v14 + 4, v18, v19, z2);
    }

    public static void zze(boolean[] arr_z) {
        arr_z[0] = false;
        arr_z[1] = false;
        arr_z[2] = false;
    }
}

