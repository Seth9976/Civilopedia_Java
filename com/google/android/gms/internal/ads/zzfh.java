package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzfh implements zzfov {
    public static final zzfh zza;

    static {
        zzfh.zza = new zzfh();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzfov
    public final boolean zza(Object object0) {
        if(((String)object0) != null) {
            String s = zzfoc.zza(((String)object0));
            return !TextUtils.isEmpty(s) && (!s.contains("text") || s.contains("text/vtt")) && !s.contains("html") && !s.contains("xml");
        }
        return false;
    }
}

