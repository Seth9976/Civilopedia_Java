package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;

public final class zzagy implements zzyr {
    public final zzee a;
    public final SparseArray b;
    public final zzdy c;
    public final b0 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public a i;
    public zzyu j;
    public boolean k;
    public static final zzyy zza;

    static {
        zzagy.zza = zzagw.zza;
    }

    public zzagy() {
        zzee zzee0 = new zzee(0L);
        super();
        this.a = zzee0;
        this.c = new zzdy(0x1000);
        this.b = new SparseArray();
        this.d = new b0(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        long v29;
        long v28;
        zzafq zzafq1;
        zzcw.zzb(this.j);
        long v = zzys0.zzd();
        long v1 = 0x8000000000000001L;
        b0 b00 = this.d;
        int v2 = Long.compare(v, -1L);
        if(v2 != 0 && !b00.c) {
            zzdy zzdy0 = b00.b;
            if(!b00.e) {
                long v3 = zzys0.zzd();
                int v4 = (int)Math.min(20000L, v3);
                long v5 = v3 - ((long)v4);
                if(zzys0.zzf() != v5) {
                    zzzr0.zza = v5;
                    return 1;
                }
                zzdy0.zzC(v4);
                zzys0.zzj();
                ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, v4, false);
                int v6 = zzdy0.zzc();
                for(int v7 = zzdy0.zzd() - 4; v7 >= v6; --v7) {
                    if(b0.c(v7, zzdy0.zzH()) == 442) {
                        zzdy0.zzF(v7 + 4);
                        long v8 = b0.a(zzdy0);
                        if(v8 != 0x8000000000000001L) {
                            v1 = v8;
                            break;
                        }
                    }
                }
                b00.g = v1;
                b00.e = true;
                return 0;
            }
            if(b00.g == 0x8000000000000001L) {
                zzdy0.zzD(zzeg.zzf, 0);
                b00.c = true;
                zzys0.zzj();
                return 0;
            }
            if(!b00.d) {
                int v9 = (int)Math.min(20000L, zzys0.zzd());
                if(zzys0.zzf() != 0L) {
                    zzzr0.zza = 0L;
                    return 1;
                }
                zzdy0.zzC(v9);
                zzys0.zzj();
                ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, v9, false);
                int v10 = zzdy0.zzc();
                int v11 = zzdy0.zzd();
                while(v10 < v11 - 3) {
                    if(b0.c(v10, zzdy0.zzH()) == 442) {
                        zzdy0.zzF(v10 + 4);
                        long v12 = b0.a(zzdy0);
                        if(v12 != 0x8000000000000001L) {
                            v1 = v12;
                            break;
                        }
                    }
                    ++v10;
                }
                b00.f = v1;
                b00.d = true;
                return 0;
            }
            long v13 = b00.f;
            if(v13 == 0x8000000000000001L) {
                zzdy0.zzD(zzeg.zzf, 0);
                b00.c = true;
                zzys0.zzj();
                return 0;
            }
            long v14 = b00.a.zzb(v13);
            long v15 = b00.a.zzb(b00.g) - v14;
            b00.h = v15;
            if(v15 < 0L) {
                Log.w("PsDurationReader", "Invalid duration: " + v15 + ". Using TIME_UNSET instead.");
                b00.h = 0x8000000000000001L;
            }
            zzdy0.zzD(zzeg.zzf, 0);
            b00.c = true;
            zzys0.zzj();
            return 0;
        }
        if(!this.k) {
            this.k = true;
            long v16 = b00.h;
            if(v16 == 0x8000000000000001L) {
                this.j.zzL(new zzzt(0x8000000000000001L, 0L));
            }
            else {
                a a0 = new a(new zzyc(), new Q(b00.a), v16, v16 + 1L, 0L, v, 0xBCL, 1000);  // 初始化器: Lcom/google/android/gms/internal/ads/zzyh;-><init>(Lcom/google/android/gms/internal/ads/zzye;Lcom/google/android/gms/internal/ads/zzyg;JJJJJI)V
                this.i = a0;
                this.j.zzL(a0.zzb());
            }
        }
        a a1 = this.i;
        if(a1 != null && a1.zze()) {
            return a1.zza(zzys0, zzzr0);
        }
        zzys0.zzj();
        long v17 = v2 == 0 ? -1L : v - zzys0.zze();
        if(v17 != -1L && v17 < 4L) {
            return -1;
        }
        zzdy zzdy1 = this.c;
        if(!zzys0.zzm(zzdy1.zzH(), 0, 4, true)) {
            return -1;
        }
        zzdy1.zzF(0);
        int v18 = zzdy1.zze();
        if(v18 == 441) {
            return -1;
        }
        switch(v18) {
            case 442: {
                ((zzyl)zzys0).zzm(zzdy1.zzH(), 0, 10, false);
                zzdy1.zzF(9);
                ((zzyl)zzys0).zzo((zzdy1.zzk() & 7) + 14, false);
                return 0;
            }
            case 443: {
                ((zzyl)zzys0).zzm(zzdy1.zzH(), 0, 2, false);
                zzdy1.zzF(0);
                ((zzyl)zzys0).zzo(zzdy1.zzo() + 6, false);
                return 0;
            }
            default: {
                if(v18 >> 8 != 1) {
                    ((zzyl)zzys0).zzo(1, false);
                    return 0;
                }
                zzafq zzafq0 = null;
                SparseArray sparseArray0 = this.b;
                c0 c00 = (c0)sparseArray0.get(v18 & 0xFF);
                if(!this.e) {
                    if(c00 == null) {
                        if((v18 & 0xFF) == 0xBD) {
                            zzafq1 = new zzafq(null);
                            this.f = true;
                            this.h = zzys0.zzf();
                            zzafq0 = zzafq1;
                        }
                        else if((v18 & 0xE0) == 0xC0) {
                            zzafq1 = new zzago(null);
                            this.f = true;
                            this.h = zzys0.zzf();
                            zzafq0 = zzafq1;
                        }
                        else if((v18 & 0xF0) == 0xE0) {
                            zzafq1 = new zzagc(null);
                            this.g = true;
                            this.h = zzys0.zzf();
                            zzafq0 = zzafq1;
                        }
                        if(zzafq0 != null) {
                            zzahm zzahm0 = new zzahm(0x80000000, v18 & 0xFF, 0x100);
                            zzafq0.zzb(this.j, zzahm0);
                            c00 = new c0(zzafq0, this.a);
                            sparseArray0.put(v18 & 0xFF, c00);
                        }
                    }
                    long v19 = !this.f || !this.g ? 0x100000L : this.h + 0x2000L;
                    if(zzys0.zzf() > v19) {
                        this.e = true;
                        this.j.zzB();
                    }
                }
                ((zzyl)zzys0).zzm(zzdy1.zzH(), 0, 2, false);
                zzdy1.zzF(0);
                int v20 = zzdy1.zzo();
                if(c00 == null) {
                    ((zzyl)zzys0).zzo(v20 + 6, false);
                    return 0;
                }
                zzdy1.zzC(v20 + 6);
                ((zzyl)zzys0).zzn(zzdy1.zzH(), 0, v20 + 6, false);
                zzdy1.zzF(6);
                zzdx zzdx0 = c00.c;
                zzdy1.zzB(zzdx0.zza, 0, 3);
                zzdx0.zzh(0);
                zzdx0.zzj(8);
                c00.d = zzdx0.zzl();
                c00.e = zzdx0.zzl();
                zzdx0.zzj(6);
                int v21 = zzdx0.zzc(8);
                zzdy1.zzB(zzdx0.zza, 0, v21);
                zzdx0.zzh(0);
                if(c00.d) {
                    zzdx0.zzj(4);
                    int v22 = zzdx0.zzc(3);
                    zzdx0.zzj(1);
                    int v23 = zzdx0.zzc(15);
                    zzdx0.zzj(1);
                    long v24 = ((long)v22) << 30 | ((long)(v23 << 15)) | ((long)zzdx0.zzc(15));
                    zzdx0.zzj(1);
                    zzee zzee0 = c00.b;
                    if(!c00.f && c00.e) {
                        zzdx0.zzj(4);
                        int v25 = zzdx0.zzc(3);
                        zzdx0.zzj(1);
                        int v26 = zzdx0.zzc(15);
                        zzdx0.zzj(1);
                        int v27 = zzdx0.zzc(15);
                        zzdx0.zzj(1);
                        zzee0.zzb(((long)v25) << 30 | ((long)(v26 << 15)) | ((long)v27));
                        c00.f = true;
                    }
                    v28 = v24;
                    v29 = zzee0.zzb(v28);
                }
                else {
                    v29 = 0L;
                }
                c00.a.zzd(v29, 4);
                c00.a.zza(zzdy1);
                c00.a.zzc();
                zzdy1.zzE(zzdy1.zzb());
                return 0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.j = zzyu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        zzee zzee0 = this.a;
        if(zzee0.zze() == 0x8000000000000001L) {
            zzee0.zzf(v1);
        }
        else {
            long v2 = zzee0.zzc();
            if(v2 != 0x8000000000000001L && v2 != 0L && v2 != v1) {
                zzee0.zzf(v1);
            }
        }
        a a0 = this.i;
        if(a0 != null) {
            a0.zzd(v1);
        }
        for(int v3 = 0; true; ++v3) {
            SparseArray sparseArray0 = this.b;
            if(v3 >= sparseArray0.size()) {
                break;
            }
            c0 c00 = (c0)sparseArray0.valueAt(v3);
            c00.f = false;
            c00.a.zze();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        byte[] arr_b = new byte[14];
        ((zzyl)zzys0).zzm(arr_b, 0, 14, false);
        if(((arr_b[0] & 0xFF) << 24 | (arr_b[1] & 0xFF) << 16 | (arr_b[2] & 0xFF) << 8 | arr_b[3] & 0xFF) != 442) {
            return false;
        }
        if((arr_b[4] & 0xC4) != 68) {
            return false;
        }
        if((arr_b[6] & 4) != 4) {
            return false;
        }
        if((arr_b[8] & 4) != 4) {
            return false;
        }
        if((arr_b[9] & 1) != 1) {
            return false;
        }
        if((arr_b[12] & 3) != 3) {
            return false;
        }
        ((zzyl)zzys0).zzl(arr_b[13] & 7, false);
        ((zzyl)zzys0).zzm(arr_b, 0, 3, false);
        return ((arr_b[0] & 0xFF) << 16 | (arr_b[1] & 0xFF) << 8 | arr_b[2] & 0xFF) == 1;
    }
}

