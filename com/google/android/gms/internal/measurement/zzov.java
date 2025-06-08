package com.google.android.gms.internal.measurement;

public final class zzov implements zzou {
    public static final zzia zza;
    public static final zzia zzb;
    public static final zzia zzc;
    public static final zzia zzd;
    public static final zzia zze;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zza();
        zzov.zza = zzhx0.zzf("measurement.test.boolean_flag", false);
        zzov.zzb = zzhx0.zzc("measurement.test.double_flag", -3.0);
        zzov.zzc = zzhx0.zzd("measurement.test.int_flag", -2L);
        zzov.zzd = zzhx0.zzd("measurement.test.long_flag", -1L);
        zzov.zze = zzhx0.zze("measurement.test.string_flag", "---");
    }

    @Override  // com.google.android.gms.internal.measurement.zzou
    public final double zza() {
        return (double)(((Double)zzov.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzou
    public final long zzb() {
        return (long)(((Long)zzov.zzc.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzou
    public final long zzc() {
        return (long)(((Long)zzov.zzd.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzou
    public final String zzd() {
        return (String)zzov.zze.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzou
    public final boolean zze() {
        return ((Boolean)zzov.zza.zzb()).booleanValue();
    }
}

