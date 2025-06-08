package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgak extends zzgau {
    public zzgak() {
        zzgat[] arr_zzgat = {new G8(zzfwm.class, 12)};
        super(zzgfd.class, arr_zzgat);
    }

    public static zzgaq a(int v, int v1) {
        zzgez zzgez0 = zzgfa.zza();
        zzgez0.zzc(3);
        zzgez0.zzb(3);
        zzgez0.zza(v);
        zzgfa zzgfa0 = (zzgfa)zzgez0.zzal();
        zzgew zzgew0 = zzgex.zza();
        zzgew0.zza(zzgfa0);
        return new zzgaq(((zzgex)zzgew0.zzal()), v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new H8(zzgex.class, 10);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgfd.zze(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        if(((zzgfd)zzgma0).zzg().zzD()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if(!((zzgfd)zzgma0).zzk()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        zzgim.zzb(((zzgfd)zzgma0).zza(), 0);
        zzgan.a(((zzgfd)zzgma0).zzf().zzc());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 4;
    }
}

