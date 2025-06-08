package com.google.android.gms.internal.ads;

public final class zzgqs implements zzgqu {
    public zzgrh a;

    public static void zza(zzgrh zzgrh0, zzgrh zzgrh1) {
        if(((zzgqs)zzgrh0).a != null) {
            throw new IllegalStateException();
        }
        ((zzgqs)zzgrh0).a = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzgrh zzgrh0 = this.a;
        if(zzgrh0 == null) {
            throw new IllegalStateException();
        }
        return zzgrh0.zzb();
    }
}

