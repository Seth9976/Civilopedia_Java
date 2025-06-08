package com.google.android.gms.internal.measurement;

public final class zzni implements zznh {
    public static final zzia zza;
    public static final zzia zzb;
    public static final zzia zzc;
    public static final zzia zzd;
    public static final zzia zze;
    public static final zzia zzf;
    public static final zzia zzg;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zzb().zza();
        zzni.zza = zzhx0.zzf("measurement.adid_zero.app_instance_id_fix", true);
        zzni.zzb = zzhx0.zzf("measurement.adid_zero.service", true);
        zzni.zzc = zzhx0.zzf("measurement.adid_zero.adid_uid", true);
        zzni.zzd = zzhx0.zzf("measurement.adid_zero.only_request_adid_if_enabled", true);
        zzni.zze = zzhx0.zzf("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        zzni.zzf = zzhx0.zzf("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        zzni.zzg = zzhx0.zzf("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zznh
    public final boolean zza() {
        return ((Boolean)zzni.zzd.zzb()).booleanValue();
    }
}

