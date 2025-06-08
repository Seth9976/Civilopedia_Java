package com.google.android.gms.internal.ads;

public final class zzbkb {
    public static final zzbjb zza;
    public static final zzbjb zzb;
    public static final zzbjb zzc;

    static {
        zzbkb.zza = zzbjb.zzb("gads:ad_loader:timeout_ms", 60000L);
        zzbkb.zzb = zzbjb.zzb("gads:rendering:timeout_ms", 60000L);
        zzbkb.zzc = zzbjb.zzb("gads:resolve_future:default_timeout_ms", 30000L);
    }
}

