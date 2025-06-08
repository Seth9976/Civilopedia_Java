package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzcks implements Runnable {
    public final zzchr zza;
    public final Map zzb;

    public zzcks(zzchr zzchr0, Map map0) {
        this.zza = zzchr0;
        this.zzb = map0;
    }

    @Override
    public final void run() {
        this.zza.zzd("onGcacheInfoEvent", this.zzb);
    }
}

