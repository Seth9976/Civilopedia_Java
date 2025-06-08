package com.google.android.gms.internal.ads;

public final class zzcdc implements w2 {
    public static final zzcdc zza;

    static {
        zzcdc.zza = new zzcdc();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.w2
    public final Object zza(zzcmz zzcmz0) {
        String s = zzcmz0.zzh();
        if(s == null) {
            s = zzcmz0.zzg();
            return s == null ? "" : s;
        }
        return s;
    }
}

