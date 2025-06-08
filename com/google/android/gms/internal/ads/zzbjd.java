package com.google.android.gms.internal.ads;

public final class zzbjd {
    public static final zzbjb zza;
    public static final zzbjb zzb;
    public static final zzbjb zzc;
    public static final zzbjb zzd;

    static {
        zzbjd.zza = zzbjb.zzd("gads:afs:csa_send_tcf_data", true);
        zzbjd.zzb = zzbjb.zzc("gads:afs:csa_tcf_data_to_collect", "[{\"bk\":\"tcString\",\"sk\":\"IABTCF_TCString\",\"type\":0},{\"bk\":\"gdprApplies\",\"sk\":\"IABTCF_gdprApplies\",\"type\":1},{\"bk\":\"usPrivacy\",\"sk\":\"IABUSPrivacy_String\",\"type\":0}]");
        zzbjd.zzc = zzbjb.zzc("gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
        zzbjd.zzd = zzbjb.zzc("gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    }
}

