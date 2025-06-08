package com.google.android.gms.internal.measurement;

public final class zzos implements zzor {
    public static final zzia zza;
    public static final zzia zzb;
    public static final zzia zzc;
    public static final zzia zzd;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zza();
        zzos.zza = zzhx0.zzd("measurement.id.lifecycle.app_in_background_parameter", 0L);
        zzos.zzb = zzhx0.zzf("measurement.lifecycle.app_backgrounded_tracking", true);
        zzos.zzc = zzhx0.zzf("measurement.lifecycle.app_in_background_parameter", false);
        zzos.zzd = zzhx0.zzd("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzor
    public final boolean zza() {
        return ((Boolean)zzos.zzc.zzb()).booleanValue();
    }
}

