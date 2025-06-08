package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzfjg {
    public Context a;
    public static final zzfjg b;

    static {
        zzfjg.b = new zzfjg();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final Context zza() {
        return this.a;
    }

    public static zzfjg zzb() {
        return zzfjg.b;
    }

    public final void zzc(Context context0) {
        this.a = context0 == null ? null : context0.getApplicationContext();
    }
}

