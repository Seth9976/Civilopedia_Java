package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfxs extends zzgas {
    public zzfxs() {
        zzgat[] arr_zzgat = {new G8(zzfwf.class, 0)};
        super(zzgbs.class, arr_zzgat);
    }

    public static zzgaq a(int v, int v1, int v2) {
        zzgca zzgca0 = zzgcb.zzc();
        zzgcd zzgcd0 = zzgce.zzc();
        zzgcd0.zza(16);
        zzgca0.zzb(((zzgce)zzgcd0.zzal()));
        zzgca0.zza(v);
        zzgcb zzgcb0 = (zzgcb)zzgca0.zzal();
        zzgeo zzgeo0 = zzgep.zzc();
        zzger zzger0 = zzges.zzc();
        zzger0.zzb(5);
        zzger0.zza(v1);
        zzgeo0.zzb(((zzges)zzger0.zzal()));
        zzgeo0.zza(0x20);
        zzgep zzgep0 = (zzgep)zzgeo0.zzal();
        zzgbu zzgbu0 = zzgbv.zza();
        zzgbu0.zza(zzgcb0);
        zzgbu0.zzb(zzgep0);
        return new zzgaq(((zzgbv)zzgbu0.zzal()), v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new H8(zzgbv.class, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgbs.zze(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        zzgim.zzb(((zzgbs)zzgma0).zza(), 0);
        new zzfxv();
        zzfxv.zzh(((zzgbs)zzgma0).zzf());
        new zzgbb();
        zzgbb.zzh(((zzgbs)zzgma0).zzg());
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

