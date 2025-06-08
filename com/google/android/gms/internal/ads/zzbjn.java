package com.google.android.gms.internal.ads;

public final class zzbjn {
    public static final zzbjb zza;
    public static final zzbjb zzb;
    public static final zzbjb zzc;
    public static final zzbjb zzd;
    public static final zzbjb zze;
    public static final zzbjb zzf;
    public static final zzbjb zzg;
    public static final zzbjb zzh;
    public static final zzbjb zzi;

    static {
        zzbjn.zza = zzbjb.zzd("gads:init:init_on_bg_thread", true);
        zzbjn.zzb = zzbjb.zzd("gads:init:init_on_single_bg_thread", false);
        zzbjn.zzc = zzbjb.zzd("gads:adloader_load_bg_thread", true);
        zzbjn.zzd = zzbjb.zzd("gads:appopen_load_on_bg_thread", true);
        zzbjn.zze = zzbjb.zzd("gads:banner_load_bg_thread", true);
        zzbjn.zzf = zzbjb.zzd("gads:interstitial_load_on_bg_thread", true);
        zzbjn.zzg = zzbjb.zzd("gads:persist_flags_on_bg_thread", false);
        zzbjn.zzh = zzbjb.zzd("gads:query_info_bg_thread", true);
        zzbjn.zzi = zzbjb.zzd("gads:rewarded_load_bg_thread", true);
    }
}

