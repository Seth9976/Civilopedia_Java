package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

public final class zzcsx implements zzcsp {
    public final zzdzb a;

    public zzcsx(zzdzb zzdzb0) {
        this.a = zzdzb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map0) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhL)).booleanValue()) {
            return;
        }
        String s = (String)map0.get("policy_violations");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.a.zzk(s);
    }
}

