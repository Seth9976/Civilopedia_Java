package com.google.android.gms.internal.ads;

public final class zzbjx {
    public static final zzbjb zza;
    public static final zzbjb zzb;
    public static final zzbjb zzc;
    public static final zzbjb zzd;
    public static final zzbjb zze;
    public static final zzbjb zzf;
    public static final zzbjb zzg;

    static {
        zzbjx.zza = zzbjb.zzb("gads:dynamite_load:fail:sample_rate", 10000L);
        zzbjx.zzb = zzbjb.zzd("gads:report_dynamite_crash_in_background_thread", false);
        zzbjx.zzc = zzbjb.zzc("gads:public_beta:traffic_multiplier", "1.0");
        zzbjx.zzd = zzbjb.zzc("gads:sdk_crash_report_class_prefix", "com.google.");
        zzbjx.zze = zzbjb.zzd("gads:sdk_crash_report_enabled", false);
        zzbjx.zzf = zzbjb.zzd("gads:sdk_crash_report_full_stacktrace", false);
        zzbjx.zzg = zzbjb.zza("gads:trapped_exception_sample_rate", 0.01);
    }
}

