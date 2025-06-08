package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Collections;
import java.util.List;

public final class zzzh {
    public final List zza;
    public final int zzb;
    public final float zzc;
    public final String zzd;

    public zzzh(List list0, int v, float f, String s) {
        this.zza = list0;
        this.zzb = v;
        this.zzc = f;
        this.zzd = s;
    }

    public static zzzh zza(zzdy zzdy0) throws zzbp {
        float f1;
        boolean z2;
        int v33;
        int v29;
        try {
            zzdy0.zzG(21);
            int v = zzdy0.zzk();
            int v1 = zzdy0.zzk();
            int v2 = zzdy0.zzc();
            int v4 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                zzdy0.zzG(1);
                int v5 = zzdy0.zzo();
                for(int v6 = 0; v6 < v5; ++v6) {
                    int v7 = zzdy0.zzo();
                    v4 += v7 + 4;
                    zzdy0.zzG(v7);
                }
            }
            zzdy0.zzF(v2);
            byte[] arr_b = new byte[v4];
            String s = null;
            int v8 = 0;
            float f = 1.0f;
            int v9 = 0;
            while(v8 < v1) {
                int v10 = zzdy0.zzk() & 0x7F;
                int v11 = zzdy0.zzo();
                int v12 = 0;
                while(v12 < v11) {
                    int v13 = zzdy0.zzo();
                    System.arraycopy(zzzo.zza, 0, arr_b, v9, 4);
                    System.arraycopy(zzdy0.zzH(), zzdy0.zzc(), arr_b, v9 + 4, v13);
                    if(v10 != 33 || v12 != 0) {
                        v29 = v10;
                    }
                    else {
                        zzzq zzzq0 = new zzzq(arr_b, v9 + 6, v9 + 4 + v13);
                        zzzq0.zze(4);
                        int v14 = zzzq0.zza(3);
                        zzzq0.zzd();
                        int v15 = zzzq0.zza(2);
                        boolean z = zzzq0.zzf();
                        int v16 = zzzq0.zza(5);
                        int v17 = 0;
                        for(int v18 = 0; v18 < 0x20; ++v18) {
                            if(zzzq0.zzf()) {
                                v17 |= 1 << v18;
                            }
                        }
                        int[] arr_v = new int[6];
                        for(int v19 = 0; v19 < 6; ++v19) {
                            arr_v[v19] = zzzq0.zza(8);
                        }
                        int v20 = zzzq0.zza(8);
                        int v22 = 0;
                        for(int v21 = 0; v21 < v14; ++v21) {
                            if(zzzq0.zzf()) {
                                v22 += 89;
                            }
                            if(zzzq0.zzf()) {
                                v22 += 8;
                            }
                        }
                        zzzq0.zze(v22);
                        if(v14 > 0) {
                            zzzq0.zze(v14 * -2 + 16);
                        }
                        zzzq0.zzc();
                        if(zzzq0.zzc() == 3) {
                            zzzq0.zzd();
                        }
                        zzzq0.zzc();
                        zzzq0.zzc();
                        if(zzzq0.zzf()) {
                            zzzq0.zzc();
                            zzzq0.zzc();
                            zzzq0.zzc();
                            zzzq0.zzc();
                        }
                        zzzq0.zzc();
                        zzzq0.zzc();
                        int v23 = zzzq0.zzc();
                        for(int v24 = zzzq0.zzf() ? 0 : v14; v24 <= v14; ++v24) {
                            zzzq0.zzc();
                            zzzq0.zzc();
                            zzzq0.zzc();
                        }
                        zzzq0.zzc();
                        zzzq0.zzc();
                        zzzq0.zzc();
                        zzzq0.zzc();
                        zzzq0.zzc();
                        zzzq0.zzc();
                        if(zzzq0.zzf() && zzzq0.zzf()) {
                            for(int v25 = 0; v25 < 4; ++v25) {
                                for(int v26 = 0; v26 < 6; v26 += (v25 == 3 ? 3 : 1)) {
                                    if(zzzq0.zzf()) {
                                        int v27 = Math.min(0x40, 1 << v25 * 2 + 4);
                                        if(v25 > 1) {
                                            zzzq0.zzb();
                                        }
                                        for(int v28 = 0; v28 < v27; ++v28) {
                                            zzzq0.zzb();
                                        }
                                    }
                                    else {
                                        zzzq0.zzc();
                                    }
                                }
                            }
                        }
                        v29 = 33;
                        zzzq0.zze(2);
                        if(zzzq0.zzf()) {
                            zzzq0.zze(8);
                            zzzq0.zzc();
                            zzzq0.zzc();
                            zzzq0.zzd();
                        }
                        int v30 = zzzq0.zzc();
                        int v31 = 0;
                        int v32 = 0;
                        for(boolean z1 = false; v32 < v30; z1 = z2) {
                            if(v32 != 0) {
                                z1 = zzzq0.zzf();
                            }
                            if(z1) {
                                zzzq0.zzd();
                                zzzq0.zzc();
                                v33 = v30;
                                for(int v34 = 0; v34 <= v31; ++v34) {
                                    if(!zzzq0.zzf()) {
                                        zzzq0.zzd();
                                    }
                                }
                                z2 = true;
                            }
                            else {
                                v33 = v30;
                                int v35 = zzzq0.zzc();
                                int v36 = zzzq0.zzc();
                                z2 = false;
                                for(int v37 = 0; v37 < v35; ++v37) {
                                    zzzq0.zzc();
                                    zzzq0.zzd();
                                }
                                for(int v38 = 0; v38 < v36; ++v38) {
                                    zzzq0.zzc();
                                    zzzq0.zzd();
                                }
                                v31 = v35 + v36;
                            }
                            ++v32;
                            v30 = v33;
                        }
                        if(zzzq0.zzf()) {
                            for(int v39 = 0; v39 < zzzq0.zzc(); ++v39) {
                                zzzq0.zze(v23 + 5);
                            }
                        }
                        zzzq0.zze(2);
                        if(zzzq0.zzf()) {
                            if(zzzq0.zzf()) {
                                int v40 = zzzq0.zza(8);
                                if(v40 == 0xFF) {
                                    int v41 = zzzq0.zza(16);
                                    int v42 = zzzq0.zza(16);
                                    if(v41 != 0 && v42 != 0) {
                                        f1 = ((float)v41) / ((float)v42);
                                        goto label_180;
                                    }
                                }
                                else if(v40 < 17) {
                                    f1 = zzzo.zzb[v40];
                                    goto label_180;
                                }
                                else {
                                    Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + v40);
                                }
                            }
                            f1 = 1.0f;
                        label_180:
                            if(zzzq0.zzf()) {
                                zzzq0.zzd();
                            }
                            if(zzzq0.zzf()) {
                                zzzq0.zze(4);
                                if(zzzq0.zzf()) {
                                    zzzq0.zze(24);
                                }
                            }
                            if(zzzq0.zzf()) {
                                zzzq0.zzc();
                                zzzq0.zzc();
                            }
                            zzzq0.zzd();
                            zzzq0.zzf();
                        }
                        else {
                            f1 = 1.0f;
                        }
                        s = zzcy.zzb(v15, z, v16, v17, arr_v, v20);
                        f = f1;
                        v12 = 0;
                    }
                    v9 = v9 + 4 + v13;
                    zzdy0.zzG(v13);
                    ++v12;
                    v10 = v29;
                }
                ++v8;
            }
            return new zzzh((v4 == 0 ? Collections.emptyList() : Collections.singletonList(arr_b)), (v & 3) + 1, f, s);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
        }
        throw zzbp.zza("Error parsing HEVC config", arrayIndexOutOfBoundsException0);
    }
}

