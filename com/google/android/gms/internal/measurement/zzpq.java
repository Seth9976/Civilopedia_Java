package com.google.android.gms.internal.measurement;

public final class zzpq implements zzpp {
    public static final zzia zza;

    static {
        zzpq.zza = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zza().zzf("measurement.integration.disable_firebase_instance_id", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpp
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpp
    public final boolean zzb() {
        return ((Boolean)zzpq.zza.zzb()).booleanValue();
    }
}

