package com.google.android.gms.internal.measurement;

public final class zzoa implements zznz {
    public static final zzia zza;
    public static final zzia zzb;
    public static final zzia zzc;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zzb().zza();
        zzoa.zza = zzhx0.zzf("measurement.collection.event_safelist", true);
        zzoa.zzb = zzhx0.zzf("measurement.service.store_null_safelist", true);
        zzoa.zzc = zzhx0.zzf("measurement.service.store_safelist", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zznz
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zznz
    public final boolean zzb() {
        return ((Boolean)zzoa.zzb.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznz
    public final boolean zzc() {
        return ((Boolean)zzoa.zzc.zzb()).booleanValue();
    }
}

