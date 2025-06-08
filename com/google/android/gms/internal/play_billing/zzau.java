package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzau extends zzar implements zzav {
    public static zzav zzc(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        return iInterface0 instanceof zzav ? ((zzav)iInterface0) : new zzat(iBinder0, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzaq;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

