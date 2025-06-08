package com.google.android.gms.internal.ads;

import Q1.b;
import java.io.IOException;
import java.util.Arrays;

public final class zzaam implements zzyr {
    public final byte[] a;
    public final zzdy b;
    public final zzyz c;
    public zzyu d;
    public zzzy e;
    public int f;
    public zzbl g;
    public zzze h;
    public int i;
    public int j;
    public a k;
    public int l;
    public long m;
    public static final zzyy zza;

    static {
        zzaam.zza = zzaal.zza;
    }

    public zzaam() {
        this(0);
    }

    public zzaam(int v) {
        this.a = new byte[42];
        this.b = new zzdy(new byte[0x8000], 0);
        this.c = new zzyz();
        this.f = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        long v7;
        boolean z;
        long v21;
        long v20;
        zzzu zzzu0;
        int v = this.f;
        if(v != 0) {
            byte[] arr_b = this.a;
            switch(v) {
                case 1: {
                    ((zzyl)zzys0).zzm(arr_b, 0, 42, false);
                    zzys0.zzj();
                    this.f = 2;
                    return 0;
                }
                case 2: {
                    zzdy zzdy1 = new zzdy(4);
                    ((zzyl)zzys0).zzn(zzdy1.zzH(), 0, 4, false);
                    if(zzdy1.zzs() != 0x664C6143L) {
                        throw zzbp.zza("Failed to read FLAC stream marker.", null);
                    }
                    this.f = 3;
                    return 0;
                }
                case 3: {
                    zzze zzze1 = this.h;
                    while(true) {
                        zzys0.zzj();
                        zzdx zzdx0 = new zzdx(new byte[4], 4);
                        ((zzyl)zzys0).zzm(zzdx0.zza, 0, 4, false);
                        boolean z2 = zzdx0.zzl();
                        int v11 = zzdx0.zzc(7);
                        int v12 = zzdx0.zzc(24) + 4;
                        if(v11 == 0) {
                            byte[] arr_b1 = new byte[38];
                            ((zzyl)zzys0).zzn(arr_b1, 0, 38, false);
                            zzze1 = new zzze(arr_b1, 4);
                        }
                        else {
                            if(zzze1 == null) {
                                break;
                            }
                            if(v11 == 3) {
                                zzdy zzdy2 = new zzdy(v12);
                                ((zzyl)zzys0).zzn(zzdy2.zzH(), 0, v12, false);
                                zzze1 = zzze1.zzf(zzzb.zzb(zzdy2));
                            }
                            else if(v11 == 4) {
                                zzdy zzdy3 = new zzdy(v12);
                                ((zzyl)zzys0).zzn(zzdy3.zzH(), 0, v12, false);
                                zzdy3.zzG(4);
                                zzze1 = zzze1.zzg(Arrays.asList(zzaae.zzc(zzdy3, false, false).zzb));
                            }
                            else if(v11 == 6) {
                                zzdy zzdy4 = new zzdy(v12);
                                ((zzyl)zzys0).zzn(zzdy4.zzH(), 0, v12, false);
                                zzdy4.zzG(4);
                                zzze1 = zzze1.zze(zzfrj.zzp(zzabg.zzb(zzdy4)));
                            }
                            else {
                                ((zzyl)zzys0).zzo(v12, false);
                            }
                        }
                        this.h = zzze1;
                        if(z2) {
                            zzze1.getClass();
                            this.i = Math.max(zzze1.zzc, 6);
                            this.e.zzk(this.h.zzc(arr_b, this.g));
                            this.f = 4;
                            return 0;
                        }
                    }
                    throw new IllegalArgumentException();
                }
                case 4: {
                    zzys0.zzj();
                    zzdy zzdy5 = new zzdy(2);
                    ((zzyl)zzys0).zzm(zzdy5.zzH(), 0, 2, false);
                    int v13 = zzdy5.zzo();
                    if(v13 >> 2 == 0x3FFE) {
                        zzys0.zzj();
                        this.j = v13;
                        zzyu zzyu0 = this.d;
                        long v14 = zzys0.zzf();
                        long v15 = zzys0.zzd();
                        zzze zzze2 = this.h;
                        zzze2.getClass();
                        if(zzze2.zzk != null) {
                            zzzu0 = new zzzc(zzze2, v14);
                        }
                        else if(v15 == -1L || zzze2.zzj <= 0L) {
                            zzzu0 = new zzzt(zzze2.zza(), 0L);
                        }
                        else {
                            int v16 = this.j;
                            zzaah zzaah0 = new zzaah(zzze2);
                            b b0 = new b(zzze2, v16);
                            long v17 = zzze2.zza();
                            long v18 = zzze2.zzj;
                            int v19 = zzze2.zzd;
                            if(v19 > 0) {
                                v20 = (((long)v19) + ((long)zzze2.zzc)) / 2L;
                                v21 = 1L;
                            }
                            else {
                                v20 = (zzze2.zza != zzze2.zzb || zzze2.zza <= 0 ? 0x1000L : ((long)zzze2.zza)) * ((long)zzze2.zzg) * ((long)zzze2.zzh) / 8L;
                                v21 = 0x40L;
                            }
                            super(zzaah0, b0, v17, v18, v14, v15, v20 + v21, Math.max(6, zzze2.zzc));
                            this.k = null;
                            zzzu0 = null.zzb();
                        }
                        zzyu0.zzL(zzzu0);
                        this.f = 5;
                        return 0;
                    }
                    zzys0.zzj();
                    throw zzbp.zza("First frame does not start with sync code.", null);
                }
                default: {
                    this.e.getClass();
                    zzze zzze0 = this.h;
                    zzze0.getClass();
                    a a0 = this.k;
                    if(a0 != null && a0.zze()) {
                        return a0.zza(zzys0, zzzr0);
                    }
                    if(this.m == -1L) {
                        this.m = zzza.zzb(zzys0, zzze0);
                        return 0;
                    }
                    zzdy zzdy0 = this.b;
                    int v1 = zzdy0.zzd();
                    if(v1 < 0x8000) {
                        int v2 = zzys0.zza(zzdy0.zzH(), v1, 0x8000 - v1);
                        z = v2 == -1;
                        if(!z) {
                            zzdy0.zzE(v1 + v2);
                        }
                        else if(zzdy0.zza() == 0) {
                            this.e.zzs(this.m * 1000000L / ((long)this.h.zze), 1, this.l, 0, null);
                            return -1;
                        }
                    }
                    else {
                        z = false;
                    }
                    int v3 = zzdy0.zzc();
                    int v4 = this.l;
                    int v5 = this.i;
                    if(v4 < v5) {
                        zzdy0.zzG(Math.min(v5 - v4, zzdy0.zza()));
                    }
                    this.h.getClass();
                    int v6 = zzdy0.zzc();
                alab1:
                    while(true) {
                        zzyz zzyz0 = this.c;
                        if(v6 > zzdy0.zzd() - 16) {
                            if(z) {
                                while(v6 <= zzdy0.zzd() - this.i) {
                                    zzdy0.zzF(v6);
                                    try {
                                        boolean z1 = false;
                                        z1 = zzza.zzc(zzdy0, this.h, this.j, zzyz0);
                                    }
                                    catch(IndexOutOfBoundsException unused_ex) {
                                    }
                                    if(zzdy0.zzc() <= zzdy0.zzd() && z1) {
                                        zzdy0.zzF(v6);
                                        v7 = zzyz0.zza;
                                        break alab1;
                                    }
                                    ++v6;
                                }
                                zzdy0.zzF(zzdy0.zzd());
                            }
                            else {
                                zzdy0.zzF(v6);
                            }
                            v7 = -1L;
                            break;
                        }
                        zzdy0.zzF(v6);
                        if(zzza.zzc(zzdy0, this.h, this.j, zzyz0)) {
                            zzdy0.zzF(v6);
                            v7 = zzyz0.zza;
                            break;
                        }
                        ++v6;
                    }
                    int v8 = zzdy0.zzc() - v3;
                    zzdy0.zzF(v3);
                    zzzw.zzb(this.e, zzdy0, v8);
                    int v9 = this.l + v8;
                    this.l = v9;
                    if(v7 != -1L) {
                        this.e.zzs(this.m * 1000000L / ((long)this.h.zze), 1, v9, 0, null);
                        this.l = 0;
                        this.m = v7;
                    }
                    if(zzdy0.zza() >= 16) {
                        return 0;
                    }
                    int v10 = zzdy0.zza();
                    System.arraycopy(zzdy0.zzH(), zzdy0.zzc(), zzdy0.zzH(), 0, v10);
                    zzdy0.zzF(0);
                    zzdy0.zzE(v10);
                    return 0;
                }
            }
        }
        zzys0.zzj();
        long v22 = zzys0.zze();
        zzbl zzbl0 = zzzb.zza(zzys0, true);
        ((zzyl)zzys0).zzo(((int)(zzys0.zze() - v22)), false);
        this.g = zzbl0;
        this.f = 1;
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.d = zzyu0;
        this.e = zzyu0.zzv(0, 1);
        zzyu0.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        long v2 = 0L;
        if(v == 0L) {
            this.f = 0;
        }
        else {
            a a0 = this.k;
            if(a0 != null) {
                a0.zzd(v1);
            }
        }
        if(v1 != 0L) {
            v2 = -1L;
        }
        this.m = v2;
        this.l = 0;
        this.b.zzC(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        zzzb.zza(zzys0, false);
        zzdy zzdy0 = new zzdy(4);
        ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 4, false);
        return zzdy0.zzs() == 0x664C6143L;
    }
}

