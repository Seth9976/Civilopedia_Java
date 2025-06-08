package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzafv implements zzyr {
    public final zzafw a;
    public final zzdy b;
    public final zzdy c;
    public final zzdx d;
    public zzyu e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public static final zzyy zza;

    static {
        zzafv.zza = zzafu.zza;
    }

    public zzafv() {
        this(0);
    }

    public zzafv(int v) {
        this.a = new zzafw(true, null);
        this.b = new zzdy(0x800);
        this.g = -1L;
        zzdy zzdy0 = new zzdy(10);
        this.c = zzdy0;
        byte[] arr_b = zzdy0.zzH();
        this.d = new zzdx(arr_b, arr_b.length);
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        zzcw.zzb(this.e);
        zzdy zzdy0 = this.b;
        int v = zzys0.zza(zzdy0.zzH(), 0, 0x800);
        if(!this.i) {
            this.e.zzL(new zzzt(0x8000000000000001L, 0L));
            this.i = true;
        }
        if(v == -1) {
            return -1;
        }
        zzdy0.zzF(0);
        zzdy0.zzE(v);
        zzafw zzafw0 = this.a;
        if(!this.h) {
            zzafw0.zzd(this.f, 4);
            this.h = true;
        }
        zzafw0.zza(zzdy0);
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.e = zzyu0;
        zzahm zzahm0 = new zzahm(0x80000000, 0, 1);
        this.a.zzb(zzyu0, zzahm0);
        zzyu0.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        this.h = false;
        this.a.zze();
        this.f = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        zzdy zzdy0;
        int v = 0;
        while(true) {
            zzdy0 = this.c;
            ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 10, false);
            zzdy0.zzF(0);
            if(zzdy0.zzm() != 4801587) {
                break;
            }
            zzdy0.zzG(3);
            int v1 = zzdy0.zzj();
            v += v1 + 10;
            ((zzyl)zzys0).zzl(v1, false);
        }
        zzys0.zzj();
        ((zzyl)zzys0).zzl(v, false);
        if(this.g == -1L) {
            this.g = (long)v;
        }
        int v2 = v;
        int v3 = 0;
        int v4 = 0;
        do {
            ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 2, false);
            zzdy0.zzF(0);
            if(zzafw.zzf(zzdy0.zzo())) {
                ++v3;
                if(v3 >= 4 && v4 > 0xBC) {
                    return true;
                }
                ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 4, false);
                this.d.zzh(14);
                int v5 = this.d.zzc(13);
                if(v5 <= 6) {
                    ++v2;
                    zzys0.zzj();
                    ((zzyl)zzys0).zzl(v2, false);
                    v3 = 0;
                    v4 = 0;
                }
                else {
                    ((zzyl)zzys0).zzl(v5 - 6, false);
                    v4 += v5;
                }
            }
            else {
                ++v2;
                zzys0.zzj();
                ((zzyl)zzys0).zzl(v2, false);
                v3 = 0;
                v4 = 0;
            }
        }
        while(v2 - v < 0x2000);
        return false;
    }
}

