package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzbny implements zzbom {
    public static final zzbny zza;

    static {
        zzbny.zza = new zzbny();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzgT)).booleanValue()) {
            zzcfi.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        String s = (String)map0.get("package_name");
        if(TextUtils.isEmpty(s)) {
            zzcfi.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap0 = new HashMap();
        Boolean boolean0 = Boolean.valueOf(((zzcmj)object0).getContext().getPackageManager().getLaunchIntentForPackage(s) != null);
        hashMap0.put(s, boolean0);
        zze.zza(("/canOpenApp;" + s + ";" + boolean0));
        ((zzbrd)(((zzcmj)object0))).zzd("openableApp", hashMap0);
    }
}

