package com.google.android.gms.internal.ads;

import A.f;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

public final class zzfzi extends zzgas {
    public zzfzi() {
        zzgat[] arr_zzgat = {new G8(zzfwl.class, 9)};
        super(zzgdc.class, arr_zzgat);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new H8(zzgdf.class, 8);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgdc.zze(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        zzgim.zzb(((zzgdc)zzgma0).zza(), 0);
        if(((zzgdc)zzgma0).zzf().zzd() != 0x40) {
            throw new InvalidKeyException(f.e(((zzgdc)zzgma0).zzf().zzd(), "invalid key size: ", ". Valid keys must have 64 bytes."));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}

