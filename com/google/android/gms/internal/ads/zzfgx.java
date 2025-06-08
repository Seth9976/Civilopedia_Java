package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.List;
import java.util.Map;

public final class zzfgx {
    public final Context a;
    public final String b;
    public final String c;

    public zzfgx(Context context0, zzcfo zzcfo0) {
        this.a = context0;
        this.b = "com.spears.civilopedia";
        this.c = zzcfo0.zza;
    }

    public final void zza(Map map0) {
        map0.put("s", "gmob_sdk");
        map0.put("v", "3");
        map0.put("os", Build.VERSION.RELEASE);
        map0.put("api_v", Build.VERSION.SDK);
        map0.put("device", zzs.zzq());
        map0.put("app", this.b);
        Context context0 = this.a;
        String s = "1";
        map0.put("is_lite_sdk", (zzs.zzA(context0) ? "1" : "0"));
        List list0 = zzbhz.zzb();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfR)).booleanValue()) {
            list0.addAll(zzt.zzo().zzh().zzh().zzd());
        }
        map0.put("e", TextUtils.join(",", list0));
        map0.put("sdkVersion", this.c);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzix)).booleanValue()) {
            if(!DeviceProperties.isBstar(context0)) {
                s = "0";
            }
            map0.put("is_bstar", s);
        }
    }
}

