package com.google.android.gms.internal.ads;

public final class zzbjo {
    public static final zzbjb zza;
    public static final zzbjb zzb;
    public static final zzbjb zzc;
    public static final zzbjb zzd;
    public static final zzbjb zze;
    public static final zzbjb zzf;
    public static final zzbjb zzg;
    public static final zzbjb zzh;
    public static final zzbjb zzi;
    public static final zzbjb zzj;
    public static final zzbjb zzk;

    static {
        zzbjo.zza = zzbjb.zzc("gads:gma_attestation:click:macro_string", "@click_attok@");
        zzbjo.zzb = zzbjb.zzc("gads:gma_attestation:click:query_param", "attok");
        zzbjo.zzc = zzbjb.zzb("gads:gma_attestation:click:timeout", 2000L);
        zzbjo.zzd = zzbjb.zzd("gads:gma_attestation:click:enable", false);
        zzbjo.zze = zzbjb.zzb("gads:gma_attestation:click:enable_dynamite_version", 213806100L);
        zzbjo.zzf = zzbjb.zzd("gads:gma_attestation:click:qualification:enable", true);
        zzbjo.zzg = zzbjb.zzd("gads:gma_attestation:image_hash", false);
        zzbjo.zzh = zzbjb.zzd("gads:gma_attestation:impression:enable", true);
        zzbjo.zzi = zzbjb.zzd("gads:gma_attestation:request:enable_javascript", false);
        zzbjo.zzj = zzbjb.zzd("gads:gma_attestation:request:enable", true);
        zzbjo.zzk = zzbjb.zzd("gads:gma_attestation:click:report_error", true);
    }
}

