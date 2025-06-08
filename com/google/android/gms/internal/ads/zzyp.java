package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzyp {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int zza;

    static {
        zzyp.a = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        zzyp.b = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        zzyp.c = new int[]{0x40, 0x70, 0x80, 0xC0, 0xE0, 0x100, 0x180, 0x1C0, 0x200, 640, 0x300, 0x380, 0x400, 0x480, 0x500, 0x600, 0x780, 0x800, 0x900, 0xA00, 0xA80, 0xB00, 0xB07, 0xB80, 0xC00, 0xF00, 0x1000, 0x1800, 0x1E00};
    }

    public static zzad zza(byte[] arr_b, String s, String s1, zzv zzv0) {
        zzdx zzdx0;
        int v = 0;
        int v1 = -1;
        if(arr_b[0] == 0x7F) {
            zzdx0 = new zzdx(arr_b, arr_b.length);
        }
        else {
            byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
            switch(arr_b1[0]) {
                case -2: 
                case -1: {
                    for(int v2 = 0; v2 < arr_b1.length - 1; v2 += 2) {
                        byte b = arr_b1[v2];
                        arr_b1[v2] = arr_b1[v2 + 1];
                        arr_b1[v2 + 1] = b;
                    }
                }
            }
            zzdx0 = new zzdx(arr_b1, arr_b1.length);
            if(arr_b1[0] == 0x1F) {
                zzdx zzdx1 = new zzdx(arr_b1, arr_b1.length);
                while(zzdx1.zza() >= 16) {
                    zzdx1.zzj(2);
                    zzdx0.zze(zzdx1.zzc(14), 14);
                }
            }
            zzdx0.zzg(arr_b1, arr_b1.length);
        }
        zzdx0.zzj(60);
        int v3 = zzyp.a[zzdx0.zzc(6)];
        int v4 = zzyp.b[zzdx0.zzc(4)];
        int v5 = zzdx0.zzc(5);
        if(v5 < 29) {
            v1 = zzyp.c[v5] * 1000 / 2;
        }
        zzdx0.zzj(10);
        if(zzdx0.zzc(2) > 0) {
            v = 1;
        }
        zzab zzab0 = new zzab();
        zzab0.zzH(s);
        zzab0.zzS("audio/vnd.dts");
        zzab0.zzv(v1);
        zzab0.zzw(v3 + v);
        zzab0.zzT(v4);
        zzab0.zzB(null);
        zzab0.zzK(s1);
        return zzab0.zzY();
    }
}

