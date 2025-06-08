package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzafp implements zzyr {
    public final zzafq a;
    public final zzdy b;
    public boolean c;
    public static final zzyy zza;

    static {
        zzafp.zza = zzafo.zza;
    }

    public zzafp() {
        this.a = new zzafq(null);
        this.b = new zzdy(0xAE2);
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        zzdy zzdy0 = this.b;
        int v = zzys0.zza(zzdy0.zzH(), 0, 0xAE2);
        if(v == -1) {
            return -1;
        }
        zzdy0.zzF(0);
        zzdy0.zzE(v);
        zzafq zzafq0 = this.a;
        if(!this.c) {
            zzafq0.zzd(0L, 4);
            this.c = true;
        }
        zzafq0.zza(zzdy0);
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
            ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 6, false);
            zzdy0.zzF(0);
            if(zzdy0.zzo() == 0xB77) {
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
        int v4 = zzxw.zzb(zzdy0.zzH());
        if(v4 != -1) {
            ((zzyl)zzys0).zzl(v4 - 6, false);
            goto label_14;
        }
        return false;
    }
}

