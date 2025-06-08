package com.google.android.gms.ads.internal.util;

import A.k;
import C.b;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.telephony.TelephonyManager;

@TargetApi(26)
public class zzv extends zzu {
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final void zzg(Context context0) {
        NotificationChannel notificationChannel0 = b.c();
        b.q(notificationChannel0);
        ((NotificationManager)k.x(context0)).createNotificationChannel(notificationChannel0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final int zzh(Context context0, TelephonyManager telephonyManager0) {
        return !zzs.zzx(context0, "android.permission.ACCESS_NETWORK_STATE") || !telephonyManager0.isDataEnabled() ? 1 : 2;
    }
}

