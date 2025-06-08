package com.google.android.gms.internal.ads;

public final class zzafy implements zzaga {
    public final zzdy a;
    public final String b;
    public String c;
    public zzzy d;
    public int e;
    public int f;
    public int g;
    public long h;
    public zzad i;
    public int j;
    public long k;

    public zzafy(String s) {
        this.a = new zzdy(new byte[18]);
        this.e = 0;
        this.k = 0x8000000000000001L;
        this.b = s;
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) {
        int v12;
        int v11;
        int v10;
        zzcw.zzb(this.d);
    label_1:
        while(zzdy0.zza() > 0) {
            zzdy zzdy1 = this.a;
        alab1:
            switch(this.e) {
                case 0: {
                    do {
                        if(zzdy0.zza() <= 0) {
                            continue label_1;
                        }
                        int v4 = this.g << 8;
                        this.g = v4;
                        int v5 = v4 | zzdy0.zzk();
                        this.g = v5;
                    }
                    while(v5 != 0xFE7F0180 && v5 != 0xFF1F00E8 && v5 != 0x1FFFE800 && v5 != 0x7FFE8001);
                    byte[] arr_b = zzdy1.zzH();
                    int v6 = this.g;
                    arr_b[0] = (byte)(v6 >> 24 & 0xFF);
                    arr_b[1] = (byte)(v6 >> 16 & 0xFF);
                    arr_b[2] = (byte)(v6 >> 8 & 0xFF);
                    arr_b[3] = (byte)(v6 & 0xFF);
                    this.f = 4;
                    this.g = 0;
                    this.e = 1;
                    continue;
                }
                case 1: {
                    int v7 = Math.min(zzdy0.zza(), 18 - this.f);
                    zzdy0.zzB(zzdy1.zzH(), this.f, v7);
                    int v8 = this.f + v7;
                    this.f = v8;
                    if(v8 != 18) {
                        continue;
                    }
                    byte[] arr_b1 = zzdy1.zzH();
                    if(this.i == null) {
                        zzad zzad0 = zzyp.zza(arr_b1, this.c, this.b, null);
                        this.i = zzad0;
                        this.d.zzk(zzad0);
                    }
                    int v9 = arr_b1[0];
                    switch(v9) {
                        case -2: {
                            v10 = ((arr_b1[4] & 3) << 12 | (arr_b1[7] & 0xFF) << 4 | (arr_b1[6] & 0xF0) >> 4) + 1;
                            break;
                        }
                        case -1: {
                            v10 = (((arr_b1[7] & 3) << 12 | (arr_b1[6] & 0xFF) << 4 | (arr_b1[9] & 60) >> 2) + 1) * 16 / 14;
                            break;
                        }
                        case 0x1F: {
                            v10 = (((arr_b1[8] & 60) >> 2 | ((arr_b1[6] & 3) << 12 | (arr_b1[7] & 0xFF) << 4)) + 1) * 16 / 14;
                            break;
                        }
                        default: {
                            v10 = ((arr_b1[5] & 3) << 12 | (arr_b1[6] & 0xFF) << 4 | (arr_b1[7] & 0xF0) >> 4) + 1;
                        }
                    }
                    this.j = v10;
                    switch(v9) {
                        case -2: {
                            v11 = (arr_b1[5] & 1) << 6;
                            v12 = arr_b1[4] & 0xFC;
                            break alab1;
                        }
                        case -1: {
                            v11 = (arr_b1[4] & 7) << 4;
                            v12 = arr_b1[7] & 60;
                            break alab1;
                        }
                        case 0x1F: {
                            v11 = (arr_b1[5] & 7) << 4;
                            v12 = arr_b1[6] & 60;
                            break alab1;
                        }
                        default: {
                            v11 = (arr_b1[4] & 1) << 6;
                            v12 = arr_b1[5] & 0xFC;
                            break alab1;
                        }
                    }
                }
                default: {
                    int v = Math.min(zzdy0.zza(), this.j - this.f);
                    zzzw.zzb(this.d, zzdy0, v);
                    int v1 = this.f + v;
                    this.f = v1;
                    int v2 = this.j;
                    if(v1 != v2) {
                        continue;
                    }
                    long v3 = this.k;
                    if(v3 != 0x8000000000000001L) {
                        this.d.zzs(v3, 1, v2, 0, null);
                        this.k += this.h;
                    }
                    this.e = 0;
                    continue;
                }
            }
            this.h = (long)(((int)(((long)(((v12 >> 2 | v11) + 1) * 0x20)) * 1000000L / ((long)this.i.zzA))));
            zzdy1.zzF(0);
            zzzw.zzb(this.d, zzdy1, 18);
            this.e = 2;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        zzahm0.zzc();
        this.c = zzahm0.zzb();
        this.d = zzyu0.zzv(zzahm0.zza(), 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.k = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = 0x8000000000000001L;
    }
}

