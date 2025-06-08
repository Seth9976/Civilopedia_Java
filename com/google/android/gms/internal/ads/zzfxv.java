package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfxv extends zzgas {
    public zzfxv() {
        zzgat[] arr_zzgat = {new G8(zzgie.class, 1)};
        super(zzgby.class, arr_zzgat);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new I8(zzgcb.class);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgar;-><init>(Ljava/lang/Class;)V
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgby.zzf(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        zzfxv.zzh(((zzgby)zzgma0));
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }

    public static final void zzh(zzgby zzgby0) throws GeneralSecurityException {
        zzgim.zzb(zzgby0.zza(), 0);
        zzgim.zza(zzgby0.zzh().zzd());
        zzgce zzgce0 = zzgby0.zzg();
        if(zzgce0.zza() < 12 || zzgce0.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}

