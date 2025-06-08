package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;

public final class zzbic {
    public final String a;
    public final LinkedHashMap b;
    public final Context c;
    public final String d;

    public zzbic(Context context0, String s) {
        this.c = context0;
        this.d = s;
        this.a = "https://csi.gstatic.com/csi";
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.b = linkedHashMap0;
        linkedHashMap0.put("s", "gmob_sdk");
        linkedHashMap0.put("v", "3");
        linkedHashMap0.put("os", Build.VERSION.RELEASE);
        linkedHashMap0.put("api_v", Build.VERSION.SDK);
        linkedHashMap0.put("device", zzs.zzq());
        boolean z = context0.getApplicationContext() == null;
        linkedHashMap0.put("app", "com.spears.civilopedia");
        String s1 = "1";
        linkedHashMap0.put("is_lite_sdk", (zzs.zzA(context0) ? "1" : "0"));
        Future future0 = zzt.zzm().zzb(context0);
        try {
            linkedHashMap0.put("network_coarse", Integer.toString(((zzcaa)future0.get()).zzk));
            linkedHashMap0.put("network_fine", Integer.toString(((zzcaa)future0.get()).zzl));
        }
        catch(Exception exception0) {
            zzt.zzo().zzt(exception0, "CsiConfiguration.CsiConfiguration");
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzix)).booleanValue()) {
            LinkedHashMap linkedHashMap1 = this.b;
            if(!DeviceProperties.isBstar(context0)) {
                s1 = "0";
            }
            linkedHashMap1.put("is_bstar", s1);
        }
    }
}

