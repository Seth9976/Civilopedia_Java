package com.google.android.gms.internal.measurement;

public final class zzoy implements zzox {
    public static final zzia zza;
    public static final zzia zzb;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zza();
        zzoy.zza = zzhx0.zzf("measurement.module.pixie.ees", true);
        zzoy.zzb = zzhx0.zzf("measurement.module.pixie.fix_array", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzox
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzox
    public final boolean zzb() {
        return ((Boolean)zzoy.zzb.zzb()).booleanValue();
    }
}

