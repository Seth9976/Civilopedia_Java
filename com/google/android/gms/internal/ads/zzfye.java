package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class zzfye extends zzgas {
    public zzfye() {
        zzgat[] arr_zzgat = {new G8(zzfwf.class, 4)};
        super(zzgcw.class, arr_zzgat);
    }

    public static zzgaq a(int v, int v1) {
        zzgcy zzgcy0 = zzgcz.zzc();
        zzgcy0.zza(v);
        return new zzgaq(((zzgcz)zzgcy0.zzal()), v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new H8(zzgcz.class, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgcw.zze(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        zzgim.zzb(((zzgcw)zzgma0).zza(), 0);
        zzgim.zza(((zzgcw)zzgma0).zzf().zzd());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }

    public static void zzg(boolean z) throws GeneralSecurityException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException unused_ex) {
            return;
        }
        zzfxk.zzm(new zzfye(), true);
    }
}

