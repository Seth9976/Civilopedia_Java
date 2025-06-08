package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import org.json.JSONObject;

public final class zzcae implements zzfok {
    public final zzcaf zza;

    public zzcae(zzcaf zzcaf0) {
        this.zza = zzcaf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        zzbhz.zzd(this.zza.b, 1, ((JSONObject)object0));
        this.zza.c.edit().putLong("js_last_update", zzt.zzA().currentTimeMillis()).apply();
        return null;
    }
}

