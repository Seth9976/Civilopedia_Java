package com.google.android.gms.internal.ads;

public final class zzqn implements jb {
    public static final zzqn zza;

    static {
        zzqn.zza = new zzqn();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.jb
    public final int zza(Object object0) {
        String s = ((zzqf)object0).zza;
        if(!s.startsWith("OMX.google") && !s.startsWith("c2.android")) {
            return zzeg.zza >= 26 || !s.equals("OMX.MTK.AUDIO.DECODER.RAW") ? 0 : -1;
        }
        return 1;
    }
}

