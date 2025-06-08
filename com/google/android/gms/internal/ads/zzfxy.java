package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfxy extends zzgas {
    public zzfxy() {
        zzgat[] arr_zzgat = {new G8(zzfwf.class, 2)};
        super(zzgch.class, arr_zzgat);
    }

    public static zzgaq a(int v, int v1) {
        zzgcj zzgcj0 = zzgck.zzc();
        zzgcj0.zza(v);
        zzgcm zzgcm0 = zzgcn.zzc();
        zzgcm0.zza(16);
        zzgcj0.zzb(((zzgcn)zzgcm0.zzal()));
        return new zzgaq(((zzgck)zzgcj0.zzal()), v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new H8(zzgck.class, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgch.zze(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        zzgim.zzb(((zzgch)zzgma0).zza(), 0);
        zzgim.zza(((zzgch)zzgma0).zzg().zzd());
        switch(((zzgch)zzgma0).zzf().zza()) {
            case 12: 
            case 16: {
                return;
            }
            default: {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}

