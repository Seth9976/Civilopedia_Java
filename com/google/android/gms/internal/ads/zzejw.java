package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzejw implements zzeff {
    public final zzela a;

    public zzejw(zzela zzela0) {
        this.a = zzela0;
    }

    @Override  // com.google.android.gms.internal.ads.zzeff
    public final zzefg zza(String s, JSONObject jSONObject0) throws zzfci {
        zzbvt zzbvt0 = this.a.zza(s);
        return zzbvt0 == null ? null : new zzefg(zzbvt0, new zzegz(), s);
    }
}

