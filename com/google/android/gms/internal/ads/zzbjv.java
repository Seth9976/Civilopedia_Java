package com.google.android.gms.internal.ads;

public final class zzbjv {
    public static final zzbjb zza;
    public static final zzbjb zzb;
    public static final zzbjb zzc;
    public static final zzbjb zzd;

    static {
        zzbjv.zza = zzbjb.zzd("gads:separate_url_generation:enabled", false);
        zzbjv.zzb = zzbjb.zzd("gads:invoke_leibniz:enabled", false);
        zzbjv.zzc = zzbjb.zzb("gads:url_cache:max_size", 200L);
        zzbjv.zzd = zzbjb.zzd("gads:use_request_id_as_url_cache_key:enabled", false);
    }
}

