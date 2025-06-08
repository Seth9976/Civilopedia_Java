package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzaw;
import org.json.JSONObject;

public final class zzecg implements zzfuj {
    public final zzetj zza;

    public zzecg(zzetj zzetj0) {
        this.zza = zzetj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        JSONObject jSONObject0 = zzaw.zzb().zzh(((Bundle)object0));
        return this.zza.zza(jSONObject0);
    }
}

