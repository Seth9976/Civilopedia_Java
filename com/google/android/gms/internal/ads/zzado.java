package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.EOFException;
import java.io.IOException;

public final class zzado implements zzyr {
    public final zzdy a;
    public final zzzk b;
    public final zzzg c;
    public final zzzi d;
    public zzyu e;
    public zzzy f;
    public zzzy g;
    public int h;
    public zzbl i;
    public long j;
    public long k;
    public long l;
    public int m;
    public p n;
    public boolean o;
    public static final zzyy zza;

    static {
        zzado.zza = zzadm.zza;
    }

    public zzado() {
        this(0);
    }

    public zzado(int v) {
        this.a = new zzdy(10);
        this.b = new zzzk();
        this.c = new zzzg();
        this.j = 0x8000000000000001L;
        this.d = new zzzi();
        this.g = new zzyq();
    }

    public final n a(zzys zzys0) {
        ((zzyl)zzys0).zzm(this.a.zzH(), 0, 4, false);
        this.a.zzF(0);
        int v = this.a.zze();
        this.b.zza(v);
        return new n(zzys0.zzd(), zzys0.zzf(), this.b.zzf, this.b.zzc, false);  // 初始化器: Lcom/google/android/gms/internal/ads/zzyk;-><init>(JJIIZ)V
    }

    public final boolean b(zzys zzys0) {
        p p0 = this.n;
        if(p0 != null) {
            long v = p0.zzb();
            if(v != -1L && zzys0.zze() > v - 4L) {
                return true;
            }
        }
        try {
            return !zzys0.zzm(this.a.zzH(), 0, 4, true);
        }
        catch(EOFException unused_ex) {
            return true;
        }
    }

    public final boolean c(zzys zzys0, boolean z) {
        int v1;
        int v;
        zzys0.zzj();
        if(zzys0.zzf() == 0L) {
            zzbl zzbl0 = this.d.zza(zzys0, null);
            this.i = zzbl0;
            if(zzbl0 != null) {
                this.c.zzb(zzbl0);
            }
            v = (int)zzys0.zze();
            if(!z) {
                ((zzyl)zzys0).zzo(v, false);
            }
            v1 = 0;
        }
        else {
            v1 = 0;
            v = 0;
        }
        int v2 = 0;
        int v3 = 0;
        while(true) {
            if(this.b(zzys0)) {
                if(v2 <= 0) {
                    throw new EOFException();
                }
                goto label_29;
            }
            this.a.zzF(0);
            int v4 = this.a.zze();
            if(v1 == 0 || ((long)(0xFFFE0C00 & v4)) == (((long)v1) & 0xFFFFFFFFFFFE0C00L)) {
                int v5 = zzzl.zzb(v4);
                if(v5 != -1) {
                    ++v2;
                    if(v2 == 1) {
                        this.b.zza(v4);
                        v1 = v4;
                    }
                    else if(v2 == 4) {
                        goto label_29;
                    }
                    ((zzyl)zzys0).zzl(v5 - 4, false);
                    continue;
                label_29:
                    if(z) {
                        ((zzyl)zzys0).zzo(v + v3, false);
                    }
                    else {
                        zzys0.zzj();
                    }
                    this.h = v1;
                    return true;
                }
            }
            if(v3 == (z ? 0x8000 : 0x20000)) {
                if(!z) {
                    throw zzbp.zza("Searched too many bytes.", null);
                }
                return false;
            }
            if(z) {
                zzys0.zzj();
                ((zzyl)zzys0).zzl(v + (v3 + 1), false);
            }
            else {
                ((zzyl)zzys0).zzo(1, false);
            }
            ++v3;
            v1 = 0;
            v2 = 0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        zzadp zzadp0;
        o o0;
        zzdy zzdy4;
        long v29;
        zzdy zzdy2;
        r r1;
        zzzk zzzk1;
        r r2;
        int v23;
        zzzk zzzk2;
        zzdy zzdy3;
        int v1;
        zzcw.zzb(this.f);
        if(this.h == 0) {
            try {
                this.c(zzys0, false);
            }
            catch(EOFException unused_ex) {
                return -1;
            }
        }
        zzzk zzzk0 = this.b;
        zzdy zzdy0 = this.a;
        if(this.n == null) {
            zzdy zzdy1 = new zzdy(zzzk0.zzc);
            ((zzyl)zzys0).zzm(zzdy1.zzH(), 0, zzzk0.zzc, false);
            int v = 21;
            if((zzzk0.zza & 1) == 0) {
                if(zzzk0.zze == 1) {
                    v = 13;
                }
            }
            else if(zzzk0.zze != 1) {
                v = 36;
            }
            if(zzdy1.zzd() >= v + 4) {
                zzdy1.zzF(v);
                v1 = zzdy1.zze();
                if(v1 != 1483304551) {
                    if(v1 == 0x496E666F) {
                        v1 = 0x496E666F;
                        goto label_30;
                    }
                    goto label_22;
                }
            }
            else {
            label_22:
                if(zzdy1.zzd() >= 40) {
                    zzdy1.zzF(36);
                    v1 = zzdy1.zze() == 1447187017 ? 1447187017 : 0;
                }
                else {
                    v1 = 0;
                }
            }
        label_30:
            zzzg zzzg0 = this.c;
            r r0 = null;
            switch(v1) {
                case 1447187017: {
                    long v13 = zzys0.zzd();
                    long v14 = zzys0.zzf();
                    zzdy1.zzG(10);
                    int v15 = zzdy1.zze();
                    if(v15 <= 0) {
                        zzzk1 = zzzk0;
                        zzdy3 = zzdy0;
                        r1 = null;
                    }
                    else {
                        zzdy3 = zzdy0;
                        long v16 = zzeg.zzw(v15, ((long)(zzzk0.zzd < 32000 ? 0x240 : 0x480)) * 1000000L, zzzk0.zzd);
                        int v17 = zzdy1.zzo();
                        int v18 = zzdy1.zzo();
                        int v19 = zzdy1.zzo();
                        zzdy1.zzG(2);
                        long v20 = v14 + ((long)zzzk0.zzc);
                        long[] arr_v1 = new long[v17];
                        long[] arr_v2 = new long[v17];
                        long v21 = v14;
                        int v22 = 0;
                    alab1:
                        while(true) {
                            if(v22 >= v17) {
                                zzzk2 = zzzk0;
                                if(v13 != -1L && v13 != v21) {
                                    Log.w("VbriSeeker", "VBRI data size mismatch: " + v13 + ", " + v21);
                                }
                                r1 = new q(arr_v1, arr_v2, v16, v21);
                                break;
                            }
                            zzzk2 = zzzk0;
                            arr_v1[v22] = ((long)v22) * v16 / ((long)v17);
                            arr_v2[v22] = Math.max(v21, v20);
                            switch(v19) {
                                case 1: {
                                    v23 = zzdy1.zzk();
                                    break;
                                }
                                case 2: {
                                    v23 = zzdy1.zzo();
                                    break;
                                }
                                case 3: {
                                    v23 = zzdy1.zzm();
                                    break;
                                }
                                case 4: {
                                    v23 = zzdy1.zzn();
                                    break;
                                }
                                default: {
                                    r1 = null;
                                    break alab1;
                                }
                            }
                            v21 += ((long)v23) * ((long)v18);
                            ++v22;
                            zzzk0 = zzzk2;
                        }
                        zzzk1 = zzzk2;
                    }
                    ((zzyl)zzys0).zzo(zzzk1.zzc, false);
                    zzdy2 = zzdy3;
                    break;
                }
                case 0x496E666F: 
                case 1483304551: {
                    zzzk1 = zzzk0;
                    long v2 = zzys0.zzd();
                    long v3 = zzys0.zzf();
                    int v4 = zzzk1.zzg;
                    int v5 = zzzk1.zzd;
                    int v6 = zzdy1.zze();
                    if((v6 & 1) == 1) {
                        int v7 = zzdy1.zzn();
                        if(v7 == 0) {
                            r2 = null;
                        }
                        else {
                            long v8 = zzeg.zzw(v7, ((long)v4) * 1000000L, v5);
                            if((v6 & 6) == 6) {
                                long v9 = zzdy1.zzs();
                                long[] arr_v = new long[100];
                                for(int v10 = 0; v10 < 100; ++v10) {
                                    arr_v[v10] = (long)zzdy1.zzk();
                                }
                                if(v2 != -1L) {
                                    long v11 = v3 + v9;
                                    if(v2 != v11) {
                                        Log.w("XingSeeker", "XING data size mismatch: " + v2 + ", " + v11);
                                    }
                                }
                                r2 = new r(v3, zzzk1.zzc, v8, v9, arr_v);
                            }
                            else {
                                r2 = new r(v3, zzzk1.zzc, v8, -1L, null);
                            }
                        }
                    }
                    else {
                        r2 = null;
                    }
                    if(r2 == null || zzzg0.zza()) {
                        zzdy2 = zzdy0;
                    }
                    else {
                        zzys0.zzj();
                        ((zzyl)zzys0).zzl(v + 0x8D, false);
                        ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 3, false);
                        zzdy2 = zzdy0;
                        zzdy2.zzF(0);
                        int v12 = zzdy2.zzm();
                        if(v12 >> 12 > 0 || (v12 & 0xFFF) > 0) {
                            zzzg0.zza = v12 >> 12;
                            zzzg0.zzb = v12 & 0xFFF;
                        }
                    }
                    ((zzyl)zzys0).zzo(zzzk1.zzc, false);
                    r1 = r2 == null || r2.zzh() || v1 != 0x496E666F ? r2 : this.a(zzys0);
                    break;
                }
                default: {
                    zzzk1 = zzzk0;
                    zzys0.zzj();
                    r1 = null;
                    zzdy2 = zzdy0;
                }
            }
            zzbl zzbl0 = this.i;
            long v24 = zzys0.zzf();
            if(zzbl0 != null) {
                int v25 = zzbl0.zza();
                int v26 = 0;
                while(v26 < v25) {
                    zzbk zzbk0 = zzbl0.zzb(v26);
                    if(zzbk0 instanceof zzacf) {
                        int v27 = zzbl0.zza();
                        for(int v28 = 0; true; ++v28) {
                            v29 = 0x8000000000000001L;
                            if(v28 >= v27) {
                                break;
                            }
                            zzbk zzbk1 = zzbl0.zzb(v28);
                            if(zzbk1 instanceof zzacj && ((zzacj)zzbk1).zzf.equals("TLEN")) {
                                v29 = zzeg.zzv(Long.parseLong(((zzacj)zzbk1).zzb));
                                break;
                            }
                        }
                        long[] arr_v3 = new long[((zzacf)zzbk0).zzd.length + 1];
                        long[] arr_v4 = new long[((zzacf)zzbk0).zzd.length + 1];
                        arr_v3[0] = v24;
                        arr_v4[0] = 0L;
                        long v31 = 0L;
                        for(int v30 = 1; v30 <= ((zzacf)zzbk0).zzd.length; ++v30) {
                            v24 += (long)(((zzacf)zzbk0).zzb + ((zzacf)zzbk0).zzd[v30 - 1]);
                            v31 += (long)(((zzacf)zzbk0).zzc + ((zzacf)zzbk0).zze[v30 - 1]);
                            arr_v3[v30] = v24;
                            arr_v4[v30] = v31;
                        }
                        zzdy4 = zzdy2;
                        o0 = new o(arr_v3, arr_v4, v29);
                        goto label_170;
                    }
                    ++v26;
                }
            }
            zzdy4 = zzdy2;
            o0 = null;
        label_170:
            if(this.o) {
                zzadp0 = new zzadp();
            }
            else {
                if(o0 != null) {
                    r0 = o0;
                }
                else if(r1 != null) {
                    r0 = r1;
                }
                if(r0 == null) {
                    zzadp0 = this.a(zzys0);
                }
                else {
                    r0.zzh();
                    zzadp0 = r0;
                }
            }
            this.n = zzadp0;
            this.e.zzL(zzadp0);
            zzzy zzzy0 = this.g;
            zzab zzab0 = new zzab();
            zzab0.zzS(zzzk1.zzb);
            zzab0.zzL(0x1000);
            zzab0.zzw(zzzk1.zze);
            zzab0.zzT(zzzk1.zzd);
            zzab0.zzC(zzzg0.zza);
            zzab0.zzD(zzzg0.zzb);
            zzab0.zzM(this.i);
            zzzy0.zzk(zzab0.zzY());
            this.l = zzys0.zzf();
        }
        else {
            zzzk1 = zzzk0;
            zzdy4 = zzdy0;
            long v32 = this.l;
            if(v32 != 0L) {
                long v33 = zzys0.zzf();
                if(v33 < v32) {
                    ((zzyl)zzys0).zzo(((int)(v32 - v33)), false);
                }
            }
        }
        int v34 = this.m;
        if(v34 == 0) {
            zzys0.zzj();
            if(!this.b(zzys0)) {
                zzdy4.zzF(0);
                int v35 = zzdy4.zze();
                if(((long)(0xFFFE0C00 & v35)) == (((long)this.h) & 0xFFFFFFFFFFFE0C00L) && zzzl.zzb(v35) != -1) {
                    zzzk1.zza(v35);
                    if(this.j == 0x8000000000000001L) {
                        this.j = this.n.zzc(zzys0.zzf());
                    }
                    v34 = zzzk1.zzc;
                    this.m = v34;
                    goto label_221;
                }
                ((zzyl)zzys0).zzo(1, false);
                this.h = 0;
                return 0;
            }
            return -1;
        }
    label_221:
        int v36 = this.g.zze(zzys0, v34, true);
        if(v36 != -1) {
            int v37 = this.m - v36;
            this.m = v37;
            if(v37 <= 0) {
                this.g.zzs(this.j + this.k * 1000000L / ((long)zzzk1.zzd), 1, zzzk1.zzc, 0, null);
                this.k += (long)zzzk1.zzg;
                this.m = 0;
            }
            return 0;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.e = zzyu0;
        zzzy zzzy0 = zzyu0.zzv(0, 1);
        this.f = zzzy0;
        this.g = zzzy0;
        this.e.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        this.h = 0;
        this.j = 0x8000000000000001L;
        this.k = 0L;
        this.m = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        return this.c(zzys0, true);
    }

    public final void zze() {
        this.o = true;
    }
}

