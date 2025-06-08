package com.google.android.gms.internal.ads;

import java.util.HashMap;
import org.json.JSONObject;

public final class zzejg implements zzeff {
    public final HashMap a;
    public final zzduc b;

    public zzejg(zzduc zzduc0) {
        this.a = new HashMap();
        this.b = zzduc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzeff
    public final zzefg zza(String s, JSONObject jSONObject0) throws zzfci {
        synchronized(this) {
            zzefg zzefg0 = (zzefg)this.a.get(s);
            if(zzefg0 == null) {
                zzefg0 = new zzefg(this.b.zzc(s, jSONObject0), new zzeha(), s);
                this.a.put(s, zzefg0);
            }
            return zzefg0;
        }
    }
}

