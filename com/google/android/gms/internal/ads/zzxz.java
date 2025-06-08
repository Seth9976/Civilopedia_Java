package com.google.android.gms.internal.ads;

public final class zzxz {
    public static final int[] a;
    public static final int zza;

    static {
        zzxz.a = new int[]{2002, 2000, 0x780, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 0x800};
    }

    public static zzxy zza(zzdx zzdx0) {
        int v2;
        int v = zzdx0.zzc(16);
        int v1 = zzdx0.zzc(16);
        if(v1 == 0xFFFF) {
            v1 = zzdx0.zzc(24);
            v2 = 7;
        }
        else {
            v2 = 4;
        }
        int v3 = v == 44097 ? v1 + v2 + 2 : v1 + v2;
        if(zzdx0.zzc(2) == 3) {
            while(true) {
                zzdx0.zzc(2);
                if(!zzdx0.zzl()) {
                    break;
                }
            }
        }
        int v4 = zzdx0.zzc(10);
        if(zzdx0.zzl() && zzdx0.zzc(3) > 0) {
            zzdx0.zzj(2);
        }
        int v5 = zzdx0.zzl() ? 48000 : 44100;
        int v6 = zzdx0.zzc(4);
        int[] arr_v = zzxz.a;
        if(v5 == 44100 && v6 == 13) {
            return new zzxy(v5, v3, arr_v[13]);
        }
        if(v5 == 48000 && v6 < 14) {
            int v7 = arr_v[v6];
            if(v4 % 5 != 1) {
                switch(v4 % 5) {
                    case 2: {
                        return v6 != 8 && v6 != 11 ? new zzxy(v5, v3, v7) : new zzxy(v5, v3, v7 + 1);
                    }
                    case 3: {
                        break;
                    }
                    case 4: {
                        return v6 != 3 && v6 != 8 && v6 != 11 ? new zzxy(v5, v3, v7) : new zzxy(v5, v3, v7 + 1);
                    }
                    default: {
                        return new zzxy(v5, v3, v7);
                    }
                }
            }
            return v6 == 3 || v6 == 8 ? new zzxy(v5, v3, v7 + 1) : new zzxy(v5, v3, v7);
        }
        return new zzxy(v5, v3, 0);
    }

    public static void zzb(int v, zzdy zzdy0) {
        zzdy0.zzC(7);
        byte[] arr_b = zzdy0.zzH();
        arr_b[0] = -84;
        arr_b[1] = 0x40;
        arr_b[2] = -1;
        arr_b[3] = -1;
        arr_b[4] = (byte)(v >> 16 & 0xFF);
        arr_b[5] = (byte)(v >> 8 & 0xFF);
        arr_b[6] = (byte)(v & 0xFF);
    }
}

