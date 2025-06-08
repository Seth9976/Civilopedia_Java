package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.Log;

public abstract class pa {
    public static zzmu a(Context context0, ta ta0, boolean z) {
        zzmq zzmq0 = zzmq.zzb(context0);
        if(zzmq0 == null) {
            Log.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzmu(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if(z) {
            ta0.getClass();
            ta0.o.zzw(zzmq0);
        }
        return new zzmu(zzmq0.zza());
    }
}

