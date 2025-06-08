package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzevh implements zzetg {
    public final ScheduledExecutorService a;

    public zzevh(zzbxz zzbxz0, ScheduledExecutorService scheduledExecutorService0, Context context0, byte[] arr_b) {
        this.a = scheduledExecutorService0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 49;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzm(zzfvc.zzo(zzfvc.zzi(new Bundle()), ((long)(((Long)zzay.zzc().zzb(zzbhz.zzdf)))), TimeUnit.MILLISECONDS, this.a), zzevg.zza, zzcfv.zza);
    }
}

