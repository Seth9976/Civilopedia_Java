package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public final class zzil {
    public static zzih zza(zzih zzih0) {
        if(!(zzih0 instanceof I) && !(zzih0 instanceof H)) {
            if(zzih0 instanceof Serializable) {
                return new H(zzih0);
            }
            zzih zzih1 = new I();  // 初始化器: Ljava/lang/Object;-><init>()V
            zzih0.getClass();
            zzih1.i = zzih0;
            return zzih1;
        }
        return zzih0;
    }

    public static zzih zzb(Object object0) {
        return new J(object0);
    }
}

