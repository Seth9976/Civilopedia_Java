package com.google.android.gms.internal.ads;

import java.util.Collections;

public final class zzagn implements zzaga {
    public final String a;
    public final zzdy b;
    public final zzdx c;
    public zzzy d;
    public String e;
    public zzad f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public zzagn(String s) {
        this.a = s;
        zzdy zzdy0 = new zzdy(0x400);
        this.b = zzdy0;
        byte[] arr_b = zzdy0.zzH();
        this.c = new zzdx(arr_b, arr_b.length);
        this.k = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) throws zzbp {
        int v5;
        int v4;
        zzcw.zzb(this.d);
        while(zzdy0.zza() > 0) {
            int v = this.g;
            switch(v) {
                case 0: {
                    if(zzdy0.zzk() != 86) {
                        continue;
                    }
                    this.g = 1;
                    continue;
                }
                case 1: {
                    int v13 = zzdy0.zzk();
                    if((v13 & 0xE0) == 0xE0) {
                        this.j = v13;
                        this.g = 2;
                        continue;
                    }
                    if(v13 != 86) {
                        break;
                    }
                    continue;
                }
                default: {
                    zzdx zzdx0 = this.c;
                    zzdy zzdy1 = this.b;
                    if(v == 2) {
                        int v12 = (this.j & 0xFFFFFF1F) << 8 | zzdy0.zzk();
                        this.i = v12;
                        if(v12 > zzdy1.zzH().length) {
                            zzdy1.zzC(v12);
                            byte[] arr_b1 = zzdy1.zzH();
                            zzdx0.zzg(arr_b1, arr_b1.length);
                        }
                        this.h = 0;
                        this.g = 3;
                    }
                    else {
                        int v1 = Math.min(zzdy0.zza(), this.i - this.h);
                        zzdy0.zzB(zzdx0.zza, this.h, v1);
                        int v2 = this.h + v1;
                        this.h = v2;
                        if(v2 != this.i) {
                            continue;
                        }
                        zzdx0.zzh(0);
                        if(!zzdx0.zzl()) {
                            this.l = true;
                            int v3 = zzdx0.zzc(1);
                            if(v3 == 1) {
                                v4 = zzdx0.zzc(1);
                                v5 = 1;
                            }
                            else {
                                v5 = v3;
                                v4 = 0;
                            }
                            this.m = v4;
                            if(v4 != 0) {
                                throw zzbp.zza(null, null);
                            }
                            if(v5 == 1) {
                                zzdx0.zzc((zzdx0.zzc(2) + 1) * 8);
                                v5 = 1;
                            }
                            if(!zzdx0.zzl()) {
                                throw zzbp.zza(null, null);
                            }
                            this.n = zzdx0.zzc(6);
                            if(zzdx0.zzc(4) != 0 || zzdx0.zzc(3) != 0) {
                                throw zzbp.zza(null, null);
                            }
                            if(v5 == 0) {
                                zzxs zzxs0 = zzxt.zzb(zzdx0, true);
                                this.u = zzxs0.zzc;
                                this.r = zzxs0.zza;
                                this.t = zzxs0.zzb;
                                zzdx0.zzh(zzdx0.zzb());
                                byte[] arr_b = new byte[0];
                                zzdx0.zzf(arr_b, 0, 0);
                                zzab zzab0 = new zzab();
                                zzab0.zzH(this.e);
                                zzab0.zzS("audio/mp4a-latm");
                                zzab0.zzx(this.u);
                                zzab0.zzw(this.t);
                                zzab0.zzT(this.r);
                                zzab0.zzI(Collections.singletonList(arr_b));
                                zzab0.zzK(this.a);
                                zzad zzad0 = zzab0.zzY();
                                if(!zzad0.equals(this.f)) {
                                    this.f = zzad0;
                                    this.s = 1024000000L / ((long)zzad0.zzA);
                                    this.d.zzk(zzad0);
                                }
                            }
                            else {
                                int v6 = (int)(((long)zzdx0.zzc((zzdx0.zzc(2) + 1) * 8)));
                                zzxs zzxs1 = zzxt.zzb(zzdx0, true);
                                this.u = zzxs1.zzc;
                                this.r = zzxs1.zza;
                                this.t = zzxs1.zzb;
                                zzdx0.zzj(v6);
                            }
                            int v7 = zzdx0.zzc(3);
                            this.o = v7;
                            switch(v7) {
                                case 0: {
                                    zzdx0.zzj(8);
                                    break;
                                }
                                case 1: {
                                    zzdx0.zzj(9);
                                    break;
                                }
                                case 3: 
                                case 4: 
                                case 5: {
                                    zzdx0.zzj(6);
                                    break;
                                }
                                case 6: 
                                case 7: {
                                    zzdx0.zzj(1);
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException();
                                }
                            }
                            boolean z = zzdx0.zzl();
                            this.p = z;
                            this.q = 0L;
                            if(z) {
                                if(v5 == 1) {
                                    this.q = (long)zzdx0.zzc((zzdx0.zzc(2) + 1) * 8);
                                }
                                else {
                                    do {
                                        boolean z1 = zzdx0.zzl();
                                        this.q = (this.q << 8) + ((long)zzdx0.zzc(8));
                                    }
                                    while(z1);
                                }
                            }
                            if(zzdx0.zzl()) {
                                zzdx0.zzj(8);
                            }
                            goto label_86;
                        }
                        else if(this.l) {
                        label_86:
                            if(this.m != 0 || this.n != 0 || this.o != 0) {
                                throw zzbp.zza(null, null);
                            }
                            int v8 = 0;
                            do {
                                int v9 = zzdx0.zzc(8);
                                v8 += v9;
                            }
                            while(v9 == 0xFF);
                            int v10 = zzdx0.zzb();
                            if((v10 & 7) == 0) {
                                zzdy1.zzF(v10 >> 3);
                            }
                            else {
                                zzdx0.zzf(zzdy1.zzH(), 0, v8 * 8);
                                zzdy1.zzF(0);
                            }
                            zzzw.zzb(this.d, zzdy1, v8);
                            long v11 = this.k;
                            if(v11 != 0x8000000000000001L) {
                                this.d.zzs(v11, 1, v8, 0, null);
                                this.k += this.s;
                            }
                            if(this.p) {
                                zzdx0.zzj(((int)this.q));
                            }
                        }
                        this.g = 0;
                    }
                    continue;
                }
            }
            this.g = 0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        zzahm0.zzc();
        this.d = zzyu0.zzv(zzahm0.zza(), 1);
        this.e = zzahm0.zzb();
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
        this.g = 0;
        this.k = 0x8000000000000001L;
        this.l = false;
    }
}

