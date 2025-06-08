package com.google.android.gms.internal.ads;

public final class d0 implements e0 {
    public final zzyu a;
    public final zzzy b;
    public final z c;
    public final int d;
    public final byte[] e;
    public final zzdy f;
    public final int g;
    public final zzad h;
    public int i;
    public long j;
    public int k;
    public long l;
    public static final int[] m;
    public static final int[] n;

    static {
        d0.m = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        d0.n = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 0x1F, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 0x76, 130, 0x8F, 0x9D, 0xAD, 190, 209, 230, 0xFD, 279, 307, 337, 371, 408, 449, 494, 0x220, 598, 658, 724, 796, 876, 963, 1060, 0x48E, 0x502, 0x583, 0x610, 1707, 0x756, 2066, 0x8E0, 0x9C3, 0xABD, 0xBD0, 0xCFF, 3660, 0xFBA, 4428, 0x1307, 5358, 0x1706, 6484, 7132, 7845, 8630, 9493, 10442, 0x2CDF, 0x315B, 0x364B, 0x3BB9, 0x41B2, 18500, 20350, 0x5771, 0x602F, 27086, 0x7462, 0x7FFF};
    }

    public d0(zzyu zzyu0, zzzy zzzy0, z z0) {
        this.a = zzyu0;
        this.b = zzzy0;
        this.c = z0;
        int v = z0.c;
        int v1 = Math.max(1, v / 10);
        this.g = v1;
        zzdy zzdy0 = new zzdy(((byte[])z0.f));
        zzdy0.zzi();
        int v2 = zzdy0.zzi();
        this.d = v2;
        int v3 = z0.b;
        int v4 = z0.d;
        int v5 = (v4 - v3 * 4) * 8 / (z0.e * v3) + 1;
        if(v2 != v5) {
            throw zzbp.zza(("Expected frames per block: " + v5 + "; got: " + v2), null);
        }
        int v6 = zzeg.zze(v1, v2);
        this.e = new byte[v6 * v4];
        this.f = new zzdy((v2 + v2) * v3 * v6);
        int v7 = v4 * v * 8 / v2;
        zzab zzab0 = new zzab();
        zzab0.zzS("audio/raw");
        zzab0.zzv(v7);
        zzab0.zzO(v7);
        zzab0.zzL((v1 + v1) * v3);
        zzab0.zzw(v3);
        zzab0.zzT(v);
        zzab0.zzN(2);
        this.h = zzab0.zzY();
    }

    @Override  // com.google.android.gms.internal.ads.e0
    public final boolean a(zzys zzys0, long v) {
        boolean z2;
        zzdy zzdy0;
        byte[] arr_b;
        boolean z1;
        z z0 = this.c;
        int v1 = this.g;
        int v2 = this.d;
        int v3 = zzeg.zze(v1 - this.k / (z0.b + z0.b), v2);
        int v4 = z0.d;
        int v5 = v3 * v4;
        if(v != 0L) {
            z1 = false;
            goto label_10;
        }
        while(true) {
            z1 = true;
        label_10:
            arr_b = this.e;
            if(z1) {
                break;
            }
            int v6 = this.i;
            if(v6 >= v5) {
                break;
            }
            int v7 = zzys0.zza(arr_b, this.i, ((int)Math.min(v5 - v6, v)));
            if(v7 == -1) {
                continue;
            }
            this.i += v7;
            goto label_10;
        }
        int v8 = this.i / v4;
        if(v8 > 0) {
            for(int v9 = 0; true; ++v9) {
                zzdy0 = this.f;
                if(v9 >= v8) {
                    break;
                }
                for(int v10 = 0; true; ++v10) {
                    int v11 = z0.b;
                    if(v10 >= v11) {
                        break;
                    }
                    byte[] arr_b1 = zzdy0.zzH();
                    int v12 = v10 * 4 + v9 * v4;
                    int v13 = v11 * 4 + v12;
                    int v14 = v4 / v11 - 4;
                    int v15 = (short)(arr_b[v12] & 0xFF | (arr_b[v12 + 1] & 0xFF) << 8);
                    int v16 = Math.min(arr_b[v12 + 2] & 0xFF, 88);
                    int[] arr_v = d0.n;
                    int v17 = arr_v[v16];
                    int v18 = v9 * v2 * v11 + v10;
                    int v19 = v18 + v18;
                    arr_b1[v19] = (byte)(v15 & 0xFF);
                    arr_b1[v19 + 1] = (byte)(v15 >> 8);
                    int v20 = v16;
                    for(int v21 = 0; v21 < v14 + v14; ++v21) {
                        int v22 = arr_b[v21 / 2 % 4 + (v21 / 8 * v11 * 4 + v13)];
                        int v23 = v21 % 2 == 0 ? v22 & 15 : (v22 & 0xFF) >> 4;
                        v15 = zzeg.zzf(v15 + ((v23 & 8) == 0 ? ((v23 & 7) * 2 + 1) * v17 >> 3 : -(((v23 & 7) * 2 + 1) * v17 >> 3)), 0xFFFF8000, 0x7FFF);
                        v19 = v11 * 2 + v19;
                        arr_b1[v19] = (byte)(v15 & 0xFF);
                        arr_b1[v19 + 1] = (byte)(v15 >> 8);
                        v20 = zzeg.zzf(v20 + d0.m[v23], 0, 88);
                        v17 = arr_v[v20];
                    }
                }
            }
            z2 = z1;
            int v24 = (v2 * v8 + v2 * v8) * z0.b;
            zzdy0.zzF(0);
            zzdy0.zzE(v24);
            this.i -= v8 * v4;
            int v25 = zzdy0.zzd();
            zzzw.zzb(this.b, zzdy0, v25);
            int v26 = this.k + v25;
            this.k = v26;
            if(v26 / (z0.b + z0.b) >= v1) {
                this.b(v1);
            }
        }
        else {
            z2 = z1;
        }
        if(z2) {
            int v27 = this.k / (z0.b + z0.b);
            if(v27 > 0) {
                this.b(v27);
            }
        }
        return z2;
    }

    public final void b(int v) {
        long v1 = this.j;
        long v2 = zzeg.zzw(this.l, 1000000L, this.c.c);
        int v3 = (v + v) * this.c.b;
        this.b.zzs(v1 + v2, 1, v3, this.k - v3, null);
        this.l += (long)v;
        this.k -= v3;
    }

    @Override  // com.google.android.gms.internal.ads.e0
    public final void zza(int v, long v1) {
        h0 h00 = new h0(this.c, this.d, ((long)v), v1);
        this.a.zzL(h00);
        this.b.zzk(this.h);
    }

    @Override  // com.google.android.gms.internal.ads.e0
    public final void zzb(long v) {
        this.i = 0;
        this.j = v;
        this.k = 0;
        this.l = 0L;
    }
}

