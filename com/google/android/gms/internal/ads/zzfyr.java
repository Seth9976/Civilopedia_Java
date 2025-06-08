package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfyr extends zzgas {
    public zzfyr() {
        zzgat[] arr_zzgat = {new G8(zzfwf.class, 8)};
        super(zzggv.class, arr_zzgat);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new H8(zzggy.class, 7);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzggv.zze(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        zzgim.zzb(((zzggv)zzgma0).zza(), 0);
        if(((zzggv)zzgma0).zzf().zzd() != 0x20) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}

