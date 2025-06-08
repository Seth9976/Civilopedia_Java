package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzza {
    public static int zza(zzdy zzdy0, int v) {
        switch(v) {
            case 1: {
                return 0xC0;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 0x240 << v - 2;
            }
            case 6: {
                return zzdy0.zzk() + 1;
            }
            case 7: {
                return zzdy0.zzo() + 1;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return 0x100 << v - 8;
            }
            default: {
                return -1;
            }
        }
    }

    public static long zzb(zzys zzys0, zzze zzze0) throws IOException {
        long v2;
        zzys0.zzj();
        boolean z = true;
        ((zzyl)zzys0).zzl(1, false);
        byte[] arr_b = new byte[1];
        ((zzyl)zzys0).zzm(arr_b, 0, 1, false);
        int v = arr_b[0] & 1;
        ((zzyl)zzys0).zzl(2, false);
        int v1 = 1 == v ? 7 : 6;
        zzdy zzdy0 = new zzdy(v1);
        zzdy0.zzE(zzyv.zza(zzys0, zzdy0.zzH(), 0, v1));
        zzys0.zzj();
        zzyz zzyz0 = new zzyz();
        if(1 != v) {
            z = false;
        }
        try {
            v2 = zzdy0.zzu();
        }
        catch(NumberFormatException unused_ex) {
            throw zzbp.zza(null, null);
        }
        if(!z) {
            v2 *= (long)zzze0.zzb;
        }
        zzyz0.zza = v2;
        return v2;
    }

    public static boolean zzc(zzdy zzdy0, zzze zzze0, int v, zzyz zzyz0) {
        long v6;
        int v1 = zzdy0.zzc();
        long v2 = zzdy0.zzs();
        if(v2 >>> 16 != ((long)v)) {
            return false;
        }
        int v3 = (int)(v2 >> 8 & 15L);
        int v4 = (int)(15L & v2 >> 4);
        int v5 = (int)(v2 >> 1 & 7L);
        if(v4 > 7) {
            if(v4 <= 10 && zzze0.zzg == 2) {
            label_11:
                if((v5 == 0 || v5 == zzze0.zzi) && (v2 & 1L) != 1L) {
                    try {
                        v6 = zzdy0.zzu();
                        if((v2 >>> 16 & 1L) != 1L) {
                            goto label_14;
                        }
                        goto label_15;
                    }
                    catch(NumberFormatException unused_ex) {
                        return false;
                    }
                label_14:
                    v6 *= (long)zzze0.zzb;
                label_15:
                    zzyz0.zza = v6;
                    int v7 = zzza.zza(zzdy0, ((int)(v2 >> 12 & 15L)));
                    if(v7 != -1 && v7 <= zzze0.zzb) {
                        int v8 = zzze0.zze;
                        if(v3 == 0) {
                            return zzdy0.zzk() == zzeg.zzh(zzdy0.zzH(), v1, zzdy0.zzc() - 1, 0);
                        }
                        if(v3 <= 11) {
                            return v3 == zzze0.zzf ? zzdy0.zzk() == zzeg.zzh(zzdy0.zzH(), v1, zzdy0.zzc() - 1, 0) : false;
                        }
                        if(v3 == 12) {
                            return zzdy0.zzk() * 1000 == v8 ? zzdy0.zzk() == zzeg.zzh(zzdy0.zzH(), v1, zzdy0.zzc() - 1, 0) : false;
                        }
                        if(v3 <= 14) {
                            int v9 = zzdy0.zzo();
                            if(v3 == 14) {
                                v9 *= 10;
                            }
                            return v9 == v8 ? zzdy0.zzk() == zzeg.zzh(zzdy0.zzH(), v1, zzdy0.zzc() - 1, 0) : false;
                        }
                    }
                }
            }
        }
        else if(v4 == zzze0.zzg - 1) {
            goto label_11;
        }
        return false;
    }
}

