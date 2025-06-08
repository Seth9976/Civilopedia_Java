package com.google.android.gms.internal.ads;

import A.f;

public final class zzzs {
    public final zzzv zza;
    public final zzzv zzb;

    public zzzs(zzzv zzzv0, zzzv zzzv1) {
        this.zza = zzzv0;
        this.zzb = zzzv1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzzs.class == class0 && this.zza.equals(((zzzs)object0).zza) && this.zzb.equals(((zzzs)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zzb.hashCode() + this.zza.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        String s = this.zza.toString();
        return this.zza.equals(this.zzb) ? f.j("[", s, "", "]") : f.j("[", s, ", " + this.zzb.toString(), "]");
    }
}

