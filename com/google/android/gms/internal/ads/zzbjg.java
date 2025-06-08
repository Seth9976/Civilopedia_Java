package com.google.android.gms.internal.ads;

public final class zzbjg {
    public static final zzbjb zza;
    public static final zzbjb zzb;
    public static final zzbjb zzc;
    public static final zzbjb zzd;
    public static final zzbjb zze;

    static {
        zzbjg.zza = zzbjc.zzf("gads:consent:gmscore:dsid:enabled", true);
        zzbjg.zzb = zzbjc.zzf("gads:consent:gmscore:lat:enabled", true);
        zzbjg.zzc = new zzbjc(4, "https://adservice.google.com/getconfig/pubvendors", "gads:consent:gmscore:backend_url");  // 初始化器: Lcom/google/android/gms/internal/ads/zzbjb;-><init>(ILjava/lang/Object;Ljava/lang/String;)V
        zzbjg.zzd = new zzbjc(2, 10000L, "gads:consent:gmscore:time_out");  // 初始化器: Lcom/google/android/gms/internal/ads/zzbjb;-><init>(ILjava/lang/Object;Ljava/lang/String;)V
        zzbjg.zze = zzbjc.zzf("gads:consent:gmscore:enabled", true);
    }
}

