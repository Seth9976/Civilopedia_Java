package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgay extends zzgas {
    public static void a(zzgbp zzgbp0) {
        if(zzgbp0.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if(zzgbp0.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new H8(zzgbm.class, 11);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgbj.zze(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        zzgim.zzb(((zzgbj)zzgma0).zza(), 0);
        if(((zzgbj)zzgma0).zzg().zzd() != 0x20) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        zzgay.a(((zzgbj)zzgma0).zzf());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}

