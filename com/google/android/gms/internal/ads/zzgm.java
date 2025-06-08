package com.google.android.gms.internal.ads;

import A.f;

public final class zzgm {
    public final String zza;
    public final zzad zzb;
    public final zzad zzc;
    public final int zzd;
    public final int zze;

    public zzgm(String s, zzad zzad0, zzad zzad1, int v, int v1) {
        boolean z = true;
        if(v != 0) {
            if(v1 == 0) {
                v1 = 0;
            }
            else {
                z = false;
            }
        }
        zzcw.zzd(z);
        zzcw.zzc(s);
        this.zza = s;
        zzad0.getClass();
        this.zzb = zzad0;
        zzad1.getClass();
        this.zzc = zzad1;
        this.zzd = v;
        this.zze = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzgm.class == class0 && this.zzd == ((zzgm)object0).zzd && this.zze == ((zzgm)object0).zze && this.zza.equals(((zzgm)object0).zza) && this.zzb.equals(((zzgm)object0).zzb) && this.zzc.equals(((zzgm)object0).zzc);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zzc.hashCode() + (this.zzb.hashCode() + f.b(((this.zzd + 0x20F) * 0x1F + this.zze) * 0x1F, 0x1F, this.zza)) * 0x1F;
    }
}

