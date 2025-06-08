package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfxm {
    public static final String zza;
    public static final String zzb;
    @Deprecated
    public static final zzggs zzc;
    @Deprecated
    public static final zzggs zzd;
    @Deprecated
    public static final zzggs zze;

    static {
        new zzfxs();
        zzfxm.zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new zzfyb();
        zzfxm.zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new zzfye();
        new zzfxy();
        new zzfyk();
        new zzfyo();
        new zzfyh();
        new zzfyr();
        zzggs zzggs0 = zzggs.zzc();
        zzfxm.zzc = zzggs0;
        zzfxm.zzd = zzggs0;
        zzfxm.zze = zzggs0;
        try {
            zzfxm.zza();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfxk.zzn(new zzfxp());  // 初始化器: Ljava/lang/Object;-><init>()V
        zzgbc.zza();
        zzfxk.zzm(new zzfxs(), true);
        zzfxk.zzm(new zzfyb(), true);
        if(zzfzf.zzb()) {
            return;
        }
        zzfxk.zzm(new zzfxy(), true);
        zzfye.zzg(true);
        zzfxk.zzm(new zzfyh(), true);
        zzfxk.zzm(new zzfyk(), true);
        zzfxk.zzm(new zzfyo(), true);
        zzfxk.zzm(new zzfyr(), true);
    }
}

