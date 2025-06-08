package com.google.android.gms.internal.measurement;

public final class zzom implements zzol {
    public static final zzia zza;
    public static final zzia zzb;
    public static final zzia zzc;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zza();
        zzom.zza = zzhx0.zzf("measurement.client.sessions.check_on_reset_and_enable2", true);
        zzom.zzb = zzhx0.zzf("measurement.client.sessions.check_on_startup", true);
        zzom.zzc = zzhx0.zzf("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzol
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzol
    public final boolean zzb() {
        return ((Boolean)zzom.zza.zzb()).booleanValue();
    }
}

