package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfyb extends zzgas {
    public zzfyb() {
        zzgat[] arr_zzgat = {new G8(zzfwf.class, 3)};
        super(zzgcq.class, arr_zzgat);
    }

    public static zzgaq a(int v, int v1) {
        zzgcs zzgcs0 = zzgct.zzc();
        zzgcs0.zza(v);
        return new zzgaq(((zzgct)zzgcs0.zzal()), v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new H8(zzgct.class, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgcq.zze(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        zzgim.zzb(((zzgcq)zzgma0).zza(), 0);
        zzgim.zza(((zzgcq)zzgma0).zzf().zzd());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zze() {
        return 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}

