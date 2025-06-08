package com.google.android.gms.internal.measurement;

public final class zzpk implements zzpj {
    public static final zzia zza;
    public static final zzia zzb;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpk.zza = zzhx0.zzf("measurement.collection.enable_session_stitching_token.client.dev", false);
        zzpk.zzb = zzhx0.zzf("measurement.collection.enable_session_stitching_token.service", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpj
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpj
    public final boolean zzb() {
        return ((Boolean)zzpk.zza.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpj
    public final boolean zzc() {
        return ((Boolean)zzpk.zzb.zzb()).booleanValue();
    }
}

