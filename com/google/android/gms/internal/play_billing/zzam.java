package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzam extends zzar implements zzan {
    public static zzan zzu(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return iInterface0 instanceof zzan ? ((zzan)iInterface0) : new zzal(iBinder0, "com.android.vending.billing.IInAppBillingService");  // 初始化器: Lcom/google/android/gms/internal/play_billing/zzaq;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

