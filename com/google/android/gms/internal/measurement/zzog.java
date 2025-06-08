package com.google.android.gms.internal.measurement;

public final class zzog implements zzof {
    public static final zzia zza;
    public static final zzia zzb;
    public static final zzia zzc;
    public static final zzia zzd;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zza();
        zzog.zza = zzhx0.zzf("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        zzog.zzb = zzhx0.zzf("measurement.audience.refresh_event_count_filters_timestamp", false);
        zzog.zzc = zzhx0.zzf("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        zzog.zzd = zzhx0.zzf("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzof
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzof
    public final boolean zzb() {
        return ((Boolean)zzog.zzb.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzof
    public final boolean zzc() {
        return ((Boolean)zzog.zzc.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzof
    public final boolean zzd() {
        return ((Boolean)zzog.zzd.zzb()).booleanValue();
    }
}

