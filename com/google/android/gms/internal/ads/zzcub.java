package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzcub implements Runnable {
    public final zzcli zza;
    public final JSONObject zzb;

    public zzcub(zzcli zzcli0, JSONObject jSONObject0) {
        this.zza = zzcli0;
        this.zzb = jSONObject0;
    }

    @Override
    public final void run() {
        this.zza.zzl("AFMA_updateActiveView", this.zzb);
    }
}

