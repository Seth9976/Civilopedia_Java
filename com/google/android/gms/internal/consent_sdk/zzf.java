package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzf implements Callable {
    public final zzg zza;
    public final String zzb;
    public final JSONObject zzc;

    public zzf(zzg zzg0, String s, JSONObject jSONObject0) {
        this.zza = zzg0;
        this.zzb = s;
        this.zzc = jSONObject0;
    }

    @Override
    public final Object call() {
        return Boolean.valueOf(this.zza.zzb(this.zzb, this.zzc));
    }
}

