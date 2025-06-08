package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzecd implements Callable {
    public final zzfvl zza;
    public final zzfvl zzb;
    public final zzfvl zzc;

    public zzecd(zzfvl zzfvl0, zzfvl zzfvl1, zzfvl zzfvl2) {
        this.zza = zzfvl0;
        this.zzb = zzfvl1;
        this.zzc = zzfvl2;
    }

    @Override
    public final Object call() {
        return new zzecn(((zzecr)this.zza.get()), ((JSONObject)this.zzb.get()), ((zzbzy)this.zzc.get()));
    }
}

