package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public final class zzfzr {
    @Deprecated
    public static final zzggs zza;
    @Deprecated
    public static final zzggs zzb;
    @Deprecated
    public static final zzggs zzc;

    static {
        Class class0 = zzfwn.class;
        zzgat[] arr_zzgat = {new G8(class0, 11)};
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v <= 0; ++v) {
            zzgat zzgat0 = arr_zzgat[v];
            boolean z = hashMap0.containsKey(zzgat0.a);
            Class class1 = zzgat0.a;
            if(z) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + class1.getCanonicalName());
            }
            hashMap0.put(class1, zzgat0);
        }
        Collections.unmodifiableMap(hashMap0);
        new zzfzo();
        zzfzr.zza = zzggs.zzc();
        zzfzr.zzb = zzggs.zzc();
        zzfzr.zzc = zzggs.zzc();
        try {
            zzfxk.zzn(new zzfzt());  // 初始化器: Ljava/lang/Object;-><init>()V
            zzfxk.zzn(new zzfzw());  // 初始化器: Ljava/lang/Object;-><init>()V
            zzfxm.zza();
            if(zzfzf.zzb()) {
                return;
            }
            zzfzo zzfzo0 = new zzfzo();
            zzgat[] arr_zzgat1 = {new G8(class0, 11)};
            zzfxk.zzk(zzfzo0, new N8(zzgec.class, arr_zzgat1), true);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgas;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/ads/zzgat;)V
            zzfxk.zzk(new zzgak(), new zzgam(), true);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }
}

