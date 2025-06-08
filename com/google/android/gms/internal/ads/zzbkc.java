package com.google.android.gms.internal.ads;

public final class zzbkc {
    public static final zzbjb zza;
    public static final zzbjb zzb;
    public static final zzbjb zzc;
    public static final zzbjb zzd;

    static {
        zzbkc.zza = zzbjb.zzd("gads:always_collect_trustless_token_at_native_side", false);
        zzbkc.zzb = zzbjb.zzd("gms:expose_token_for_gma:enabled", true);
        zzbkc.zzc = zzbjb.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbkc.zzd = zzbjb.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}

