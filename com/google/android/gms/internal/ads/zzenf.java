package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import v.j;

public final class zzenf implements zzetg {
    public final Context a;

    public zzenf(Context context0) {
        this.a = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzcr)).booleanValue()) {
            return j.checkSelfPermission(this.a, "com.google.android.gms.permission.AD_ID") == 0 ? zzfvc.zzi(new zzeng(true)) : zzfvc.zzi(new zzeng(false));
        }
        return zzfvc.zzi(null);
    }
}

