package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzafs implements zzyr {
    public final zzaft a;
    public final zzdy b;
    public boolean c;
    public static final zzyy zza;

    static {
        zzafs.zza = zzafr.zza;
    }

    public zzafs() {
        this.a = new zzaft(null);
        this.b = new zzdy(0x4000);
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        zzdy zzdy0 = this.b;
        int v = zzys0.zza(zzdy0.zzH(), 0, 0x4000);
        if(v == -1) {
            return -1;
        }
        zzdy0.zzF(0);
        zzdy0.zzE(v);
        zzaft zzaft0 = this.a;
        if(!this.c) {
            zzaft0.zzd(0L, 4);
            this.c = true;
        }
        zzaft0.zza(zzdy0);
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        zzahm zzahm0 = new zzahm(0x80000000, 0, 1);
        this.a.zzb(zzyu0, zzahm0);
        zzyu0.zzB();
        zzyu0.zzL(new zzzt(0x8000000000000001L, 0L));
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        this.c = false;
        this.a.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        int v6;
        int v4;
        int v3;
        zzdy zzdy0 = new zzdy(10);
        int v = 0;
        while(true) {
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
        int v2 = v;
        while(true) {
            v3 = 0;
        label_14:
            v4 = 7;
            ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 7, false);
            zzdy0.zzF(0);
            int v5 = zzdy0.zzo();
            if(v5 == 0xAC40 || v5 == 44097) {
                break;
            }
            zzys0.zzj();
            ++v2;
            if(v2 - v < 0x2000) {
                ((zzyl)zzys0).zzl(v2, false);
                continue;
            }
            return false;
        }
        ++v3;
        if(v3 >= 4) {
            return true;
        }
        byte[] arr_b = zzdy0.zzH();
        if(arr_b.length < 7) {
            v6 = -1;
        }
        else {
            int v7 = arr_b[3] & 0xFF | (arr_b[2] & 0xFF) << 8;
            if(v7 == 0xFFFF) {
                v7 = (arr_b[4] & 0xFF) << 16 | (arr_b[5] & 0xFF) << 8 | arr_b[6] & 0xFF;
            }
            else {
                v4 = 4;
            }
            if(v5 == 44097) {
                v4 += 2;
            }
            v6 = v7 + v4;
        }
        if(v6 != -1) {
            ((zzyl)zzys0).zzl(v6 - 7, false);
            goto label_14;
        }
        return false;
    }
}

