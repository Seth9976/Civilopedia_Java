package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

public final class zzfcp {
    public zzfcp() {
        try {
            zzfxm.zza();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            zze.zza(("Failed to Configure Aead. " + generalSecurityException0.toString()));
            zzt.zzo().zzt(generalSecurityException0, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgjf zzgjf0 = zzgji.zzt();
        try {
            zzfwj.zzb(zzfwt.zzb(zzfws.zza("AES128_GCM")), zzfwh.zzb(zzgjf0));
        }
        catch(GeneralSecurityException | IOException generalSecurityException0) {
            zze.zza(("Failed to generate key" + generalSecurityException0.toString()));
            zzt.zzo().zzt(generalSecurityException0, "CryptoUtils.generateKey");
        }
        String s = Base64.encodeToString(zzgjf0.zzb().zzE(), 11);
        zzgjf0.zzc();
        return s;
    }

    @Nullable
    public static final String zzb(byte[] arr_b, byte[] arr_b1, String s, zzdwc zzdwc0) {
        zzfwt zzfwt0;
        try {
            zzfwt0 = zzfwj.zza(zzfwg.zzb(Base64.decode(s, 11)));
        }
        catch(GeneralSecurityException | IOException generalSecurityException0) {
            zze.zza(("Failed to get keysethandle" + generalSecurityException0.toString()));
            zzt.zzo().zzt(generalSecurityException0, "CryptoUtils.getHandle");
            zzfwt0 = null;
        }
        if(zzfwt0 == null) {
            return null;
        }
        try {
            byte[] arr_b2 = ((zzfwf)zzfwt0.zzd(zzfwf.class)).zza(arr_b, arr_b1);
            zzdwc0.zza().put("ds", "1");
            return new String(arr_b2, "UTF-8");
        }
        catch(GeneralSecurityException | UnsupportedEncodingException generalSecurityException1) {
            zze.zza(("Failed to decrypt " + generalSecurityException1.toString()));
            zzt.zzo().zzt(generalSecurityException1, "CryptoUtils.decrypt");
            zzdwc0.zza().put("df", generalSecurityException1.toString());
            return null;
        }
    }
}

