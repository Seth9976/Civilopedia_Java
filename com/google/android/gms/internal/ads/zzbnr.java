package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

public final class zzbnr implements zzfok {
    public static final zzbnr zza;

    static {
        zzbnr.zza = new zzbnr();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        if(((Boolean)zzbjo.zzk.zze()).booleanValue()) {
            zzt.zzo().zzt(((Throwable)object0), "prepareClickUrl.attestation1");
        }
        return "failure_click_attok";
    }
}

