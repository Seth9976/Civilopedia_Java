package com.google.android.gms.internal.measurement;

public final class zznu implements zznt {
    public static final zzia zza;
    public static final zzia zzb;
    public static final zzia zzc;
    public static final zzia zzd;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zza();
        zznu.zza = zzhx0.zzf("measurement.client.consent_state_v1", true);
        zznu.zzb = zzhx0.zzf("measurement.client.3p_consent_state_v1", true);
        zznu.zzc = zzhx0.zzf("measurement.service.consent_state_v1_W36", true);
        zznu.zzd = zzhx0.zzd("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override  // com.google.android.gms.internal.measurement.zznt
    public final long zza() {
        return (long)(((Long)zznu.zzd.zzb()));
    }
}

