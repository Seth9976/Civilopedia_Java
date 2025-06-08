package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

public final class zzce {
    public String a;
    public static zzce b;

    public static zzce zza() {
        if(zzce.b == null) {
            zzce.b = new zzce();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        return zzce.b;
    }

    public final void zzb(Context context0) {
        zze.zza("Updating user agent.");
        String s = WebSettings.getDefaultUserAgent(context0);
        if(!s.equals(this.a)) {
            if(GooglePlayServicesUtilLight.getRemoteContext(context0) == null) {
                String s1 = WebSettings.getDefaultUserAgent(context0);
                context0.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", s1).apply();
            }
            this.a = s;
        }
        zze.zza("User agent is updated.");
    }
}

