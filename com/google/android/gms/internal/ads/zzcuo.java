package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzcuo implements zzgqu {
    public final zzgrh a;

    public zzcuo(zzgrh zzgrh0) {
        this.a = zzgrh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzfbl zzfbl0 = ((zzcyn)this.a).zza();
        try {
            return new JSONObject(zzfbl0.zzA);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }
}

