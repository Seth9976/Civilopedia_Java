package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfyh extends zzgas {
    public zzfyh() {
        zzgat[] arr_zzgat = {new G8(zzfwf.class, 5)};
        super(zzgdi.class, arr_zzgat);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new H8(zzgdl.class, 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgdi.zze(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        zzgim.zzb(((zzgdi)zzgma0).zza(), 0);
        if(((zzgdi)zzgma0).zzf().zzd() != 0x20) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}

