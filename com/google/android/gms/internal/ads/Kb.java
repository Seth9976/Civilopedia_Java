package com.google.android.gms.internal.ads;

public final class kb implements zztq {
    public final zztq a;
    public boolean b;
    public final zzrf c;

    public kb(zzrf zzrf0, zztq zztq0) {
        this.c = zzrf0;
        this.a = zztq0;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final int zza(zziz zziz0, zzgb zzgb0, int v) {
        zzrf zzrf0 = this.c;
        if(zzrf0.a()) {
            return -3;
        }
        if(this.b) {
            zzgb0.zzc(4);
            return -4;
        }
        int v1 = this.a.zza(zziz0, zzgb0, v);
        if(v1 == -5) {
            zzad zzad0 = zziz0.zza;
            zzad0.getClass();
            int v2 = zzad0.zzC;
            int v3 = 0;
            if(v2 != 0) {
            label_15:
                if(zzrf0.l == 0x8000000000000000L) {
                    v3 = zzad0.zzD;
                }
                zzab zzab0 = zzad0.zzb();
                zzab0.zzC(v2);
                zzab0.zzD(v3);
                zziz0.zza = zzab0.zzY();
            }
            else if(zzad0.zzD != 0) {
                v2 = 0;
                goto label_15;
            }
            return -5;
        }
        if(zzrf0.l != 0x8000000000000000L && (v1 == -4 && zzgb0.zzd >= zzrf0.l || v1 == -3 && zzrf0.zzb() == 0x8000000000000000L && !zzgb0.zzc)) {
            zzgb0.zzb();
            zzgb0.zzc(4);
            this.b = true;
            return -4;
        }
        return v1;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zztq
    public final int zzb(long v) {
        return this.c.a() ? -3 : this.a.zzb(v);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzd() {
        this.a.zzd();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zze() {
        return !this.c.a() && this.a.zze();
    }
}

