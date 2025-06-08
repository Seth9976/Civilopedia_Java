package com.google.android.gms.internal.measurement;

public final class zznx implements zznw {
    public static final zzia zza;
    public static final zzia zzb;
    public static final zzia zzc;
    public static final zzia zzd;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zzb().zza();
        zznx.zza = zzhx0.zzf("measurement.enhanced_campaign.client", true);
        zznx.zzb = zzhx0.zzf("measurement.enhanced_campaign.service", true);
        zznx.zzc = zzhx0.zzf("measurement.enhanced_campaign.srsltid.client", true);
        zznx.zzd = zzhx0.zzf("measurement.enhanced_campaign.srsltid.service", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zznw
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zznw
    public final boolean zzb() {
        return ((Boolean)zznx.zza.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznw
    public final boolean zzc() {
        return ((Boolean)zznx.zzb.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznw
    public final boolean zzd() {
        return ((Boolean)zznx.zzc.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznw
    public final boolean zze() {
        return ((Boolean)zznx.zzd.zzb()).booleanValue();
    }
}

