package com.google.android.gms.internal.measurement;

public final class zzpe implements zzpd {
    public static final zzia zza;
    public static final zzia zzb;
    public static final zzia zzc;
    public static final zzia zzd;
    public static final zzia zze;
    public static final zzia zzf;
    public static final zzia zzg;
    public static final zzia zzh;
    public static final zzia zzi;
    public static final zzia zzj;
    public static final zzia zzk;
    public static final zzia zzl;
    public static final zzia zzm;
    public static final zzia zzn;
    public static final zzia zzo;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpe.zza = zzhx0.zzf("measurement.redaction.app_instance_id", true);
        zzpe.zzb = zzhx0.zzf("measurement.redaction.client_ephemeral_aiid_generation", true);
        zzpe.zzc = zzhx0.zzf("measurement.redaction.config_redacted_fields", true);
        zzpe.zzd = zzhx0.zzf("measurement.redaction.device_info", true);
        zzpe.zze = zzhx0.zzf("measurement.redaction.e_tag", true);
        zzpe.zzf = zzhx0.zzf("measurement.redaction.enhanced_uid", true);
        zzpe.zzg = zzhx0.zzf("measurement.redaction.populate_ephemeral_app_instance_id", true);
        zzpe.zzh = zzhx0.zzf("measurement.redaction.google_signals", true);
        zzpe.zzi = zzhx0.zzf("measurement.redaction.no_aiid_in_config_request", true);
        zzpe.zzj = zzhx0.zzf("measurement.redaction.retain_major_os_version", true);
        zzpe.zzk = zzhx0.zzf("measurement.redaction.scion_payload_generator", false);
        zzpe.zzl = zzhx0.zzf("measurement.redaction.upload_redacted_fields", true);
        zzpe.zzm = zzhx0.zzf("measurement.redaction.upload_subdomain_override", true);
        zzpe.zzn = zzhx0.zzf("measurement.redaction.user_id", true);
        zzpe.zzo = zzhx0.zzd("measurement.id.redaction", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzb() {
        return ((Boolean)zzpe.zza.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzc() {
        return ((Boolean)zzpe.zzb.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzd() {
        return ((Boolean)zzpe.zzc.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zze() {
        return ((Boolean)zzpe.zzd.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzf() {
        return ((Boolean)zzpe.zze.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzg() {
        return ((Boolean)zzpe.zzf.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzh() {
        return ((Boolean)zzpe.zzg.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzi() {
        return ((Boolean)zzpe.zzh.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzj() {
        return ((Boolean)zzpe.zzi.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzk() {
        return ((Boolean)zzpe.zzj.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzl() {
        return ((Boolean)zzpe.zzk.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzm() {
        return ((Boolean)zzpe.zzl.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzn() {
        return ((Boolean)zzpe.zzm.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpd
    public final boolean zzo() {
        return ((Boolean)zzpe.zzn.zzb()).booleanValue();
    }
}

