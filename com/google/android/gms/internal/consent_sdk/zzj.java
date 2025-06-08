package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import m1.e;

public final class zzj extends Exception {
    public zzj(int v, String s) {
        super(s);
    }

    public zzj(int v, String s, Throwable throwable0) {
        super(s, throwable0);
    }

    public final e zza() {
        if(this.getCause() == null) {
            Log.w("UserMessagingPlatform", this.getMessage());
            return new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        Log.w("UserMessagingPlatform", this.getMessage(), this.getCause());
        return new e();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

