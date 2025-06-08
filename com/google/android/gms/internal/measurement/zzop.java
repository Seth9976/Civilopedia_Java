package com.google.android.gms.internal.measurement;

public final class zzop implements zzoo {
    public static final zzia zza;
    public static final zzia zzb;
    public static final zzia zzc;
    public static final zzia zzd;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zza();
        zzop.zza = zzhx0.zzf("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzop.zzb = zzhx0.zzf("measurement.sdk.collection.last_deep_link_referrer2", true);
        zzop.zzc = zzhx0.zzf("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzop.zzd = zzhx0.zzd("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzoo
    public final boolean zza() {
        return ((Boolean)zzop.zzc.zzb()).booleanValue();
    }
}

