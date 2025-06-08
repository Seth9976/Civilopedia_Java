package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;

public final class zzafw implements zzaga {
    public final boolean a;
    public final zzdx b;
    public final zzdy c;
    public final String d;
    public String e;
    public zzzy f;
    public zzzy g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public zzzy t;
    public long u;
    public static final byte[] v;

    static {
        zzafw.v = new byte[]{73, 68, 51};
    }

    public zzafw(boolean z, String s) {
        this.b = new zzdx(new byte[7], 7);
        this.c = new zzdy(Arrays.copyOf(zzafw.v, 10));
        this.h = 0;
        this.i = 0;
        this.j = 0x100;
        this.m = -1;
        this.n = -1;
        this.q = 0x8000000000000001L;
        this.s = 0x8000000000000001L;
        this.a = z;
        this.d = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) throws zzbp {
        this.f.getClass();
    label_1:
        while(zzdy0.zza() > 0) {
            zzdy zzdy1 = this.c;
            zzdx zzdx0 = this.b;
            switch(this.h) {
                case 0: {
                    byte[] arr_b = zzdy0.zzH();
                    int v4 = zzdy0.zzc();
                    int v5 = zzdy0.zzd();
                    while(v4 < v5) {
                        int v6 = arr_b[v4];
                        int v7 = v6 & 0xFF;
                        if(this.j == 0x200 && zzafw.zzf(((byte)v7) & 0xFF | 0xFF00)) {
                            if(this.l) {
                            label_58:
                                this.o = (v6 & 8) >> 3;
                                this.k = 1 == (v6 & 1 ^ 1);
                                this.h = this.l ? 3 : 1;
                                this.i = 0;
                                zzdy0.zzF(v4 + 1);
                                continue label_1;
                            }
                            else {
                                zzdy0.zzF(v4);
                                byte[] arr_b1 = zzdx0.zza;
                                if(zzdy0.zza() >= 1) {
                                    zzdy0.zzB(arr_b1, 0, 1);
                                    zzdx0.zzh(4);
                                    int v8 = zzdx0.zzc(1);
                                    if(this.m == -1 || v8 == this.m) {
                                        if(this.n == -1) {
                                        label_41:
                                            byte[] arr_b3 = zzdx0.zza;
                                            if(zzdy0.zza() >= 4) {
                                                zzdy0.zzB(arr_b3, 0, 4);
                                                zzdx0.zzh(14);
                                                int v9 = zzdx0.zzc(13);
                                                if(v9 >= 7) {
                                                    byte[] arr_b4 = zzdy0.zzH();
                                                    int v10 = zzdy0.zzd();
                                                    int v11 = v4 - 1 + v9;
                                                    if(v11 < v10) {
                                                        int v12 = arr_b4[v11];
                                                        if(v12 != -1) {
                                                            if(v12 == 73 && (v11 + 1 == v10 || arr_b4[v11 + 1] == 68 && (v11 + 2 == v10 || arr_b4[v11 + 2] == 51))) {
                                                                goto label_58;
                                                            }
                                                        }
                                                        else if(v11 + 1 != v10) {
                                                            int v13 = arr_b4[v11 + 1];
                                                            if(zzafw.zzf(v13 & 0xFF | 0xFF00) && (v13 & 8) >> 3 == v8) {
                                                                goto label_58;
                                                            }
                                                        }
                                                        else {
                                                            goto label_58;
                                                        }
                                                    }
                                                    else {
                                                        goto label_58;
                                                    }
                                                }
                                            }
                                            else {
                                                goto label_58;
                                            }
                                        }
                                        else {
                                            byte[] arr_b2 = zzdx0.zza;
                                            if(zzdy0.zza() >= 1) {
                                                zzdy0.zzB(arr_b2, 0, 1);
                                                zzdx0.zzh(2);
                                                if(zzdx0.zzc(4) == this.n) {
                                                    zzdy0.zzF(v4 + 1);
                                                    goto label_41;
                                                }
                                            }
                                            else {
                                                goto label_58;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int v14 = this.j;
                        switch(v14 | v7) {
                            case 329: {
                                this.j = 0x300;
                                ++v4;
                                continue;
                            }
                            case 0x1FF: {
                                this.j = 0x200;
                                ++v4;
                                continue;
                            }
                            case 836: {
                                this.j = 0x400;
                                ++v4;
                                continue;
                            }
                            case 1075: {
                                break;
                            }
                            default: {
                                if(v14 != 0x100) {
                                    this.j = 0x100;
                                    continue;
                                }
                                ++v4;
                                continue;
                            }
                        }
                        this.h = 2;
                        this.i = 3;
                        this.r = 0;
                        zzdy1.zzF(0);
                        zzdy0.zzF(v4 + 1);
                        continue label_1;
                    }
                    zzdy0.zzF(v4);
                    continue;
                }
                case 1: {
                    if(zzdy0.zza() == 0) {
                        continue;
                    }
                    zzdx0.zza[0] = zzdy0.zzH()[zzdy0.zzc()];
                    zzdx0.zzh(2);
                    int v15 = zzdx0.zzc(4);
                    if(this.n == -1 || v15 == this.n) {
                        if(!this.l) {
                            this.l = true;
                            this.m = this.o;
                            this.n = v15;
                        }
                        this.h = 3;
                        this.i = 0;
                    }
                    else {
                        this.l = false;
                        this.h = 0;
                        this.i = 0;
                        this.j = 0x100;
                    }
                    continue;
                }
                case 2: {
                    int v16 = Math.min(zzdy0.zza(), 10 - this.i);
                    zzdy0.zzB(zzdy1.zzH(), this.i, v16);
                    int v17 = this.i + v16;
                    this.i = v17;
                    if(v17 != 10) {
                        continue;
                    }
                    this.g.zzq(zzdy1, 10);
                    zzdy1.zzF(6);
                    zzzy zzzy0 = this.g;
                    int v18 = zzdy1.zzj();
                    this.h = 4;
                    this.i = 10;
                    this.t = zzzy0;
                    this.u = 0L;
                    this.r = v18 + 10;
                    continue;
                }
                case 3: {
                    int v19 = this.k ? 7 : 5;
                    int v20 = Math.min(zzdy0.zza(), v19 - this.i);
                    zzdy0.zzB(zzdx0.zza, this.i, v20);
                    int v21 = this.i + v20;
                    this.i = v21;
                    if(v21 != v19) {
                        continue;
                    }
                    zzdx0.zzh(0);
                    if(this.p) {
                        zzdx0.zzj(10);
                    }
                    else {
                        int v22 = zzdx0.zzc(2) + 1;
                        if(v22 != 2) {
                            Log.w("AdtsReader", "Detected audio object type: " + v22 + ", but assuming AAC LC.");
                        }
                        zzdx0.zzj(5);
                        byte b = (byte)(zzdx0.zzc(3) << 3 & 120 | this.n << 7 & 0x80);
                        byte[] arr_b5 = {((byte)(this.n >> 1 & 7 | 16)), b};
                        zzxs zzxs0 = zzxt.zza(arr_b5);
                        zzab zzab0 = new zzab();
                        zzab0.zzH(this.e);
                        zzab0.zzS("audio/mp4a-latm");
                        zzab0.zzx(zzxs0.zzc);
                        zzab0.zzw(zzxs0.zzb);
                        zzab0.zzT(zzxs0.zza);
                        zzab0.zzI(Collections.singletonList(arr_b5));
                        zzab0.zzK(this.d);
                        zzad zzad0 = zzab0.zzY();
                        this.q = 1024000000L / ((long)zzad0.zzA);
                        this.f.zzk(zzad0);
                        this.p = true;
                    }
                    break;
                }
                default: {
                    int v = Math.min(zzdy0.zza(), this.r - this.i);
                    this.t.zzq(zzdy0, v);
                    int v1 = this.i + v;
                    this.i = v1;
                    int v2 = this.r;
                    if(v1 != v2) {
                        continue;
                    }
                    long v3 = this.s;
                    if(v3 != 0x8000000000000001L) {
                        this.t.zzs(v3, 1, v2, 0, null);
                        this.s += this.u;
                    }
                    this.h = 0;
                    this.i = 0;
                    this.j = 0x100;
                    continue;
                }
            }
            zzdx0.zzj(4);
            int v23 = zzdx0.zzc(13);
            this.h = 4;
            this.i = 0;
            this.t = this.f;
            this.u = this.q;
            this.r = this.k ? v23 - 9 : v23 - 7;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        zzahm0.zzc();
        this.e = zzahm0.zzb();
        zzzy zzzy0 = zzyu0.zzv(zzahm0.zza(), 1);
        this.f = zzzy0;
        this.t = zzzy0;
        if(this.a) {
            zzahm0.zzc();
            zzzy zzzy1 = zzyu0.zzv(zzahm0.zza(), 5);
            this.g = zzzy1;
            zzab zzab0 = new zzab();
            zzab0.zzH(zzahm0.zzb());
            zzab0.zzS("application/id3");
            zzzy1.zzk(zzab0.zzY());
            return;
        }
        this.g = new zzyq();
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.s = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.s = 0x8000000000000001L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 0x100;
    }

    public static boolean zzf(int v) {
        return (v & 0xFFF6) == 0xFFF0;
    }
}

