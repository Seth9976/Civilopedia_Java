package com.google.android.gms.internal.ads;

import android.util.Log;

public final class zzxt {
    public static final int[] a;
    public static final int[] b;
    public static final int zza;

    static {
        zzxt.a = new int[]{96000, 88200, 0xFA00, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        zzxt.b = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int a(zzdx zzdx0) {
        int v = zzdx0.zzc(4);
        if(v == 15) {
            return zzdx0.zzc(24);
        }
        if(v >= 13) {
            throw zzbp.zza(null, null);
        }
        return zzxt.a[v];
    }

    public static zzxs zza(byte[] arr_b) throws zzbp {
        return zzxt.zzb(new zzdx(arr_b, arr_b.length), false);
    }

    public static zzxs zzb(zzdx zzdx0, boolean z) throws zzbp {
        int v6;
        int v = zzdx0.zzc(5);
        if(v == 0x1F) {
            v = zzdx0.zzc(6) + 0x20;
        }
        int v1 = zzxt.a(zzdx0);
        int v2 = zzdx0.zzc(4);
        String s = "mp4a.40." + v;
        int v3 = 22;
        if(v == 5 || v == 29) {
            v1 = zzxt.a(zzdx0);
            int v4 = zzdx0.zzc(5);
            if(v4 == 0x1F) {
                v4 = zzdx0.zzc(6) + 0x20;
            }
            v = v4;
            if(v == 22) {
                v2 = zzdx0.zzc(4);
            }
        }
        int v5 = 3;
        if(z) {
            if(v != 1 && v != 2 && v != 3 && v != 4 && v != 6 && (v != 7 && v != 17) && (v != 19 && v != 20 && v != 21 && v != 22 && v != 23)) {
                throw zzbp.zzc(("Unsupported audio object type: " + v));
            }
            if(zzdx0.zzl()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if(zzdx0.zzl()) {
                zzdx0.zzj(14);
            }
            boolean z1 = zzdx0.zzl();
            if(v2 == 0) {
                throw new UnsupportedOperationException();
            }
            switch(v) {
                case 6: {
                    v6 = 6;
                    zzdx0.zzj(3);
                    break;
                }
                case 20: {
                    v = 20;
                    v6 = 20;
                    zzdx0.zzj(3);
                    break;
                }
                default: {
                    v6 = v;
                }
            }
            if(z1) {
                if(v == 22) {
                    zzdx0.zzj(16);
                }
                else {
                    v3 = v;
                }
                if(v3 == 17 || (v3 == 19 || v3 == 20) || v3 == 23) {
                    zzdx0.zzj(3);
                }
                zzdx0.zzj(1);
            }
            switch(v6) {
                case 17: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: {
                    int v7 = zzdx0.zzc(2);
                    if(v7 == 2) {
                        v5 = 2;
                    }
                    else if(v7 != 3) {
                        break;
                    }
                    throw zzbp.zzc(("Unsupported epConfig: " + v5));
                }
            }
        }
        int v8 = zzxt.b[v2];
        if(v8 == -1) {
            throw zzbp.zza(null, null);
        }
        return new zzxs(v1, v8, s);
    }
}

