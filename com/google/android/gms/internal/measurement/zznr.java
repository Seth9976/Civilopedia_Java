package com.google.android.gms.internal.measurement;

public final class zznr implements zznq {
    public static final zzia zzA;
    public static final zzia zzB;
    public static final zzia zzC;
    public static final zzia zzD;
    public static final zzia zzE;
    public static final zzia zzF;
    public static final zzia zzG;
    public static final zzia zzH;
    public static final zzia zzI;
    public static final zzia zzJ;
    public static final zzia zzK;
    public static final zzia zzL;
    public static final zzia zzM;
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
    public static final zzia zzp;
    public static final zzia zzq;
    public static final zzia zzr;
    public static final zzia zzs;
    public static final zzia zzt;
    public static final zzia zzu;
    public static final zzia zzv;
    public static final zzia zzw;
    public static final zzia zzx;
    public static final zzia zzy;
    public static final zzia zzz;

    static {
        zzhx zzhx0 = new zzhx(zzhp.zza("com.google.android.gms.measurement")).zza();
        zznr.zza = zzhx0.zzd("measurement.ad_id_cache_time", 10000L);
        zznr.zzb = zzhx0.zzd("measurement.max_bundles_per_iteration", 100L);
        zznr.zzc = zzhx0.zzd("measurement.config.cache_time", 86400000L);
        zznr.zzd = zzhx0.zze("measurement.log_tag", "FA");
        zznr.zze = zzhx0.zze("measurement.config.url_authority", "app-measurement.com");
        zznr.zzf = zzhx0.zze("measurement.config.url_scheme", "https");
        zznr.zzg = zzhx0.zzd("measurement.upload.debug_upload_interval", 1000L);
        zznr.zzh = zzhx0.zzd("measurement.lifetimevalue.max_currency_tracked", 4L);
        zznr.zzi = zzhx0.zzd("measurement.store.max_stored_events_per_app", 100000L);
        zznr.zzj = zzhx0.zzd("measurement.experiment.max_ids", 50L);
        zznr.zzk = zzhx0.zzd("measurement.audience.filter_result_max_count", 200L);
        zznr.zzl = zzhx0.zzd("measurement.alarm_manager.minimum_interval", 60000L);
        zznr.zzm = zzhx0.zzd("measurement.upload.minimum_delay", 500L);
        zznr.zzn = zzhx0.zzd("measurement.monitoring.sample_period_millis", 86400000L);
        zznr.zzo = zzhx0.zzd("measurement.upload.realtime_upload_interval", 10000L);
        zznr.zzp = zzhx0.zzd("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        zznr.zzq = zzhx0.zzd("measurement.config.cache_time.service", 3600000L);
        zznr.zzr = zzhx0.zzd("measurement.service_client.idle_disconnect_millis", 5000L);
        zznr.zzs = zzhx0.zze("measurement.log_tag.service", "FA-SVC");
        zznr.zzt = zzhx0.zzd("measurement.upload.stale_data_deletion_interval", 86400000L);
        zznr.zzu = zzhx0.zzd("measurement.sdk.attribution.cache.ttl", 604800000L);
        zznr.zzv = zzhx0.zzd("measurement.redaction.app_instance_id.ttl", 7200000L);
        zznr.zzw = zzhx0.zzd("measurement.upload.backoff_period", 43200000L);
        zznr.zzx = zzhx0.zzd("measurement.upload.initial_upload_delay_time", 15000L);
        zznr.zzy = zzhx0.zzd("measurement.upload.interval", 3600000L);
        zznr.zzz = zzhx0.zzd("measurement.upload.max_bundle_size", 0x10000L);
        zznr.zzA = zzhx0.zzd("measurement.upload.max_bundles", 100L);
        zznr.zzB = zzhx0.zzd("measurement.upload.max_conversions_per_day", 500L);
        zznr.zzC = zzhx0.zzd("measurement.upload.max_error_events_per_day", 1000L);
        zznr.zzD = zzhx0.zzd("measurement.upload.max_events_per_bundle", 1000L);
        zznr.zzE = zzhx0.zzd("measurement.upload.max_events_per_day", 100000L);
        zznr.zzF = zzhx0.zzd("measurement.upload.max_public_events_per_day", 50000L);
        zznr.zzG = zzhx0.zzd("measurement.upload.max_queue_time", 2419200000L);
        zznr.zzH = zzhx0.zzd("measurement.upload.max_realtime_events_per_day", 10L);
        zznr.zzI = zzhx0.zzd("measurement.upload.max_batch_size", 0x10000L);
        zznr.zzJ = zzhx0.zzd("measurement.upload.retry_count", 6L);
        zznr.zzK = zzhx0.zzd("measurement.upload.retry_time", 1800000L);
        zznr.zzL = zzhx0.zze("measurement.upload.url", "https://app-measurement.com/a");
        zznr.zzM = zzhx0.zzd("measurement.upload.window_interval", 3600000L);
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzA() {
        return (long)(((Long)zznr.zzF.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzB() {
        return (long)(((Long)zznr.zzG.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzC() {
        return (long)(((Long)zznr.zzH.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzD() {
        return (long)(((Long)zznr.zzI.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzE() {
        return (long)(((Long)zznr.zzJ.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzF() {
        return (long)(((Long)zznr.zzK.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzG() {
        return (long)(((Long)zznr.zzM.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final String zzH() {
        return (String)zznr.zze.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final String zzI() {
        return (String)zznr.zzf.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final String zzJ() {
        return (String)zznr.zzL.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zza() {
        return (long)(((Long)zznr.zza.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzb() {
        return (long)(((Long)zznr.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzc() {
        return (long)(((Long)zznr.zzc.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzd() {
        return (long)(((Long)zznr.zzg.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zze() {
        return (long)(((Long)zznr.zzh.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzf() {
        return (long)(((Long)zznr.zzi.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzg() {
        return (long)(((Long)zznr.zzj.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzh() {
        return (long)(((Long)zznr.zzk.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzi() {
        return (long)(((Long)zznr.zzl.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzj() {
        return (long)(((Long)zznr.zzm.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzk() {
        return (long)(((Long)zznr.zzn.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzl() {
        return (long)(((Long)zznr.zzo.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzm() {
        return (long)(((Long)zznr.zzp.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzn() {
        return (long)(((Long)zznr.zzr.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzo() {
        return (long)(((Long)zznr.zzt.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzp() {
        return (long)(((Long)zznr.zzu.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzq() {
        return (long)(((Long)zznr.zzv.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzr() {
        return (long)(((Long)zznr.zzw.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzs() {
        return (long)(((Long)zznr.zzx.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzt() {
        return (long)(((Long)zznr.zzy.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzu() {
        return (long)(((Long)zznr.zzz.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzv() {
        return (long)(((Long)zznr.zzA.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzw() {
        return (long)(((Long)zznr.zzB.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzx() {
        return (long)(((Long)zznr.zzC.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzy() {
        return (long)(((Long)zznr.zzD.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final long zzz() {
        return (long)(((Long)zznr.zzE.zzb()));
    }
}

