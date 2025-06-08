package com.google.android.gms.internal.measurement;

public final class zzod implements zzoc {
    public static final zzia zza;

    static {
        zzod.zza = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zza().zzf("measurement.client.firebase_feature_rollout.v1.enable", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzoc
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzoc
    public final boolean zzb() {
        return ((Boolean)zzod.zza.zzb()).booleanValue();
    }
}

