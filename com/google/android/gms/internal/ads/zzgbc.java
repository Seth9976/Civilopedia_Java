package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgbc {
    @Deprecated
    public static final zzggs zza;
    @Deprecated
    public static final zzggs zzb;
    @Deprecated
    public static final zzggs zzc;

    static {
        new zzgbb();
        zzggs zzggs0 = zzggs.zzc();
        zzgbc.zza = zzggs0;
        zzgbc.zzb = zzggs0;
        zzgbc.zzc = zzggs0;
        try {
            zzgbc.zza();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfxk.zzn(new V8());  // 初始化器: Ljava/lang/Object;-><init>()V
        zzfxk.zzm(new zzgbb(), true);
        if(zzfzf.zzb()) {
            return;
        }
        zzgat[] arr_zzgat = {new G8(zzfwx.class, 14)};
        zzfxk.zzm(new zzgay(zzgbj.class, arr_zzgat), true);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgas;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/ads/zzgat;)V
    }
}

