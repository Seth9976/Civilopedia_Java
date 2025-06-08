package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgam extends zzgas {
    public zzgam() {
        zzgat[] arr_zzgat = {new G8(zzfwn.class, 13)};
        super(zzgfg.class, arr_zzgat);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgfg.zzg(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        zzgim.zzb(((zzgfg)zzgma0).zza(), 0);
        if(!((zzgfg)zzgma0).zzl()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        zzgan.a(((zzgfg)zzgma0).zzc());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 5;
    }
}

