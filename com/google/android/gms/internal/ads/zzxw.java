package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzxw {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int zza;

    static {
        zzxw.a = new int[]{1, 2, 3, 6};
        zzxw.b = new int[]{48000, 44100, 32000};
        zzxw.c = new int[]{24000, 22050, 16000};
        zzxw.d = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        zzxw.e = new int[]{0x20, 40, 0x30, 56, 0x40, 80, 0x60, 0x70, 0x80, 0xA0, 0xC0, 0xE0, 0x100, 320, 0x180, 0x1C0, 0x200, 0x240, 640};
        zzxw.f = new int[]{69, 87, 104, 0x79, 0x8B, 0xAE, 0xD0, 0xF3, 278, 348, 417, 487, 557, 696, 835, 0x3CF, 0x45A, 0x4E5, 0x571};
    }

    public static int a(int v, int v1) {
        if(v >= 0 && v < 3 && v1 >= 0 && v1 / 2 < 19) {
            int v2 = zzxw.b[v];
            if(v2 == 44100) {
                int v3 = zzxw.f[v1 / 2] + (v1 & 1);
                return v3 + v3;
            }
            int v4 = zzxw.e[v1 / 2];
            return v2 == 32000 ? v4 * 6 : v4 * 4;
        }
        return -1;
    }

    public static int zza(ByteBuffer byteBuffer0) {
        int v = 3;
        if((byteBuffer0.get(byteBuffer0.position() + 5) & 0xF8) >> 3 > 10) {
            if((byteBuffer0.get(byteBuffer0.position() + 4) & 0xC0) >> 6 != 3) {
                v = (byteBuffer0.get(byteBuffer0.position() + 4) & 0x30) >> 4;
            }
            return zzxw.a[v] * 0x100;
        }
        return 0x600;
    }

    public static int zzb(byte[] arr_b) {
        if(arr_b.length < 6) {
            return -1;
        }
        if((arr_b[5] & 0xF8) >> 3 > 10) {
            int v = (arr_b[3] & 0xFF | (arr_b[2] & 7) << 8) + 1;
            return v + v;
        }
        return zzxw.a((arr_b[4] & 0xC0) >> 6, arr_b[4] & 0x3F);
    }

    public static zzad zzc(zzdy zzdy0, String s, String s1, zzv zzv0) {
        int v = zzxw.b[(zzdy0.zzk() & 0xC0) >> 6];
        int v1 = zzdy0.zzk();
        int v2 = zzxw.d[(v1 & 56) >> 3];
        if((v1 & 4) != 0) {
            ++v2;
        }
        zzab zzab0 = new zzab();
        zzab0.zzH(s);
        zzab0.zzS("audio/ac3");
        zzab0.zzw(v2);
        zzab0.zzT(v);
        zzab0.zzB(zzv0);
        zzab0.zzK(s1);
        return zzab0.zzY();
    }

    public static zzad zzd(zzdy zzdy0, String s, String s1, zzv zzv0) {
        zzdy0.zzG(2);
        int v = zzxw.b[(zzdy0.zzk() & 0xC0) >> 6];
        int v1 = zzdy0.zzk();
        int v2 = zzxw.d[(v1 & 14) >> 1];
        if((v1 & 1) != 0) {
            ++v2;
        }
        if((zzdy0.zzk() & 30) >> 1 > 0 && (2 & zzdy0.zzk()) != 0) {
            v2 += 2;
        }
        String s2 = zzdy0.zza() <= 0 || (zzdy0.zzk() & 1) == 0 ? "audio/eac3" : "audio/eac3-joc";
        zzab zzab0 = new zzab();
        zzab0.zzH(s);
        zzab0.zzS(s2);
        zzab0.zzw(v2);
        zzab0.zzT(v);
        zzab0.zzB(zzv0);
        zzab0.zzK(s1);
        return zzab0.zzY();
    }

    public static zzxv zze(zzdx zzdx0) {
        int v14;
        int v11;
        int v6;
        int v5;
        int v4;
        zzdx0.zzj(40);
        int v = zzdx0.zzc(5);
        zzdx0.zzh(zzdx0.zzb());
        int[] arr_v = zzxw.d;
        int[] arr_v1 = zzxw.b;
        int v1 = -1;
        if(v > 10) {
            zzdx0.zzj(16);
            switch(zzdx0.zzc(2)) {
                case 0: {
                    v1 = 0;
                    break;
                }
                case 1: {
                    v1 = 1;
                    break;
                }
                case 2: {
                    v1 = 2;
                }
            }
            zzdx0.zzj(3);
            int v2 = zzdx0.zzc(11);
            int v3 = zzdx0.zzc(2);
            if(v3 == 3) {
                v4 = zzxw.c[zzdx0.zzc(2)];
                v5 = 6;
                v6 = 3;
            }
            else {
                v6 = zzdx0.zzc(2);
                int v7 = zzxw.a[v6];
                v4 = arr_v1[v3];
                v5 = v7;
            }
            int v8 = zzdx0.zzc(3);
            int v9 = zzdx0.zzl();
            int v10 = arr_v[v8] + v9;
            zzdx0.zzj(10);
            if(zzdx0.zzl()) {
                zzdx0.zzj(8);
            }
            if(v8 == 0) {
                zzdx0.zzj(5);
                if(zzdx0.zzl()) {
                    zzdx0.zzj(8);
                }
                v11 = 0;
                v8 = 0;
            }
            else {
                v11 = v8;
            }
            if(v1 == 1) {
                if(zzdx0.zzl()) {
                    zzdx0.zzj(16);
                }
                v1 = 1;
            }
            if(zzdx0.zzl()) {
                if(v11 > 2) {
                    zzdx0.zzj(2);
                }
                if((v11 & 1) != 0 && v11 > 2) {
                    zzdx0.zzj(6);
                }
                if((v11 & 4) != 0) {
                    zzdx0.zzj(6);
                }
                if(v9 != 0 && zzdx0.zzl()) {
                    zzdx0.zzj(5);
                }
                if(v1 == 0) {
                    if(zzdx0.zzl()) {
                        zzdx0.zzj(6);
                    }
                    if(v11 == 0 && zzdx0.zzl()) {
                        zzdx0.zzj(6);
                    }
                    if(zzdx0.zzl()) {
                        zzdx0.zzj(6);
                    }
                    int v12 = zzdx0.zzc(2);
                    if(v12 == 1) {
                        zzdx0.zzj(5);
                    }
                    else if(v12 == 2) {
                        zzdx0.zzj(12);
                    }
                    else if(v12 == 3) {
                        int v13 = zzdx0.zzc(5);
                        if(zzdx0.zzl()) {
                            zzdx0.zzj(5);
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(4);
                            }
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(4);
                            }
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(4);
                            }
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(4);
                            }
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(4);
                            }
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(4);
                            }
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(4);
                            }
                            if(zzdx0.zzl()) {
                                if(zzdx0.zzl()) {
                                    zzdx0.zzj(4);
                                }
                                if(zzdx0.zzl()) {
                                    zzdx0.zzj(4);
                                }
                            }
                        }
                        if(zzdx0.zzl()) {
                            zzdx0.zzj(5);
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(7);
                                if(zzdx0.zzl()) {
                                    zzdx0.zzj(8);
                                }
                            }
                        }
                        zzdx0.zzj((v13 + 2) * 8);
                        zzdx0.zzd();
                    }
                    if(v11 < 2) {
                        if(zzdx0.zzl()) {
                            zzdx0.zzj(14);
                        }
                        if(v8 == 0 && zzdx0.zzl()) {
                            zzdx0.zzj(14);
                        }
                    }
                    if(!zzdx0.zzl()) {
                        v14 = 0;
                    }
                    else if(v6 == 0) {
                        zzdx0.zzj(5);
                        v14 = 0;
                        v6 = 0;
                    }
                    else {
                        for(int v15 = 0; v15 < v5; ++v15) {
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(5);
                            }
                        }
                        v14 = 0;
                    }
                }
                else {
                    v14 = v1;
                }
            }
            else {
                v14 = v1;
            }
            if(zzdx0.zzl()) {
                zzdx0.zzj(5);
                if(v11 == 2) {
                    zzdx0.zzj(4);
                    v11 = 2;
                }
                if(v11 >= 6) {
                    zzdx0.zzj(2);
                }
                if(zzdx0.zzl()) {
                    zzdx0.zzj(8);
                }
                if(v11 == 0 && zzdx0.zzl()) {
                    zzdx0.zzj(8);
                }
                if(v3 < 3) {
                    zzdx0.zzi();
                }
            }
            if(v14 == 0 && v6 != 3) {
                zzdx0.zzi();
            }
            if(v14 == 2 && (v6 == 3 || zzdx0.zzl())) {
                zzdx0.zzj(6);
            }
            return !zzdx0.zzl() || zzdx0.zzc(6) != 1 || zzdx0.zzc(8) != 1 ? new zzxv("audio/eac3", v10, v4, v2 * 2 + 2, v5 * 0x100) : new zzxv("audio/eac3-joc", v10, v4, v2 * 2 + 2, v5 * 0x100);
        }
        zzdx0.zzj(0x20);
        int v16 = zzdx0.zzc(2);
        int v17 = zzxw.a(v16, zzdx0.zzc(6));
        zzdx0.zzj(8);
        int v18 = zzdx0.zzc(3);
        if((v18 & 1) != 0 && v18 != 1) {
            zzdx0.zzj(2);
        }
        if((v18 & 4) != 0) {
            zzdx0.zzj(2);
        }
        if(v18 == 2) {
            zzdx0.zzj(2);
        }
        if(v16 < 3) {
            v1 = arr_v1[v16];
        }
        int v19 = zzdx0.zzl();
        return new zzxv((v16 == 3 ? null : "audio/ac3"), arr_v[v18] + v19, v1, v17, 0x600);
    }
}

